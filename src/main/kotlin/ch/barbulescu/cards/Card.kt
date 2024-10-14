package ch.barbulescu.cards
import kotlinx.serialization.Serializable

@Serializable
data class Card(val front: String, val back: String) {
    fun reverse(): Card = Card(back, front)
}

infix fun String.pair(back: String) = Card(front = this, back = back)

@Serializable
data class Cards(val data: Set<Card>)
