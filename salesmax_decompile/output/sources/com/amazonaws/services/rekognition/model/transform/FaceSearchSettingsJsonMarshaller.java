package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.FaceSearchSettings;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class FaceSearchSettingsJsonMarshaller {
    private static FaceSearchSettingsJsonMarshaller instance;

    public static FaceSearchSettingsJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new FaceSearchSettingsJsonMarshaller();
        }
        return instance;
    }

    public void marshall(FaceSearchSettings faceSearchSettings, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (faceSearchSettings.getCollectionId() != null) {
            String collectionId = faceSearchSettings.getCollectionId();
            awsJsonWriter.name("CollectionId");
            awsJsonWriter.value(collectionId);
        }
        if (faceSearchSettings.getFaceMatchThreshold() != null) {
            Float faceMatchThreshold = faceSearchSettings.getFaceMatchThreshold();
            awsJsonWriter.name("FaceMatchThreshold");
            awsJsonWriter.value(faceMatchThreshold);
        }
        awsJsonWriter.endObject();
    }
}
