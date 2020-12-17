package org.example.kmp.common

import kotlin.test.Test
import kotlin.test.assertTrue

class RequestBackJsTest {
    @Test
    fun requestJS() {
        RequestBack().requestPromise("zzz").then {
            assertTrue { it.boolProp }
        }
    }
}
