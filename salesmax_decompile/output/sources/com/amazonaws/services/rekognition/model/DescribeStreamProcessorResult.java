package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/* loaded from: classes5.dex */
public class DescribeStreamProcessorResult implements Serializable {
    private Date creationTimestamp;
    private StreamProcessorDataSharingPreference dataSharingPreference;
    private StreamProcessorInput input;
    private String kmsKeyId;
    private Date lastUpdateTimestamp;
    private String name;
    private StreamProcessorNotificationChannel notificationChannel;
    private StreamProcessorOutput output;
    private List<RegionOfInterest> regionsOfInterest;
    private String roleArn;
    private StreamProcessorSettings settings;
    private String status;
    private String statusMessage;
    private String streamProcessorArn;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeStreamProcessorResult)) {
            return false;
        }
        DescribeStreamProcessorResult describeStreamProcessorResult = (DescribeStreamProcessorResult) obj;
        if ((describeStreamProcessorResult.getName() == null) ^ (getName() == null)) {
            return false;
        }
        if (describeStreamProcessorResult.getName() != null && !describeStreamProcessorResult.getName().equals(getName())) {
            return false;
        }
        if ((describeStreamProcessorResult.getStreamProcessorArn() == null) ^ (getStreamProcessorArn() == null)) {
            return false;
        }
        if (describeStreamProcessorResult.getStreamProcessorArn() != null && !describeStreamProcessorResult.getStreamProcessorArn().equals(getStreamProcessorArn())) {
            return false;
        }
        if ((describeStreamProcessorResult.getStatus() == null) ^ (getStatus() == null)) {
            return false;
        }
        if (describeStreamProcessorResult.getStatus() != null && !describeStreamProcessorResult.getStatus().equals(getStatus())) {
            return false;
        }
        if ((describeStreamProcessorResult.getStatusMessage() == null) ^ (getStatusMessage() == null)) {
            return false;
        }
        if (describeStreamProcessorResult.getStatusMessage() != null && !describeStreamProcessorResult.getStatusMessage().equals(getStatusMessage())) {
            return false;
        }
        if ((describeStreamProcessorResult.getCreationTimestamp() == null) ^ (getCreationTimestamp() == null)) {
            return false;
        }
        if (describeStreamProcessorResult.getCreationTimestamp() != null && !describeStreamProcessorResult.getCreationTimestamp().equals(getCreationTimestamp())) {
            return false;
        }
        if ((describeStreamProcessorResult.getLastUpdateTimestamp() == null) ^ (getLastUpdateTimestamp() == null)) {
            return false;
        }
        if (describeStreamProcessorResult.getLastUpdateTimestamp() != null && !describeStreamProcessorResult.getLastUpdateTimestamp().equals(getLastUpdateTimestamp())) {
            return false;
        }
        if ((describeStreamProcessorResult.getInput() == null) ^ (getInput() == null)) {
            return false;
        }
        if (describeStreamProcessorResult.getInput() != null && !describeStreamProcessorResult.getInput().equals(getInput())) {
            return false;
        }
        if ((describeStreamProcessorResult.getOutput() == null) ^ (getOutput() == null)) {
            return false;
        }
        if (describeStreamProcessorResult.getOutput() != null && !describeStreamProcessorResult.getOutput().equals(getOutput())) {
            return false;
        }
        if ((describeStreamProcessorResult.getRoleArn() == null) ^ (getRoleArn() == null)) {
            return false;
        }
        if (describeStreamProcessorResult.getRoleArn() != null && !describeStreamProcessorResult.getRoleArn().equals(getRoleArn())) {
            return false;
        }
        if ((describeStreamProcessorResult.getSettings() == null) ^ (getSettings() == null)) {
            return false;
        }
        if (describeStreamProcessorResult.getSettings() != null && !describeStreamProcessorResult.getSettings().equals(getSettings())) {
            return false;
        }
        if ((describeStreamProcessorResult.getNotificationChannel() == null) ^ (getNotificationChannel() == null)) {
            return false;
        }
        if (describeStreamProcessorResult.getNotificationChannel() != null && !describeStreamProcessorResult.getNotificationChannel().equals(getNotificationChannel())) {
            return false;
        }
        if ((describeStreamProcessorResult.getKmsKeyId() == null) ^ (getKmsKeyId() == null)) {
            return false;
        }
        if (describeStreamProcessorResult.getKmsKeyId() != null && !describeStreamProcessorResult.getKmsKeyId().equals(getKmsKeyId())) {
            return false;
        }
        if ((describeStreamProcessorResult.getRegionsOfInterest() == null) ^ (getRegionsOfInterest() == null)) {
            return false;
        }
        if (describeStreamProcessorResult.getRegionsOfInterest() != null && !describeStreamProcessorResult.getRegionsOfInterest().equals(getRegionsOfInterest())) {
            return false;
        }
        if ((describeStreamProcessorResult.getDataSharingPreference() == null) ^ (getDataSharingPreference() == null)) {
            return false;
        }
        return describeStreamProcessorResult.getDataSharingPreference() == null || describeStreamProcessorResult.getDataSharingPreference().equals(getDataSharingPreference());
    }

    public Date getCreationTimestamp() {
        return this.creationTimestamp;
    }

    public StreamProcessorDataSharingPreference getDataSharingPreference() {
        return this.dataSharingPreference;
    }

    public StreamProcessorInput getInput() {
        return this.input;
    }

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    public Date getLastUpdateTimestamp() {
        return this.lastUpdateTimestamp;
    }

    public String getName() {
        return this.name;
    }

    public StreamProcessorNotificationChannel getNotificationChannel() {
        return this.notificationChannel;
    }

    public StreamProcessorOutput getOutput() {
        return this.output;
    }

    public List<RegionOfInterest> getRegionsOfInterest() {
        return this.regionsOfInterest;
    }

    public String getRoleArn() {
        return this.roleArn;
    }

    public StreamProcessorSettings getSettings() {
        return this.settings;
    }

    public String getStatus() {
        return this.status;
    }

    public String getStatusMessage() {
        return this.statusMessage;
    }

    public String getStreamProcessorArn() {
        return this.streamProcessorArn;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((getName() == null ? 0 : getName().hashCode()) + 31) * 31) + (getStreamProcessorArn() == null ? 0 : getStreamProcessorArn().hashCode())) * 31) + (getStatus() == null ? 0 : getStatus().hashCode())) * 31) + (getStatusMessage() == null ? 0 : getStatusMessage().hashCode())) * 31) + (getCreationTimestamp() == null ? 0 : getCreationTimestamp().hashCode())) * 31) + (getLastUpdateTimestamp() == null ? 0 : getLastUpdateTimestamp().hashCode())) * 31) + (getInput() == null ? 0 : getInput().hashCode())) * 31) + (getOutput() == null ? 0 : getOutput().hashCode())) * 31) + (getRoleArn() == null ? 0 : getRoleArn().hashCode())) * 31) + (getSettings() == null ? 0 : getSettings().hashCode())) * 31) + (getNotificationChannel() == null ? 0 : getNotificationChannel().hashCode())) * 31) + (getKmsKeyId() == null ? 0 : getKmsKeyId().hashCode())) * 31) + (getRegionsOfInterest() == null ? 0 : getRegionsOfInterest().hashCode())) * 31) + (getDataSharingPreference() != null ? getDataSharingPreference().hashCode() : 0);
    }

    public void setCreationTimestamp(Date date) {
        this.creationTimestamp = date;
    }

    public void setDataSharingPreference(StreamProcessorDataSharingPreference streamProcessorDataSharingPreference) {
        this.dataSharingPreference = streamProcessorDataSharingPreference;
    }

    public void setInput(StreamProcessorInput streamProcessorInput) {
        this.input = streamProcessorInput;
    }

    public void setKmsKeyId(String str) {
        this.kmsKeyId = str;
    }

    public void setLastUpdateTimestamp(Date date) {
        this.lastUpdateTimestamp = date;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNotificationChannel(StreamProcessorNotificationChannel streamProcessorNotificationChannel) {
        this.notificationChannel = streamProcessorNotificationChannel;
    }

    public void setOutput(StreamProcessorOutput streamProcessorOutput) {
        this.output = streamProcessorOutput;
    }

    public void setRegionsOfInterest(Collection<RegionOfInterest> collection) {
        if (collection == null) {
            this.regionsOfInterest = null;
        } else {
            this.regionsOfInterest = new ArrayList(collection);
        }
    }

    public void setRoleArn(String str) {
        this.roleArn = str;
    }

    public void setSettings(StreamProcessorSettings streamProcessorSettings) {
        this.settings = streamProcessorSettings;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public void setStatusMessage(String str) {
        this.statusMessage = str;
    }

    public void setStreamProcessorArn(String str) {
        this.streamProcessorArn = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getName() != null) {
            sb.append("Name: " + getName() + ",");
        }
        if (getStreamProcessorArn() != null) {
            sb.append("StreamProcessorArn: " + getStreamProcessorArn() + ",");
        }
        if (getStatus() != null) {
            sb.append("Status: " + getStatus() + ",");
        }
        if (getStatusMessage() != null) {
            sb.append("StatusMessage: " + getStatusMessage() + ",");
        }
        if (getCreationTimestamp() != null) {
            sb.append("CreationTimestamp: " + getCreationTimestamp() + ",");
        }
        if (getLastUpdateTimestamp() != null) {
            sb.append("LastUpdateTimestamp: " + getLastUpdateTimestamp() + ",");
        }
        if (getInput() != null) {
            sb.append("Input: " + getInput() + ",");
        }
        if (getOutput() != null) {
            sb.append("Output: " + getOutput() + ",");
        }
        if (getRoleArn() != null) {
            sb.append("RoleArn: " + getRoleArn() + ",");
        }
        if (getSettings() != null) {
            sb.append("Settings: " + getSettings() + ",");
        }
        if (getNotificationChannel() != null) {
            sb.append("NotificationChannel: " + getNotificationChannel() + ",");
        }
        if (getKmsKeyId() != null) {
            sb.append("KmsKeyId: " + getKmsKeyId() + ",");
        }
        if (getRegionsOfInterest() != null) {
            sb.append("RegionsOfInterest: " + getRegionsOfInterest() + ",");
        }
        if (getDataSharingPreference() != null) {
            sb.append("DataSharingPreference: " + getDataSharingPreference());
        }
        sb.append("}");
        return sb.toString();
    }

    public DescribeStreamProcessorResult withCreationTimestamp(Date date) {
        this.creationTimestamp = date;
        return this;
    }

    public DescribeStreamProcessorResult withDataSharingPreference(StreamProcessorDataSharingPreference streamProcessorDataSharingPreference) {
        this.dataSharingPreference = streamProcessorDataSharingPreference;
        return this;
    }

    public DescribeStreamProcessorResult withInput(StreamProcessorInput streamProcessorInput) {
        this.input = streamProcessorInput;
        return this;
    }

    public DescribeStreamProcessorResult withKmsKeyId(String str) {
        this.kmsKeyId = str;
        return this;
    }

    public DescribeStreamProcessorResult withLastUpdateTimestamp(Date date) {
        this.lastUpdateTimestamp = date;
        return this;
    }

    public DescribeStreamProcessorResult withName(String str) {
        this.name = str;
        return this;
    }

    public DescribeStreamProcessorResult withNotificationChannel(StreamProcessorNotificationChannel streamProcessorNotificationChannel) {
        this.notificationChannel = streamProcessorNotificationChannel;
        return this;
    }

    public DescribeStreamProcessorResult withOutput(StreamProcessorOutput streamProcessorOutput) {
        this.output = streamProcessorOutput;
        return this;
    }

    public DescribeStreamProcessorResult withRegionsOfInterest(RegionOfInterest... regionOfInterestArr) {
        if (getRegionsOfInterest() == null) {
            this.regionsOfInterest = new ArrayList(regionOfInterestArr.length);
        }
        for (RegionOfInterest regionOfInterest : regionOfInterestArr) {
            this.regionsOfInterest.add(regionOfInterest);
        }
        return this;
    }

    public DescribeStreamProcessorResult withRoleArn(String str) {
        this.roleArn = str;
        return this;
    }

    public DescribeStreamProcessorResult withSettings(StreamProcessorSettings streamProcessorSettings) {
        this.settings = streamProcessorSettings;
        return this;
    }

    public DescribeStreamProcessorResult withStatus(String str) {
        this.status = str;
        return this;
    }

    public DescribeStreamProcessorResult withStatusMessage(String str) {
        this.statusMessage = str;
        return this;
    }

    public DescribeStreamProcessorResult withStreamProcessorArn(String str) {
        this.streamProcessorArn = str;
        return this;
    }

    public void setStatus(StreamProcessorStatus streamProcessorStatus) {
        this.status = streamProcessorStatus.toString();
    }

    public DescribeStreamProcessorResult withStatus(StreamProcessorStatus streamProcessorStatus) {
        this.status = streamProcessorStatus.toString();
        return this;
    }

    public DescribeStreamProcessorResult withRegionsOfInterest(Collection<RegionOfInterest> collection) {
        setRegionsOfInterest(collection);
        return this;
    }
}
