package tinkoff.qa.hometask.enterToKotlin

fun main() {
    print("Введите натруальное число не более 1000: ")
    print(numberInWord(readLine()))

}

internal fun numberInWord(num: String?): String {
    num?.toIntOrNull()?.let {
        return when (it) {
            in 1..999 -> {
                val stringNum = it.toString()
                when (stringNum.length) {
                    3 -> hundredsToText(stringNum)
                    2 -> tensToText(stringNum)
                    1 -> entitiesToText(stringNum[0])
                    else -> "Как так? Тут нельзя оказаться"
                }
            }
            1000 -> return "Тысяча"
            else -> return "Число за пределами диапазона"
        }
    }
    return "Цифры! Дай мне цифры!"
}

private fun entitiesToText(n: Char): String {
    val entities = listOf("Ноль","Один","Два","Три","Четыре","Пять",
        "Шесть","Семь","Восемь","Девять")
    return entities[n.toString().toInt()]
}

private fun tensToText(n: String): String {
    val text: String
    text = when(n[0].toString().toInt()) {
        1 -> {
            val tens = listOf("Десять","Одинадцать","Двенадцать","Тринадцать","Четырнадцать",
                "Пятнадцать,","Шестнадцать","Семнадцать","Восемнадцать","Девятнадцать")
            tens[n[1].toString().toInt()]
        }
        4 -> "Сорок"
        2, 3 -> entitiesToText(n[0]) + "дцать"
        9 -> "Девяносто"
        else -> entitiesToText(n[0]) + "десят"
    }

    return if ((n[0] != '1') and (n[1] != '0')) text + " " + entitiesToText(n[1]) else text

}

private fun hundredsToText(n: String): String {
    val text: String = when (n[0].toString().toInt()) {
        1 -> "Сто"
        2 -> "Двести"
        3 -> "Триста"
        4 -> "Четыреста"
        else -> entitiesToText(n[0]) + "сот"
    }

    return when {
        n[1] != '0' -> text + " " + tensToText(n.drop(1))
        (n[1] == '0') and (n[2] != '0') -> text + " " + entitiesToText(n[2])
        else -> text
    }

}