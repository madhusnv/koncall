package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.UntagResourceResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;

/* loaded from: classes5.dex */
public class UntagResourceResultJsonUnmarshaller implements Unmarshaller<UntagResourceResult, JsonUnmarshallerContext> {
    private static UntagResourceResultJsonUnmarshaller instance;

    public static UntagResourceResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new UntagResourceResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public UntagResourceResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        return new UntagResourceResult();
    }
}
