package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.MouthOpen;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class MouthOpenJsonMarshaller {
    private static MouthOpenJsonMarshaller instance;

    public static MouthOpenJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new MouthOpenJsonMarshaller();
        }
        return instance;
    }

    public void marshall(MouthOpen mouthOpen, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (mouthOpen.getValue() != null) {
            Boolean value = mouthOpen.getValue();
            awsJsonWriter.name("Value");
            awsJsonWriter.value(value.booleanValue());
        }
        if (mouthOpen.getConfidence() != null) {
            Float confidence = mouthOpen.getConfidence();
            awsJsonWriter.name("Confidence");
            awsJsonWriter.value(confidence);
        }
        awsJsonWriter.endObject();
    }
}
