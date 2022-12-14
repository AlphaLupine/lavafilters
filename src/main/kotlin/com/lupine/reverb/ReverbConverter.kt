package com.lupine.reverb

import com.github.natanbc.lavadsp.Converter

class ReverbConverter : Converter {

    override fun process(input: FloatArray?, inputOffset: Int, output: FloatArray, outputOffset: Int, samples: Int) {

        val fdn = FeedBackDelay()
        fdn.addDelayLine(100, .5f)
        fdn.addDelayLine(200, .4f)
        fdn.addDelayLine(300, .3f)

        if(input != null) {
            for(i in input.indices) {
                output[i] = fdn.process(input[i])
            }
        }
    }
}