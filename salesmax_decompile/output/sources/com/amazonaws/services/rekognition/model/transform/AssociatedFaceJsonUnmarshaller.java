package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.AssociatedFace;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class AssociatedFaceJsonUnmarshaller implements Unmarshaller<AssociatedFace, JsonUnmarshallerContext> {
    private static AssociatedFaceJsonUnmarshaller instance;

    public static AssociatedFaceJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new AssociatedFaceJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public AssociatedFace unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AssociatedFace associatedFace = new AssociatedFace();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("FaceId")) {
                associatedFace.setFaceId(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return associatedFace;
    }
}
