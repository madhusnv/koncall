package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.StartLabelDetectionResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
public class StartLabelDetectionResultJsonUnmarshaller implements Unmarshaller<StartLabelDetectionResult, JsonUnmarshallerContext> {
    private static StartLabelDetectionResultJsonUnmarshaller instance;

    public static StartLabelDetectionResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new StartLabelDetectionResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public StartLabelDetectionResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        StartLabelDetectionResult startLabelDetectionResult = new StartLabelDetectionResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("JobId")) {
                startLabelDetectionResult.setJobId(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return startLabelDetectionResult;
    }
}
