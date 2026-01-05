package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.DetectionFilter;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class DetectionFilterJsonMarshaller {
    private static DetectionFilterJsonMarshaller instance;

    public static DetectionFilterJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new DetectionFilterJsonMarshaller();
        }
        return instance;
    }

    public void marshall(DetectionFilter detectionFilter, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (detectionFilter.getMinConfidence() != null) {
            Float minConfidence = detectionFilter.getMinConfidence();
            awsJsonWriter.name("MinConfidence");
            awsJsonWriter.value(minConfidence);
        }
        if (detectionFilter.getMinBoundingBoxHeight() != null) {
            Float minBoundingBoxHeight = detectionFilter.getMinBoundingBoxHeight();
            awsJsonWriter.name("MinBoundingBoxHeight");
            awsJsonWriter.value(minBoundingBoxHeight);
        }
        if (detectionFilter.getMinBoundingBoxWidth() != null) {
            Float minBoundingBoxWidth = detectionFilter.getMinBoundingBoxWidth();
            awsJsonWriter.name("MinBoundingBoxWidth");
            awsJsonWriter.value(minBoundingBoxWidth);
        }
        awsJsonWriter.endObject();
    }
}
