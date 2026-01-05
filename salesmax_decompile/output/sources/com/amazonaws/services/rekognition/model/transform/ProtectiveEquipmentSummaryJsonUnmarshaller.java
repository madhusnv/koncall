package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.ProtectiveEquipmentSummary;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class ProtectiveEquipmentSummaryJsonUnmarshaller implements Unmarshaller<ProtectiveEquipmentSummary, JsonUnmarshallerContext> {
    private static ProtectiveEquipmentSummaryJsonUnmarshaller instance;

    public static ProtectiveEquipmentSummaryJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new ProtectiveEquipmentSummaryJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public ProtectiveEquipmentSummary unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ProtectiveEquipmentSummary protectiveEquipmentSummary = new ProtectiveEquipmentSummary();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("PersonsWithRequiredEquipment")) {
                protectiveEquipmentSummary.setPersonsWithRequiredEquipment(new ListUnmarshaller(SimpleTypeJsonUnmarshallers.IntegerJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("PersonsWithoutRequiredEquipment")) {
                protectiveEquipmentSummary.setPersonsWithoutRequiredEquipment(new ListUnmarshaller(SimpleTypeJsonUnmarshallers.IntegerJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("PersonsIndeterminate")) {
                protectiveEquipmentSummary.setPersonsIndeterminate(new ListUnmarshaller(SimpleTypeJsonUnmarshallers.IntegerJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return protectiveEquipmentSummary;
    }
}
