package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.BlackFrame;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class BlackFrameJsonMarshaller {
    private static BlackFrameJsonMarshaller instance;

    public static BlackFrameJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new BlackFrameJsonMarshaller();
        }
        return instance;
    }

    public void marshall(BlackFrame blackFrame, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (blackFrame.getMaxPixelThreshold() != null) {
            Float maxPixelThreshold = blackFrame.getMaxPixelThreshold();
            awsJsonWriter.name("MaxPixelThreshold");
            awsJsonWriter.value(maxPixelThreshold);
        }
        if (blackFrame.getMinCoveragePercentage() != null) {
            Float minCoveragePercentage = blackFrame.getMinCoveragePercentage();
            awsJsonWriter.name("MinCoveragePercentage");
            awsJsonWriter.value(minCoveragePercentage);
        }
        awsJsonWriter.endObject();
    }
}
