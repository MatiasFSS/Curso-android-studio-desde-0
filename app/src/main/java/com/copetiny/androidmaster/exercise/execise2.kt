package com.copetiny.androidmaster.exercise

/**
 * Las entradas de cine suelen tener un precio diferente según la edad de los espectadores.

 En el codigo inicial que se proporciona en el siguiente fragmento de codigo, escribe un programa
 qye calcule los precios de estas entradas basados en la edad.

 * Un precio de entrada infantil de USD 15 para personas de 12 años o menos
 * un precio de entrada estandas de USD 30 para personas de entre 13 y 60 años los lunes, un precio
 estandar con descuento de USD25 para el mismo grupo etario

 * un precio para adultos mayores de USD20 para personas de 61 años o más (asumimos que la edad maxima de un espectador es de 100 años)
 * un valor de -1 para indicar que el precio no es valido cuando un usuario ingresa una edad fuera de las especificaciones.
 *
 * Resultados
 * -the movie ticket price for a person aged 5 is 15$
 * -The movie ticket price for a person aged 28 is $25
 * -The movie ticket price for a person aged 87 is $20
 */

fun main(){
 val child = 5
 val adult = 28
 val senior = 87

 val isMonday = true

 println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}")
 println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}")
 println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}")

}

fun ticketPrice(age:Int, isModay:Boolean):Int{
   return when(age){
     in 0..12 -> 15
     in 13..60 -> if (isModay) 25 else 30
     in 61..100 -> 20
       else -> -1
   }


}