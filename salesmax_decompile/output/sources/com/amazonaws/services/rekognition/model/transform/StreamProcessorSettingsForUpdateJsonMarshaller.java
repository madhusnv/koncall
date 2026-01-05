package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.ConnectedHomeSettingsForUpdate;
import com.amazonaws.services.rekognition.model.StreamProcessorSettingsForUpdate;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class StreamProcessorSettingsForUpdateJsonMarshaller {
    private static StreamProcessorSettingsForUpdateJsonMarshaller instance;

    public static StreamProcessorSettingsForUpdateJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new StreamProcessorSettingsForUpdateJsonMarshaller();
        }
        return instance;
    }

    public void marshall(StreamProcessorSettingsForUpdate streamProcessorSettingsForUpdate, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (streamProcessorSettingsForUpdate.getConnectedHomeForUpdate() != null) {
            ConnectedHomeSettingsForUpdate connectedHomeForUpdate = streamProcessorSettingsForUpdate.getConnectedHomeForUpdate();
            awsJsonWriter.name("ConnectedHomeForUpdate");
            ConnectedHomeSettingsForUpdateJsonMarshaller.getInstance().marshall(connectedHomeForUpdate, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
