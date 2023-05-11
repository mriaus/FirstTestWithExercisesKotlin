import kotlin.random.Random

fun main(){
    resultListExercise()
}


fun resultListExercise(){
    var randomList = MutableList(100){
        Random.nextInt(0,10)
    }
    println(randomList)

    var resultList = MutableList(10){0}

    randomList.forEach{
        resultList[it] +=1
    }
    println(resultList)
}