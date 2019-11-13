package tinkoff.qa.hometask.enterToKotlin

fun main() {
    print("Введите число: ")
    val stringInput = readLine()!!
    println(inputNumber(stringInput))
}

internal fun inputNumber(stringInput: String): String {
    stringInput.toIntOrNull()?.let {
        return "Вы ввели число: $stringInput"
    }
    return "Ошибка ввода"
}