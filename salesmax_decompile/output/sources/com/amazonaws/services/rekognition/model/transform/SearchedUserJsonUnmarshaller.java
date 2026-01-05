package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.SearchedUser;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class SearchedUserJsonUnmarshaller implements Unmarshaller<SearchedUser, JsonUnmarshallerContext> {
    private static SearchedUserJsonUnmarshaller instance;

    public static SearchedUserJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new SearchedUserJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public SearchedUser unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        SearchedUser searchedUser = new SearchedUser();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("UserId")) {
                searchedUser.setUserId(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return searchedUser;
    }
}
