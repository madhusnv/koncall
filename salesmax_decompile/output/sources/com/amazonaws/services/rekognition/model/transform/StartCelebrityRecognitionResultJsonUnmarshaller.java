package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.StartCelebrityRecognitionResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
public class StartCelebrityRecognitionResultJsonUnmarshaller implements Unmarshaller<StartCelebrityRecognitionResult, JsonUnmarshallerContext> {
    private static StartCelebrityRecognitionResultJsonUnmarshaller instance;

    public static StartCelebrityRecognitionResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new StartCelebrityRecognitionResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public StartCelebrityRecognitionResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        StartCelebrityRecognitionResult startCelebrityRecognitionResult = new StartCelebrityRecognitionResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("JobId")) {
                startCelebrityRecognitionResult.setJobId(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return startCelebrityRecognitionResult;
    }
}
