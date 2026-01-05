package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.DetectFacesResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
public class DetectFacesResultJsonUnmarshaller implements Unmarshaller<DetectFacesResult, JsonUnmarshallerContext> {
    private static DetectFacesResultJsonUnmarshaller instance;

    public static DetectFacesResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new DetectFacesResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public DetectFacesResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        DetectFacesResult detectFacesResult = new DetectFacesResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("FaceDetails")) {
                detectFacesResult.setFaceDetails(new ListUnmarshaller(FaceDetailJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("OrientationCorrection")) {
                detectFacesResult.setOrientationCorrection(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return detectFacesResult;
    }
}
