package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.Sunglasses;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class SunglassesJsonMarshaller {
    private static SunglassesJsonMarshaller instance;

    public static SunglassesJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new SunglassesJsonMarshaller();
        }
        return instance;
    }

    public void marshall(Sunglasses sunglasses, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (sunglasses.getValue() != null) {
            Boolean value = sunglasses.getValue();
            awsJsonWriter.name("Value");
            awsJsonWriter.value(value.booleanValue());
        }
        if (sunglasses.getConfidence() != null) {
            Float confidence = sunglasses.getConfidence();
            awsJsonWriter.name("Confidence");
            awsJsonWriter.value(confidence);
        }
        awsJsonWriter.endObject();
    }
}
