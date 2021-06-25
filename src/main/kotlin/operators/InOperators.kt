package operators

/*
In operators
"in" in operator
"!in" not in operator
 */
fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    if (2 in numbers) {
        print("2 is in numbers")
    } else if (2 !in numbers) {
        print("2 is not in numbers")
    }
}