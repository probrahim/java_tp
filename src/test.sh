#!/bin/bash

# Vérifier si le répertoire est fourni
if [ "$#" -ne 1 ]; then
    echo "Usage: $0 <répertoire>"
    exit 1
fi

# Nom du répertoire contenant les fichiers source
REPERTOIRE="$1"

# Vérifier si le répertoire existe
if [ ! -d "$REPERTOIRE" ]; then
    echo "Le répertoire $REPERTOIRE n'existe pas."
    exit 1
fi

# Se déplacer dans le répertoire
cd "$REPERTOIRE" || exit

# Créer un répertoire pour les fichiers .class
mkdir -p classes

# Compiler tous les fichiers .java en gardant la structure des packages
echo "Compilation des fichiers Java dans $REPERTOIRE..."
javac -d classes $(find . -name "*.java")

# Vérifier si la compilation a réussi
if [ $? -ne 0 ]; then
    echo "La compilation a échoué."
    exit 1
fi

# Trouver les classes avec une méthode main
for CLASS_FILE in $(find classes -name "*.class"); do
    # Retirer le préfixe "classes/" et l'extension ".class"
    CLASS_NAME="${CLASS_FILE#classes/}"
    CLASS_NAME="${CLASS_NAME%.class}"
    
    # Convertir les séparateurs de répertoires en points
    CLASS_NAME="${CLASS_NAME//\//.}"
    
    # Vérifier si la classe a une méthode main
    if javap -classpath classes "$CLASS_NAME" | grep -q 'public static void main'; then
        # Exécuter la classe
        echo "Exécution de $CLASS_NAME..."
        java -cp classes "$CLASS_NAME"
        
        # Vérifier si l'exécution a réussi
        if [ $? -ne 0 ]; then
            echo "L'exécution de $CLASS_NAME a échoué."
            exit 1
        fi
    fi
done

