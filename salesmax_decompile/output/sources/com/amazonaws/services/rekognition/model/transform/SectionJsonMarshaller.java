package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.Section;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class SectionJsonMarshaller {
    private static SectionJsonMarshaller instance;

    public static SectionJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new SectionJsonMarshaller();
        }
        return instance;
    }

    public void marshall(Section section, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (section.getStartTimestamp() != null) {
            Long startTimestamp = section.getStartTimestamp();
            awsJsonWriter.name("StartTimestamp");
            awsJsonWriter.value(startTimestamp);
        }
        if (section.getEndTimestamp() != null) {
            Long endTimestamp = section.getEndTimestamp();
            awsJsonWriter.name("EndTimestamp");
            awsJsonWriter.value(endTimestamp);
        }
        awsJsonWriter.endObject();
    }
}
