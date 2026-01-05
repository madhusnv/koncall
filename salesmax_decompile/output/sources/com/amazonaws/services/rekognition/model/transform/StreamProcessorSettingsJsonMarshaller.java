package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.ConnectedHomeSettings;
import com.amazonaws.services.rekognition.model.FaceSearchSettings;
import com.amazonaws.services.rekognition.model.StreamProcessorSettings;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class StreamProcessorSettingsJsonMarshaller {
    private static StreamProcessorSettingsJsonMarshaller instance;

    public static StreamProcessorSettingsJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new StreamProcessorSettingsJsonMarshaller();
        }
        return instance;
    }

    public void marshall(StreamProcessorSettings streamProcessorSettings, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (streamProcessorSettings.getFaceSearch() != null) {
            FaceSearchSettings faceSearch = streamProcessorSettings.getFaceSearch();
            awsJsonWriter.name("FaceSearch");
            FaceSearchSettingsJsonMarshaller.getInstance().marshall(faceSearch, awsJsonWriter);
        }
        if (streamProcessorSettings.getConnectedHome() != null) {
            ConnectedHomeSettings connectedHome = streamProcessorSettings.getConnectedHome();
            awsJsonWriter.name("ConnectedHome");
            ConnectedHomeSettingsJsonMarshaller.getInstance().marshall(connectedHome, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
