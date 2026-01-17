package com.example.kotlinbasics

/**
 * Functions.kt
 *
 * This file demonstrates all important concepts
 * related to functions in Kotlin.
 *
 * Topics covered:
 * - Simple functions
 * - Functions with parameters
 * - Functions with return types
 * - Unit return type
 * - Default parameters
 * - Named arguments
 * - Single-expression functions
 *
 * Example theme: Coffee making ☕
 */

fun main() {

    // Calling a function that does NOT return anything (Unit)
    askCoffeeDetails()

    // Calling a function that RETURNS a value
    val totalPrice = calculateCoffeePrice(2)
    println("Total coffee price: $totalPrice")

    // Function with default parameters
    orderCoffee(name = "Ali")

    // Single-expression function
    println("Is coffee free? ${isCoffeeFree(0)}")
}


/**
 * Function with no return type (Unit)
 * Takes user input and calls another function
 */
fun askCoffeeDetails() {
    println("Who is this coffee for?")
    val name = readln()

    println("How many spoons of sugar do you want?")
    val sugarCount = readln().toInt()

    makeCoffee(name, sugarCount)
}


/**
 * Function with parameters
 */
fun makeCoffee(name: String, sugarCount: Int) {

    if (sugarCount == 0) {
        println("Making coffee for $name with no sugar")
    } else if (sugarCount == 1) {
        println("Making coffee for $name with 1 spoon of sugar")
    } else {
        println("Making coffee for $name with $sugarCount spoons of sugar")
    }
}


/**
 * Function with return type
 */
fun calculateCoffeePrice(sugarCount: Int): Int {
    val basePrice = 100
    val sugarPrice = sugarCount * 10
    return basePrice + sugarPrice
}


/**
 * Function with default parameters
 */
fun orderCoffee(
    name: String,
    sugarCount: Int = 1,
    size: String = "Medium"
) {
    println("Order placed for $name | Sugar: $sugarCount | Size: $size")
}


/**
 * Single-expression function
 */
fun isCoffeeFree(price: Int): Boolean = price == 0
