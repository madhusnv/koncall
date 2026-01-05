package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.ContentModerationDetection;
import com.amazonaws.services.rekognition.model.ModerationLabel;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class ContentModerationDetectionJsonMarshaller {
    private static ContentModerationDetectionJsonMarshaller instance;

    public static ContentModerationDetectionJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new ContentModerationDetectionJsonMarshaller();
        }
        return instance;
    }

    public void marshall(ContentModerationDetection contentModerationDetection, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (contentModerationDetection.getTimestamp() != null) {
            Long timestamp = contentModerationDetection.getTimestamp();
            awsJsonWriter.name("Timestamp");
            awsJsonWriter.value(timestamp);
        }
        if (contentModerationDetection.getModerationLabel() != null) {
            ModerationLabel moderationLabel = contentModerationDetection.getModerationLabel();
            awsJsonWriter.name("ModerationLabel");
            ModerationLabelJsonMarshaller.getInstance().marshall(moderationLabel, awsJsonWriter);
        }
        if (contentModerationDetection.getStartTimestampMillis() != null) {
            Long startTimestampMillis = contentModerationDetection.getStartTimestampMillis();
            awsJsonWriter.name("StartTimestampMillis");
            awsJsonWriter.value(startTimestampMillis);
        }
        if (contentModerationDetection.getEndTimestampMillis() != null) {
            Long endTimestampMillis = contentModerationDetection.getEndTimestampMillis();
            awsJsonWriter.name("EndTimestampMillis");
            awsJsonWriter.value(endTimestampMillis);
        }
        if (contentModerationDetection.getDurationMillis() != null) {
            Long durationMillis = contentModerationDetection.getDurationMillis();
            awsJsonWriter.name("DurationMillis");
            awsJsonWriter.value(durationMillis);
        }
        awsJsonWriter.endObject();
    }
}
