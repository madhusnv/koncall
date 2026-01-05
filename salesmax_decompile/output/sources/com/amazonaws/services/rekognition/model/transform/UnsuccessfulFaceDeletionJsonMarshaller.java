package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.UnsuccessfulFaceDeletion;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.List;

/* loaded from: classes5.dex */
class UnsuccessfulFaceDeletionJsonMarshaller {
    private static UnsuccessfulFaceDeletionJsonMarshaller instance;

    public static UnsuccessfulFaceDeletionJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new UnsuccessfulFaceDeletionJsonMarshaller();
        }
        return instance;
    }

    public void marshall(UnsuccessfulFaceDeletion unsuccessfulFaceDeletion, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (unsuccessfulFaceDeletion.getFaceId() != null) {
            String faceId = unsuccessfulFaceDeletion.getFaceId();
            awsJsonWriter.name("FaceId");
            awsJsonWriter.value(faceId);
        }
        if (unsuccessfulFaceDeletion.getUserId() != null) {
            String userId = unsuccessfulFaceDeletion.getUserId();
            awsJsonWriter.name("UserId");
            awsJsonWriter.value(userId);
        }
        if (unsuccessfulFaceDeletion.getReasons() != null) {
            List<String> reasons = unsuccessfulFaceDeletion.getReasons();
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
