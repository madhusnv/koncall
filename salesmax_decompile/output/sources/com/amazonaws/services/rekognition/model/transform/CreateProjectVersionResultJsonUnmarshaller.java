package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.CreateProjectVersionResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
public class CreateProjectVersionResultJsonUnmarshaller implements Unmarshaller<CreateProjectVersionResult, JsonUnmarshallerContext> {
    private static CreateProjectVersionResultJsonUnmarshaller instance;

    public static CreateProjectVersionResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new CreateProjectVersionResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public CreateProjectVersionResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        CreateProjectVersionResult createProjectVersionResult = new CreateProjectVersionResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("ProjectVersionArn")) {
                createProjectVersionResult.setProjectVersionArn(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return createProjectVersionResult;
    }
}
