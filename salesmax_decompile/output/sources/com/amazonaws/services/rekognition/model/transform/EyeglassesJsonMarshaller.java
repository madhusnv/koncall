package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.Eyeglasses;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class EyeglassesJsonMarshaller {
    private static EyeglassesJsonMarshaller instance;

    public static EyeglassesJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new EyeglassesJsonMarshaller();
        }
        return instance;
    }

    public void marshall(Eyeglasses eyeglasses, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (eyeglasses.getValue() != null) {
            Boolean value = eyeglasses.getValue();
            awsJsonWriter.name("Value");
            awsJsonWriter.value(value.booleanValue());
        }
        if (eyeglasses.getConfidence() != null) {
            Float confidence = eyeglasses.getConfidence();
            awsJsonWriter.name("Confidence");
            awsJsonWriter.value(confidence);
        }
        awsJsonWriter.endObject();
    }
}
