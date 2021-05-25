fun main(args: Array<String>) {
    println("Hello World!")

    //Variables val y var

    val edad = 25;
    val nombre = "Samahel"

    println(edad)
    println(nombre)

    val n1=5
    val n2=8

    if (n1 > n2)
    {
        println("Estamos arriba")
    }
    else
    {
        println("Estamos abajo")
    }

    //2. Tarea: Aprender sobre operadores y tipos

    //Paso 2: Practicar usando tipos

    //Conversion de datos en kotlin

    val i: Int = 6
    val b1 = i.toByte()
    println(b1)

    val b2: Byte = 1
    println(b2)

    val i4: Int = b2.toInt()
    println(i4)

    val i5: String =b2.toString()
    println(i5)

    val i6: Double = b2.toDouble()
    println(i6)

    //unir cadenas en kotlin
    val numeroPeces=5
    val numeroPlantas=14
    println("Yo tengo $numeroPeces peces" + " y $numeroPlantas plantas")

    //3. Tarea: Comparar condiciones y booleanos

    val numeroPez = 50
    val numeroPlanta= 23

    if (numeroPez > numeroPlanta){
        println("Buena salud!!!")
    }else{
        println("Mala salud! Ten cuidado")
    }

    //Rangos

    val cuyos = 50
    if (cuyos in 1..100){
        println("Este es tu rango $cuyos")
    }

    //ejercicios de rangos

    val edad1 = 32


    if (edad1 in 50..59){
        println("cancino")
    }else{
        if (edad1 in 60..100){
            println("phizer")
        }else{
            if (edad1 in 40..49){
                println("sV")
            }else{
                if (edad1 in 30..39){
                    println("astra zeneca")
                }
            }
        }
    }

    //Operador "When"

    val reptil = 20
    when(20){
        0 -> println("jaula vacia")
        in 1..39->("buenos reptiles")
        else -> println("Hay muchas aves en la Jaula")
    }

    val numberOfFish=50
    when (numberOfFish) {
        0  -> println("Empty tank")
        in 1..39 -> println("Got fish!")
        else -> println("That's a lot of fish!")
    }

    //4. Tarea: Aprender sobre la nulidad, Operador Elvis

    var rocks: Int? = null

    //Paso 2: Aprender acerca de la ? y ?: operadores

    var fishFoodTreats = 6
    fishFoodTreats = fishFoodTreats?.dec()

    //5. Tarea: Explorar matrices, listas y bucles
    //Paso 1: Hacer listas

    val escuela = listOf("samanta", "erika", "luis", "jose")
    println(escuela)

    //Declare una lista que se pueda cambiar mediante . Quite un elemento.mutableListOf

    val miLista = mutableListOf("atun", "salmon", "tiburon")
    miLista.remove("tiburon")
    println(miLista)

    //Paso 2: Crear matrices
    val school = arrayOf("shark", "salmon", "minnow")
    println(java.util.Arrays.toString(school))
    val mix = arrayOf("fish", 2)
    println(mix)



    val numbers = intArrayOf(1,2,3)
    val numbers3 = intArrayOf(4,5,6)
    val foo2 = numbers3 + numbers
    println(foo2[5])

    val array = Array (5) { it * 1 }
    println(java.util.Arrays.toString(array))

    //Paso 3: Hacer bucles

    //Imprimir los elementos de una lista con el ciclo "FOR"

    val escuelas = arrayOf("shark", "salmon", "minnow")
    for (element in escuelas) {
        print(element + " ")
    }

    //Recorrer indices y elementos al mismo tiempo

    for ((index, element) in escuelas.withIndex()) {
        println("Item at $index is $element\n")
    }

    for (i in 1..5) print(i)


    for (i in 5 downTo 1) print(i)


    for (i in 3..6 step 2) print(i)


    for (i in 'd'..'g') print (i)


}