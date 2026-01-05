package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.Gender;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class GenderJsonMarshaller {
    private static GenderJsonMarshaller instance;

    public static GenderJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new GenderJsonMarshaller();
        }
        return instance;
    }

    public void marshall(Gender gender, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (gender.getValue() != null) {
            String value = gender.getValue();
            awsJsonWriter.name("Value");
            awsJsonWriter.value(value);
        }
        if (gender.getConfidence() != null) {
            Float confidence = gender.getConfidence();
            awsJsonWriter.name("Confidence");
            awsJsonWriter.value(confidence);
        }
        awsJsonWriter.endObject();
    }
}
