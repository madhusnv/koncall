package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.FaceOccluded;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class FaceOccludedJsonUnmarshaller implements Unmarshaller<FaceOccluded, JsonUnmarshallerContext> {
    private static FaceOccludedJsonUnmarshaller instance;

    public static FaceOccludedJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new FaceOccludedJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public FaceOccluded unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        FaceOccluded faceOccluded = new FaceOccluded();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("Value")) {
                faceOccluded.setValue(SimpleTypeJsonUnmarshallers.BooleanJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Confidence")) {
                faceOccluded.setConfidence(SimpleTypeJsonUnmarshallers.FloatJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return faceOccluded;
    }
}
