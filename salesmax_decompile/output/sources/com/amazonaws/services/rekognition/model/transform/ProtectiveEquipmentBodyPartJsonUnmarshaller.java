package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.ProtectiveEquipmentBodyPart;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class ProtectiveEquipmentBodyPartJsonUnmarshaller implements Unmarshaller<ProtectiveEquipmentBodyPart, JsonUnmarshallerContext> {
    private static ProtectiveEquipmentBodyPartJsonUnmarshaller instance;

    public static ProtectiveEquipmentBodyPartJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new ProtectiveEquipmentBodyPartJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public ProtectiveEquipmentBodyPart unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ProtectiveEquipmentBodyPart protectiveEquipmentBodyPart = new ProtectiveEquipmentBodyPart();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("Name")) {
                protectiveEquipmentBodyPart.setName(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Confidence")) {
                protectiveEquipmentBodyPart.setConfidence(SimpleTypeJsonUnmarshallers.FloatJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("EquipmentDetections")) {
                protectiveEquipmentBodyPart.setEquipmentDetections(new ListUnmarshaller(EquipmentDetectionJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return protectiveEquipmentBodyPart;
    }
}
