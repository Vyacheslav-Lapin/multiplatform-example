package org.example.kmp.common

expect class RequestBack {
    suspend fun request(query: String): SimpleDTO
}
