import org.example.abc
import org.example.countXO
import org.junit.jupiter.api.*

class MainTeste {

    @Test
    fun provocacao(){
        Assertions.assertNotNull(countXO("ASUHDASDHIUA"))
        Assertions.assertNotNull(countXO("xxoo"))
        Assertions.assertNotNull(countXO("xxxo"))

    }

    @Test
    @DisplayName("Teste Metodo xxoo")
    fun testCountXO(){

        Assertions.assertAll(
            {Assertions.assertTrue(countXO("xxoo"))},
            {Assertions.assertTrue(countXO("xxoO"))},
        )
    }

    @Test
    @Disabled
    fun naoImplementado(){

    }

    @Test
    fun vaiFalhar(){
    }

    @Test
    fun assumption(){
       Assumptions.assumeTrue(countXO("xxo"))
        Assertions.assertTrue(abc())
    }

    fun exception(){
        assertThrows<NullPointerException> {  abc() }
    }
}