package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.StartSegmentDetectionResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
public class StartSegmentDetectionResultJsonUnmarshaller implements Unmarshaller<StartSegmentDetectionResult, JsonUnmarshallerContext> {
    private static StartSegmentDetectionResultJsonUnmarshaller instance;

    public static StartSegmentDetectionResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new StartSegmentDetectionResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public StartSegmentDetectionResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        StartSegmentDetectionResult startSegmentDetectionResult = new StartSegmentDetectionResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("JobId")) {
                startSegmentDetectionResult.setJobId(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return startSegmentDetectionResult;
    }
}
