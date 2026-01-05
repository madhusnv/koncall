package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.ConnectedHomeSettings;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.List;

/* loaded from: classes5.dex */
class ConnectedHomeSettingsJsonMarshaller {
    private static ConnectedHomeSettingsJsonMarshaller instance;

    public static ConnectedHomeSettingsJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new ConnectedHomeSettingsJsonMarshaller();
        }
        return instance;
    }

    public void marshall(ConnectedHomeSettings connectedHomeSettings, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (connectedHomeSettings.getLabels() != null) {
            List<String> labels = connectedHomeSettings.getLabels();
            awsJsonWriter.name("Labels");
            awsJsonWriter.beginArray();
            for (String str : labels) {
                if (str != null) {
                    awsJsonWriter.value(str);
                }
            }
            awsJsonWriter.endArray();
        }
        if (connectedHomeSettings.getMinConfidence() != null) {
            Float minConfidence = connectedHomeSettings.getMinConfidence();
            awsJsonWriter.name("MinConfidence");
            awsJsonWriter.value(minConfidence);
        }
        awsJsonWriter.endObject();
    }
}
