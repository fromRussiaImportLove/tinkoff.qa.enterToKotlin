import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import tinkoff.qa.hometask.enterToKotlin.inputNumber

//import kotlinHometask1


class KotlinHometask1KtTest {

//    @org.junit.jupiter.api.Test

    @Test
    internal fun testEnterAndRecieveData() {
        val num = "42"
        assertEquals("Вы ввели число: 42", inputNumber(num), "Wrong result")
    }

    @Test
    internal fun testEnterAndRecieveErrorMessage() {
        val num = ""
        assertEquals("Ошибка ввода", inputNumber(num), "Wrong result")
    }

}