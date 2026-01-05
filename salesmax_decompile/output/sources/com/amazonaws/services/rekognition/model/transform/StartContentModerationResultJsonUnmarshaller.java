package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.StartContentModerationResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
public class StartContentModerationResultJsonUnmarshaller implements Unmarshaller<StartContentModerationResult, JsonUnmarshallerContext> {
    private static StartContentModerationResultJsonUnmarshaller instance;

    public static StartContentModerationResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new StartContentModerationResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public StartContentModerationResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        StartContentModerationResult startContentModerationResult = new StartContentModerationResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("JobId")) {
                startContentModerationResult.setJobId(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return startContentModerationResult;
    }
}
