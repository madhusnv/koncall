package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.StreamProcessorNotificationChannel;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class StreamProcessorNotificationChannelJsonMarshaller {
    private static StreamProcessorNotificationChannelJsonMarshaller instance;

    public static StreamProcessorNotificationChannelJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new StreamProcessorNotificationChannelJsonMarshaller();
        }
        return instance;
    }

    public void marshall(StreamProcessorNotificationChannel streamProcessorNotificationChannel, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (streamProcessorNotificationChannel.getSNSTopicArn() != null) {
            String sNSTopicArn = streamProcessorNotificationChannel.getSNSTopicArn();
            awsJsonWriter.name("SNSTopicArn");
            awsJsonWriter.value(sNSTopicArn);
        }
        awsJsonWriter.endObject();
    }
}
