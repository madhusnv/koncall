package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.KnownGender;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class KnownGenderJsonMarshaller {
    private static KnownGenderJsonMarshaller instance;

    public static KnownGenderJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new KnownGenderJsonMarshaller();
        }
        return instance;
    }

    public void marshall(KnownGender knownGender, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (knownGender.getType() != null) {
            String type2 = knownGender.getType();
            awsJsonWriter.name("Type");
            awsJsonWriter.value(type2);
        }
        awsJsonWriter.endObject();
    }
}
