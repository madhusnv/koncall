package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.SearchedFace;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class SearchedFaceJsonMarshaller {
    private static SearchedFaceJsonMarshaller instance;

    public static SearchedFaceJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new SearchedFaceJsonMarshaller();
        }
        return instance;
    }

    public void marshall(SearchedFace searchedFace, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (searchedFace.getFaceId() != null) {
            String faceId = searchedFace.getFaceId();
            awsJsonWriter.name("FaceId");
            awsJsonWriter.value(faceId);
        }
        awsJsonWriter.endObject();
    }
}
