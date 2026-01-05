package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.auth.policy.internal.JsonDocumentFields;
import com.amazonaws.services.rekognition.model.BoundingBox;
import com.amazonaws.services.rekognition.model.ProtectiveEquipmentBodyPart;
import com.amazonaws.services.rekognition.model.ProtectiveEquipmentPerson;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.List;

/* loaded from: classes5.dex */
class ProtectiveEquipmentPersonJsonMarshaller {
    private static ProtectiveEquipmentPersonJsonMarshaller instance;

    public static ProtectiveEquipmentPersonJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new ProtectiveEquipmentPersonJsonMarshaller();
        }
        return instance;
    }

    public void marshall(ProtectiveEquipmentPerson protectiveEquipmentPerson, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (protectiveEquipmentPerson.getBodyParts() != null) {
            List<ProtectiveEquipmentBodyPart> bodyParts = protectiveEquipmentPerson.getBodyParts();
            awsJsonWriter.name("BodyParts");
            awsJsonWriter.beginArray();
            for (ProtectiveEquipmentBodyPart protectiveEquipmentBodyPart : bodyParts) {
                if (protectiveEquipmentBodyPart != null) {
                    ProtectiveEquipmentBodyPartJsonMarshaller.getInstance().marshall(protectiveEquipmentBodyPart, awsJsonWriter);
                }
            }
            awsJsonWriter.endArray();
        }
        if (protectiveEquipmentPerson.getBoundingBox() != null) {
            BoundingBox boundingBox = protectiveEquipmentPerson.getBoundingBox();
            awsJsonWriter.name("BoundingBox");
            BoundingBoxJsonMarshaller.getInstance().marshall(boundingBox, awsJsonWriter);
        }
        if (protectiveEquipmentPerson.getConfidence() != null) {
            Float confidence = protectiveEquipmentPerson.getConfidence();
            awsJsonWriter.name("Confidence");
            awsJsonWriter.value(confidence);
        }
        if (protectiveEquipmentPerson.getId() != null) {
            Integer id = protectiveEquipmentPerson.getId();
            awsJsonWriter.name(JsonDocumentFields.POLICY_ID);
            awsJsonWriter.value(id);
        }
        awsJsonWriter.endObject();
    }
}
