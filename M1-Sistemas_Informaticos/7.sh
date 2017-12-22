#!/bin/bash
read -p "Pon un número" num

case $num in
    1)
        echo "uno"
    ;;
    2)
        echo "dos"
    ;;
    3)
        echo "tres"
    ;;
    4)
        echo "cuatro"
    ;;
    *)
        echo "No es ninguna opció"
        ;;
esac
