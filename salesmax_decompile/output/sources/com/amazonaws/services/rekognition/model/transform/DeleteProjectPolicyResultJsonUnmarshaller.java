package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.DeleteProjectPolicyResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;

/* loaded from: classes5.dex */
public class DeleteProjectPolicyResultJsonUnmarshaller implements Unmarshaller<DeleteProjectPolicyResult, JsonUnmarshallerContext> {
    private static DeleteProjectPolicyResultJsonUnmarshaller instance;

    public static DeleteProjectPolicyResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new DeleteProjectPolicyResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public DeleteProjectPolicyResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        return new DeleteProjectPolicyResult();
    }
}
