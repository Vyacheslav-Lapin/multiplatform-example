package org.example.kmp.common

import kotlinx.coroutines.runBlocking
import org.junit.Test
import kotlin.test.assertTrue

class RequestBackJsmTest {

    @Test
    fun requestJvm() {
        runBlocking {
            val obj = RequestBack().request("yyy")
            assertTrue { obj.boolProp }
        }
    }
}
