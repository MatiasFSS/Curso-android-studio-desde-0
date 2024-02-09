package com.copetiny.androidmaster.Sintaxis

fun main(){
    var name:String? = null

   println(name?.get(3) ?: "Es nulo") // si esto no es nulo muestralo -> ?: es para saber que hacer si es nulo
}