package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.FaceDetection;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class FaceDetectionJsonUnmarshaller implements Unmarshaller<FaceDetection, JsonUnmarshallerContext> {
    private static FaceDetectionJsonUnmarshaller instance;

    public static FaceDetectionJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new FaceDetectionJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public FaceDetection unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        FaceDetection faceDetection = new FaceDetection();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("Timestamp")) {
                faceDetection.setTimestamp(SimpleTypeJsonUnmarshallers.LongJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Face")) {
                faceDetection.setFace(FaceDetailJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return faceDetection;
    }
}
