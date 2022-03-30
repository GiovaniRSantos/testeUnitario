import org.junit.jupiter.api.*

class MainTest {

    @Test
    @DisplayName("Test method testCountXO")
    fun testCountXO() {
        Assertions.assertTrue(contXO("xxoo"))
        Assertions.assertTrue(contXO("xxoO"))
        Assertions.assertTrue(contXO("xXoo"))
        Assertions.assertFalse(contXO("xxxo"))
        Assertions.assertFalse(contXO("xxXo"))
    }

    @Disabled
    @DisplayName("Disabled Test")
    fun disabled() {
        fail("Não posso terminar os testes sem esse metodo")
    }

    @Test
    @DisplayName("Test AssumeTrue")
    fun assumption() {
        Assumptions.assumeTrue(contXO("xxoo"))
        Assertions.assertTrue(methodTest())
    }

    @Test
    @DisplayName("Test Exception")
    fun testException() {
        assertThrows<java.lang.NullPointerException> {
            TestException()
        }
    }

    @Test
    @DisplayName("Test If Else")
    fun testIfElse() {
        Assertions.assertTrue(olderAge(19))
        Assertions.assertFalse(olderAge(17))
    }

    @Test
    @DisplayName("Test fail")
    fun failTest() {
        fail("Não posso terminar os testes sem esse metodo")
    }


}