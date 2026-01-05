package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.SearchedFace;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class SearchedFaceJsonUnmarshaller implements Unmarshaller<SearchedFace, JsonUnmarshallerContext> {
    private static SearchedFaceJsonUnmarshaller instance;

    public static SearchedFaceJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new SearchedFaceJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public SearchedFace unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        SearchedFace searchedFace = new SearchedFace();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("FaceId")) {
                searchedFace.setFaceId(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return searchedFace;
    }
}
