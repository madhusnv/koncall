package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.CoversBodyPart;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class CoversBodyPartJsonUnmarshaller implements Unmarshaller<CoversBodyPart, JsonUnmarshallerContext> {
    private static CoversBodyPartJsonUnmarshaller instance;

    public static CoversBodyPartJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new CoversBodyPartJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public CoversBodyPart unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        CoversBodyPart coversBodyPart = new CoversBodyPart();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("Confidence")) {
                coversBodyPart.setConfidence(SimpleTypeJsonUnmarshallers.FloatJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Value")) {
                coversBodyPart.setValue(SimpleTypeJsonUnmarshallers.BooleanJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return coversBodyPart;
    }
}
