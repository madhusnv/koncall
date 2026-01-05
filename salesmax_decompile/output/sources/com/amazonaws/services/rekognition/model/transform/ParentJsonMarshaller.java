package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.Parent;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class ParentJsonMarshaller {
    private static ParentJsonMarshaller instance;

    public static ParentJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new ParentJsonMarshaller();
        }
        return instance;
    }

    public void marshall(Parent parent, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (parent.getName() != null) {
            String name = parent.getName();
            awsJsonWriter.name("Name");
            awsJsonWriter.value(name);
        }
        awsJsonWriter.endObject();
    }
}
