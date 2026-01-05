package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.DeleteUserResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;

/* loaded from: classes5.dex */
public class DeleteUserResultJsonUnmarshaller implements Unmarshaller<DeleteUserResult, JsonUnmarshallerContext> {
    private static DeleteUserResultJsonUnmarshaller instance;

    public static DeleteUserResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new DeleteUserResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public DeleteUserResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        return new DeleteUserResult();
    }
}
