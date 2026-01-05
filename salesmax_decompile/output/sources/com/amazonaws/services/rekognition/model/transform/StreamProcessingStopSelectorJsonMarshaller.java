package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.StreamProcessingStopSelector;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class StreamProcessingStopSelectorJsonMarshaller {
    private static StreamProcessingStopSelectorJsonMarshaller instance;

    public static StreamProcessingStopSelectorJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new StreamProcessingStopSelectorJsonMarshaller();
        }
        return instance;
    }

    public void marshall(StreamProcessingStopSelector streamProcessingStopSelector, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (streamProcessingStopSelector.getMaxDurationInSeconds() != null) {
            Long maxDurationInSeconds = streamProcessingStopSelector.getMaxDurationInSeconds();
            awsJsonWriter.name("MaxDurationInSeconds");
            awsJsonWriter.value(maxDurationInSeconds);
        }
        awsJsonWriter.endObject();
    }
}
