package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.CopyProjectVersionResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
public class CopyProjectVersionResultJsonUnmarshaller implements Unmarshaller<CopyProjectVersionResult, JsonUnmarshallerContext> {
    private static CopyProjectVersionResultJsonUnmarshaller instance;

    public static CopyProjectVersionResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new CopyProjectVersionResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public CopyProjectVersionResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        CopyProjectVersionResult copyProjectVersionResult = new CopyProjectVersionResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("ProjectVersionArn")) {
                copyProjectVersionResult.setProjectVersionArn(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return copyProjectVersionResult;
    }
}
