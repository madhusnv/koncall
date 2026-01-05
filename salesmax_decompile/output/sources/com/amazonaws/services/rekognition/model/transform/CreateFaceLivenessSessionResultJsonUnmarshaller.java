package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.CreateFaceLivenessSessionResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
public class CreateFaceLivenessSessionResultJsonUnmarshaller implements Unmarshaller<CreateFaceLivenessSessionResult, JsonUnmarshallerContext> {
    private static CreateFaceLivenessSessionResultJsonUnmarshaller instance;

    public static CreateFaceLivenessSessionResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new CreateFaceLivenessSessionResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public CreateFaceLivenessSessionResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        CreateFaceLivenessSessionResult createFaceLivenessSessionResult = new CreateFaceLivenessSessionResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("SessionId")) {
                createFaceLivenessSessionResult.setSessionId(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return createFaceLivenessSessionResult;
    }
}
