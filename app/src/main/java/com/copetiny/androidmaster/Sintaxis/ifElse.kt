package com.copetiny.androidmaster.Sintaxis

fun main(){
    //ifBasico()
    //ifAnidado()
    ifMultipleOR()
}


fun ifMultipleOR(){
    var pet = "dog"

    if (pet == "dog" || pet == "cat"){
        println("Es un gato o un perro")
    }
}
fun ifMultiple(){
    var age = 18
    var permission = false

    if(age >= 18 &&permission){
        println("Beber cerveza nomas")
    }else{
        println("no puedes beber")
    }
}
fun ifInt(){
    var age = 29

    if(age >= 18){
        println("Beber cerveza")
    }else{
        println("Beber jugo")
    }
}
fun ifBoolean(){
    var soyFeliz = false

    if(!soyFeliz){
        println("estoy triste")
    }
}
fun ifAnidado() {
    val animal = "caca"
    if (animal == "dog") {
        println("Es un perrito")
    }else{
        if(animal == "cat"){
            println("Es un gato")
        }else{
            if(animal == "bird"){
                println("Es un pajaro")
            }else{
                println("no es un animal de AQUI")
            }
        }
    }

}
fun ifBasico(){
    val name = "Matias"
    if(name == "Aris"){
        println("Oye la variable name es Aris")
    }else{
        println("No es aris")
    }



}