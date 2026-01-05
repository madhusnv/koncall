package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class NotificationChannel implements Serializable {
    private String roleArn;
    private String sNSTopicArn;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof NotificationChannel)) {
            return false;
        }
        NotificationChannel notificationChannel = (NotificationChannel) obj;
        if ((notificationChannel.getSNSTopicArn() == null) ^ (getSNSTopicArn() == null)) {
            return false;
        }
        if (notificationChannel.getSNSTopicArn() != null && !notificationChannel.getSNSTopicArn().equals(getSNSTopicArn())) {
            return false;
        }
        if ((notificationChannel.getRoleArn() == null) ^ (getRoleArn() == null)) {
            return false;
        }
        return notificationChannel.getRoleArn() == null || notificationChannel.getRoleArn().equals(getRoleArn());
    }

    public String getRoleArn() {
        return this.roleArn;
    }

    public String getSNSTopicArn() {
        return this.sNSTopicArn;
    }

    public int hashCode() {
        return (((getSNSTopicArn() == null ? 0 : getSNSTopicArn().hashCode()) + 31) * 31) + (getRoleArn() != null ? getRoleArn().hashCode() : 0);
    }

    public void setRoleArn(String str) {
        this.roleArn = str;
    }

    public void setSNSTopicArn(String str) {
        this.sNSTopicArn = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSNSTopicArn() != null) {
            sb.append("SNSTopicArn: " + getSNSTopicArn() + ",");
        }
        if (getRoleArn() != null) {
            sb.append("RoleArn: " + getRoleArn());
        }
        sb.append("}");
        return sb.toString();
    }

    public NotificationChannel withRoleArn(String str) {
        this.roleArn = str;
        return this;
    }

    public NotificationChannel withSNSTopicArn(String str) {
        this.sNSTopicArn = str;
        return this;
    }
}
