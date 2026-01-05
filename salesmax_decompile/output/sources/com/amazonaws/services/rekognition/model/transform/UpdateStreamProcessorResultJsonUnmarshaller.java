package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.UpdateStreamProcessorResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;

/* loaded from: classes5.dex */
public class UpdateStreamProcessorResultJsonUnmarshaller implements Unmarshaller<UpdateStreamProcessorResult, JsonUnmarshallerContext> {
    private static UpdateStreamProcessorResultJsonUnmarshaller instance;

    public static UpdateStreamProcessorResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new UpdateStreamProcessorResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public UpdateStreamProcessorResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        return new UpdateStreamProcessorResult();
    }
}
