package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.BlackFrame;
import com.amazonaws.services.rekognition.model.StartTechnicalCueDetectionFilter;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class StartTechnicalCueDetectionFilterJsonMarshaller {
    private static StartTechnicalCueDetectionFilterJsonMarshaller instance;

    public static StartTechnicalCueDetectionFilterJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new StartTechnicalCueDetectionFilterJsonMarshaller();
        }
        return instance;
    }

    public void marshall(StartTechnicalCueDetectionFilter startTechnicalCueDetectionFilter, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (startTechnicalCueDetectionFilter.getMinSegmentConfidence() != null) {
            Float minSegmentConfidence = startTechnicalCueDetectionFilter.getMinSegmentConfidence();
            awsJsonWriter.name("MinSegmentConfidence");
            awsJsonWriter.value(minSegmentConfidence);
        }
        if (startTechnicalCueDetectionFilter.getBlackFrame() != null) {
            BlackFrame blackFrame = startTechnicalCueDetectionFilter.getBlackFrame();
            awsJsonWriter.name("BlackFrame");
            BlackFrameJsonMarshaller.getInstance().marshall(blackFrame, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
