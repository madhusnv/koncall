package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.FaceMatch;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class FaceMatchJsonUnmarshaller implements Unmarshaller<FaceMatch, JsonUnmarshallerContext> {
    private static FaceMatchJsonUnmarshaller instance;

    public static FaceMatchJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new FaceMatchJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public FaceMatch unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        FaceMatch faceMatch = new FaceMatch();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("Similarity")) {
                faceMatch.setSimilarity(SimpleTypeJsonUnmarshallers.FloatJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Face")) {
                faceMatch.setFace(FaceJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return faceMatch;
    }
}
