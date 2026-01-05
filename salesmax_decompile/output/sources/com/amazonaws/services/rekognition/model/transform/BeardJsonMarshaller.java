package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.Beard;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class BeardJsonMarshaller {
    private static BeardJsonMarshaller instance;

    public static BeardJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new BeardJsonMarshaller();
        }
        return instance;
    }

    public void marshall(Beard beard, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (beard.getValue() != null) {
            Boolean value = beard.getValue();
            awsJsonWriter.name("Value");
            awsJsonWriter.value(value.booleanValue());
        }
        if (beard.getConfidence() != null) {
            Float confidence = beard.getConfidence();
            awsJsonWriter.name("Confidence");
            awsJsonWriter.value(confidence);
        }
        awsJsonWriter.endObject();
    }
}
