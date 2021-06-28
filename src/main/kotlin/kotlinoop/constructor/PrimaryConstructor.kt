package kotlinoop.constructor

/*
A constructor is a concise way to initialize class properties.
Types of constructor
-> Primary constructor
-> Secondary constructor
The block of code surrounded by parentheses is the primary constructor (var fname: String, var age: Int)
 */
fun main() {
    val obj = Details("shiva", 21)
    println("my name is ${obj.fname} and my age is ${obj.age}")
}

class Details(var fname: String, var age: Int) {

}
