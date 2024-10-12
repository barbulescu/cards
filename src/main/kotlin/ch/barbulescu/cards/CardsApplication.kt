package ch.barbulescu.cards

import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Component
import kotlin.random.Random

@SpringBootApplication
class CardsApplication

fun main(args: Array<String>) {
    runApplication<CardsApplication>(*args)
}

@Component
class Playground : ApplicationRunner {
    override fun run(args: ApplicationArguments?) {
        val data = createData()
        data.forEach {
            val front = it.first
            val back = it.second

            print("front: $front")
            readln()
            println("back: $back")
        }
    }

    private fun createData(): List<Pair<String, String>> = listOf(
        "slow" to "langsam",
        "fast" to "schnell",
        "big" to "gross",
        "small" to "klein",
    ).shuffled()

}