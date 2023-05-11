import java.lang.NumberFormatException
import kotlin.random.Random

fun main(args: Array<String>) {

       // println(integersSumatory(1,2))
       // println(stringsToDouble("1","2"))
       // println(sayResults(integersSumatory(1,2),stringsToDouble("1","2") ))

        //readConsole()

        guessNumber()
}


fun integersSumatory(firstNumber: Int, secondNumber: Int): Double {
        return (firstNumber  +  secondNumber).toDouble()
}
//The string always is a number
fun stringsToDouble(firstText: String, secondText: String): Double{
        return (firstText.toInt() + secondText.toInt()).toDouble()
}

fun sayResults(fun1: Double, fun2:Double){
        println("Suma integer ha devuelto: $fun1 y stringsToDouble ha devuelto $fun2")
}

fun readConsole(){
        println("Introduce un texto: ")
        val response = readlnOrNull()
        if(response.isNullOrEmpty()){
                println("No has escrito nada :(")
        }else{
                print("Has escrito $response")
        }
}

fun guessNumber(){
        val generatedNumber = Random.nextInt(0,11)
        var response = -1
        var end = false
        var trys: Array<Int> = arrayOf()
        println("****** Adivina el número :) *****")

        do{
                println("Inserta un número entre el 0 y el 10 :")

                try {
                        response = readln().toInt()
                }catch (e: NumberFormatException){
                        println("Debes insertar un número!")
                }

                if(!numberisInRange(0,10, response)){
                        println("Recuerda que el número se encuentra entre el 0 y el 10! (Incluidos) ")
                }else{
                        if(response == generatedNumber){
                                end = true
                        }else{
                                when{
                                        response < generatedNumber -> println("El numero es MAYOR!")
                                        response > generatedNumber -> println("El numero es MENOR!")
                                }
                             trys =  trys.plus(response)
                                println("Has fallado!! Te recuerdo los numeros que has intentado: ${trys.contentToString()}")
                        }
                }



        }while(!end)

        println("Has acertado! El número era: $generatedNumber")
}
/**
 * Return if the number is in the range
 *
 * */
fun numberisInRange(minNumber: Int, maxNumber : Int, numberToTest : Int): Boolean{
        when{
                numberToTest < minNumber -> return false
                numberToTest > maxNumber -> return false
                else -> return true
        }
}