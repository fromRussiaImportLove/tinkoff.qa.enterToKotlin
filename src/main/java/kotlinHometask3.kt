package tinkoff.qa.hometask.enterToKotlin

fun main() {
    print("Введите номер месяца: ")
    print(seasonID(readLine()))

}

internal fun seasonID(indexMonth: String?): String {
        indexMonth?.toIntOrNull()?.let {
            return when(it) {
                1, 2, 12-> ("Зима")
                in 3..5 -> ("Весна")
                in 6..8 -> ("Лето")
                in 9..11 -> ("Осень")
                else -> ("Номер месяца ошибочен")
            }
    }
    return "Цифры! Мне нужны цифры!"
}