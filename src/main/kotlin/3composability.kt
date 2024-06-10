fun main() {
    val numbers = listOf(1, 2, 3)

    println("Even plus 2")
    printAllEvenNumbersPlus2(numbers)

    println("Odd times 2")
    printAllOddNumbersTimes2(numbers)

    val stringBuilder = StringBuilder()
    addAllEvenNumbersPlus2ToStringBuilder(numbers, stringBuilder)
    println("Even plus 2 using string builder")
    println(stringBuilder)
}

private fun printAllOddNumbersTimes2(numbers: Iterable<Int>) {
    for (number in numbers) {
        if (number.isOdd()) {
            println(number * 2)
        }
    }
}

private fun printAllEvenNumbersPlus2(numbers: Iterable<Int>) {
    for (number in numbers) {
        if (number.isEven()) {
            println(number + 2)
        }
    }
}


private fun addAllEvenNumbersPlus2ToStringBuilder(numbers: Iterable<Int>, appendable: Appendable) {
    for (number in numbers) {
        if (number.isEven()) {
            appendable.appendLine("${number + 2}")
        }
    }
}
