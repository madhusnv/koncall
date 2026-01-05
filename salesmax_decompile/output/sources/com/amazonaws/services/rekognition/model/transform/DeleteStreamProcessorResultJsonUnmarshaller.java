package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.DeleteStreamProcessorResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;

/* loaded from: classes5.dex */
public class DeleteStreamProcessorResultJsonUnmarshaller implements Unmarshaller<DeleteStreamProcessorResult, JsonUnmarshallerContext> {
    private static DeleteStreamProcessorResultJsonUnmarshaller instance;

    public static DeleteStreamProcessorResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new DeleteStreamProcessorResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public DeleteStreamProcessorResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        return new DeleteStreamProcessorResult();
    }
}
