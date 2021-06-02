package com.jason.kotlin.extension

fun <T> Iterable<T>.randomTake(): T = this.shuffled().first()