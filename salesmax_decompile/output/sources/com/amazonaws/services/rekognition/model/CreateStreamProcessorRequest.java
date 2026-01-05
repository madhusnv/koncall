package com.amazonaws.services.rekognition.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class CreateStreamProcessorRequest extends AmazonWebServiceRequest implements Serializable {
    private StreamProcessorDataSharingPreference dataSharingPreference;
    private StreamProcessorInput input;
    private String kmsKeyId;
    private String name;
    private StreamProcessorNotificationChannel notificationChannel;
    private StreamProcessorOutput output;
    private List<RegionOfInterest> regionsOfInterest;
    private String roleArn;
    private StreamProcessorSettings settings;
    private Map<String, String> tags;

    public CreateStreamProcessorRequest addTagsEntry(String str, String str2) {
        if (this.tags == null) {
            this.tags = new HashMap();
        }
        if (!this.tags.containsKey(str)) {
            this.tags.put(str, str2);
            return this;
        }
        throw new IllegalArgumentException("Duplicated keys (" + str.toString() + ") are provided.");
    }

    public CreateStreamProcessorRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CreateStreamProcessorRequest)) {
            return false;
        }
        CreateStreamProcessorRequest createStreamProcessorRequest = (CreateStreamProcessorRequest) obj;
        if ((createStreamProcessorRequest.getInput() == null) ^ (getInput() == null)) {
            return false;
        }
        if (createStreamProcessorRequest.getInput() != null && !createStreamProcessorRequest.getInput().equals(getInput())) {
            return false;
        }
        if ((createStreamProcessorRequest.getOutput() == null) ^ (getOutput() == null)) {
            return false;
        }
        if (createStreamProcessorRequest.getOutput() != null && !createStreamProcessorRequest.getOutput().equals(getOutput())) {
            return false;
        }
        if ((createStreamProcessorRequest.getName() == null) ^ (getName() == null)) {
            return false;
        }
        if (createStreamProcessorRequest.getName() != null && !createStreamProcessorRequest.getName().equals(getName())) {
            return false;
        }
        if ((createStreamProcessorRequest.getSettings() == null) ^ (getSettings() == null)) {
            return false;
        }
        if (createStreamProcessorRequest.getSettings() != null && !createStreamProcessorRequest.getSettings().equals(getSettings())) {
            return false;
        }
        if ((createStreamProcessorRequest.getRoleArn() == null) ^ (getRoleArn() == null)) {
            return false;
        }
        if (createStreamProcessorRequest.getRoleArn() != null && !createStreamProcessorRequest.getRoleArn().equals(getRoleArn())) {
            return false;
        }
        if ((createStreamProcessorRequest.getTags() == null) ^ (getTags() == null)) {
            return false;
        }
        if (createStreamProcessorRequest.getTags() != null && !createStreamProcessorRequest.getTags().equals(getTags())) {
            return false;
        }
        if ((createStreamProcessorRequest.getNotificationChannel() == null) ^ (getNotificationChannel() == null)) {
            return false;
        }
        if (createStreamProcessorRequest.getNotificationChannel() != null && !createStreamProcessorRequest.getNotificationChannel().equals(getNotificationChannel())) {
            return false;
        }
        if ((createStreamProcessorRequest.getKmsKeyId() == null) ^ (getKmsKeyId() == null)) {
            return false;
        }
        if (createStreamProcessorRequest.getKmsKeyId() != null && !createStreamProcessorRequest.getKmsKeyId().equals(getKmsKeyId())) {
            return false;
        }
        if ((createStreamProcessorRequest.getRegionsOfInterest() == null) ^ (getRegionsOfInterest() == null)) {
            return false;
        }
        if (createStreamProcessorRequest.getRegionsOfInterest() != null && !createStreamProcessorRequest.getRegionsOfInterest().equals(getRegionsOfInterest())) {
            return false;
        }
        if ((createStreamProcessorRequest.getDataSharingPreference() == null) ^ (getDataSharingPreference() == null)) {
            return false;
        }
        return createStreamProcessorRequest.getDataSharingPreference() == null || createStreamProcessorRequest.getDataSharingPreference().equals(getDataSharingPreference());
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

    public Map<String, String> getTags() {
        return this.tags;
    }

    public int hashCode() {
        return (((((((((((((((((((getInput() == null ? 0 : getInput().hashCode()) + 31) * 31) + (getOutput() == null ? 0 : getOutput().hashCode())) * 31) + (getName() == null ? 0 : getName().hashCode())) * 31) + (getSettings() == null ? 0 : getSettings().hashCode())) * 31) + (getRoleArn() == null ? 0 : getRoleArn().hashCode())) * 31) + (getTags() == null ? 0 : getTags().hashCode())) * 31) + (getNotificationChannel() == null ? 0 : getNotificationChannel().hashCode())) * 31) + (getKmsKeyId() == null ? 0 : getKmsKeyId().hashCode())) * 31) + (getRegionsOfInterest() == null ? 0 : getRegionsOfInterest().hashCode())) * 31) + (getDataSharingPreference() != null ? getDataSharingPreference().hashCode() : 0);
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

    public void setTags(Map<String, String> map) {
        this.tags = map;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getInput() != null) {
            sb.append("Input: " + getInput() + ",");
        }
        if (getOutput() != null) {
            sb.append("Output: " + getOutput() + ",");
        }
        if (getName() != null) {
            sb.append("Name: " + getName() + ",");
        }
        if (getSettings() != null) {
            sb.append("Settings: " + getSettings() + ",");
        }
        if (getRoleArn() != null) {
            sb.append("RoleArn: " + getRoleArn() + ",");
        }
        if (getTags() != null) {
            sb.append("Tags: " + getTags() + ",");
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

    public CreateStreamProcessorRequest withDataSharingPreference(StreamProcessorDataSharingPreference streamProcessorDataSharingPreference) {
        this.dataSharingPreference = streamProcessorDataSharingPreference;
        return this;
    }

    public CreateStreamProcessorRequest withInput(StreamProcessorInput streamProcessorInput) {
        this.input = streamProcessorInput;
        return this;
    }

    public CreateStreamProcessorRequest withKmsKeyId(String str) {
        this.kmsKeyId = str;
        return this;
    }

    public CreateStreamProcessorRequest withName(String str) {
        this.name = str;
        return this;
    }

    public CreateStreamProcessorRequest withNotificationChannel(StreamProcessorNotificationChannel streamProcessorNotificationChannel) {
        this.notificationChannel = streamProcessorNotificationChannel;
        return this;
    }

    public CreateStreamProcessorRequest withOutput(StreamProcessorOutput streamProcessorOutput) {
        this.output = streamProcessorOutput;
        return this;
    }

    public CreateStreamProcessorRequest withRegionsOfInterest(RegionOfInterest... regionOfInterestArr) {
        if (getRegionsOfInterest() == null) {
            this.regionsOfInterest = new ArrayList(regionOfInterestArr.length);
        }
        for (RegionOfInterest regionOfInterest : regionOfInterestArr) {
            this.regionsOfInterest.add(regionOfInterest);
        }
        return this;
    }

    public CreateStreamProcessorRequest withRoleArn(String str) {
        this.roleArn = str;
        return this;
    }

    public CreateStreamProcessorRequest withSettings(StreamProcessorSettings streamProcessorSettings) {
        this.settings = streamProcessorSettings;
        return this;
    }

    public CreateStreamProcessorRequest withTags(Map<String, String> map) {
        this.tags = map;
        return this;
    }

    public CreateStreamProcessorRequest withRegionsOfInterest(Collection<RegionOfInterest> collection) {
        setRegionsOfInterest(collection);
        return this;
    }
}
