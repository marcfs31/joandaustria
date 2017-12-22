#!/bin/bash
read -p "Pon una palabra : " palabra
adivinar=hola

while [ $palabra != $adivinar ]
do
     read -p "Pon una palabra : " palabra
done
echo "Palabra acertada"

adivinar2=hola2

until [ $palabra == $adivinar2  ]
do
    read -p "Pon una palabra : " palabra
    if [[ $palabra == brk ]]; then
        break
    fi
done

if [[ $palabra == $adivinar2 ]]; then
    echo "Palabra acertada until"
fi
