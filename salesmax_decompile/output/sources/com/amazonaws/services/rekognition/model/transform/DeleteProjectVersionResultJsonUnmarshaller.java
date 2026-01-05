package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.DeleteProjectVersionResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
public class DeleteProjectVersionResultJsonUnmarshaller implements Unmarshaller<DeleteProjectVersionResult, JsonUnmarshallerContext> {
    private static DeleteProjectVersionResultJsonUnmarshaller instance;

    public static DeleteProjectVersionResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new DeleteProjectVersionResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public DeleteProjectVersionResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        DeleteProjectVersionResult deleteProjectVersionResult = new DeleteProjectVersionResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("Status")) {
                deleteProjectVersionResult.setStatus(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return deleteProjectVersionResult;
    }
}
