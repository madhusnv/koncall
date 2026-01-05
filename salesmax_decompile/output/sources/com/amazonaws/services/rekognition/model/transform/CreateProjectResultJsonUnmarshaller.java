package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.CreateProjectResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
public class CreateProjectResultJsonUnmarshaller implements Unmarshaller<CreateProjectResult, JsonUnmarshallerContext> {
    private static CreateProjectResultJsonUnmarshaller instance;

    public static CreateProjectResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new CreateProjectResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public CreateProjectResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        CreateProjectResult createProjectResult = new CreateProjectResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("ProjectArn")) {
                createProjectResult.setProjectArn(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return createProjectResult;
    }
}
