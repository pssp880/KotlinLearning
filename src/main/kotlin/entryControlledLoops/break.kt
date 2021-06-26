package entryControlledLoops

/*
break statement is used to terminate a loop
it is always used in loops
 */
fun main() {
    for (i in 1..10) {
        if (i == 6) {
            break
        }
        println(i)
    }
}