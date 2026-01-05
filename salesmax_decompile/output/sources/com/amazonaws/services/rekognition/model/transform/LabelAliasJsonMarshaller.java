package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.LabelAlias;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class LabelAliasJsonMarshaller {
    private static LabelAliasJsonMarshaller instance;

    public static LabelAliasJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new LabelAliasJsonMarshaller();
        }
        return instance;
    }

    public void marshall(LabelAlias labelAlias, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (labelAlias.getName() != null) {
            String name = labelAlias.getName();
            awsJsonWriter.name("Name");
            awsJsonWriter.value(name);
        }
        awsJsonWriter.endObject();
    }
}
