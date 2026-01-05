package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.BoundingBox;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class BoundingBoxJsonMarshaller {
    private static BoundingBoxJsonMarshaller instance;

    public static BoundingBoxJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new BoundingBoxJsonMarshaller();
        }
        return instance;
    }

    public void marshall(BoundingBox boundingBox, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (boundingBox.getWidth() != null) {
            Float width = boundingBox.getWidth();
            awsJsonWriter.name("Width");
            awsJsonWriter.value(width);
        }
        if (boundingBox.getHeight() != null) {
            Float height = boundingBox.getHeight();
            awsJsonWriter.name("Height");
            awsJsonWriter.value(height);
        }
        if (boundingBox.getLeft() != null) {
            Float left = boundingBox.getLeft();
            awsJsonWriter.name("Left");
            awsJsonWriter.value(left);
        }
        if (boundingBox.getTop() != null) {
            Float top = boundingBox.getTop();
            awsJsonWriter.name("Top");
            awsJsonWriter.value(top);
        }
        awsJsonWriter.endObject();
    }
}
