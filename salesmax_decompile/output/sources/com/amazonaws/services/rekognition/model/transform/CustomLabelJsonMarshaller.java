package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.CustomLabel;
import com.amazonaws.services.rekognition.model.Geometry;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class CustomLabelJsonMarshaller {
    private static CustomLabelJsonMarshaller instance;

    public static CustomLabelJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new CustomLabelJsonMarshaller();
        }
        return instance;
    }

    public void marshall(CustomLabel customLabel, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (customLabel.getName() != null) {
            String name = customLabel.getName();
            awsJsonWriter.name("Name");
            awsJsonWriter.value(name);
        }
        if (customLabel.getConfidence() != null) {
            Float confidence = customLabel.getConfidence();
            awsJsonWriter.name("Confidence");
            awsJsonWriter.value(confidence);
        }
        if (customLabel.getGeometry() != null) {
            Geometry geometry = customLabel.getGeometry();
            awsJsonWriter.name("Geometry");
            GeometryJsonMarshaller.getInstance().marshall(geometry, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
