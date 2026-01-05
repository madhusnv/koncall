package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.Face;
import com.amazonaws.services.rekognition.model.FaceDetail;
import com.amazonaws.services.rekognition.model.FaceRecord;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class FaceRecordJsonMarshaller {
    private static FaceRecordJsonMarshaller instance;

    public static FaceRecordJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new FaceRecordJsonMarshaller();
        }
        return instance;
    }

    public void marshall(FaceRecord faceRecord, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (faceRecord.getFace() != null) {
            Face face = faceRecord.getFace();
            awsJsonWriter.name("Face");
            FaceJsonMarshaller.getInstance().marshall(face, awsJsonWriter);
        }
        if (faceRecord.getFaceDetail() != null) {
            FaceDetail faceDetail = faceRecord.getFaceDetail();
            awsJsonWriter.name("FaceDetail");
            FaceDetailJsonMarshaller.getInstance().marshall(faceDetail, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
