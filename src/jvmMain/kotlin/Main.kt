package com.github.viktorbll.main

import kotlinx.atomicfu.*

val atomint = atomic(0)

fun main() {
    atomint.incrementAndGet()
    println("Hi atomic, $atomint")
}