package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.Mustache;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class MustacheJsonMarshaller {
    private static MustacheJsonMarshaller instance;

    public static MustacheJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new MustacheJsonMarshaller();
        }
        return instance;
    }

    public void marshall(Mustache mustache, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (mustache.getValue() != null) {
            Boolean value = mustache.getValue();
            awsJsonWriter.name("Value");
            awsJsonWriter.value(value.booleanValue());
        }
        if (mustache.getConfidence() != null) {
            Float confidence = mustache.getConfidence();
            awsJsonWriter.name("Confidence");
            awsJsonWriter.value(confidence);
        }
        awsJsonWriter.endObject();
    }
}
