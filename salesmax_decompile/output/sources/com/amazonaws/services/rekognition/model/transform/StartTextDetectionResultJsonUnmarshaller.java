package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.StartTextDetectionResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
public class StartTextDetectionResultJsonUnmarshaller implements Unmarshaller<StartTextDetectionResult, JsonUnmarshallerContext> {
    private static StartTextDetectionResultJsonUnmarshaller instance;

    public static StartTextDetectionResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new StartTextDetectionResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public StartTextDetectionResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        StartTextDetectionResult startTextDetectionResult = new StartTextDetectionResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("JobId")) {
                startTextDetectionResult.setJobId(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return startTextDetectionResult;
    }
}
