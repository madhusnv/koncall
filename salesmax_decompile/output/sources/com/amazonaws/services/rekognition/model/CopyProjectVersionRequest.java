package com.amazonaws.services.rekognition.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class CopyProjectVersionRequest extends AmazonWebServiceRequest implements Serializable {
    private String destinationProjectArn;
    private String kmsKeyId;
    private OutputConfig outputConfig;
    private String sourceProjectArn;
    private String sourceProjectVersionArn;
    private Map<String, String> tags;
    private String versionName;

    public CopyProjectVersionRequest addTagsEntry(String str, String str2) {
        if (this.tags == null) {
            this.tags = new HashMap();
        }
        if (!this.tags.containsKey(str)) {
            this.tags.put(str, str2);
            return this;
        }
        throw new IllegalArgumentException("Duplicated keys (" + str.toString() + ") are provided.");
    }

    public CopyProjectVersionRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CopyProjectVersionRequest)) {
            return false;
        }
        CopyProjectVersionRequest copyProjectVersionRequest = (CopyProjectVersionRequest) obj;
        if ((copyProjectVersionRequest.getSourceProjectArn() == null) ^ (getSourceProjectArn() == null)) {
            return false;
        }
        if (copyProjectVersionRequest.getSourceProjectArn() != null && !copyProjectVersionRequest.getSourceProjectArn().equals(getSourceProjectArn())) {
            return false;
        }
        if ((copyProjectVersionRequest.getSourceProjectVersionArn() == null) ^ (getSourceProjectVersionArn() == null)) {
            return false;
        }
        if (copyProjectVersionRequest.getSourceProjectVersionArn() != null && !copyProjectVersionRequest.getSourceProjectVersionArn().equals(getSourceProjectVersionArn())) {
            return false;
        }
        if ((copyProjectVersionRequest.getDestinationProjectArn() == null) ^ (getDestinationProjectArn() == null)) {
            return false;
        }
        if (copyProjectVersionRequest.getDestinationProjectArn() != null && !copyProjectVersionRequest.getDestinationProjectArn().equals(getDestinationProjectArn())) {
            return false;
        }
        if ((copyProjectVersionRequest.getVersionName() == null) ^ (getVersionName() == null)) {
            return false;
        }
        if (copyProjectVersionRequest.getVersionName() != null && !copyProjectVersionRequest.getVersionName().equals(getVersionName())) {
            return false;
        }
        if ((copyProjectVersionRequest.getOutputConfig() == null) ^ (getOutputConfig() == null)) {
            return false;
        }
        if (copyProjectVersionRequest.getOutputConfig() != null && !copyProjectVersionRequest.getOutputConfig().equals(getOutputConfig())) {
            return false;
        }
        if ((copyProjectVersionRequest.getTags() == null) ^ (getTags() == null)) {
            return false;
        }
        if (copyProjectVersionRequest.getTags() != null && !copyProjectVersionRequest.getTags().equals(getTags())) {
            return false;
        }
        if ((copyProjectVersionRequest.getKmsKeyId() == null) ^ (getKmsKeyId() == null)) {
            return false;
        }
        return copyProjectVersionRequest.getKmsKeyId() == null || copyProjectVersionRequest.getKmsKeyId().equals(getKmsKeyId());
    }

    public String getDestinationProjectArn() {
        return this.destinationProjectArn;
    }

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    public OutputConfig getOutputConfig() {
        return this.outputConfig;
    }

    public String getSourceProjectArn() {
        return this.sourceProjectArn;
    }

    public String getSourceProjectVersionArn() {
        return this.sourceProjectVersionArn;
    }

    public Map<String, String> getTags() {
        return this.tags;
    }

    public String getVersionName() {
        return this.versionName;
    }

    public int hashCode() {
        return (((((((((((((getSourceProjectArn() == null ? 0 : getSourceProjectArn().hashCode()) + 31) * 31) + (getSourceProjectVersionArn() == null ? 0 : getSourceProjectVersionArn().hashCode())) * 31) + (getDestinationProjectArn() == null ? 0 : getDestinationProjectArn().hashCode())) * 31) + (getVersionName() == null ? 0 : getVersionName().hashCode())) * 31) + (getOutputConfig() == null ? 0 : getOutputConfig().hashCode())) * 31) + (getTags() == null ? 0 : getTags().hashCode())) * 31) + (getKmsKeyId() != null ? getKmsKeyId().hashCode() : 0);
    }

    public void setDestinationProjectArn(String str) {
        this.destinationProjectArn = str;
    }

    public void setKmsKeyId(String str) {
        this.kmsKeyId = str;
    }

    public void setOutputConfig(OutputConfig outputConfig) {
        this.outputConfig = outputConfig;
    }

    public void setSourceProjectArn(String str) {
        this.sourceProjectArn = str;
    }

    public void setSourceProjectVersionArn(String str) {
        this.sourceProjectVersionArn = str;
    }

    public void setTags(Map<String, String> map) {
        this.tags = map;
    }

    public void setVersionName(String str) {
        this.versionName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSourceProjectArn() != null) {
            sb.append("SourceProjectArn: " + getSourceProjectArn() + ",");
        }
        if (getSourceProjectVersionArn() != null) {
            sb.append("SourceProjectVersionArn: " + getSourceProjectVersionArn() + ",");
        }
        if (getDestinationProjectArn() != null) {
            sb.append("DestinationProjectArn: " + getDestinationProjectArn() + ",");
        }
        if (getVersionName() != null) {
            sb.append("VersionName: " + getVersionName() + ",");
        }
        if (getOutputConfig() != null) {
            sb.append("OutputConfig: " + getOutputConfig() + ",");
        }
        if (getTags() != null) {
            sb.append("Tags: " + getTags() + ",");
        }
        if (getKmsKeyId() != null) {
            sb.append("KmsKeyId: " + getKmsKeyId());
        }
        sb.append("}");
        return sb.toString();
    }

    public CopyProjectVersionRequest withDestinationProjectArn(String str) {
        this.destinationProjectArn = str;
        return this;
    }

    public CopyProjectVersionRequest withKmsKeyId(String str) {
        this.kmsKeyId = str;
        return this;
    }

    public CopyProjectVersionRequest withOutputConfig(OutputConfig outputConfig) {
        this.outputConfig = outputConfig;
        return this;
    }

    public CopyProjectVersionRequest withSourceProjectArn(String str) {
        this.sourceProjectArn = str;
        return this;
    }

    public CopyProjectVersionRequest withSourceProjectVersionArn(String str) {
        this.sourceProjectVersionArn = str;
        return this;
    }

    public CopyProjectVersionRequest withTags(Map<String, String> map) {
        this.tags = map;
        return this;
    }

    public CopyProjectVersionRequest withVersionName(String str) {
        this.versionName = str;
        return this;
    }
}
