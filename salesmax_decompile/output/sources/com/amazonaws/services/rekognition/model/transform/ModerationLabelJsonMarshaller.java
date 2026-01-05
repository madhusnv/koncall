package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.ModerationLabel;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class ModerationLabelJsonMarshaller {
    private static ModerationLabelJsonMarshaller instance;

    public static ModerationLabelJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new ModerationLabelJsonMarshaller();
        }
        return instance;
    }

    public void marshall(ModerationLabel moderationLabel, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (moderationLabel.getConfidence() != null) {
            Float confidence = moderationLabel.getConfidence();
            awsJsonWriter.name("Confidence");
            awsJsonWriter.value(confidence);
        }
        if (moderationLabel.getName() != null) {
            String name = moderationLabel.getName();
            awsJsonWriter.name("Name");
            awsJsonWriter.value(name);
        }
        if (moderationLabel.getParentName() != null) {
            String parentName = moderationLabel.getParentName();
            awsJsonWriter.name("ParentName");
            awsJsonWriter.value(parentName);
        }
        awsJsonWriter.endObject();
    }
}
