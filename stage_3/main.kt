import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Hello! My name is Aid.")
    println("I was created in 2020.")
    println("Please, remind me your name.")

    val name = scanner.nextLine()

    println("What a great name you have, " + name + "!")
    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")

    val num1 = scanner.nextInt()
    val num2 = scanner.nextInt()
    val num3 = scanner.nextInt()
    // reading all remainders
    val yourAge: Int = ( num1 * 70 + num2 * 21 + num3 * 15 ) % 105
    println("Your age is $yourAge; that's a good time to start programming!")
}