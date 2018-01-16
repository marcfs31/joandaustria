#!/bin/bash
echo "Introduce -k para kilobytes/-h para human o nada para el default"
read op
df $op
