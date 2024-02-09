package com.copetiny.androidmaster.Sintaxis

val name:Int = 10


//holaa
// val constante
// Var variable
fun main(){
    showMyName()
    showMyAge()
    add(25,76)
    val mySubtract = subtract(10,5)
    println(mySubtract)

}

fun variablesNumericas(){
    //INT
    val name:Int = 10
    var name2:Int = 30

    //LONG
    val example:Long = 30

    //FLOAT
    val decimal:Float = 30.5f

    //DOUBLE
    val doubleExample:Double= 3333.444444444444
}
fun variablesBoolean(){
    /**
     * Variables booleanas
     */

    val booleanExample1:Boolean = true
    val booleanExample2:Boolean = false
    /**
     * println(booleanExample1)
     * println(booleanExample2)
     */

    //println(name + example)
    //println(example % name)
    println("hola me llamo $name")
}
fun variablesAlfaNumericas(){
    /**
     * Variables alfanumericas
     */

    //CHAR
    val charExample1:Char = 'e'
    val charExample2:Char = '2'
    val charExample3:Char = '@'

    //STRING

    val stringExample:String = "HOLA COMO ESTAN"
    // es lo mismo que arriba val stringExample2 = "HOLA COMO ESTAN"
}
fun showMyName(){
    println("Me llamo Matias")
}
fun showMyAge(currentAge:Int = 30){
    println("Tengo $currentAge años")
}
fun add(firstNumber:Int, secondNumber:Int){
    println(firstNumber + secondNumber)
}
fun subtract(firstNumber:Int, secondNumber:Int):Int{
    return firstNumber - secondNumber
}
fun subtractCool(firstNumber:Int, secondNumber:Int):Int = firstNumber - secondNumber

