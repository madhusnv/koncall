package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.EquipmentDetection;
import com.amazonaws.services.rekognition.model.ProtectiveEquipmentBodyPart;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.List;

/* loaded from: classes5.dex */
class ProtectiveEquipmentBodyPartJsonMarshaller {
    private static ProtectiveEquipmentBodyPartJsonMarshaller instance;

    public static ProtectiveEquipmentBodyPartJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new ProtectiveEquipmentBodyPartJsonMarshaller();
        }
        return instance;
    }

    public void marshall(ProtectiveEquipmentBodyPart protectiveEquipmentBodyPart, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (protectiveEquipmentBodyPart.getName() != null) {
            String name = protectiveEquipmentBodyPart.getName();
            awsJsonWriter.name("Name");
            awsJsonWriter.value(name);
        }
        if (protectiveEquipmentBodyPart.getConfidence() != null) {
            Float confidence = protectiveEquipmentBodyPart.getConfidence();
            awsJsonWriter.name("Confidence");
            awsJsonWriter.value(confidence);
        }
        if (protectiveEquipmentBodyPart.getEquipmentDetections() != null) {
            List<EquipmentDetection> equipmentDetections = protectiveEquipmentBodyPart.getEquipmentDetections();
            awsJsonWriter.name("EquipmentDetections");
            awsJsonWriter.beginArray();
            for (EquipmentDetection equipmentDetection : equipmentDetections) {
                if (equipmentDetection != null) {
                    EquipmentDetectionJsonMarshaller.getInstance().marshall(equipmentDetection, awsJsonWriter);
                }
            }
            awsJsonWriter.endArray();
        }
        awsJsonWriter.endObject();
    }
}
