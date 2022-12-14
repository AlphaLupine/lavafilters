package com.lupine.reverb

class FeedBackDelay {
    private val delayLines = ArrayList<DelayLine>()

    fun addDelayLine(delay: Int, gain: Float) {
        delayLines.add(DelayLine(delay, gain))
    }

    fun process(input: Float): Float {
        var output = input

        for (delayLine in delayLines) {
            output = delayLine.process(output)
        }

        return output
    }
}

class DelayLine(private val delay: Int, private val gain: Float) {
    private val buffer = FloatArray(delay)
    private var index = 0

    fun process(input: Float): Float {
        val output = buffer[index]
        buffer[index] = input + output * gain
        index = (index + 1) % delay
        return output
    }
}