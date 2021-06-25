package operators

/*
Logical Operators
" && " True if both expression are true
" || " True if either of expression is true
 */
fun main() {
    val a = 10
    val b = 2
    val c = 5
    if ((a > b) && (a > c)) {
        print("A is Greater")
    } else if ((b > a) && (b > c)) {
        print("B is Greater")
    } else {
        print("C is Greater")
    }
}