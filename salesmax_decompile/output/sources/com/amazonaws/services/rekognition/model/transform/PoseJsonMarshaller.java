package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.Pose;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class PoseJsonMarshaller {
    private static PoseJsonMarshaller instance;

    public static PoseJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new PoseJsonMarshaller();
        }
        return instance;
    }

    public void marshall(Pose pose, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (pose.getRoll() != null) {
            Float roll = pose.getRoll();
            awsJsonWriter.name("Roll");
            awsJsonWriter.value(roll);
        }
        if (pose.getYaw() != null) {
            Float yaw = pose.getYaw();
            awsJsonWriter.name("Yaw");
            awsJsonWriter.value(yaw);
        }
        if (pose.getPitch() != null) {
            Float pitch = pose.getPitch();
            awsJsonWriter.name("Pitch");
            awsJsonWriter.value(pitch);
        }
        awsJsonWriter.endObject();
    }
}
