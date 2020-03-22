package com.ternaryop.irsam

import android.hardware.ConsumerIrManager

class ConsumerIrManagerHelper(private val consumerIrManager: ConsumerIrManager) {
    fun transmitIRCommand(irCommand: IRCommand) {
        consumerIrManager.transmit(irCommand.frequency, irCommand.pattern)
    }

}