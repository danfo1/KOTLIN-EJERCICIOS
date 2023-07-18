package com.ThomasCastro2005.ejercicios.Condicionales

class Ejercicio3 {
}

fun main(){
    //CONDICIONALES SIMPLES
    /*print("Enter a Number: ")
    var n1: Int = readLine()!!.toInt()

    if(n1 < 10){
        print("You Won")
    }else{
        print("You Lost")
    }*/



    //CONDICIONALES ANIDADOS
    /*print("Ingrese el nombre de la fruta: ")
    var fruta: String = readLine()!!.toString().lowercase()

    if(fruta == "manzana"){

        print("Ingrese el color de la manzana: ")
        var colorFruta: String = readLine()!!.toString().lowercase()
        if(colorFruta == "rojo"){
            print("Se puede comer la manzana")
        }else if(colorFruta == "verde"){
            print("La manzana es para la ensalada")
        }else{
            print("Eligio un color de manzana EQUIVOCADO")
        }

    }else if(fruta == "fresa"){

        print("Ingrese el tamaño de la fresa:")
        var tamañoFruta: Int = readLine()!!.toInt()
        if(tamañoFruta < 15){
            print("La fresa es pequeña")
        }else if(tamañoFruta > 15){
            print("La fresa es grande")
        }else{
            print("Esto no es un tamaño")
        }

    }else if(fruta == "uva"){

        print("Ingrese el tipo de la uva: ")
        var tipoFruta: String = readLine()!!.toString().lowercase()
        if(tipoFruta == "chilena"){
            print("La uva cuesta 10.000 lb")
        }else if(tipoFruta == "nacional"){
            print("La uva cuesta 8.000 lb")
        }else{
            print("Este tipo de fruta NO esta DISPONIBLE")
        }

    }else{
        print("Elija una fruta correcta")
    }*/




    //CONDICIONALES MULTIPLES
    //RANGOS
    /*print("Enter a Number: ")
    var n2: Int = readLine()!!.toInt()

    if (n2 in 1..10){
        print("su numero esta dentro del rango")
    }else{
        print("El numero no está dentro del rango")
    }*/

    /*print("Enter a Letter: ")
    var letter: String = readLine()!!.toString().lowercase()

    if (letter in "a".."z"){
        print("su letra  esta dentro del abecedario")
    }else{
        print("su letra NO esta dentro del abecedario")
    }*/


    /*print("Enter your Age: ")
    var age: Int = readLine()!!.toInt()

    if (age in 0..14){
        print("Ud esta muy Bebe, NO podra ingresar")
    }else if (age in 15..17){
        print("Ud es menor de edad, NO podra Ingresar")
    }else if (age in 18..100){
        print("Ud podra Ingresar a disfrutar")
    }else{
        print("Edad invalida")
    }*/


    /*var result: Int = (1..50).random()

    when(result){
        0-> print("There aren't Results")
        in 1..6-> print("The result is between 1 and 6")
        in 7..50-> print("Your Result is between 7 and 50")
        else -> print("The number is out of range")
    }*/

    /*
    print("Ingrese la operacion a realizar: ")
    var operacion: String = readLine().toString().lowercase()

    print("ingrese el numero 1: ")
    var n1: Int = readLine()!!.toInt()
    print("ingrese el numero 2: ")
    var n2: Int = readLine()!!.toInt()


    when(operacion){
        "multiplicacion"->{
            var resultado1: Int = n1*n2
        print("El resultado de la multiplicacion es: ${resultado1}")
        }

        "division"->{
            var resultado1: Int = n1/n2
        print("El resultado de la division es: ${resultado1}")
        }

            "suma"->{
            var resultado1: Int = n1+n2
             print("El resultado de la suma es: ${resultado1}")
            }


             "resta"->{
            var resultado1: Int = n1-n2
             print("El resultado de la resta es: ${resultado1}")
             }

        "modulo"->{
            var resultado1: Int = n1%n2
            print("El resultado de la resta es: ${resultado1}")
        }

    }*/








}