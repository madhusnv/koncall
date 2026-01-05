package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.SearchUsersByImageResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
public class SearchUsersByImageResultJsonUnmarshaller implements Unmarshaller<SearchUsersByImageResult, JsonUnmarshallerContext> {
    private static SearchUsersByImageResultJsonUnmarshaller instance;

    public static SearchUsersByImageResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new SearchUsersByImageResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public SearchUsersByImageResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        SearchUsersByImageResult searchUsersByImageResult = new SearchUsersByImageResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("UserMatches")) {
                searchUsersByImageResult.setUserMatches(new ListUnmarshaller(UserMatchJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("FaceModelVersion")) {
                searchUsersByImageResult.setFaceModelVersion(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("SearchedFace")) {
                searchUsersByImageResult.setSearchedFace(SearchedFaceDetailsJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("UnsearchedFaces")) {
                searchUsersByImageResult.setUnsearchedFaces(new ListUnmarshaller(UnsearchedFaceJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return searchUsersByImageResult;
    }
}
