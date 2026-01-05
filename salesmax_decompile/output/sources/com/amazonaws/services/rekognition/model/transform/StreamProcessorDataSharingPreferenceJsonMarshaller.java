package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.StreamProcessorDataSharingPreference;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class StreamProcessorDataSharingPreferenceJsonMarshaller {
    private static StreamProcessorDataSharingPreferenceJsonMarshaller instance;

    public static StreamProcessorDataSharingPreferenceJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new StreamProcessorDataSharingPreferenceJsonMarshaller();
        }
        return instance;
    }

    public void marshall(StreamProcessorDataSharingPreference streamProcessorDataSharingPreference, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (streamProcessorDataSharingPreference.getOptIn() != null) {
            Boolean optIn = streamProcessorDataSharingPreference.getOptIn();
            awsJsonWriter.name("OptIn");
            awsJsonWriter.value(optIn.booleanValue());
        }
        awsJsonWriter.endObject();
    }
}
