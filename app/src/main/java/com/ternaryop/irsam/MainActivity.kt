package com.ternaryop.irsam

import android.content.Context
import android.hardware.ConsumerIrManager
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var helper: ConsumerIrManagerHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        helper = ConsumerIrManagerHelper(getSystemService(Context.CONSUMER_IR_SERVICE) as ConsumerIrManager)

        findViewById<Button>(R.id.hdm1).setOnClickListener {
            helper.transmitIRCommand(SamsungTvIRCommand.TV_HDMI1)
        }

        findViewById<Button>(R.id.hdm2).setOnClickListener {
            helper.transmitIRCommand(SamsungTvIRCommand.TV_HDMI2)
        }

        findViewById<Button>(R.id.pc1).setOnClickListener {
            helper.transmitIRCommand(SamsungTvIRCommand.TV_PC1)
        }

        findViewById<Button>(R.id.pc2).setOnClickListener {
            helper.transmitIRCommand(SamsungTvIRCommand.TV_PC2)
        }

    }
}
