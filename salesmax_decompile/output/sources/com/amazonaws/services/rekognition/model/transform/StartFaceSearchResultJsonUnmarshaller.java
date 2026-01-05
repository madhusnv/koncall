package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.StartFaceSearchResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
public class StartFaceSearchResultJsonUnmarshaller implements Unmarshaller<StartFaceSearchResult, JsonUnmarshallerContext> {
    private static StartFaceSearchResultJsonUnmarshaller instance;

    public static StartFaceSearchResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new StartFaceSearchResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public StartFaceSearchResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        StartFaceSearchResult startFaceSearchResult = new StartFaceSearchResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("JobId")) {
                startFaceSearchResult.setJobId(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return startFaceSearchResult;
    }
}
