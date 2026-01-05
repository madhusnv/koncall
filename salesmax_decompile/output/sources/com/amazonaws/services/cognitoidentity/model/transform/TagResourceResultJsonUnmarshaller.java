package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.services.cognitoidentity.model.TagResourceResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;

/* loaded from: classes5.dex */
public class TagResourceResultJsonUnmarshaller implements Unmarshaller<TagResourceResult, JsonUnmarshallerContext> {
    private static TagResourceResultJsonUnmarshaller instance;

    public static TagResourceResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new TagResourceResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public TagResourceResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        return new TagResourceResult();
    }
}
