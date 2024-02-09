package com.copetiny.androidmaster.Sintaxis

fun main (){
    result(value = 1)
}

fun result(value:Any){
    when (value){
        is Int -> value + value
        is String -> println(value)
        is Boolean -> if(value) println("holiwi")
    }
}
fun getSemester(month: Int){

}
fun getTrimester(month: Int){
    when(month){
        1, 2 ,3 -> print("Primer trimestre")
        4, 5, 6 -> print("Segundo trimestre")
        7, 8, 9 -> print("Tercer trimestre")
        10, 11, 12 -> print("Cuarto trimestre")
        else -> print("No es un mes valido")
    }
}
fun getMonth(month:Int){
    when(month){
        1 -> print("Enero")
        2 -> print("Febrero")
        3 -> print("Marzo")
        4 -> print("Abril")
        5 -> print("Mayo")
        6 -> print("Junio")
        7 -> print("Julio")
        8 -> print("Agosto")
        9 -> print("Septiembre")
        10 -> print("Octubre")
        11 -> print("Noviembre")
        12 -> print("Diciembre")
        else -> print("No es un mes valido")
    }

}

