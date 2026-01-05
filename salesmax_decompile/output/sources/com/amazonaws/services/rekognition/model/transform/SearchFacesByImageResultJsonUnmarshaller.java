package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.SearchFacesByImageResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
public class SearchFacesByImageResultJsonUnmarshaller implements Unmarshaller<SearchFacesByImageResult, JsonUnmarshallerContext> {
    private static SearchFacesByImageResultJsonUnmarshaller instance;

    public static SearchFacesByImageResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new SearchFacesByImageResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public SearchFacesByImageResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        SearchFacesByImageResult searchFacesByImageResult = new SearchFacesByImageResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("SearchedFaceBoundingBox")) {
                searchFacesByImageResult.setSearchedFaceBoundingBox(BoundingBoxJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("SearchedFaceConfidence")) {
                searchFacesByImageResult.setSearchedFaceConfidence(SimpleTypeJsonUnmarshallers.FloatJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("FaceMatches")) {
                searchFacesByImageResult.setFaceMatches(new ListUnmarshaller(FaceMatchJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("FaceModelVersion")) {
                searchFacesByImageResult.setFaceModelVersion(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return searchFacesByImageResult;
    }
}
