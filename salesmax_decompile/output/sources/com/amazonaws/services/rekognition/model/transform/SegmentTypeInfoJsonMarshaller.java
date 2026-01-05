package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.SegmentTypeInfo;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class SegmentTypeInfoJsonMarshaller {
    private static SegmentTypeInfoJsonMarshaller instance;

    public static SegmentTypeInfoJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new SegmentTypeInfoJsonMarshaller();
        }
        return instance;
    }

    public void marshall(SegmentTypeInfo segmentTypeInfo, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (segmentTypeInfo.getType() != null) {
            String type2 = segmentTypeInfo.getType();
            awsJsonWriter.name("Type");
            awsJsonWriter.value(type2);
        }
        if (segmentTypeInfo.getModelVersion() != null) {
            String modelVersion = segmentTypeInfo.getModelVersion();
            awsJsonWriter.name("ModelVersion");
            awsJsonWriter.value(modelVersion);
        }
        awsJsonWriter.endObject();
    }
}
