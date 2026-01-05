package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.EquipmentDetection;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class EquipmentDetectionJsonUnmarshaller implements Unmarshaller<EquipmentDetection, JsonUnmarshallerContext> {
    private static EquipmentDetectionJsonUnmarshaller instance;

    public static EquipmentDetectionJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new EquipmentDetectionJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public EquipmentDetection unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        EquipmentDetection equipmentDetection = new EquipmentDetection();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("BoundingBox")) {
                equipmentDetection.setBoundingBox(BoundingBoxJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Confidence")) {
                equipmentDetection.setConfidence(SimpleTypeJsonUnmarshallers.FloatJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Type")) {
                equipmentDetection.setType(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("CoversBodyPart")) {
                equipmentDetection.setCoversBodyPart(CoversBodyPartJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return equipmentDetection;
    }
}
