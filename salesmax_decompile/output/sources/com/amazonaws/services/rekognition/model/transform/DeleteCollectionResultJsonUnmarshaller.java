package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.DeleteCollectionResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
public class DeleteCollectionResultJsonUnmarshaller implements Unmarshaller<DeleteCollectionResult, JsonUnmarshallerContext> {
    private static DeleteCollectionResultJsonUnmarshaller instance;

    public static DeleteCollectionResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new DeleteCollectionResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public DeleteCollectionResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        DeleteCollectionResult deleteCollectionResult = new DeleteCollectionResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("StatusCode")) {
                deleteCollectionResult.setStatusCode(SimpleTypeJsonUnmarshallers.IntegerJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return deleteCollectionResult;
    }
}
