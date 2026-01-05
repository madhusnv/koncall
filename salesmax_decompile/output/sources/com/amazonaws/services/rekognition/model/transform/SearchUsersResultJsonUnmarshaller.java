package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.SearchUsersResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
public class SearchUsersResultJsonUnmarshaller implements Unmarshaller<SearchUsersResult, JsonUnmarshallerContext> {
    private static SearchUsersResultJsonUnmarshaller instance;

    public static SearchUsersResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new SearchUsersResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public SearchUsersResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        SearchUsersResult searchUsersResult = new SearchUsersResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("UserMatches")) {
                searchUsersResult.setUserMatches(new ListUnmarshaller(UserMatchJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("FaceModelVersion")) {
                searchUsersResult.setFaceModelVersion(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("SearchedFace")) {
                searchUsersResult.setSearchedFace(SearchedFaceJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("SearchedUser")) {
                searchUsersResult.setSearchedUser(SearchedUserJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return searchUsersResult;
    }
}
