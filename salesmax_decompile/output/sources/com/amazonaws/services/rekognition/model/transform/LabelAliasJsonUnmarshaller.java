package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.LabelAlias;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class LabelAliasJsonUnmarshaller implements Unmarshaller<LabelAlias, JsonUnmarshallerContext> {
    private static LabelAliasJsonUnmarshaller instance;

    public static LabelAliasJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new LabelAliasJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public LabelAlias unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        LabelAlias labelAlias = new LabelAlias();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("Name")) {
                labelAlias.setName(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return labelAlias;
    }
}
