package flowControl

/*
It evaluates a section of code among many alternatives.
when works like switch in java
 */
fun main() {
    val a = 10
    val b = 20
    println("for addition press 1")
    println("for subtraction press 2")
    println("for multiplication press 3")
    println("for division press 4")
    val operator = readLine()?.toInt()
    val result = when (operator) {
        1 -> a + b
        2 -> a - b
        3 -> a * b
        4 -> a / b
        else -> "select valid operation"
    }
    print(result)
}