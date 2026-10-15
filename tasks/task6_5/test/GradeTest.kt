// Task 6.5: coarse-grained unit tests for grade(), using Kotest

import io.kotest.assertions.assertSoftly
import io.kotest.assertions.withClue
import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

class GradeTest : FreeSpec({
    "Marks between 70 and 100 give a Distinction" {
        assertSoftly {
            withClue("Mark=70") { grade(70) shouldBe "Distinction" }
            withClue("Mark=85") { grade(85) shouldBe "Distinction" }
            withClue("Mark=100") { grade(100) shouldBe "Distinction" }
        }
    }

    "Marks between 40 and 69 give a Pass" {
        assertSoftly {
            withClue("Mark=40") { grade(40) shouldBe "Pass" }
            withClue("Mark=55") { grade(55) shouldBe "Pass" }
            withClue("Mark=69") { grade(69) shouldBe "Pass" }
        }
    }

    "Marks between 0 and 39 give a Fail" {
        assertSoftly {
            withClue("Mark=0") { grade(0) shouldBe "Fail" }
            withClue("Mark=20") { grade(20) shouldBe "Fail" }
            withClue("Mark=39") { grade(39) shouldBe "Fail" }
        }
    }

    "Marks below 0 give a question mark" {
        assertSoftly {
            withClue("Mark=-1") { grade(-1) shouldBe "?" }
            withClue("Mark=-50") { grade(-50) shouldBe "?" }
        }
    }

    "Marks above 100 give a question mark" {
        assertSoftly {
            withClue("Mark=101") { grade(101) shouldBe "?" }
            withClue("Mark=150") { grade(150) shouldBe "?" }
        }
    }
})