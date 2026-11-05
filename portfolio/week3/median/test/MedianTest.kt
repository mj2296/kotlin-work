// COMP2850 Portfolio: Week 3
// Tests for median()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }
    }

    // Write four more tests here
    
    "Median correct when size is 3" {
        median(listOf(8f, 1f, 5f)) shouldBe (5f plusOrMinus tolerance)
    }

    "Median correct when size is 1" {
        median(listOf(6.5f)) shouldBe (6.5f plusOrMinus tolerance)
    }

    "Median correct when size is 2" {
        median(listOf(9f, 6f)) shouldBe (7.5f plusOrMinus tolerance)
    }
    
    "Median correct when size is 4" {
        median(listOf(9f,6f,1f,12f)) shouldBe (7.5f plusOrMinus tolerance)
    }
})


