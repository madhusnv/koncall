package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.Smile;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class SmileJsonMarshaller {
    private static SmileJsonMarshaller instance;

    public static SmileJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new SmileJsonMarshaller();
        }
        return instance;
    }

    public void marshall(Smile smile, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (smile.getValue() != null) {
            Boolean value = smile.getValue();
            awsJsonWriter.name("Value");
            awsJsonWriter.value(value.booleanValue());
        }
        if (smile.getConfidence() != null) {
            Float confidence = smile.getConfidence();
            awsJsonWriter.name("Confidence");
            awsJsonWriter.value(confidence);
        }
        awsJsonWriter.endObject();
    }
}
