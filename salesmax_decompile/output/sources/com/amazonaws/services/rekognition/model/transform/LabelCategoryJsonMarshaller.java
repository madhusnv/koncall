package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.LabelCategory;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class LabelCategoryJsonMarshaller {
    private static LabelCategoryJsonMarshaller instance;

    public static LabelCategoryJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new LabelCategoryJsonMarshaller();
        }
        return instance;
    }

    public void marshall(LabelCategory labelCategory, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (labelCategory.getName() != null) {
            String name = labelCategory.getName();
            awsJsonWriter.name("Name");
            awsJsonWriter.value(name);
        }
        awsJsonWriter.endObject();
    }
}
