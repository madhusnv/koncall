package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.StartShotDetectionFilter;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class StartShotDetectionFilterJsonMarshaller {
    private static StartShotDetectionFilterJsonMarshaller instance;

    public static StartShotDetectionFilterJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new StartShotDetectionFilterJsonMarshaller();
        }
        return instance;
    }

    public void marshall(StartShotDetectionFilter startShotDetectionFilter, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (startShotDetectionFilter.getMinSegmentConfidence() != null) {
            Float minSegmentConfidence = startShotDetectionFilter.getMinSegmentConfidence();
            awsJsonWriter.name("MinSegmentConfidence");
            awsJsonWriter.value(minSegmentConfidence);
        }
        awsJsonWriter.endObject();
    }
}
