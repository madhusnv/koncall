package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.CreateStreamProcessorResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
public class CreateStreamProcessorResultJsonUnmarshaller implements Unmarshaller<CreateStreamProcessorResult, JsonUnmarshallerContext> {
    private static CreateStreamProcessorResultJsonUnmarshaller instance;

    public static CreateStreamProcessorResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new CreateStreamProcessorResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public CreateStreamProcessorResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        CreateStreamProcessorResult createStreamProcessorResult = new CreateStreamProcessorResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("StreamProcessorArn")) {
                createStreamProcessorResult.setStreamProcessorArn(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return createStreamProcessorResult;
    }
}
