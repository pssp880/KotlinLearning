package kotlinoop

/*
A class is a blueprint for the objects which have common properties
kotlin classes are declared using class keyword
A object is an instance of a class which has state and behaviour
To access members defined within the class, you need to create objects.
 */
class Name {
    var name: String = "shiva"
    var age: Int = 21
    fun Gender(Gender: String) {
        println("your are $Gender")
    }
}

fun main() {
    val obj = Name()
    println("my name is ${obj.name} and my age is ${obj.age}")
    obj.Gender("Male")
}