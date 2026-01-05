package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.StreamProcessor;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class StreamProcessorJsonMarshaller {
    private static StreamProcessorJsonMarshaller instance;

    public static StreamProcessorJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new StreamProcessorJsonMarshaller();
        }
        return instance;
    }

    public void marshall(StreamProcessor streamProcessor, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (streamProcessor.getName() != null) {
            String name = streamProcessor.getName();
            awsJsonWriter.name("Name");
            awsJsonWriter.value(name);
        }
        if (streamProcessor.getStatus() != null) {
            String status = streamProcessor.getStatus();
            awsJsonWriter.name("Status");
            awsJsonWriter.value(status);
        }
        awsJsonWriter.endObject();
    }
}
