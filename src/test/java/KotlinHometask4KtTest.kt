import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import tinkoff.qa.hometask.enterToKotlin.sortArrayFunc

internal class KotlinHometask4KtTest {

    @Test
    fun testSortingArrayWithTwoNegativeAndTwoPositive() {
        val array = arrayListOf<Int>(42, -42, 1, -1)
        assertEquals(arrayListOf<Int>(-1,-42,42,1), sortArrayFunc(array), "Не правильный массив вернулся")
    }

    @Test
    fun testSortingArrayWithOnlyNonNegative() {
        val array = arrayListOf<Int>(42, 0, 1)
        assertEquals(arrayListOf<Int>(42, 0, 1), sortArrayFunc(array), "Не правильный массив вернулся")
    }

    @Test
    fun testSortingArrayWithOnlyNegative() {
        val array = arrayListOf<Int>(-42, -1, -2)
        assertEquals(arrayListOf<Int>(-2, -1,-42), sortArrayFunc(array), "Не правильный массив вернулся")
    }

    @Test
    fun testSortingArrayWithoutNumbers() {
        val array = arrayListOf<Int>()
        assertEquals(arrayListOf<Int>(), sortArrayFunc(array), "Не правильный массив вернулся")
    }

    @Test
    fun testSortingArrayWithNegativeAndZero() {
        val array = arrayListOf<Int>(0, -42, 0, -42)
        assertEquals(arrayListOf<Int>(-42, -42, 0, 0), sortArrayFunc(array), "Не правильный массив вернулся")
    }
}