package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.Emotion;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class EmotionJsonMarshaller {
    private static EmotionJsonMarshaller instance;

    public static EmotionJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new EmotionJsonMarshaller();
        }
        return instance;
    }

    public void marshall(Emotion emotion, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (emotion.getType() != null) {
            String type2 = emotion.getType();
            awsJsonWriter.name("Type");
            awsJsonWriter.value(type2);
        }
        if (emotion.getConfidence() != null) {
            Float confidence = emotion.getConfidence();
            awsJsonWriter.name("Confidence");
            awsJsonWriter.value(confidence);
        }
        awsJsonWriter.endObject();
    }
}
