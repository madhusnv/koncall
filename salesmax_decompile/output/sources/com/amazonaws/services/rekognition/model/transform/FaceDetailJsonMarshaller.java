package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.AgeRange;
import com.amazonaws.services.rekognition.model.Beard;
import com.amazonaws.services.rekognition.model.BoundingBox;
import com.amazonaws.services.rekognition.model.Emotion;
import com.amazonaws.services.rekognition.model.EyeDirection;
import com.amazonaws.services.rekognition.model.EyeOpen;
import com.amazonaws.services.rekognition.model.Eyeglasses;
import com.amazonaws.services.rekognition.model.FaceDetail;
import com.amazonaws.services.rekognition.model.FaceOccluded;
import com.amazonaws.services.rekognition.model.Gender;
import com.amazonaws.services.rekognition.model.ImageQuality;
import com.amazonaws.services.rekognition.model.Landmark;
import com.amazonaws.services.rekognition.model.MouthOpen;
import com.amazonaws.services.rekognition.model.Mustache;
import com.amazonaws.services.rekognition.model.Pose;
import com.amazonaws.services.rekognition.model.Smile;
import com.amazonaws.services.rekognition.model.Sunglasses;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.List;

/* loaded from: classes5.dex */
class FaceDetailJsonMarshaller {
    private static FaceDetailJsonMarshaller instance;

    public static FaceDetailJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new FaceDetailJsonMarshaller();
        }
        return instance;
    }

    public void marshall(FaceDetail faceDetail, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (faceDetail.getBoundingBox() != null) {
            BoundingBox boundingBox = faceDetail.getBoundingBox();
            awsJsonWriter.name("BoundingBox");
            BoundingBoxJsonMarshaller.getInstance().marshall(boundingBox, awsJsonWriter);
        }
        if (faceDetail.getAgeRange() != null) {
            AgeRange ageRange = faceDetail.getAgeRange();
            awsJsonWriter.name("AgeRange");
            AgeRangeJsonMarshaller.getInstance().marshall(ageRange, awsJsonWriter);
        }
        if (faceDetail.getSmile() != null) {
            Smile smile = faceDetail.getSmile();
            awsJsonWriter.name("Smile");
            SmileJsonMarshaller.getInstance().marshall(smile, awsJsonWriter);
        }
        if (faceDetail.getEyeglasses() != null) {
            Eyeglasses eyeglasses = faceDetail.getEyeglasses();
            awsJsonWriter.name("Eyeglasses");
            EyeglassesJsonMarshaller.getInstance().marshall(eyeglasses, awsJsonWriter);
        }
        if (faceDetail.getSunglasses() != null) {
            Sunglasses sunglasses = faceDetail.getSunglasses();
            awsJsonWriter.name("Sunglasses");
            SunglassesJsonMarshaller.getInstance().marshall(sunglasses, awsJsonWriter);
        }
        if (faceDetail.getGender() != null) {
            Gender gender = faceDetail.getGender();
            awsJsonWriter.name("Gender");
            GenderJsonMarshaller.getInstance().marshall(gender, awsJsonWriter);
        }
        if (faceDetail.getBeard() != null) {
            Beard beard = faceDetail.getBeard();
            awsJsonWriter.name("Beard");
            BeardJsonMarshaller.getInstance().marshall(beard, awsJsonWriter);
        }
        if (faceDetail.getMustache() != null) {
            Mustache mustache = faceDetail.getMustache();
            awsJsonWriter.name("Mustache");
            MustacheJsonMarshaller.getInstance().marshall(mustache, awsJsonWriter);
        }
        if (faceDetail.getEyesOpen() != null) {
            EyeOpen eyesOpen = faceDetail.getEyesOpen();
            awsJsonWriter.name("EyesOpen");
            EyeOpenJsonMarshaller.getInstance().marshall(eyesOpen, awsJsonWriter);
        }
        if (faceDetail.getMouthOpen() != null) {
            MouthOpen mouthOpen = faceDetail.getMouthOpen();
            awsJsonWriter.name("MouthOpen");
            MouthOpenJsonMarshaller.getInstance().marshall(mouthOpen, awsJsonWriter);
        }
        if (faceDetail.getEmotions() != null) {
            List<Emotion> emotions = faceDetail.getEmotions();
            awsJsonWriter.name("Emotions");
            awsJsonWriter.beginArray();
            for (Emotion emotion : emotions) {
                if (emotion != null) {
                    EmotionJsonMarshaller.getInstance().marshall(emotion, awsJsonWriter);
                }
            }
            awsJsonWriter.endArray();
        }
        if (faceDetail.getLandmarks() != null) {
            List<Landmark> landmarks = faceDetail.getLandmarks();
            awsJsonWriter.name("Landmarks");
            awsJsonWriter.beginArray();
            for (Landmark landmark : landmarks) {
                if (landmark != null) {
                    LandmarkJsonMarshaller.getInstance().marshall(landmark, awsJsonWriter);
                }
            }
            awsJsonWriter.endArray();
        }
        if (faceDetail.getPose() != null) {
            Pose pose = faceDetail.getPose();
            awsJsonWriter.name("Pose");
            PoseJsonMarshaller.getInstance().marshall(pose, awsJsonWriter);
        }
        if (faceDetail.getQuality() != null) {
            ImageQuality quality = faceDetail.getQuality();
            awsJsonWriter.name("Quality");
            ImageQualityJsonMarshaller.getInstance().marshall(quality, awsJsonWriter);
        }
        if (faceDetail.getConfidence() != null) {
            Float confidence = faceDetail.getConfidence();
            awsJsonWriter.name("Confidence");
            awsJsonWriter.value(confidence);
        }
        if (faceDetail.getFaceOccluded() != null) {
            FaceOccluded faceOccluded = faceDetail.getFaceOccluded();
            awsJsonWriter.name("FaceOccluded");
            FaceOccludedJsonMarshaller.getInstance().marshall(faceOccluded, awsJsonWriter);
        }
        if (faceDetail.getEyeDirection() != null) {
            EyeDirection eyeDirection = faceDetail.getEyeDirection();
            awsJsonWriter.name("EyeDirection");
            EyeDirectionJsonMarshaller.getInstance().marshall(eyeDirection, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
