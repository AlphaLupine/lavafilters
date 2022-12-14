package com.lupine.reverb

import com.github.natanbc.lavadsp.ConverterPcmAudioFilter
import com.sedmelluq.discord.lavaplayer.filter.FloatPcmAudioFilter

class ReverbPcmAudioFilter(
    downstream: FloatPcmAudioFilter,
    channelCount: Int,
) : ConverterPcmAudioFilter<ReverbConverter>(ReverbConverter(), downstream, channelCount)