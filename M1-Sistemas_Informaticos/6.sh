#!/bin/bash
if [ $1 == $2 ] #Para strings se usa == y demás
then
    echo "Son iguales"
else
    echo "Son diferentes"
fi

if [ $3 -gt $4 ] # -gt y demás son para numeros
then
    echo $3 "es el mayor"
elif [ $3 -lt $4 ]
then
    echo $4 "es el mayor"
fi
