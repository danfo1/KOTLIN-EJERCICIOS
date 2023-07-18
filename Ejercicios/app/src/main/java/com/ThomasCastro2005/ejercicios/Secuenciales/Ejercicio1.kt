package com.ThomasCastro2005.ejercicios.Secuenciales


class Ejercicio1 {
}

fun main() {

    println("Bienvenido al programa")

    print("Digite el grado a convertir")
    var temp: Double = readLine()!!.toDouble()

    var C: Double = (temp - 32) / 1.8

    println("El grado Fahrenheit ${temp} °F a Celsius es igual a: ${C} °C")

}
