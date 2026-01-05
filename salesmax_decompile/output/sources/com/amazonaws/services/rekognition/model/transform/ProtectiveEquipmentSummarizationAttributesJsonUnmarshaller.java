package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.ProtectiveEquipmentSummarizationAttributes;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class ProtectiveEquipmentSummarizationAttributesJsonUnmarshaller implements Unmarshaller<ProtectiveEquipmentSummarizationAttributes, JsonUnmarshallerContext> {
    private static ProtectiveEquipmentSummarizationAttributesJsonUnmarshaller instance;

    public static ProtectiveEquipmentSummarizationAttributesJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new ProtectiveEquipmentSummarizationAttributesJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public ProtectiveEquipmentSummarizationAttributes unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ProtectiveEquipmentSummarizationAttributes protectiveEquipmentSummarizationAttributes = new ProtectiveEquipmentSummarizationAttributes();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("MinConfidence")) {
                protectiveEquipmentSummarizationAttributes.setMinConfidence(SimpleTypeJsonUnmarshallers.FloatJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("RequiredEquipmentTypes")) {
                protectiveEquipmentSummarizationAttributes.setRequiredEquipmentTypes(new ListUnmarshaller(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return protectiveEquipmentSummarizationAttributes;
    }
}
