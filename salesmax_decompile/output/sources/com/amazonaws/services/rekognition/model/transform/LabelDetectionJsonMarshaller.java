package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.Label;
import com.amazonaws.services.rekognition.model.LabelDetection;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class LabelDetectionJsonMarshaller {
    private static LabelDetectionJsonMarshaller instance;

    public static LabelDetectionJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new LabelDetectionJsonMarshaller();
        }
        return instance;
    }

    public void marshall(LabelDetection labelDetection, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (labelDetection.getTimestamp() != null) {
            Long timestamp = labelDetection.getTimestamp();
            awsJsonWriter.name("Timestamp");
            awsJsonWriter.value(timestamp);
        }
        if (labelDetection.getLabel() != null) {
            Label label = labelDetection.getLabel();
            awsJsonWriter.name("Label");
            LabelJsonMarshaller.getInstance().marshall(label, awsJsonWriter);
        }
        if (labelDetection.getStartTimestampMillis() != null) {
            Long startTimestampMillis = labelDetection.getStartTimestampMillis();
            awsJsonWriter.name("StartTimestampMillis");
            awsJsonWriter.value(startTimestampMillis);
        }
        if (labelDetection.getEndTimestampMillis() != null) {
            Long endTimestampMillis = labelDetection.getEndTimestampMillis();
            awsJsonWriter.name("EndTimestampMillis");
            awsJsonWriter.value(endTimestampMillis);
        }
        if (labelDetection.getDurationMillis() != null) {
            Long durationMillis = labelDetection.getDurationMillis();
            awsJsonWriter.name("DurationMillis");
            awsJsonWriter.value(durationMillis);
        }
        awsJsonWriter.endObject();
    }
}
