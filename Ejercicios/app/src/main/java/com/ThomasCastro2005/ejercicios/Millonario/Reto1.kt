package com.ThomasCastro2005.ejercicios.Millonario

class Reto1 {
}


fun main() {

    print("ingrese su edad: ")
    var edad: Int = readLine()!!.toInt()



    if(edad in 0..4){
        print("Pagas 3.000")
    }else if(edad in 5..17){
        print("Pagas 20.000")
    }else if(edad in 18..60){
        print("Pagas 15.000")
    }else{
        print("ingrese una opcion valida")
    }
}