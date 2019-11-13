import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import tinkoff.qa.hometask.enterToKotlin.seasonID

internal class KotlinHometask3KtTest {
    @Test
    internal fun testSummer() {
        for (month in 6..8) assertEquals("Лето", seasonID(month.toString()), "Wrong result for $month")
    }

    @Test
    internal fun testSpring() {
        for (month in 3..5) assertEquals("Весна", seasonID(month.toString()), "Wrong result for $month")
    }

    @Test
    internal fun testAutumn() {
        for (month in 9..11) assertEquals("Осень", seasonID(month.toString()), "Wrong result for $month")
    }

    @Test
    internal fun testWinter() {
        val months = listOf<Int>(1,2,12)
        for (month in months) assertEquals("Зима", seasonID(month.toString()), "Wrong result for $month")
    }

    @Test
    internal fun testWrong() {
        val wrong = listOf<Int>(42,-13,0)
        for (month in wrong) assertEquals("Номер месяца ошибочен", seasonID(month.toString()), "False positive result for $month")
    }

    @Test
    internal fun testWrongDataFormat() {
        val wrong = listOf<Any?>("",-3.14,'k',null,"kokote")
        for (month in wrong) assertEquals("Цифры! Мне нужны цифры!", seasonID(month.toString()), "False positive result for $month")
    }
}