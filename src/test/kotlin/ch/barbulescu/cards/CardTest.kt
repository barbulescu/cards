package ch.barbulescu.cards

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CardTest {

    @Test
    fun `card reverse`() {
        val direct = Card(front = "a", back = "b")
        val reversed = direct.reverse()

        assertThat(reversed).isEqualTo(Card(front = "b", back = "a"))
    }

    @Test
    fun `card double reverse is direct`() {
        val direct = Card(front = "a", back = "b")
        val reversed = direct.reverse().reverse()

        assertThat(reversed).isEqualTo(direct)
    }
}
