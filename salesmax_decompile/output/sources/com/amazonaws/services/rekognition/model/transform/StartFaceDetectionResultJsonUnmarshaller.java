package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.StartFaceDetectionResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
public class StartFaceDetectionResultJsonUnmarshaller implements Unmarshaller<StartFaceDetectionResult, JsonUnmarshallerContext> {
    private static StartFaceDetectionResultJsonUnmarshaller instance;

    public static StartFaceDetectionResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new StartFaceDetectionResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public StartFaceDetectionResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        StartFaceDetectionResult startFaceDetectionResult = new StartFaceDetectionResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("JobId")) {
                startFaceDetectionResult.setJobId(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return startFaceDetectionResult;
    }
}
