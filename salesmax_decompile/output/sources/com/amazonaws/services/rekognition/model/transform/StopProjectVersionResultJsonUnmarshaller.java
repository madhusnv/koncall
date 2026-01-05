package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.StopProjectVersionResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
public class StopProjectVersionResultJsonUnmarshaller implements Unmarshaller<StopProjectVersionResult, JsonUnmarshallerContext> {
    private static StopProjectVersionResultJsonUnmarshaller instance;

    public static StopProjectVersionResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new StopProjectVersionResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public StopProjectVersionResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        StopProjectVersionResult stopProjectVersionResult = new StopProjectVersionResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("Status")) {
                stopProjectVersionResult.setStatus(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return stopProjectVersionResult;
    }
}
