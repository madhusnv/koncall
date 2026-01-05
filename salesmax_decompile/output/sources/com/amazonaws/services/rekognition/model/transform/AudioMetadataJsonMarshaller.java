package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.AudioMetadata;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class AudioMetadataJsonMarshaller {
    private static AudioMetadataJsonMarshaller instance;

    public static AudioMetadataJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new AudioMetadataJsonMarshaller();
        }
        return instance;
    }

    public void marshall(AudioMetadata audioMetadata, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (audioMetadata.getCodec() != null) {
            String codec = audioMetadata.getCodec();
            awsJsonWriter.name("Codec");
            awsJsonWriter.value(codec);
        }
        if (audioMetadata.getDurationMillis() != null) {
            Long durationMillis = audioMetadata.getDurationMillis();
            awsJsonWriter.name("DurationMillis");
            awsJsonWriter.value(durationMillis);
        }
        if (audioMetadata.getSampleRate() != null) {
            Long sampleRate = audioMetadata.getSampleRate();
            awsJsonWriter.name("SampleRate");
            awsJsonWriter.value(sampleRate);
        }
        if (audioMetadata.getNumberOfChannels() != null) {
            Long numberOfChannels = audioMetadata.getNumberOfChannels();
            awsJsonWriter.name("NumberOfChannels");
            awsJsonWriter.value(numberOfChannels);
        }
        awsJsonWriter.endObject();
    }
}
