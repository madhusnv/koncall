package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.auth.policy.internal.JsonDocumentFields;
import com.amazonaws.services.rekognition.model.ProtectiveEquipmentPerson;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class ProtectiveEquipmentPersonJsonUnmarshaller implements Unmarshaller<ProtectiveEquipmentPerson, JsonUnmarshallerContext> {
    private static ProtectiveEquipmentPersonJsonUnmarshaller instance;

    public static ProtectiveEquipmentPersonJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new ProtectiveEquipmentPersonJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public ProtectiveEquipmentPerson unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ProtectiveEquipmentPerson protectiveEquipmentPerson = new ProtectiveEquipmentPerson();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("BodyParts")) {
                protectiveEquipmentPerson.setBodyParts(new ListUnmarshaller(ProtectiveEquipmentBodyPartJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("BoundingBox")) {
                protectiveEquipmentPerson.setBoundingBox(BoundingBoxJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Confidence")) {
                protectiveEquipmentPerson.setConfidence(SimpleTypeJsonUnmarshallers.FloatJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals(JsonDocumentFields.POLICY_ID)) {
                protectiveEquipmentPerson.setId(SimpleTypeJsonUnmarshallers.IntegerJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return protectiveEquipmentPerson;
    }
}
