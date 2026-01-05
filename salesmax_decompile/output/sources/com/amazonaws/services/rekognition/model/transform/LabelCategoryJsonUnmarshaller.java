package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.LabelCategory;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class LabelCategoryJsonUnmarshaller implements Unmarshaller<LabelCategory, JsonUnmarshallerContext> {
    private static LabelCategoryJsonUnmarshaller instance;

    public static LabelCategoryJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new LabelCategoryJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public LabelCategory unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        LabelCategory labelCategory = new LabelCategory();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("Name")) {
                labelCategory.setName(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return labelCategory;
    }
}
