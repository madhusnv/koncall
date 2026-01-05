package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.StartPersonTrackingResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
public class StartPersonTrackingResultJsonUnmarshaller implements Unmarshaller<StartPersonTrackingResult, JsonUnmarshallerContext> {
    private static StartPersonTrackingResultJsonUnmarshaller instance;

    public static StartPersonTrackingResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new StartPersonTrackingResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public StartPersonTrackingResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        StartPersonTrackingResult startPersonTrackingResult = new StartPersonTrackingResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("JobId")) {
                startPersonTrackingResult.setJobId(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return startPersonTrackingResult;
    }
}
