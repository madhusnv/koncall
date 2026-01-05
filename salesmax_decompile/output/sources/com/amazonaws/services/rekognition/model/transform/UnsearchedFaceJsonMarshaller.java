package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.FaceDetail;
import com.amazonaws.services.rekognition.model.UnsearchedFace;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.List;

/* loaded from: classes5.dex */
class UnsearchedFaceJsonMarshaller {
    private static UnsearchedFaceJsonMarshaller instance;

    public static UnsearchedFaceJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new UnsearchedFaceJsonMarshaller();
        }
        return instance;
    }

    public void marshall(UnsearchedFace unsearchedFace, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (unsearchedFace.getFaceDetails() != null) {
            FaceDetail faceDetails = unsearchedFace.getFaceDetails();
            awsJsonWriter.name("FaceDetails");
            FaceDetailJsonMarshaller.getInstance().marshall(faceDetails, awsJsonWriter);
        }
        if (unsearchedFace.getReasons() != null) {
            List<String> reasons = unsearchedFace.getReasons();
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
