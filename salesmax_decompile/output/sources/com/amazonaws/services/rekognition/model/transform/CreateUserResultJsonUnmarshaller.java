package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.CreateUserResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;

/* loaded from: classes5.dex */
public class CreateUserResultJsonUnmarshaller implements Unmarshaller<CreateUserResult, JsonUnmarshallerContext> {
    private static CreateUserResultJsonUnmarshaller instance;

    public static CreateUserResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new CreateUserResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public CreateUserResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        return new CreateUserResult();
    }
}
