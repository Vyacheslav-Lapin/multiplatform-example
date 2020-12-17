package org.example.kmp.common

import kotlinx.coroutines.delay
import kotlin.random.Random

actual class RequestBack {
    private val random = Random(191919L)
    actual suspend fun request(query: String): SimpleDTO {
        delay(1000L)
        return SimpleDTO(
            stringProp = "jvm code",
            intProp = random.nextInt(99),
            boolProp = true
        )
    }
}
