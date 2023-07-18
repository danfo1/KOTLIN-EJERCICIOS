package com.ThomasCastro2005.ejercicios.Secuenciales

class Ejercicio2 {
}


fun main() {

    println("Bienvenido al programa")

    print("Ingrese el nombre de la enfermera: ")
    var nombreEnfer: String = readLine()!!.toUpperCase()

    print("Ingrese el nombre del papa: ")
    var nombrePapa: String = readLine()!!.toUpperCase()

    print("Ingrese los meses del bebe: ")
    var mesesBebe: Double = readLine()!!.toDouble()

    print("Ingrese el peso del bebe: ")
    var pesoBebe: Double = readLine()!!.toDouble()

    var Dosis: Double = (((pesoBebe + 10) / (mesesBebe * 10)) * 8)

    println("El nombre de la enfermera es ${nombreEnfer} El nombre del papa es ${nombrePapa} y La dosis que se le debe aplicar al bebe es: ${Dosis} ml")

}


