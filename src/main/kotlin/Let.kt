/*
*   Que soluciona la función let
*   Al hacer varias cosas a la vez pueden causar problemas y con let las solucionamos
*
* */

var text :String? = null
fun main(){
    text = "1"
    //Con let si permite cambiarlo

    //Sigue dando error porque no está seguro
    if(text != null){
        println(text.toInt())
    }
    //Permite hacerlo
    text.let {
        if(it != null){
            println(it.toInt())
        }
        println(it)
    }
    //Comprueba directamente que no sea null
    text?.let {
        println(it.toInt())
    }


}
