/**
 * DataTypes.kt
 *
 * This file demonstrates all major Kotlin data types
 * with examples, variable usage, and type conversions.
 *
 * Purpose:
 * - Learning Kotlin basics
 * - Reference file for beginners
 * - GitHub educational content
 */

fun main() {

    // --------------------------------------------------
    // 1. VARIABLES IN KOTLIN (val vs var)
    // --------------------------------------------------

    // val → immutable (cannot be changed)
    val appName: String = "Kotlin Basics"

    // var → mutable (can be changed)
    var version: Int = 1
    version = 2

    println("App: $appName, Version: $version")


    // --------------------------------------------------
    // 2. INTEGER DATA TYPES
    // --------------------------------------------------

    // Byte (8-bit)
    val byteValue: Byte = 127

    // Short (16-bit)
    val shortValue: Short = 32000

    // Int (32-bit) – most commonly used
    val intValue: Int = 100000

    // Long (64-bit)
    val longValue: Long = 10000000000L

    println("Byte: $byteValue, Short: $shortValue, Int: $intValue, Long: $longValue")


    // --------------------------------------------------
    // 3. FLOATING POINT DATA TYPES
    // --------------------------------------------------

    // Float (32-bit) – needs 'f' suffix
    val floatValue: Float = 10.5f

    // Double (64-bit) – default for decimal numbers
    val doubleValue: Double = 99.99

    println("Float: $floatValue, Double: $doubleValue")


    // --------------------------------------------------
    // 4. CHARACTER DATA TYPE
    // --------------------------------------------------

    val grade: Char = 'A'
    println("Grade: $grade")


    // --------------------------------------------------
    // 5. BOOLEAN DATA TYPE
    // --------------------------------------------------

    val isLoggedIn: Boolean = true
    println("Is user logged in? $isLoggedIn")


    // --------------------------------------------------
    // 6. STRING DATA TYPE
    // --------------------------------------------------

    val firstName: String = "Codex"
    val lastName = "Ahmar" // Type inference

    // String template
    val fullName = "$firstName $lastName"
    println("Full Name: $fullName")


    // --------------------------------------------------
    // 7. TYPE CONVERSION IN KOTLIN
    // (Kotlin does NOT support implicit conversion)
    // --------------------------------------------------

    val numberInt: Int = 10

    val convertedToDouble: Double = numberInt.toDouble()
    val convertedToLong: Long = numberInt.toLong()
    val convertedToString: String = numberInt.toString()

    println("Int: $numberInt")
    println("Converted to Double: $convertedToDouble")
    println("Converted to Long: $convertedToLong")
    println("Converted to String: $convertedToString")


    // --------------------------------------------------
    // 8. NULLABLE TYPES (Null Safety)
    // --------------------------------------------------

    // Nullable variable (can hold null)
    var email: String? = null

    // --------------------------------------------------
    // END OF DATA TYPES FILE
    // --------------------------------------------------
}

/**
