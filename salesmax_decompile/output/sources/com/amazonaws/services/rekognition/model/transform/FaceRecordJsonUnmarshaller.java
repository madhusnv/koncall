package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.FaceRecord;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class FaceRecordJsonUnmarshaller implements Unmarshaller<FaceRecord, JsonUnmarshallerContext> {
    private static FaceRecordJsonUnmarshaller instance;

    public static FaceRecordJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new FaceRecordJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public FaceRecord unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        FaceRecord faceRecord = new FaceRecord();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("Face")) {
                faceRecord.setFace(FaceJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("FaceDetail")) {
                faceRecord.setFaceDetail(FaceDetailJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return faceRecord;
    }
}
