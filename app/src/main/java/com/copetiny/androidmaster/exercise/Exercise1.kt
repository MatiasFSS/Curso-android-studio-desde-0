package com.copetiny.androidmaster.exercise

/**
 Por lo general, el telefono te proporciona un resumen de las notificaciones

 En el codigo inicial que se proporciona en el siguiente fragmento de codigo,
 escribe un programa que imprima el mensaje de resumen según la cantidad de
 notificaciones que rtecibiste. El mensaje debe incluir lo siguiente:

 La cantidad exacta de notificaciones cuando haya menos de 100
 99+ como cantidad de notificaciones cuando haya 100 o más
 */

fun main (){
    val morningNotification = 51
    val eveningNotification = 135

    prinNotificationSummary(morningNotification)
    prinNotificationSummary(eveningNotification)
}

fun prinNotificationSummary(numerOfMessages:Int){
    if (numerOfMessages < 100){
        println("you have $numerOfMessages notification")
    }else{
        println("your phone is blowing up! you have 99+ notifications")
    }
}