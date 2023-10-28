
import kotlin.random.Random
import kotlin.math.sqrt
import kotlin.math.pow

fun main()
{
   /* /*This is comment
    * */
    println("Hello There!") // Prints Hello There!
    print("Welcome to Kotlin") // Prints Welcome to Kotlin */


    /*val constant = 10
    var variable = 20

    var x: Int = 500 // Daha uzun, daha okunaksız, daha güvensiz
    var y = 50*/

    /*val tamSayi: Int = 10
    val ondalikSayi: Double = 10.5
    val karakter: Char = 'A'
    val boolean: Boolean = true
    val string: String = "Hello World"

    println(tamSayi)
    println(ondalikSayi)
    println(karakter)
    println(boolean)
    println(string)*/

    /*println("What is your name?")
    val name = readLine()
    println("How old are you?")
    val age = readLine()
    println("Hello $name, you are $age years old.")*/


    /*print("Enter the first number: ")
    val number = readLine()!!.toInt()

    print("Enter the second number: ")
    val number2 = readLine()!!.toInt()

    print("Enter the operation: ")
    val operation = readLine()

    val result = when (operation) {
        "+" -> number + number2
        "-" -> number - number2
        "*" -> number * number2
        "/" -> number / number2
        else -> "$operation is an invalid operation."
    }

    println("Result: $result")*/

    /*val randomInt = Random.nextInt(0, 100)
    println(randomInt)

    val randomDouble = Random.nextDouble(0.0, 100.0)
    println(randomDouble)

    val randomBoolean = Random.nextBoolean()
    println(randomBoolean)*/

    /*print("Enter the side1 ")
    val side1 = readLine()?.toDoubleOrNull()
    print("Enter the side2 ")
    val side2 = readLine()?.toDoubleOrNull()

    val hypotenuse = sqrt(side1!!.pow(2) + side2!!.pow(2))

    println("Hypotenuse: $hypotenuse")*/


    /*print("Enter your age:")

    val age = readLine()?.toIntOrNull()

    if(age != null)
    {
        if(age >= 18 && age <= 60)
        {
            println("You can play the game")
        }
        else
            if(age <= 0)
            {
                println("You haven't born yet")
            }
            else
                if(age > 60)
                {
                    println("You are too old to play the game")
                }
                else
                {
                    println("You are too young to play the game")
                }

    }*/


    /*print("Enter a number between 1 and 3: ")
    val number = readLine()

    when(number)
    {
        "1" -> println("You selected 1")
        "2" -> println("You selected 2")
        "3" -> println("You selected 3")
        else -> println("Invalid number")
    }*/

    /*for(i in 10 downTo 1)
    {
        println(i)
    }

    print("HAPPY NEW YEAR!!!")*/




   /* val colors = Array(3){""}

    colors[0] = "Red"
    colors[1] = "Green"
    colors[2] = "Blue"

    val firstColor = colors[0]




    val numbers = arrayOf(5,3,7,0,9)
    /*val numberSize = numbers.size

    println(numberSize)*/

    numbers.sort()

    for(number in numbers)
    {
        println(number)
    }*/


    //sendMessage()

    //val result = sum(5, 10)

    //println(result)

    //greet("Arthur")

    /*val toplam: (Int, Int) -> Int = {number1, number2 -> number1 + number2}
    val sonuc  = toplam(5, 10)
    println(sonuc)*/

    /*val fee = 10

    print("fee = ${fee+5}")*/




    /*var a: Int = 10

    var b: Double = a.toDouble()

    println(b)*/

    /*print("Enter your age: ")

    val age = readLine()!!.toInt()

    when(age)
    {
        in 0..17 -> println("You are not eligible to vote")
        in 18..120 -> println("You are eligible to vote")
        else -> println("Invalid age")
    }*/


    var i = 1

    do
    {
        println(i)
        i++

    }while(i <= 10)




}

/*fun sendMessage()
{
    println("Hello World")
}*/

/*fun sum(number1: Int, number2: Int): Int
{
    return number1 + number2
}*/

/*fun greet(name: String = "Guest")
{
    println("Hello $name")
}*/