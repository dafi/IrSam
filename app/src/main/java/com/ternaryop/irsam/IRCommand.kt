package com.ternaryop.irsam

abstract class IRCommand internal constructor(irData: String) {
    val frequency = 38400
    val pattern: IntArray

    init {
        pattern = irData.split(", ").map {
            it.toInt() }.toIntArray()
//        parseFrequency(irData)
    }

    private fun parseFrequency(irData: String) {
        val list = irData.split(" ").toMutableList()
        list.removeAt(0)
        var frequency: Int = list.removeAt(0).toInt(16) // frequency
        list.removeAt(0)
        list.removeAt(0)
        frequency = (1000000 / (frequency * 0.241246)).toInt()
        val pulses = 1000000 / frequency
        var count: Int
        val pattern = IntArray(list.size)
        for (i in list.indices) {
            count = list[i].toInt(16)
            pattern[i] = count * pulses
        }
//        this.frequency = frequency
//        this.pattern = pattern
    }
}