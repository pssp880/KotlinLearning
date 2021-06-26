package flowControl

/*
if executes a certain section of code if the Expression is evaluated to true
It can have optional else clause
syntax:
if (testExpression) {
   // codes to run if testExpression is true
}
else {
  // codes to run if testExpression is false
}
*/
fun main() {
    val age = 20
    if (age > 18) {
        print("Eligible for voting")
    }
}