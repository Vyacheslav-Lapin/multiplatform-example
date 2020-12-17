package org.example.kmp.common

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.promise
import kotlin.js.Promise
import kotlin.random.Random

actual class RequestBack {

    private val random = Random(3945873498L)

    actual suspend fun request(query: String): SimpleDTO {
        delay(1000L)
        return SimpleDTO(
            stringProp = "js code",
            intProp = random.nextInt(99) + 100,
            boolProp = true
        )
    }

    @JsName("requestPromise")
    fun requestPromise(query: String): Promise<SimpleDTO> = GlobalScope.promise {
        request(query)
    }
}
