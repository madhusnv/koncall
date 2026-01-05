package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.HumanLoopDataAttributes;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.List;

/* loaded from: classes5.dex */
class HumanLoopDataAttributesJsonMarshaller {
    private static HumanLoopDataAttributesJsonMarshaller instance;

    public static HumanLoopDataAttributesJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new HumanLoopDataAttributesJsonMarshaller();
        }
        return instance;
    }

    public void marshall(HumanLoopDataAttributes humanLoopDataAttributes, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (humanLoopDataAttributes.getContentClassifiers() != null) {
            List<String> contentClassifiers = humanLoopDataAttributes.getContentClassifiers();
            awsJsonWriter.name("ContentClassifiers");
            awsJsonWriter.beginArray();
            for (String str : contentClassifiers) {
                if (str != null) {
                    awsJsonWriter.value(str);
                }
            }
            awsJsonWriter.endArray();
        }
        awsJsonWriter.endObject();
    }
}
