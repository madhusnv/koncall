package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.ComparedFace;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class ComparedFaceJsonUnmarshaller implements Unmarshaller<ComparedFace, JsonUnmarshallerContext> {
    private static ComparedFaceJsonUnmarshaller instance;

    public static ComparedFaceJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new ComparedFaceJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public ComparedFace unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ComparedFace comparedFace = new ComparedFace();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("BoundingBox")) {
                comparedFace.setBoundingBox(BoundingBoxJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Confidence")) {
                comparedFace.setConfidence(SimpleTypeJsonUnmarshallers.FloatJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Landmarks")) {
                comparedFace.setLandmarks(new ListUnmarshaller(LandmarkJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Pose")) {
                comparedFace.setPose(PoseJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Quality")) {
                comparedFace.setQuality(ImageQualityJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Emotions")) {
                comparedFace.setEmotions(new ListUnmarshaller(EmotionJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Smile")) {
                comparedFace.setSmile(SmileJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return comparedFace;
    }
}
