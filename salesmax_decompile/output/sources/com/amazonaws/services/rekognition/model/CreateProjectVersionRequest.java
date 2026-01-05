package com.amazonaws.services.rekognition.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class CreateProjectVersionRequest extends AmazonWebServiceRequest implements Serializable {
    private String kmsKeyId;
    private OutputConfig outputConfig;
    private String projectArn;
    private Map<String, String> tags;
    private TestingData testingData;
    private TrainingData trainingData;
    private String versionName;

    public CreateProjectVersionRequest addTagsEntry(String str, String str2) {
        if (this.tags == null) {
            this.tags = new HashMap();
        }
        if (!this.tags.containsKey(str)) {
            this.tags.put(str, str2);
            return this;
        }
        throw new IllegalArgumentException("Duplicated keys (" + str.toString() + ") are provided.");
    }

    public CreateProjectVersionRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CreateProjectVersionRequest)) {
            return false;
        }
        CreateProjectVersionRequest createProjectVersionRequest = (CreateProjectVersionRequest) obj;
        if ((createProjectVersionRequest.getProjectArn() == null) ^ (getProjectArn() == null)) {
            return false;
        }
        if (createProjectVersionRequest.getProjectArn() != null && !createProjectVersionRequest.getProjectArn().equals(getProjectArn())) {
            return false;
        }
        if ((createProjectVersionRequest.getVersionName() == null) ^ (getVersionName() == null)) {
            return false;
        }
        if (createProjectVersionRequest.getVersionName() != null && !createProjectVersionRequest.getVersionName().equals(getVersionName())) {
            return false;
        }
        if ((createProjectVersionRequest.getOutputConfig() == null) ^ (getOutputConfig() == null)) {
            return false;
        }
        if (createProjectVersionRequest.getOutputConfig() != null && !createProjectVersionRequest.getOutputConfig().equals(getOutputConfig())) {
            return false;
        }
        if ((createProjectVersionRequest.getTrainingData() == null) ^ (getTrainingData() == null)) {
            return false;
        }
        if (createProjectVersionRequest.getTrainingData() != null && !createProjectVersionRequest.getTrainingData().equals(getTrainingData())) {
            return false;
        }
        if ((createProjectVersionRequest.getTestingData() == null) ^ (getTestingData() == null)) {
            return false;
        }
        if (createProjectVersionRequest.getTestingData() != null && !createProjectVersionRequest.getTestingData().equals(getTestingData())) {
            return false;
        }
        if ((createProjectVersionRequest.getTags() == null) ^ (getTags() == null)) {
            return false;
        }
        if (createProjectVersionRequest.getTags() != null && !createProjectVersionRequest.getTags().equals(getTags())) {
            return false;
        }
        if ((createProjectVersionRequest.getKmsKeyId() == null) ^ (getKmsKeyId() == null)) {
            return false;
        }
        return createProjectVersionRequest.getKmsKeyId() == null || createProjectVersionRequest.getKmsKeyId().equals(getKmsKeyId());
    }

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    public OutputConfig getOutputConfig() {
        return this.outputConfig;
    }

    public String getProjectArn() {
        return this.projectArn;
    }

    public Map<String, String> getTags() {
        return this.tags;
    }

    public TestingData getTestingData() {
        return this.testingData;
    }

    public TrainingData getTrainingData() {
        return this.trainingData;
    }

    public String getVersionName() {
        return this.versionName;
    }

    public int hashCode() {
        return (((((((((((((getProjectArn() == null ? 0 : getProjectArn().hashCode()) + 31) * 31) + (getVersionName() == null ? 0 : getVersionName().hashCode())) * 31) + (getOutputConfig() == null ? 0 : getOutputConfig().hashCode())) * 31) + (getTrainingData() == null ? 0 : getTrainingData().hashCode())) * 31) + (getTestingData() == null ? 0 : getTestingData().hashCode())) * 31) + (getTags() == null ? 0 : getTags().hashCode())) * 31) + (getKmsKeyId() != null ? getKmsKeyId().hashCode() : 0);
    }

    public void setKmsKeyId(String str) {
        this.kmsKeyId = str;
    }

    public void setOutputConfig(OutputConfig outputConfig) {
        this.outputConfig = outputConfig;
    }

    public void setProjectArn(String str) {
        this.projectArn = str;
    }

    public void setTags(Map<String, String> map) {
        this.tags = map;
    }

    public void setTestingData(TestingData testingData) {
        this.testingData = testingData;
    }

    public void setTrainingData(TrainingData trainingData) {
        this.trainingData = trainingData;
    }

    public void setVersionName(String str) {
        this.versionName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getProjectArn() != null) {
            sb.append("ProjectArn: " + getProjectArn() + ",");
        }
        if (getVersionName() != null) {
            sb.append("VersionName: " + getVersionName() + ",");
        }
        if (getOutputConfig() != null) {
            sb.append("OutputConfig: " + getOutputConfig() + ",");
        }
        if (getTrainingData() != null) {
            sb.append("TrainingData: " + getTrainingData() + ",");
        }
        if (getTestingData() != null) {
            sb.append("TestingData: " + getTestingData() + ",");
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

    public CreateProjectVersionRequest withKmsKeyId(String str) {
        this.kmsKeyId = str;
        return this;
    }

    public CreateProjectVersionRequest withOutputConfig(OutputConfig outputConfig) {
        this.outputConfig = outputConfig;
        return this;
    }

    public CreateProjectVersionRequest withProjectArn(String str) {
        this.projectArn = str;
        return this;
    }

    public CreateProjectVersionRequest withTags(Map<String, String> map) {
        this.tags = map;
        return this;
    }

    public CreateProjectVersionRequest withTestingData(TestingData testingData) {
        this.testingData = testingData;
        return this;
    }

    public CreateProjectVersionRequest withTrainingData(TrainingData trainingData) {
        this.trainingData = trainingData;
        return this;
    }

    public CreateProjectVersionRequest withVersionName(String str) {
        this.versionName = str;
        return this;
    }
}
