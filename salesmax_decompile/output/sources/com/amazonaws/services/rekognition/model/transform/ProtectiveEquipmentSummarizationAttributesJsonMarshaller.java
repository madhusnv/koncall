package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.ProtectiveEquipmentSummarizationAttributes;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.List;

/* loaded from: classes5.dex */
class ProtectiveEquipmentSummarizationAttributesJsonMarshaller {
    private static ProtectiveEquipmentSummarizationAttributesJsonMarshaller instance;

    public static ProtectiveEquipmentSummarizationAttributesJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new ProtectiveEquipmentSummarizationAttributesJsonMarshaller();
        }
        return instance;
    }

    public void marshall(ProtectiveEquipmentSummarizationAttributes protectiveEquipmentSummarizationAttributes, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (protectiveEquipmentSummarizationAttributes.getMinConfidence() != null) {
            Float minConfidence = protectiveEquipmentSummarizationAttributes.getMinConfidence();
            awsJsonWriter.name("MinConfidence");
            awsJsonWriter.value(minConfidence);
        }
        if (protectiveEquipmentSummarizationAttributes.getRequiredEquipmentTypes() != null) {
            List<String> requiredEquipmentTypes = protectiveEquipmentSummarizationAttributes.getRequiredEquipmentTypes();
            awsJsonWriter.name("RequiredEquipmentTypes");
            awsJsonWriter.beginArray();
            for (String str : requiredEquipmentTypes) {
                if (str != null) {
                    awsJsonWriter.value(str);
                }
            }
            awsJsonWriter.endArray();
        }
        awsJsonWriter.endObject();
    }
}
