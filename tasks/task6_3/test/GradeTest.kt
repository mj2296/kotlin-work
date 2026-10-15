// Task 6.3: unit tests for grade()

import kotlin.test.Test
import kotlin.test.assertEquals

class GradeTest {
    // Distinction: 70 to 100
    @Test
    fun `Mark of 70 gives a Distinction`() {
        assertEquals("Distinction", grade(70))
    }

    @Test
    fun `Mark of 85 gives a Distinction`() {
        assertEquals("Distinction", grade(85))
    }

    @Test
    fun `Mark of 100 gives a Distinction`() {
        assertEquals("Distinction", grade(100))
    }

    // Pass: 40 to 69
    @Test
    fun `Mark of 40 gives a Pass`() {
        assertEquals("Pass", grade(40))
    }

    @Test
    fun `Mark of 55 gives a Pass`() {
        assertEquals("Pass", grade(55))
    }

    @Test
    fun `Mark of 69 gives a Pass`() {
        assertEquals("Pass", grade(69))
    }

    // Fail: 0 to 39
    @Test
    fun `Mark of 0 gives a Fail`() {
        assertEquals("Fail", grade(0))
    }

    @Test
    fun `Mark of 20 gives a Fail`() {
        assertEquals("Fail", grade(20))
    }

    @Test
    fun `Mark of 39 gives a Fail`() {
        assertEquals("Fail", grade(39))
    }

    // Invalid: below 0
    @Test
    fun `Mark of -1 gives a question mark`() {
        assertEquals("?", grade(-1))
    }

    @Test
    fun `Mark of -50 gives a question mark`() {
        assertEquals("?", grade(-50))
    }

    // Invalid: above 100
    @Test
    fun `Mark of 101 gives a question mark`() {
        assertEquals("?", grade(101))
    }

    @Test
    fun `Mark of 150 gives a question mark`() {
        assertEquals("?", grade(150))
    }
}
