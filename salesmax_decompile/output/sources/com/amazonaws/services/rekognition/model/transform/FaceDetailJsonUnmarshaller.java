package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.FaceDetail;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class FaceDetailJsonUnmarshaller implements Unmarshaller<FaceDetail, JsonUnmarshallerContext> {
    private static FaceDetailJsonUnmarshaller instance;

    public static FaceDetailJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new FaceDetailJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public FaceDetail unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        FaceDetail faceDetail = new FaceDetail();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("BoundingBox")) {
                faceDetail.setBoundingBox(BoundingBoxJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("AgeRange")) {
                faceDetail.setAgeRange(AgeRangeJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Smile")) {
                faceDetail.setSmile(SmileJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Eyeglasses")) {
                faceDetail.setEyeglasses(EyeglassesJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Sunglasses")) {
                faceDetail.setSunglasses(SunglassesJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Gender")) {
                faceDetail.setGender(GenderJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Beard")) {
                faceDetail.setBeard(BeardJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Mustache")) {
                faceDetail.setMustache(MustacheJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("EyesOpen")) {
                faceDetail.setEyesOpen(EyeOpenJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("MouthOpen")) {
                faceDetail.setMouthOpen(MouthOpenJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Emotions")) {
                faceDetail.setEmotions(new ListUnmarshaller(EmotionJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Landmarks")) {
                faceDetail.setLandmarks(new ListUnmarshaller(LandmarkJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Pose")) {
                faceDetail.setPose(PoseJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Quality")) {
                faceDetail.setQuality(ImageQualityJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Confidence")) {
                faceDetail.setConfidence(SimpleTypeJsonUnmarshallers.FloatJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("FaceOccluded")) {
                faceDetail.setFaceOccluded(FaceOccludedJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("EyeDirection")) {
                faceDetail.setEyeDirection(EyeDirectionJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return faceDetail;
    }
}
