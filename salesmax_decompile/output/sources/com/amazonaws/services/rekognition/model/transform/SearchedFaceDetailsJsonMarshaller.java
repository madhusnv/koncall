package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.FaceDetail;
import com.amazonaws.services.rekognition.model.SearchedFaceDetails;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class SearchedFaceDetailsJsonMarshaller {
    private static SearchedFaceDetailsJsonMarshaller instance;

    public static SearchedFaceDetailsJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new SearchedFaceDetailsJsonMarshaller();
        }
        return instance;
    }

    public void marshall(SearchedFaceDetails searchedFaceDetails, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (searchedFaceDetails.getFaceDetail() != null) {
            FaceDetail faceDetail = searchedFaceDetails.getFaceDetail();
            awsJsonWriter.name("FaceDetail");
            FaceDetailJsonMarshaller.getInstance().marshall(faceDetail, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
