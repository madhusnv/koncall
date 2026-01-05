package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class StreamProcessorNotificationChannel implements Serializable {
    private String sNSTopicArn;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof StreamProcessorNotificationChannel)) {
            return false;
        }
        StreamProcessorNotificationChannel streamProcessorNotificationChannel = (StreamProcessorNotificationChannel) obj;
        if ((streamProcessorNotificationChannel.getSNSTopicArn() == null) ^ (getSNSTopicArn() == null)) {
            return false;
        }
        return streamProcessorNotificationChannel.getSNSTopicArn() == null || streamProcessorNotificationChannel.getSNSTopicArn().equals(getSNSTopicArn());
    }

    public String getSNSTopicArn() {
        return this.sNSTopicArn;
    }

    public int hashCode() {
        return 31 + (getSNSTopicArn() == null ? 0 : getSNSTopicArn().hashCode());
    }

    public void setSNSTopicArn(String str) {
        this.sNSTopicArn = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSNSTopicArn() != null) {
            sb.append("SNSTopicArn: " + getSNSTopicArn());
        }
        sb.append("}");
        return sb.toString();
    }

    public StreamProcessorNotificationChannel withSNSTopicArn(String str) {
        this.sNSTopicArn = str;
        return this;
    }
}
