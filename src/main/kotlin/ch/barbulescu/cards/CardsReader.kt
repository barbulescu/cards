package ch.barbulescu.cards

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.decodeFromStream
import java.io.InputStream

@OptIn(ExperimentalSerializationApi::class)
fun InputStream.readCards(): Cards {
    return Json.decodeFromStream<Cards>(this)
}
