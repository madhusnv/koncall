package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.SearchFacesResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
public class SearchFacesResultJsonUnmarshaller implements Unmarshaller<SearchFacesResult, JsonUnmarshallerContext> {
    private static SearchFacesResultJsonUnmarshaller instance;

    public static SearchFacesResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new SearchFacesResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public SearchFacesResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        SearchFacesResult searchFacesResult = new SearchFacesResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("SearchedFaceId")) {
                searchFacesResult.setSearchedFaceId(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("FaceMatches")) {
                searchFacesResult.setFaceMatches(new ListUnmarshaller(FaceMatchJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("FaceModelVersion")) {
                searchFacesResult.setFaceModelVersion(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return searchFacesResult;
    }
}
