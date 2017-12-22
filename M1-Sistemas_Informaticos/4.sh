#!/bin/bash
read -p "Pon algo" nom
echo $nom

echo "Introduce un máximo de 5 caracteres"
read -n 5 num
echo $num

echo "Tienes 10 segundos para introducir algo"
read -t 10 temps
echo $temps
