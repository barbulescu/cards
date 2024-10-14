package ch.barbulescu.cards

fun buildCards(block: CardsBuilder.() -> Unit): Cards {
    val builder = CardsBuilder()
    block(builder)
    return Cards(data = builder.build())
}

class CardsBuilder {
    private val data = mutableSetOf<Card>()

    fun card(front: String, back: String) {
        data.add(front.pair(back))
    }

    fun build(): Set<Card> = data.toSet()
}
