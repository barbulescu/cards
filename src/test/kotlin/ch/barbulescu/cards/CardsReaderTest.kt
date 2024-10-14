package ch.barbulescu.cards

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.MissingFieldException
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.intellij.lang.annotations.Language
import org.junit.jupiter.api.Test

@OptIn(ExperimentalSerializationApi::class)
class CardsReaderTest {

    @Test
    fun `read empty content`() {
        assertThatThrownBy {
            "".byteInputStream().readCards()
        }.hasMessageStartingWith("Expected start of the object '{', but had 'EOF' instead at path: \$")
    }

    @Test
    fun `read empty json content`() {
        assertThatThrownBy {
            "{}".byteInputStream().readCards()
        }.isInstanceOf(MissingFieldException::class.java)
    }

    @Test
    fun `read single card`() {
        val content = """{
          "data": [
            {
              "front": "a",
              "back": "b"
            }
          ]
        }""".trimIndent()

        @Language("JSON")
        val cards = content.byteInputStream().readCards()
        val expected = Cards(data = setOf(Card(front = "a", back = "b")))
        assertThat(cards).isEqualTo(expected)
    }
}
