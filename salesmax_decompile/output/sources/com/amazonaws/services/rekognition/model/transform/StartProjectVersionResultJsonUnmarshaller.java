package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.StartProjectVersionResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
public class StartProjectVersionResultJsonUnmarshaller implements Unmarshaller<StartProjectVersionResult, JsonUnmarshallerContext> {
    private static StartProjectVersionResultJsonUnmarshaller instance;

    public static StartProjectVersionResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new StartProjectVersionResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public StartProjectVersionResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        StartProjectVersionResult startProjectVersionResult = new StartProjectVersionResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("Status")) {
                startProjectVersionResult.setStatus(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return startProjectVersionResult;
    }
}
