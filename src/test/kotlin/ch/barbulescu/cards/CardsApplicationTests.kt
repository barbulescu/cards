package ch.barbulescu.cards

import io.github.oshai.kotlinlogging.KotlinLogging
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class CardsApplicationTests {

    private val log = KotlinLogging.logger {}

    @Test
    fun `check whether Spring context is loaded correctly`() {
        log.info { "Spring context is loaded correctly!" }
    }

}
