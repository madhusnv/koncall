package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.FaceDetail;
import com.amazonaws.services.rekognition.model.UnindexedFace;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.List;

/* loaded from: classes5.dex */
class UnindexedFaceJsonMarshaller {
    private static UnindexedFaceJsonMarshaller instance;

    public static UnindexedFaceJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new UnindexedFaceJsonMarshaller();
        }
        return instance;
    }

    public void marshall(UnindexedFace unindexedFace, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (unindexedFace.getReasons() != null) {
            List<String> reasons = unindexedFace.getReasons();
            awsJsonWriter.name("Reasons");
            awsJsonWriter.beginArray();
            for (String str : reasons) {
                if (str != null) {
                    awsJsonWriter.value(str);
                }
            }
            awsJsonWriter.endArray();
        }
        if (unindexedFace.getFaceDetail() != null) {
            FaceDetail faceDetail = unindexedFace.getFaceDetail();
            awsJsonWriter.name("FaceDetail");
            FaceDetailJsonMarshaller.getInstance().marshall(faceDetail, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
