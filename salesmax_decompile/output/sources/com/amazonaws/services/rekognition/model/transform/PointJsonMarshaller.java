package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.Point;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class PointJsonMarshaller {
    private static PointJsonMarshaller instance;

    public static PointJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new PointJsonMarshaller();
        }
        return instance;
    }

    public void marshall(Point point, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (point.getX() != null) {
            Float x = point.getX();
            awsJsonWriter.name("X");
            awsJsonWriter.value(x);
        }
        if (point.getY() != null) {
            Float y = point.getY();
            awsJsonWriter.name("Y");
            awsJsonWriter.value(y);
        }
        awsJsonWriter.endObject();
    }
}
