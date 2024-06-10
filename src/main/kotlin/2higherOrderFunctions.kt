fun main() {
    println("all plus 1")
    printAllPlusOne(listOf(1, 2, 3))
    println("all times 2")
    printAllTimesTwo(listOf(1, 2, 3))
}

private fun printAllPlusOne(numbers: Iterable<Int>) {
    for (number in numbers) {
        println(number + 1)
    }
}

private fun printAllTimesTwo(numbers: Iterable<Int>) {
    for (number in numbers) {
        println(number * 2)
    }
}

