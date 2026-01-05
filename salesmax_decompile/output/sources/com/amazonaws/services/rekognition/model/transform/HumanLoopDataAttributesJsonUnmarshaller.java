package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.HumanLoopDataAttributes;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class HumanLoopDataAttributesJsonUnmarshaller implements Unmarshaller<HumanLoopDataAttributes, JsonUnmarshallerContext> {
    private static HumanLoopDataAttributesJsonUnmarshaller instance;

    public static HumanLoopDataAttributesJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new HumanLoopDataAttributesJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public HumanLoopDataAttributes unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        HumanLoopDataAttributes humanLoopDataAttributes = new HumanLoopDataAttributes();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("ContentClassifiers")) {
                humanLoopDataAttributes.setContentClassifiers(new ListUnmarshaller(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return humanLoopDataAttributes;
    }
}
