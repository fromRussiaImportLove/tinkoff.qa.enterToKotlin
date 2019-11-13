import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import tinkoff.qa.hometask.enterToKotlin.reverseFunc

internal class KotlinHometask2KtTest {

    @Test
    internal fun testEnterAndRecieveDataTwoDigital() {
        val num = "42"
        assertEquals("24", reverseFunc(num), "Wrong result")
    }

    @Test
    internal fun testEnterAndRecieveDataFourDigitalWithZero() {
        val num = "1000"
        assertEquals("0001", reverseFunc(num), "Wrong result")
    }
}