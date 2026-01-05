package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.ComparedSourceImageFace;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class ComparedSourceImageFaceJsonUnmarshaller implements Unmarshaller<ComparedSourceImageFace, JsonUnmarshallerContext> {
    private static ComparedSourceImageFaceJsonUnmarshaller instance;

    public static ComparedSourceImageFaceJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new ComparedSourceImageFaceJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public ComparedSourceImageFace unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ComparedSourceImageFace comparedSourceImageFace = new ComparedSourceImageFace();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("BoundingBox")) {
                comparedSourceImageFace.setBoundingBox(BoundingBoxJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Confidence")) {
                comparedSourceImageFace.setConfidence(SimpleTypeJsonUnmarshallers.FloatJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return comparedSourceImageFace;
    }
}
