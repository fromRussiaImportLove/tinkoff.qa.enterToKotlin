import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import tinkoff.qa.hometask.enterToKotlin.numberInWord

internal class KotlinHometask5KtTest {

    @Test
    fun testNumEntitiesInWords() {
        val num =  1
        assertEquals("Один", numberInWord(num.toString()), "Ошибка при преобразовании числа $num")
    }

    @Test
    fun testNumTenRoundInWords() {
        val num =  10
        assertEquals("Десять", numberInWord(num.toString()), "Ошибка при преобразовании числа $num")
    }

    @Test
    fun testNumTenNotRoundInWords() {
        val num =  11
        assertEquals("Одинадцать", numberInWord(num.toString()), "Ошибка при преобразовании числа $num")
    }

    @Test
    fun testNumTensRoundInWords() {
        val num =  40
        assertEquals("Сорок", numberInWord(num.toString()), "Ошибка при преобразовании числа $num")
    }

    @Test
    fun testNumTensNotRoundWords() {
        val num =  42
        assertEquals("Сорок Два", numberInWord(num.toString()), "Ошибка при преобразовании числа $num")
    }

    @Test
    fun testNumHundredRoundInWords() {
        val num =  100
        assertEquals("Сто", numberInWord(num.toString()), "Ошибка при преобразовании числа $num")
    }

    @Test
    fun testNumHundredWithTenRoundInWords() {
        val num =  110
        assertEquals("Сто Десять", numberInWord(num.toString()), "Ошибка при преобразовании числа $num")
    }

    @Test
    fun testNumHundredWitnTenNotRoundInWords() {
        val num =  111
        assertEquals("Сто Одинадцать", numberInWord(num.toString()), "Ошибка при преобразовании числа $num")
    }

    @Test
    fun testNumHundredsInWords() {
        val num =  900
        assertEquals("Девятьсот", numberInWord(num.toString()), "Ошибка при преобразовании числа $num")
    }

    @Test
    fun testNumHundredsWithTenRoundInWords() {
        val num =  990
        assertEquals("Девятьсот Девяносто", numberInWord(num.toString()), "Ошибка при преобразовании числа $num")
    }

    @Test
    fun testNumHundredsWithTenNotRoundInWords() {
        val num =  999
        assertEquals("Девятьсот Девяносто Девять", numberInWord(num.toString()), "Ошибка при преобразовании числа $num")
    }

    @Test
    fun testNumHundredsWithoutTenInWords() {
        val num =  902
        assertEquals("Девятьсот Два", numberInWord(num.toString()), "Ошибка при преобразовании числа $num")
    }

    @Test
    fun testNumHundredWithounTenInWords() {
        val num =  107
        assertEquals("Сто Семь", numberInWord(num.toString()), "Ошибка при преобразовании числа $num")
    }

    @Test
    fun testThousandInWords() {
        val num =  1000
        assertEquals("Тысяча", numberInWord(num.toString()), "Ошибка при преобразовании числа $num")
    }

    @Test
    fun testWrongData() {
        val wrong = listOf<Any?>("",-3.14,'k',null,"kokote")
        for (num in wrong) assertEquals("Цифры! Дай мне цифры!", numberInWord(num.toString()), "Ошибка при преобразовании числа $num")
    }

    @Test
    fun testOutofRangeNumber() {
        val nums = listOf(-1,0,1001)
        for (num in nums) assertEquals("Число за пределами диапазона", numberInWord(num.toString()), "Не правильная ошибка при вводе $num")
    }
}