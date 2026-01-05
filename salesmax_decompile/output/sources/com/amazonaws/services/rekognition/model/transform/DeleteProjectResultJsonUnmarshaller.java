package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.DeleteProjectResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
public class DeleteProjectResultJsonUnmarshaller implements Unmarshaller<DeleteProjectResult, JsonUnmarshallerContext> {
    private static DeleteProjectResultJsonUnmarshaller instance;

    public static DeleteProjectResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new DeleteProjectResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public DeleteProjectResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        DeleteProjectResult deleteProjectResult = new DeleteProjectResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("Status")) {
                deleteProjectResult.setStatus(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return deleteProjectResult;
    }
}
