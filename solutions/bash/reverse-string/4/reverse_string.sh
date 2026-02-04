#!/usr/bin/env bash

#   main () {
#     # your main function code here
#   }
#   # call main with all of the positional arguments
#   main "$@"

# Mision: Crear una funcion para darle la vuelta a una cadena de texto
function reverseString(){
# PASO 1: usar | rev con $1 = 1º Parametro del comando
	echo "$1" | rev
}

main(){
	reverseString "$1"
}

main "$@"
