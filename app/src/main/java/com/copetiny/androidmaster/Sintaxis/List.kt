package com.copetiny.androidmaster.Sintaxis

fun main (){
mutableList()

}
fun mutableList(){
    val weekDays:MutableList<String> = mutableListOf("lunes", "martes", "miercoles","jueves", "viernes", "sabado", "domingo")
    weekDays.add("matias")
    println(weekDays)
}

fun inmutableList(){
    val readOnly:List<String> = listOf("lunes", "martes", "miercoles","jueves", "viernes", "sabado", "domingo")
    //println(readOnly.size)
    //println(readOnly)
    //println(readOnly[0])
   // println(readOnly.last())
    //println(readOnly.first())

   // val example = readOnly.filter { it.contains("a") }
    //println(example)

    readOnly.forEach{weekDay -> println(weekDay)}
}