package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.UpdateDatasetEntriesResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;

/* loaded from: classes5.dex */
public class UpdateDatasetEntriesResultJsonUnmarshaller implements Unmarshaller<UpdateDatasetEntriesResult, JsonUnmarshallerContext> {
    private static UpdateDatasetEntriesResultJsonUnmarshaller instance;

    public static UpdateDatasetEntriesResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new UpdateDatasetEntriesResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public UpdateDatasetEntriesResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        return new UpdateDatasetEntriesResult();
    }
}
