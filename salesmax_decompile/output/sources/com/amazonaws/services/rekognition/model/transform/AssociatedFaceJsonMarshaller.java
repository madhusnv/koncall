package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.AssociatedFace;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class AssociatedFaceJsonMarshaller {
    private static AssociatedFaceJsonMarshaller instance;

    public static AssociatedFaceJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new AssociatedFaceJsonMarshaller();
        }
        return instance;
    }

    public void marshall(AssociatedFace associatedFace, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (associatedFace.getFaceId() != null) {
            String faceId = associatedFace.getFaceId();
            awsJsonWriter.name("FaceId");
            awsJsonWriter.value(faceId);
        }
        awsJsonWriter.endObject();
    }
}
