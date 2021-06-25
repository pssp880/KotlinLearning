package operators

/*
Bitwise Operators
"or" 1 if either of bit is 1
"and" 1 if both bits are 1
"xor" 1 if corresponding bits are different
"inv" inverts bits
"shl" shift left
"shr" shift right
 */
fun main() {
    val number1 = 10
    val number2 = 20
    var result: Int
    result = number1 or number2
    println(result)
    result = number1 and number2
    println(result)
    result = number1 xor number2
    println(result)
    result = number1.inv()
    println(result)
    print(number1 shl 1)
    println(number2 shr 1)
}