package code.cover.covermykotlincode

import org.junit.Assert.assertEquals
import org.junit.Test

class AddingTest {

    @Test
    fun testAddMethod() {

        val a = Adding()
        val result = a.add(3, 4)

        assertEquals(result, 7)
    }

}