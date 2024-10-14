package ch.barbulescu.cards

import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Component

@SpringBootApplication
class CardsApplication

fun main(args: Array<String>) {
    runApplication<CardsApplication>(args = args)
}

@Component
class Playground : ApplicationRunner {
    override fun run(args: ApplicationArguments?) {
        createData().forEach { (front, back) ->
            print("front: $front")
            readlnOrNull()
            println("back: $back")
        }
    }

    private fun createData(): List<Card> = listOf(
        "slow" pair "langsam",
        "fast" pair "schnell",
        "big" pair "gross",
        "small" pair "klein",
    ).shuffled()
}
