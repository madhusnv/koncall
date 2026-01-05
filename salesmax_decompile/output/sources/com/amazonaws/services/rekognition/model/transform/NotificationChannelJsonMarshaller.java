package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.NotificationChannel;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class NotificationChannelJsonMarshaller {
    private static NotificationChannelJsonMarshaller instance;

    public static NotificationChannelJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new NotificationChannelJsonMarshaller();
        }
        return instance;
    }

    public void marshall(NotificationChannel notificationChannel, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (notificationChannel.getSNSTopicArn() != null) {
            String sNSTopicArn = notificationChannel.getSNSTopicArn();
            awsJsonWriter.name("SNSTopicArn");
            awsJsonWriter.value(sNSTopicArn);
        }
        if (notificationChannel.getRoleArn() != null) {
            String roleArn = notificationChannel.getRoleArn();
            awsJsonWriter.name("RoleArn");
            awsJsonWriter.value(roleArn);
        }
        awsJsonWriter.endObject();
    }
}
