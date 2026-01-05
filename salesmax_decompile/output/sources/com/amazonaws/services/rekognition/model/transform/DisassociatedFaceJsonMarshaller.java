package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.DisassociatedFace;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class DisassociatedFaceJsonMarshaller {
    private static DisassociatedFaceJsonMarshaller instance;

    public static DisassociatedFaceJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new DisassociatedFaceJsonMarshaller();
        }
        return instance;
    }

    public void marshall(DisassociatedFace disassociatedFace, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (disassociatedFace.getFaceId() != null) {
            String faceId = disassociatedFace.getFaceId();
            awsJsonWriter.name("FaceId");
            awsJsonWriter.value(faceId);
        }
        awsJsonWriter.endObject();
    }
}
