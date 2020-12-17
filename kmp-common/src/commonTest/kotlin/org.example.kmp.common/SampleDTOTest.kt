package org.example.kmp.common

import kotlin.js.JsName
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class SampleDTOTest {

    @Test
    @JsName("constructorWorks")
    fun `конструктор работает`() {
        val obj = SimpleDTO(
            stringProp = "one",
            intProp = 2,
            boolProp = true
        )
        assertEquals("one", obj.stringProp)
        assertEquals(2, obj.intProp)
        assertTrue { obj.boolProp }

    }
}

