package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.ShotSegment;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class ShotSegmentJsonMarshaller {
    private static ShotSegmentJsonMarshaller instance;

    public static ShotSegmentJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new ShotSegmentJsonMarshaller();
        }
        return instance;
    }

    public void marshall(ShotSegment shotSegment, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (shotSegment.getIndex() != null) {
            Long index = shotSegment.getIndex();
            awsJsonWriter.name("Index");
            awsJsonWriter.value(index);
        }
        if (shotSegment.getConfidence() != null) {
            Float confidence = shotSegment.getConfidence();
            awsJsonWriter.name("Confidence");
            awsJsonWriter.value(confidence);
        }
        awsJsonWriter.endObject();
    }
}
