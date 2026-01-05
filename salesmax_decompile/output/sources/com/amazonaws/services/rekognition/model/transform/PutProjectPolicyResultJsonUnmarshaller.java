package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.PutProjectPolicyResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
public class PutProjectPolicyResultJsonUnmarshaller implements Unmarshaller<PutProjectPolicyResult, JsonUnmarshallerContext> {
    private static PutProjectPolicyResultJsonUnmarshaller instance;

    public static PutProjectPolicyResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new PutProjectPolicyResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public PutProjectPolicyResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        PutProjectPolicyResult putProjectPolicyResult = new PutProjectPolicyResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("PolicyRevisionId")) {
                putProjectPolicyResult.setPolicyRevisionId(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return putProjectPolicyResult;
    }
}
