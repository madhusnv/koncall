package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.DetectProtectiveEquipmentResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
public class DetectProtectiveEquipmentResultJsonUnmarshaller implements Unmarshaller<DetectProtectiveEquipmentResult, JsonUnmarshallerContext> {
    private static DetectProtectiveEquipmentResultJsonUnmarshaller instance;

    public static DetectProtectiveEquipmentResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new DetectProtectiveEquipmentResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public DetectProtectiveEquipmentResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        DetectProtectiveEquipmentResult detectProtectiveEquipmentResult = new DetectProtectiveEquipmentResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("ProtectiveEquipmentModelVersion")) {
                detectProtectiveEquipmentResult.setProtectiveEquipmentModelVersion(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Persons")) {
                detectProtectiveEquipmentResult.setPersons(new ListUnmarshaller(ProtectiveEquipmentPersonJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Summary")) {
                detectProtectiveEquipmentResult.setSummary(ProtectiveEquipmentSummaryJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return detectProtectiveEquipmentResult;
    }
}
