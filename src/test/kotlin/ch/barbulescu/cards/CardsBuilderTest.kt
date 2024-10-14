package ch.barbulescu.cards

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CardsBuilderTest {
    @Test
    fun `build simple cards`() {
        val cards = buildCards {
            card(front = "a", back = "b")
        }

        val expected = Cards(data = setOf("a" pair "b"))
        assertThat(cards).isEqualTo(expected)
    }
}
