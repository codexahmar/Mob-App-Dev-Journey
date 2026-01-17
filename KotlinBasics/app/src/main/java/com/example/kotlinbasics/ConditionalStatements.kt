package com.example.kotlinbasics

/**
 * This file demonstrates:
 * - if statement
 * - if else statement
 * - else if ladder
 * - when expression
 * - logical operators (&&, ||, !)
 *
 * Input is taken using readln()
 *
 * Purpose:
 * - Learn Kotlin conditional statements
 * - Understand why else-if order matters
 * - GitHub reference for beginners
 */

fun main() {

    // --------------------------------------------------
    // 1. SIMPLE IF STATEMENT
    // --------------------------------------------------

    println("Enter your age:")
    val age = readln().toInt()

    if (age >= 18) {
        println("You are eligible to drive a car.")
    }


    // --------------------------------------------------
    // 2. IF - ELSE STATEMENT
    // --------------------------------------------------

    if (age >= 18) {
        println("You can apply for a driving license.")
    } else {
        println("You are underage and cannot apply for a license.")
    }


    // --------------------------------------------------
    // 3. ELSE IF (WHY ORDER MATTERS)
    // --------------------------------------------------
    /**
     * IMPORTANT CONCEPT:
     *
     * Conditions are checked from TOP to BOTTOM.
     * As soon as one condition becomes true,
     * the rest are ignored.
     *
     * ❌ WRONG LOGIC (example explanation):
     *
     * if (age > 18) → true for age = 45
     * else if (age > 40) → never reached
     *
     * That is why we must write MORE SPECIFIC
     * conditions FIRST.
     */

    if (age > 40) {
        println("You cannot drive due to old age restrictions.")
    } else if (age >= 18) {
        println("You are allowed to drive a car.")
    } else {
        println("You are too young to drive.")
    }


    // --------------------------------------------------
    // 4. LOGICAL OPERATORS
    // --------------------------------------------------

    println("\nLogical Operators Example")

    println("Enter your age again:")
    val userAge = readln().toInt()

    println("Do you have a driving license? (true/false)")
    val hasLicense = readln().toBoolean()

    // AND (&&) → both conditions must be true
    if (userAge >= 18 && hasLicense) {
        println("You are legally allowed to drive.")
    } else {
        println("You are NOT allowed to drive legally.")
    }

    // OR (||) → at least one condition must be true
    if (userAge < 18 || !hasLicense) {
        println("Driving is not permitted.")
    }

    // NOT (!) → reverses condition
    if (!hasLicense) {
        println("You must get a license first.")
    }


    // --------------------------------------------------
    // 5. WHEN STATEMENT
    // --------------------------------------------------
    /**
     * when is used as a cleaner alternative
     * to multiple else-if conditions.
     */

    println("\nEnter a day number (1–7):")
    val day = readln().toInt()

    when (day) {
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunday")
        else -> println("Invalid day number")
    }


    // --------------------------------------------------
    // END OF CONDITIONAL STATEMENTS FILE
    // --------------------------------------------------
}