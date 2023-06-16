
fun main() {
    println("Type the number of fibonacci terms you want to print e.g. 10:")
    val input = readlnOrNull()?.toIntOrNull()

    if (input != null) {
        var term1 = 0
        var term2 = 1

        for (term in 1..input) {
            println("The $term fibonacci term is $term1")
            val nextTerm = term1 + term2
            term1 = term2
            term2 = nextTerm
        }
    }
    else {
        println("Please provide a valid integer input.")
    }
}