package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.FaceOccluded;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class FaceOccludedJsonMarshaller {
    private static FaceOccludedJsonMarshaller instance;

    public static FaceOccludedJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new FaceOccludedJsonMarshaller();
        }
        return instance;
    }

    public void marshall(FaceOccluded faceOccluded, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (faceOccluded.getValue() != null) {
            Boolean value = faceOccluded.getValue();
            awsJsonWriter.name("Value");
            awsJsonWriter.value(value.booleanValue());
        }
        if (faceOccluded.getConfidence() != null) {
            Float confidence = faceOccluded.getConfidence();
            awsJsonWriter.name("Confidence");
            awsJsonWriter.value(confidence);
        }
        awsJsonWriter.endObject();
    }
}
