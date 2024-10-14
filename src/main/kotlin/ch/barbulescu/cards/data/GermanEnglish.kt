package ch.barbulescu.cards.data

import ch.barbulescu.cards.buildCards

val germanEnglish = buildCards {
    card(front = "slow", back = "langsam")
    card(front = "fast", back = "schnell")
    card(front = "big", back = "gross")
    card(front = "small", back = "klein")
}
