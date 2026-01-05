package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.ProtectiveEquipmentSummary;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.List;

/* loaded from: classes5.dex */
class ProtectiveEquipmentSummaryJsonMarshaller {
    private static ProtectiveEquipmentSummaryJsonMarshaller instance;

    public static ProtectiveEquipmentSummaryJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new ProtectiveEquipmentSummaryJsonMarshaller();
        }
        return instance;
    }

    public void marshall(ProtectiveEquipmentSummary protectiveEquipmentSummary, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (protectiveEquipmentSummary.getPersonsWithRequiredEquipment() != null) {
            List<Integer> personsWithRequiredEquipment = protectiveEquipmentSummary.getPersonsWithRequiredEquipment();
            awsJsonWriter.name("PersonsWithRequiredEquipment");
            awsJsonWriter.beginArray();
            for (Integer num : personsWithRequiredEquipment) {
                if (num != null) {
                    awsJsonWriter.value(num);
                }
            }
            awsJsonWriter.endArray();
        }
        if (protectiveEquipmentSummary.getPersonsWithoutRequiredEquipment() != null) {
            List<Integer> personsWithoutRequiredEquipment = protectiveEquipmentSummary.getPersonsWithoutRequiredEquipment();
            awsJsonWriter.name("PersonsWithoutRequiredEquipment");
            awsJsonWriter.beginArray();
            for (Integer num2 : personsWithoutRequiredEquipment) {
                if (num2 != null) {
                    awsJsonWriter.value(num2);
                }
            }
            awsJsonWriter.endArray();
        }
        if (protectiveEquipmentSummary.getPersonsIndeterminate() != null) {
            List<Integer> personsIndeterminate = protectiveEquipmentSummary.getPersonsIndeterminate();
            awsJsonWriter.name("PersonsIndeterminate");
            awsJsonWriter.beginArray();
            for (Integer num3 : personsIndeterminate) {
                if (num3 != null) {
                    awsJsonWriter.value(num3);
                }
            }
            awsJsonWriter.endArray();
        }
        awsJsonWriter.endObject();
    }
}
