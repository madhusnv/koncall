package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.StartStreamProcessorResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
public class StartStreamProcessorResultJsonUnmarshaller implements Unmarshaller<StartStreamProcessorResult, JsonUnmarshallerContext> {
    private static StartStreamProcessorResultJsonUnmarshaller instance;

    public static StartStreamProcessorResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new StartStreamProcessorResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public StartStreamProcessorResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        StartStreamProcessorResult startStreamProcessorResult = new StartStreamProcessorResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("SessionId")) {
                startStreamProcessorResult.setSessionId(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return startStreamProcessorResult;
    }
}
