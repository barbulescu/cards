package ch.barbulescu.cards

data class Card(val front: String, val back: String) {
    fun reverse(): Card = Card(back, front)
}

infix fun String.pair(back: String) = Card(front = this, back = back)
