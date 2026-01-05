package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.auth.policy.internal.JsonDocumentFields;
import com.amazonaws.services.rekognition.model.Geometry;
import com.amazonaws.services.rekognition.model.TextDetection;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class TextDetectionJsonMarshaller {
    private static TextDetectionJsonMarshaller instance;

    public static TextDetectionJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new TextDetectionJsonMarshaller();
        }
        return instance;
    }

    public void marshall(TextDetection textDetection, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (textDetection.getDetectedText() != null) {
            String detectedText = textDetection.getDetectedText();
            awsJsonWriter.name("DetectedText");
            awsJsonWriter.value(detectedText);
        }
        if (textDetection.getType() != null) {
            String type2 = textDetection.getType();
            awsJsonWriter.name("Type");
            awsJsonWriter.value(type2);
        }
        if (textDetection.getId() != null) {
            Integer id = textDetection.getId();
            awsJsonWriter.name(JsonDocumentFields.POLICY_ID);
            awsJsonWriter.value(id);
        }
        if (textDetection.getParentId() != null) {
            Integer parentId = textDetection.getParentId();
            awsJsonWriter.name("ParentId");
            awsJsonWriter.value(parentId);
        }
        if (textDetection.getConfidence() != null) {
            Float confidence = textDetection.getConfidence();
            awsJsonWriter.name("Confidence");
            awsJsonWriter.value(confidence);
        }
        if (textDetection.getGeometry() != null) {
            Geometry geometry = textDetection.getGeometry();
            awsJsonWriter.name("Geometry");
            GeometryJsonMarshaller.getInstance().marshall(geometry, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
