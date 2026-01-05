package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.Eyeglasses;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class EyeglassesJsonUnmarshaller implements Unmarshaller<Eyeglasses, JsonUnmarshallerContext> {
    private static EyeglassesJsonUnmarshaller instance;

    public static EyeglassesJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new EyeglassesJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public Eyeglasses unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Eyeglasses eyeglasses = new Eyeglasses();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("Value")) {
                eyeglasses.setValue(SimpleTypeJsonUnmarshallers.BooleanJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Confidence")) {
                eyeglasses.setConfidence(SimpleTypeJsonUnmarshallers.FloatJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return eyeglasses;
    }
}
