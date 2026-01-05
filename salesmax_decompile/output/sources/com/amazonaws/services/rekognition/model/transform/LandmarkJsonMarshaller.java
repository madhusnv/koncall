package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.Landmark;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class LandmarkJsonMarshaller {
    private static LandmarkJsonMarshaller instance;

    public static LandmarkJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new LandmarkJsonMarshaller();
        }
        return instance;
    }

    public void marshall(Landmark landmark, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (landmark.getType() != null) {
            String type2 = landmark.getType();
            awsJsonWriter.name("Type");
            awsJsonWriter.value(type2);
        }
        if (landmark.getX() != null) {
            Float x = landmark.getX();
            awsJsonWriter.name("X");
            awsJsonWriter.value(x);
        }
        if (landmark.getY() != null) {
            Float y = landmark.getY();
            awsJsonWriter.name("Y");
            awsJsonWriter.value(y);
        }
        awsJsonWriter.endObject();
    }
}
