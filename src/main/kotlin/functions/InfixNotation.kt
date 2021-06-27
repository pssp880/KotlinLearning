package functions

/*
Infix function call
The function should be named with infix
 */
class Structure() {
    infix fun createPyramid(rows: Int) {
        for (i in 1..rows) {
            var k = 0
            for (space in 1..rows - i) {
                print("  ")
            }
            while (k != 2 * i - 1) {
                print("* ")
                ++k
            }
            println()
        }
    }
}

fun main() {
    val p = Structure()
    p.createPyramid(10)
}