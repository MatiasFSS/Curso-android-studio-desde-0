package com.copetiny.androidmaster.Sintaxis

fun main (){
    var name:String ="AristiDevs"
    val weekDays= arrayOf("lunes", "martes", "miercoles","jueves", "viernes", "sabado", "domingo")

    print(weekDays.size)
    if(weekDays.size >= 8){
        println(weekDays[7])
    }else{
        println("No hay más valores en el array")
    }

    for (position in weekDays.indices){
        println("he pasado por aqui $position")
    }

    for ((position,value) in weekDays.withIndex()){
        println("la posicion $position contiene $value")
    }
}