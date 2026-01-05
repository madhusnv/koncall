package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.EyeOpen;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class EyeOpenJsonMarshaller {
    private static EyeOpenJsonMarshaller instance;

    public static EyeOpenJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new EyeOpenJsonMarshaller();
        }
        return instance;
    }

    public void marshall(EyeOpen eyeOpen, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (eyeOpen.getValue() != null) {
            Boolean value = eyeOpen.getValue();
            awsJsonWriter.name("Value");
            awsJsonWriter.value(value.booleanValue());
        }
        if (eyeOpen.getConfidence() != null) {
            Float confidence = eyeOpen.getConfidence();
            awsJsonWriter.name("Confidence");
            awsJsonWriter.value(confidence);
        }
        awsJsonWriter.endObject();
    }
}
