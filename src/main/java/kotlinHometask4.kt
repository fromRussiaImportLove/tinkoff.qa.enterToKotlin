package tinkoff.qa.hometask.enterToKotlin

fun main(){
    print("Введи длинну массива: ")
    val n = readLine()?.toIntOrNull()
    val intArray = ArrayList<Int>()
    if ((n != null) and (n in 1..65535)) {
        n as Int
        println("Заполним массив. Вводи числа по одному: ")
        for (i in 0 until n) {
            var t: Int? = null
            while (t == null) {
                t = readLine()?.toIntOrNull()
                if (t != null) {
                    intArray.add(t)
                } else {
                    print("Число! Мне нужно цельное число! Попробуй еще раз: ")
                }
            }
        }
    } else {
        print("Нужно число в диапазоне от 1 до 65535")
    }

    println(sortArrayFunc(intArray))
}

internal fun sortArrayFunc(intArray: ArrayList<Int>): ArrayList<Int> {
    val sortdArray = mutableListOf<Int>()

    for (i in intArray) {
        if (i < 0) {
            sortdArray.add(0,i)
        } else {
            sortdArray.add(i)
        }
    }

    val srtdArray = ArrayList<Int>(sortdArray)

    return srtdArray
}

private fun forMyMemory() {

    val intArray = listOf(4, 3, -5, -2, 0, 2, 1)
    val srtArray = intArray.sorted()
    val srtdArray = intArray.filter { it < 0 }.union(intArray)

    val sortdArray = mutableListOf<Int>()

    for (i in intArray) {
        if (i < 0) {
            sortdArray.add(0,i)
        } else {
            sortdArray.add(i)
        }
    }

    println(srtArray)
    println(srtdArray)
    println(sortdArray)
}

