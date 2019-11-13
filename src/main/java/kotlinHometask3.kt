package tinkoff.qa.hometask.enterToKotlin

fun main() {
    print("Введите номер месяца: ")
    val indexMonth = readLine()!!
        indexMonth.toIntOrNull()?.let {
            when(it) {
                1, 2, 12-> print("Зима")
                in 3..5 -> print("Весна")
                in 6..8 -> print("Лето")
                in 9..11 -> print("Осень")
            }
    }
}