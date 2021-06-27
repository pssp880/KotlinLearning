package functions

/*
If the function is called without passing any arguments then arguments use default values
when we want to pass only second parameter value then it will show error,because compiler understands it as a first parameter value
To solve this problem named parameter are used
 */

fun add(a: Int = 10, b: Int = 20) {
    println(a + b)
}

fun main() {
    add(20, 30)
    add()
    add(10)
}