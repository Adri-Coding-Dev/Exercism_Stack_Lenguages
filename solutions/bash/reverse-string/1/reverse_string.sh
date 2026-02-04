#!/usr/bin/env bash

#   main () {
#     # your main function code here
#   }
#   # call main with all of the positional arguments
#   main "$@"

# Mision: Crear una funcion para darle la vuelta a una cadena de texto
function reverseString(str){
# PASO 1: Separa la cadena para conseguir una especie de array
	var cadenaSeparada = str.split("");
# PASO 2: Darle la vuelta al conjunto de caracteres separados
	var cadenaReves = cadenaSeparada.serverse();
# PASO 3: Volver a juntar el conjunto de caracteres
	var cadenaJuntada = cadenaReves.join("");
# RETORNA: Cadena al reves
	return cadenaJuntada;

# VERSION OPTIMIZADA:
# return str.split("").reverse().join("");
}

main(){
	reverseString "$1"
}

main "$@"
