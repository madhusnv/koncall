package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.BoundingBox;
import com.amazonaws.services.rekognition.model.CoversBodyPart;
import com.amazonaws.services.rekognition.model.EquipmentDetection;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class EquipmentDetectionJsonMarshaller {
    private static EquipmentDetectionJsonMarshaller instance;

    public static EquipmentDetectionJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new EquipmentDetectionJsonMarshaller();
        }
        return instance;
    }

    public void marshall(EquipmentDetection equipmentDetection, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (equipmentDetection.getBoundingBox() != null) {
            BoundingBox boundingBox = equipmentDetection.getBoundingBox();
            awsJsonWriter.name("BoundingBox");
            BoundingBoxJsonMarshaller.getInstance().marshall(boundingBox, awsJsonWriter);
        }
        if (equipmentDetection.getConfidence() != null) {
            Float confidence = equipmentDetection.getConfidence();
            awsJsonWriter.name("Confidence");
            awsJsonWriter.value(confidence);
        }
        if (equipmentDetection.getType() != null) {
            String type2 = equipmentDetection.getType();
            awsJsonWriter.name("Type");
            awsJsonWriter.value(type2);
        }
        if (equipmentDetection.getCoversBodyPart() != null) {
            CoversBodyPart coversBodyPart = equipmentDetection.getCoversBodyPart();
            awsJsonWriter.name("CoversBodyPart");
            CoversBodyPartJsonMarshaller.getInstance().marshall(coversBodyPart, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
