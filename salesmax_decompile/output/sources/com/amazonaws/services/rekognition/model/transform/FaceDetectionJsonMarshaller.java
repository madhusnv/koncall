package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.FaceDetail;
import com.amazonaws.services.rekognition.model.FaceDetection;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class FaceDetectionJsonMarshaller {
    private static FaceDetectionJsonMarshaller instance;

    public static FaceDetectionJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new FaceDetectionJsonMarshaller();
        }
        return instance;
    }

    public void marshall(FaceDetection faceDetection, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (faceDetection.getTimestamp() != null) {
            Long timestamp = faceDetection.getTimestamp();
            awsJsonWriter.name("Timestamp");
            awsJsonWriter.value(timestamp);
        }
        if (faceDetection.getFace() != null) {
            FaceDetail face = faceDetection.getFace();
            awsJsonWriter.name("Face");
            FaceDetailJsonMarshaller.getInstance().marshall(face, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
