package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.BoundingBox;
import com.amazonaws.services.rekognition.model.Face;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class FaceJsonMarshaller {
    private static FaceJsonMarshaller instance;

    public static FaceJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new FaceJsonMarshaller();
        }
        return instance;
    }

    public void marshall(Face face, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (face.getFaceId() != null) {
            String faceId = face.getFaceId();
            awsJsonWriter.name("FaceId");
            awsJsonWriter.value(faceId);
        }
        if (face.getBoundingBox() != null) {
            BoundingBox boundingBox = face.getBoundingBox();
            awsJsonWriter.name("BoundingBox");
            BoundingBoxJsonMarshaller.getInstance().marshall(boundingBox, awsJsonWriter);
        }
        if (face.getImageId() != null) {
            String imageId = face.getImageId();
            awsJsonWriter.name("ImageId");
            awsJsonWriter.value(imageId);
        }
        if (face.getExternalImageId() != null) {
            String externalImageId = face.getExternalImageId();
            awsJsonWriter.name("ExternalImageId");
            awsJsonWriter.value(externalImageId);
        }
        if (face.getConfidence() != null) {
            Float confidence = face.getConfidence();
            awsJsonWriter.name("Confidence");
            awsJsonWriter.value(confidence);
        }
        if (face.getIndexFacesModelVersion() != null) {
            String indexFacesModelVersion = face.getIndexFacesModelVersion();
            awsJsonWriter.name("IndexFacesModelVersion");
            awsJsonWriter.value(indexFacesModelVersion);
        }
        if (face.getUserId() != null) {
            String userId = face.getUserId();
            awsJsonWriter.name("UserId");
            awsJsonWriter.value(userId);
        }
        awsJsonWriter.endObject();
    }
}
