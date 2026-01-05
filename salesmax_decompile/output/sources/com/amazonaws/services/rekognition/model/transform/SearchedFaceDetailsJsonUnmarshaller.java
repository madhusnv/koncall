package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.SearchedFaceDetails;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class SearchedFaceDetailsJsonUnmarshaller implements Unmarshaller<SearchedFaceDetails, JsonUnmarshallerContext> {
    private static SearchedFaceDetailsJsonUnmarshaller instance;

    public static SearchedFaceDetailsJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new SearchedFaceDetailsJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public SearchedFaceDetails unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        SearchedFaceDetails searchedFaceDetails = new SearchedFaceDetails();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("FaceDetail")) {
                searchedFaceDetails.setFaceDetail(FaceDetailJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return searchedFaceDetails;
    }
}
