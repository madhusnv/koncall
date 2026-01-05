package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.EyeDirection;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class EyeDirectionJsonUnmarshaller implements Unmarshaller<EyeDirection, JsonUnmarshallerContext> {
    private static EyeDirectionJsonUnmarshaller instance;

    public static EyeDirectionJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new EyeDirectionJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public EyeDirection unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        EyeDirection eyeDirection = new EyeDirection();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("Yaw")) {
                eyeDirection.setYaw(SimpleTypeJsonUnmarshallers.FloatJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Pitch")) {
                eyeDirection.setPitch(SimpleTypeJsonUnmarshallers.FloatJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Confidence")) {
                eyeDirection.setConfidence(SimpleTypeJsonUnmarshallers.FloatJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return eyeDirection;
    }
}
