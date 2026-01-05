package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.DisassociatedFace;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class DisassociatedFaceJsonUnmarshaller implements Unmarshaller<DisassociatedFace, JsonUnmarshallerContext> {
    private static DisassociatedFaceJsonUnmarshaller instance;

    public static DisassociatedFaceJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new DisassociatedFaceJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public DisassociatedFace unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DisassociatedFace disassociatedFace = new DisassociatedFace();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("FaceId")) {
                disassociatedFace.setFaceId(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return disassociatedFace;
    }
}
