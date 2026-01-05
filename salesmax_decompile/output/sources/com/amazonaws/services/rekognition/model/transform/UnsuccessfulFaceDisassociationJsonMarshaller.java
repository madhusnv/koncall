package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.UnsuccessfulFaceDisassociation;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.List;

/* loaded from: classes5.dex */
class UnsuccessfulFaceDisassociationJsonMarshaller {
    private static UnsuccessfulFaceDisassociationJsonMarshaller instance;

    public static UnsuccessfulFaceDisassociationJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new UnsuccessfulFaceDisassociationJsonMarshaller();
        }
        return instance;
    }

    public void marshall(UnsuccessfulFaceDisassociation unsuccessfulFaceDisassociation, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (unsuccessfulFaceDisassociation.getFaceId() != null) {
            String faceId = unsuccessfulFaceDisassociation.getFaceId();
            awsJsonWriter.name("FaceId");
            awsJsonWriter.value(faceId);
        }
        if (unsuccessfulFaceDisassociation.getUserId() != null) {
            String userId = unsuccessfulFaceDisassociation.getUserId();
            awsJsonWriter.name("UserId");
            awsJsonWriter.value(userId);
        }
        if (unsuccessfulFaceDisassociation.getReasons() != null) {
            List<String> reasons = unsuccessfulFaceDisassociation.getReasons();
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
