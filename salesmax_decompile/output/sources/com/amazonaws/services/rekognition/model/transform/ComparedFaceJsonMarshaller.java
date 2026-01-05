package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.BoundingBox;
import com.amazonaws.services.rekognition.model.ComparedFace;
import com.amazonaws.services.rekognition.model.Emotion;
import com.amazonaws.services.rekognition.model.ImageQuality;
import com.amazonaws.services.rekognition.model.Landmark;
import com.amazonaws.services.rekognition.model.Pose;
import com.amazonaws.services.rekognition.model.Smile;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.List;

/* loaded from: classes5.dex */
class ComparedFaceJsonMarshaller {
    private static ComparedFaceJsonMarshaller instance;

    public static ComparedFaceJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new ComparedFaceJsonMarshaller();
        }
        return instance;
    }

    public void marshall(ComparedFace comparedFace, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (comparedFace.getBoundingBox() != null) {
            BoundingBox boundingBox = comparedFace.getBoundingBox();
            awsJsonWriter.name("BoundingBox");
            BoundingBoxJsonMarshaller.getInstance().marshall(boundingBox, awsJsonWriter);
        }
        if (comparedFace.getConfidence() != null) {
            Float confidence = comparedFace.getConfidence();
            awsJsonWriter.name("Confidence");
            awsJsonWriter.value(confidence);
        }
        if (comparedFace.getLandmarks() != null) {
            List<Landmark> landmarks = comparedFace.getLandmarks();
            awsJsonWriter.name("Landmarks");
            awsJsonWriter.beginArray();
            for (Landmark landmark : landmarks) {
                if (landmark != null) {
                    LandmarkJsonMarshaller.getInstance().marshall(landmark, awsJsonWriter);
                }
            }
            awsJsonWriter.endArray();
        }
        if (comparedFace.getPose() != null) {
            Pose pose = comparedFace.getPose();
            awsJsonWriter.name("Pose");
            PoseJsonMarshaller.getInstance().marshall(pose, awsJsonWriter);
        }
        if (comparedFace.getQuality() != null) {
            ImageQuality quality = comparedFace.getQuality();
            awsJsonWriter.name("Quality");
            ImageQualityJsonMarshaller.getInstance().marshall(quality, awsJsonWriter);
        }
        if (comparedFace.getEmotions() != null) {
            List<Emotion> emotions = comparedFace.getEmotions();
            awsJsonWriter.name("Emotions");
            awsJsonWriter.beginArray();
            for (Emotion emotion : emotions) {
                if (emotion != null) {
                    EmotionJsonMarshaller.getInstance().marshall(emotion, awsJsonWriter);
                }
            }
            awsJsonWriter.endArray();
        }
        if (comparedFace.getSmile() != null) {
            Smile smile = comparedFace.getSmile();
            awsJsonWriter.name("Smile");
            SmileJsonMarshaller.getInstance().marshall(smile, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
