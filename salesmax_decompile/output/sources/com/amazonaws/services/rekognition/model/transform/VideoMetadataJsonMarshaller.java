package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.VideoMetadata;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class VideoMetadataJsonMarshaller {
    private static VideoMetadataJsonMarshaller instance;

    public static VideoMetadataJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new VideoMetadataJsonMarshaller();
        }
        return instance;
    }

    public void marshall(VideoMetadata videoMetadata, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (videoMetadata.getCodec() != null) {
            String codec = videoMetadata.getCodec();
            awsJsonWriter.name("Codec");
            awsJsonWriter.value(codec);
        }
        if (videoMetadata.getDurationMillis() != null) {
            Long durationMillis = videoMetadata.getDurationMillis();
            awsJsonWriter.name("DurationMillis");
            awsJsonWriter.value(durationMillis);
        }
        if (videoMetadata.getFormat() != null) {
            String format = videoMetadata.getFormat();
            awsJsonWriter.name("Format");
            awsJsonWriter.value(format);
        }
        if (videoMetadata.getFrameRate() != null) {
            Float frameRate = videoMetadata.getFrameRate();
            awsJsonWriter.name("FrameRate");
            awsJsonWriter.value(frameRate);
        }
        if (videoMetadata.getFrameHeight() != null) {
            Long frameHeight = videoMetadata.getFrameHeight();
            awsJsonWriter.name("FrameHeight");
            awsJsonWriter.value(frameHeight);
        }
        if (videoMetadata.getFrameWidth() != null) {
            Long frameWidth = videoMetadata.getFrameWidth();
            awsJsonWriter.name("FrameWidth");
            awsJsonWriter.value(frameWidth);
        }
        if (videoMetadata.getColorRange() != null) {
            String colorRange = videoMetadata.getColorRange();
            awsJsonWriter.name("ColorRange");
            awsJsonWriter.value(colorRange);
        }
        awsJsonWriter.endObject();
    }
}
