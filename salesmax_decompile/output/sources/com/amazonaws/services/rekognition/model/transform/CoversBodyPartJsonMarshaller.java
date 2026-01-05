package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.CoversBodyPart;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class CoversBodyPartJsonMarshaller {
    private static CoversBodyPartJsonMarshaller instance;

    public static CoversBodyPartJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new CoversBodyPartJsonMarshaller();
        }
        return instance;
    }

    public void marshall(CoversBodyPart coversBodyPart, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (coversBodyPart.getConfidence() != null) {
            Float confidence = coversBodyPart.getConfidence();
            awsJsonWriter.name("Confidence");
            awsJsonWriter.value(confidence);
        }
        if (coversBodyPart.getValue() != null) {
            Boolean value = coversBodyPart.getValue();
            awsJsonWriter.name("Value");
            awsJsonWriter.value(value.booleanValue());
        }
        awsJsonWriter.endObject();
    }
}
