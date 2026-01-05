package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.UnsearchedFace;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class UnsearchedFaceJsonUnmarshaller implements Unmarshaller<UnsearchedFace, JsonUnmarshallerContext> {
    private static UnsearchedFaceJsonUnmarshaller instance;

    public static UnsearchedFaceJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new UnsearchedFaceJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public UnsearchedFace unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        UnsearchedFace unsearchedFace = new UnsearchedFace();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("FaceDetails")) {
                unsearchedFace.setFaceDetails(FaceDetailJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Reasons")) {
                unsearchedFace.setReasons(new ListUnmarshaller(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return unsearchedFace;
    }
}
