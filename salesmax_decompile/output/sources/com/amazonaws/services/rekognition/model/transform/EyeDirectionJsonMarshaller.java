package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.EyeDirection;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class EyeDirectionJsonMarshaller {
    private static EyeDirectionJsonMarshaller instance;

    public static EyeDirectionJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new EyeDirectionJsonMarshaller();
        }
        return instance;
    }

    public void marshall(EyeDirection eyeDirection, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (eyeDirection.getYaw() != null) {
            Float yaw = eyeDirection.getYaw();
            awsJsonWriter.name("Yaw");
            awsJsonWriter.value(yaw);
        }
        if (eyeDirection.getPitch() != null) {
            Float pitch = eyeDirection.getPitch();
            awsJsonWriter.name("Pitch");
            awsJsonWriter.value(pitch);
        }
        if (eyeDirection.getConfidence() != null) {
            Float confidence = eyeDirection.getConfidence();
            awsJsonWriter.name("Confidence");
            awsJsonWriter.value(confidence);
        }
        awsJsonWriter.endObject();
    }
}
