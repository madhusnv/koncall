package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.UnindexedFace;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class UnindexedFaceJsonUnmarshaller implements Unmarshaller<UnindexedFace, JsonUnmarshallerContext> {
    private static UnindexedFaceJsonUnmarshaller instance;

    public static UnindexedFaceJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new UnindexedFaceJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public UnindexedFace unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        UnindexedFace unindexedFace = new UnindexedFace();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("Reasons")) {
                unindexedFace.setReasons(new ListUnmarshaller(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("FaceDetail")) {
                unindexedFace.setFaceDetail(FaceDetailJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return unindexedFace;
    }
}
