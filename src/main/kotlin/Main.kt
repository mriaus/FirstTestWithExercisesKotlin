fun main(args: Array<String>) {

        println(integersSumatory(1,2))
        println(stringsToDouble("1","2"))
        println(sayResults(integersSumatory(1,2),stringsToDouble("1","2") ))
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