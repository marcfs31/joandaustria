#!/bin/bash
whoami
ifconfig|sed -n '2p'|cut -d ':' -f2|cut -d " " -f1
