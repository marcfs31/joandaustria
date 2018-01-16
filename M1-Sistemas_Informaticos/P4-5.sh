#!/bin/bash
cut -d" " -f1,2,3 $1 | grep $2
