package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.DeleteDatasetResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;

/* loaded from: classes5.dex */
public class DeleteDatasetResultJsonUnmarshaller implements Unmarshaller<DeleteDatasetResult, JsonUnmarshallerContext> {
    private static DeleteDatasetResultJsonUnmarshaller instance;

    public static DeleteDatasetResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new DeleteDatasetResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public DeleteDatasetResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        return new DeleteDatasetResult();
    }
}
