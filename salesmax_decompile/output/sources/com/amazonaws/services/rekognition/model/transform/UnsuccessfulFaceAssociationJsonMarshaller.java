package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.UnsuccessfulFaceAssociation;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.List;

/* loaded from: classes5.dex */
class UnsuccessfulFaceAssociationJsonMarshaller {
    private static UnsuccessfulFaceAssociationJsonMarshaller instance;

    public static UnsuccessfulFaceAssociationJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new UnsuccessfulFaceAssociationJsonMarshaller();
        }
        return instance;
    }

    public void marshall(UnsuccessfulFaceAssociation unsuccessfulFaceAssociation, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (unsuccessfulFaceAssociation.getFaceId() != null) {
            String faceId = unsuccessfulFaceAssociation.getFaceId();
            awsJsonWriter.name("FaceId");
            awsJsonWriter.value(faceId);
        }
        if (unsuccessfulFaceAssociation.getUserId() != null) {
            String userId = unsuccessfulFaceAssociation.getUserId();
            awsJsonWriter.name("UserId");
            awsJsonWriter.value(userId);
        }
        if (unsuccessfulFaceAssociation.getConfidence() != null) {
            Float confidence = unsuccessfulFaceAssociation.getConfidence();
            awsJsonWriter.name("Confidence");
            awsJsonWriter.value(confidence);
        }
        if (unsuccessfulFaceAssociation.getReasons() != null) {
            List<String> reasons = unsuccessfulFaceAssociation.getReasons();
            awsJsonWriter.name("Reasons");
            awsJsonWriter.beginArray();
            for (String str : reasons) {
                if (str != null) {
                    awsJsonWriter.value(str);
                }
            }
            awsJsonWriter.endArray();
        }
        awsJsonWriter.endObject();
    }
}
