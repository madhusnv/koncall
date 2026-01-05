package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.ConnectedHomeSettingsForUpdate;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.List;

/* loaded from: classes5.dex */
class ConnectedHomeSettingsForUpdateJsonMarshaller {
    private static ConnectedHomeSettingsForUpdateJsonMarshaller instance;

    public static ConnectedHomeSettingsForUpdateJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new ConnectedHomeSettingsForUpdateJsonMarshaller();
        }
        return instance;
    }

    public void marshall(ConnectedHomeSettingsForUpdate connectedHomeSettingsForUpdate, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (connectedHomeSettingsForUpdate.getLabels() != null) {
            List<String> labels = connectedHomeSettingsForUpdate.getLabels();
            awsJsonWriter.name("Labels");
            awsJsonWriter.beginArray();
            for (String str : labels) {
                if (str != null) {
                    awsJsonWriter.value(str);
                }
            }
            awsJsonWriter.endArray();
        }
        if (connectedHomeSettingsForUpdate.getMinConfidence() != null) {
            Float minConfidence = connectedHomeSettingsForUpdate.getMinConfidence();
            awsJsonWriter.name("MinConfidence");
            awsJsonWriter.value(minConfidence);
        }
        awsJsonWriter.endObject();
    }
}
