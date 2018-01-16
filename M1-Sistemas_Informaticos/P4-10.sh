#!/bin/bash

/sbin/ifconfig | grep HWaddr

lscpu | grep "Model name"

lscpu | grep "CPU(s):" | head -n 1
