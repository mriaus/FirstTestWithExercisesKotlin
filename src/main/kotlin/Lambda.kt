fun main(){
/*
* Las lambdas son funciones que se declaran de formas mas sencillas pueden asignarse a variables, pasarse como parametros de función y ejecutarse donde sea
*   invoke() Hace que se lance
* */

    {
        println("Pinta ")
    }.invoke()

    println("Primera lambda")

    var lambd1 = {
        println("Se ejecuta dentro de la variable  ")

    }

    //Hacen lo mismo
    lambd1.invoke()
    lambd1()
}