package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.StopStreamProcessorResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;

/* loaded from: classes5.dex */
public class StopStreamProcessorResultJsonUnmarshaller implements Unmarshaller<StopStreamProcessorResult, JsonUnmarshallerContext> {
    private static StopStreamProcessorResultJsonUnmarshaller instance;

    public static StopStreamProcessorResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new StopStreamProcessorResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public StopStreamProcessorResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        return new StopStreamProcessorResult();
    }
}
