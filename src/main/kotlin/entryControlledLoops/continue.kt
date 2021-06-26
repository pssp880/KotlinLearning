package entryControlledLoops

/*
continue skips the current iteration
it is always used in loops
 */
fun main() {
    for (i in 1..10) {
        if (i % 2 == 0) {
            continue
        }
        println(i)
    }
}