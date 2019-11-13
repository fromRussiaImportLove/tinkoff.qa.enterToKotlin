package tinkoff.qa.hometask.enterToKotlin

fun main() {
    print("Введите число: ")
    println(reverseFunc(readLine().toString()))
}

internal fun reverseFunc(stringInput: String): String {
    return stringInput.reversed()
}

