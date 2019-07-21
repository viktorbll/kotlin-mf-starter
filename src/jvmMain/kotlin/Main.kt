package com.github.viktorbll.main

import kotlinx.atomicfu.*

private val _atomint = atomic(0)

fun main() {
    _atomint.incrementAndGet()
    println("Hi atomic, ${_atomint.value}")
}