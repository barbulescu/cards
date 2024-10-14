package ch.barbulescu.cards

import ch.barbulescu.cards.data.germanEnglish
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
        germanEnglish.data.forEach { (front, back) ->
            print("front: $front")
            readlnOrNull()
            println("back: $back")
        }
    }

}
