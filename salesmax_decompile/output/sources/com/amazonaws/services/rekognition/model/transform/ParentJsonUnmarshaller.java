package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.Parent;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class ParentJsonUnmarshaller implements Unmarshaller<Parent, JsonUnmarshallerContext> {
    private static ParentJsonUnmarshaller instance;

    public static ParentJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new ParentJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public Parent unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Parent parent = new Parent();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("Name")) {
                parent.setName(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return parent;
    }
}
