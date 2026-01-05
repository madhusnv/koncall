package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.TechnicalCueSegment;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class TechnicalCueSegmentJsonMarshaller {
    private static TechnicalCueSegmentJsonMarshaller instance;

    public static TechnicalCueSegmentJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new TechnicalCueSegmentJsonMarshaller();
        }
        return instance;
    }

    public void marshall(TechnicalCueSegment technicalCueSegment, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (technicalCueSegment.getType() != null) {
            String type2 = technicalCueSegment.getType();
            awsJsonWriter.name("Type");
            awsJsonWriter.value(type2);
        }
        if (technicalCueSegment.getConfidence() != null) {
            Float confidence = technicalCueSegment.getConfidence();
            awsJsonWriter.name("Confidence");
            awsJsonWriter.value(confidence);
        }
        awsJsonWriter.endObject();
    }
}
