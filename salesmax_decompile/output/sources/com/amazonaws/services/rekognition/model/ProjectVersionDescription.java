package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import java.util.Date;

/* loaded from: classes5.dex */
public class ProjectVersionDescription implements Serializable {
    private Long billableTrainingTimeInSeconds;
    private Date creationTimestamp;
    private EvaluationResult evaluationResult;
    private String kmsKeyId;
    private GroundTruthManifest manifestSummary;
    private Integer maxInferenceUnits;
    private Integer minInferenceUnits;
    private OutputConfig outputConfig;
    private String projectVersionArn;
    private String sourceProjectVersionArn;
    private String status;
    private String statusMessage;
    private TestingDataResult testingDataResult;
    private TrainingDataResult trainingDataResult;
    private Date trainingEndTimestamp;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ProjectVersionDescription)) {
            return false;
        }
        ProjectVersionDescription projectVersionDescription = (ProjectVersionDescription) obj;
        if ((projectVersionDescription.getProjectVersionArn() == null) ^ (getProjectVersionArn() == null)) {
            return false;
        }
        if (projectVersionDescription.getProjectVersionArn() != null && !projectVersionDescription.getProjectVersionArn().equals(getProjectVersionArn())) {
            return false;
        }
        if ((projectVersionDescription.getCreationTimestamp() == null) ^ (getCreationTimestamp() == null)) {
            return false;
        }
        if (projectVersionDescription.getCreationTimestamp() != null && !projectVersionDescription.getCreationTimestamp().equals(getCreationTimestamp())) {
            return false;
        }
        if ((projectVersionDescription.getMinInferenceUnits() == null) ^ (getMinInferenceUnits() == null)) {
            return false;
        }
        if (projectVersionDescription.getMinInferenceUnits() != null && !projectVersionDescription.getMinInferenceUnits().equals(getMinInferenceUnits())) {
            return false;
        }
        if ((projectVersionDescription.getStatus() == null) ^ (getStatus() == null)) {
            return false;
        }
        if (projectVersionDescription.getStatus() != null && !projectVersionDescription.getStatus().equals(getStatus())) {
            return false;
        }
        if ((projectVersionDescription.getStatusMessage() == null) ^ (getStatusMessage() == null)) {
            return false;
        }
        if (projectVersionDescription.getStatusMessage() != null && !projectVersionDescription.getStatusMessage().equals(getStatusMessage())) {
            return false;
        }
        if ((projectVersionDescription.getBillableTrainingTimeInSeconds() == null) ^ (getBillableTrainingTimeInSeconds() == null)) {
            return false;
        }
        if (projectVersionDescription.getBillableTrainingTimeInSeconds() != null && !projectVersionDescription.getBillableTrainingTimeInSeconds().equals(getBillableTrainingTimeInSeconds())) {
            return false;
        }
        if ((projectVersionDescription.getTrainingEndTimestamp() == null) ^ (getTrainingEndTimestamp() == null)) {
            return false;
        }
        if (projectVersionDescription.getTrainingEndTimestamp() != null && !projectVersionDescription.getTrainingEndTimestamp().equals(getTrainingEndTimestamp())) {
            return false;
        }
        if ((projectVersionDescription.getOutputConfig() == null) ^ (getOutputConfig() == null)) {
            return false;
        }
        if (projectVersionDescription.getOutputConfig() != null && !projectVersionDescription.getOutputConfig().equals(getOutputConfig())) {
            return false;
        }
        if ((projectVersionDescription.getTrainingDataResult() == null) ^ (getTrainingDataResult() == null)) {
            return false;
        }
        if (projectVersionDescription.getTrainingDataResult() != null && !projectVersionDescription.getTrainingDataResult().equals(getTrainingDataResult())) {
            return false;
        }
        if ((projectVersionDescription.getTestingDataResult() == null) ^ (getTestingDataResult() == null)) {
            return false;
        }
        if (projectVersionDescription.getTestingDataResult() != null && !projectVersionDescription.getTestingDataResult().equals(getTestingDataResult())) {
            return false;
        }
        if ((projectVersionDescription.getEvaluationResult() == null) ^ (getEvaluationResult() == null)) {
            return false;
        }
        if (projectVersionDescription.getEvaluationResult() != null && !projectVersionDescription.getEvaluationResult().equals(getEvaluationResult())) {
            return false;
        }
        if ((projectVersionDescription.getManifestSummary() == null) ^ (getManifestSummary() == null)) {
            return false;
        }
        if (projectVersionDescription.getManifestSummary() != null && !projectVersionDescription.getManifestSummary().equals(getManifestSummary())) {
            return false;
        }
        if ((projectVersionDescription.getKmsKeyId() == null) ^ (getKmsKeyId() == null)) {
            return false;
        }
        if (projectVersionDescription.getKmsKeyId() != null && !projectVersionDescription.getKmsKeyId().equals(getKmsKeyId())) {
            return false;
        }
        if ((projectVersionDescription.getMaxInferenceUnits() == null) ^ (getMaxInferenceUnits() == null)) {
            return false;
        }
        if (projectVersionDescription.getMaxInferenceUnits() != null && !projectVersionDescription.getMaxInferenceUnits().equals(getMaxInferenceUnits())) {
            return false;
        }
        if ((projectVersionDescription.getSourceProjectVersionArn() == null) ^ (getSourceProjectVersionArn() == null)) {
            return false;
        }
        return projectVersionDescription.getSourceProjectVersionArn() == null || projectVersionDescription.getSourceProjectVersionArn().equals(getSourceProjectVersionArn());
    }

    public Long getBillableTrainingTimeInSeconds() {
        return this.billableTrainingTimeInSeconds;
    }

    public Date getCreationTimestamp() {
        return this.creationTimestamp;
    }

    public EvaluationResult getEvaluationResult() {
        return this.evaluationResult;
    }

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    public GroundTruthManifest getManifestSummary() {
        return this.manifestSummary;
    }

    public Integer getMaxInferenceUnits() {
        return this.maxInferenceUnits;
    }

    public Integer getMinInferenceUnits() {
        return this.minInferenceUnits;
    }

    public OutputConfig getOutputConfig() {
        return this.outputConfig;
    }

    public String getProjectVersionArn() {
        return this.projectVersionArn;
    }

    public String getSourceProjectVersionArn() {
        return this.sourceProjectVersionArn;
    }

    public String getStatus() {
        return this.status;
    }

    public String getStatusMessage() {
        return this.statusMessage;
    }

    public TestingDataResult getTestingDataResult() {
        return this.testingDataResult;
    }

    public TrainingDataResult getTrainingDataResult() {
        return this.trainingDataResult;
    }

    public Date getTrainingEndTimestamp() {
        return this.trainingEndTimestamp;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((getProjectVersionArn() == null ? 0 : getProjectVersionArn().hashCode()) + 31) * 31) + (getCreationTimestamp() == null ? 0 : getCreationTimestamp().hashCode())) * 31) + (getMinInferenceUnits() == null ? 0 : getMinInferenceUnits().hashCode())) * 31) + (getStatus() == null ? 0 : getStatus().hashCode())) * 31) + (getStatusMessage() == null ? 0 : getStatusMessage().hashCode())) * 31) + (getBillableTrainingTimeInSeconds() == null ? 0 : getBillableTrainingTimeInSeconds().hashCode())) * 31) + (getTrainingEndTimestamp() == null ? 0 : getTrainingEndTimestamp().hashCode())) * 31) + (getOutputConfig() == null ? 0 : getOutputConfig().hashCode())) * 31) + (getTrainingDataResult() == null ? 0 : getTrainingDataResult().hashCode())) * 31) + (getTestingDataResult() == null ? 0 : getTestingDataResult().hashCode())) * 31) + (getEvaluationResult() == null ? 0 : getEvaluationResult().hashCode())) * 31) + (getManifestSummary() == null ? 0 : getManifestSummary().hashCode())) * 31) + (getKmsKeyId() == null ? 0 : getKmsKeyId().hashCode())) * 31) + (getMaxInferenceUnits() == null ? 0 : getMaxInferenceUnits().hashCode())) * 31) + (getSourceProjectVersionArn() != null ? getSourceProjectVersionArn().hashCode() : 0);
    }

    public void setBillableTrainingTimeInSeconds(Long l) {
        this.billableTrainingTimeInSeconds = l;
    }

    public void setCreationTimestamp(Date date) {
        this.creationTimestamp = date;
    }

    public void setEvaluationResult(EvaluationResult evaluationResult) {
        this.evaluationResult = evaluationResult;
    }

    public void setKmsKeyId(String str) {
        this.kmsKeyId = str;
    }

    public void setManifestSummary(GroundTruthManifest groundTruthManifest) {
        this.manifestSummary = groundTruthManifest;
    }

    public void setMaxInferenceUnits(Integer num) {
        this.maxInferenceUnits = num;
    }

    public void setMinInferenceUnits(Integer num) {
        this.minInferenceUnits = num;
    }

    public void setOutputConfig(OutputConfig outputConfig) {
        this.outputConfig = outputConfig;
    }

    public void setProjectVersionArn(String str) {
        this.projectVersionArn = str;
    }

    public void setSourceProjectVersionArn(String str) {
        this.sourceProjectVersionArn = str;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public void setStatusMessage(String str) {
        this.statusMessage = str;
    }

    public void setTestingDataResult(TestingDataResult testingDataResult) {
        this.testingDataResult = testingDataResult;
    }

    public void setTrainingDataResult(TrainingDataResult trainingDataResult) {
        this.trainingDataResult = trainingDataResult;
    }

    public void setTrainingEndTimestamp(Date date) {
        this.trainingEndTimestamp = date;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getProjectVersionArn() != null) {
            sb.append("ProjectVersionArn: " + getProjectVersionArn() + ",");
        }
        if (getCreationTimestamp() != null) {
            sb.append("CreationTimestamp: " + getCreationTimestamp() + ",");
        }
        if (getMinInferenceUnits() != null) {
            sb.append("MinInferenceUnits: " + getMinInferenceUnits() + ",");
        }
        if (getStatus() != null) {
            sb.append("Status: " + getStatus() + ",");
        }
        if (getStatusMessage() != null) {
            sb.append("StatusMessage: " + getStatusMessage() + ",");
        }
        if (getBillableTrainingTimeInSeconds() != null) {
            sb.append("BillableTrainingTimeInSeconds: " + getBillableTrainingTimeInSeconds() + ",");
        }
        if (getTrainingEndTimestamp() != null) {
            sb.append("TrainingEndTimestamp: " + getTrainingEndTimestamp() + ",");
        }
        if (getOutputConfig() != null) {
            sb.append("OutputConfig: " + getOutputConfig() + ",");
        }
        if (getTrainingDataResult() != null) {
            sb.append("TrainingDataResult: " + getTrainingDataResult() + ",");
        }
        if (getTestingDataResult() != null) {
            sb.append("TestingDataResult: " + getTestingDataResult() + ",");
        }
        if (getEvaluationResult() != null) {
            sb.append("EvaluationResult: " + getEvaluationResult() + ",");
        }
        if (getManifestSummary() != null) {
            sb.append("ManifestSummary: " + getManifestSummary() + ",");
        }
        if (getKmsKeyId() != null) {
            sb.append("KmsKeyId: " + getKmsKeyId() + ",");
        }
        if (getMaxInferenceUnits() != null) {
            sb.append("MaxInferenceUnits: " + getMaxInferenceUnits() + ",");
        }
        if (getSourceProjectVersionArn() != null) {
            sb.append("SourceProjectVersionArn: " + getSourceProjectVersionArn());
        }
        sb.append("}");
        return sb.toString();
    }

    public ProjectVersionDescription withBillableTrainingTimeInSeconds(Long l) {
        this.billableTrainingTimeInSeconds = l;
        return this;
    }

    public ProjectVersionDescription withCreationTimestamp(Date date) {
        this.creationTimestamp = date;
        return this;
    }

    public ProjectVersionDescription withEvaluationResult(EvaluationResult evaluationResult) {
        this.evaluationResult = evaluationResult;
        return this;
    }

    public ProjectVersionDescription withKmsKeyId(String str) {
        this.kmsKeyId = str;
        return this;
    }

    public ProjectVersionDescription withManifestSummary(GroundTruthManifest groundTruthManifest) {
        this.manifestSummary = groundTruthManifest;
        return this;
    }

    public ProjectVersionDescription withMaxInferenceUnits(Integer num) {
        this.maxInferenceUnits = num;
        return this;
    }

    public ProjectVersionDescription withMinInferenceUnits(Integer num) {
        this.minInferenceUnits = num;
        return this;
    }

    public ProjectVersionDescription withOutputConfig(OutputConfig outputConfig) {
        this.outputConfig = outputConfig;
        return this;
    }

    public ProjectVersionDescription withProjectVersionArn(String str) {
        this.projectVersionArn = str;
        return this;
    }

    public ProjectVersionDescription withSourceProjectVersionArn(String str) {
        this.sourceProjectVersionArn = str;
        return this;
    }

    public ProjectVersionDescription withStatus(String str) {
        this.status = str;
        return this;
    }

    public ProjectVersionDescription withStatusMessage(String str) {
        this.statusMessage = str;
        return this;
    }

    public ProjectVersionDescription withTestingDataResult(TestingDataResult testingDataResult) {
        this.testingDataResult = testingDataResult;
        return this;
    }

    public ProjectVersionDescription withTrainingDataResult(TrainingDataResult trainingDataResult) {
        this.trainingDataResult = trainingDataResult;
        return this;
    }

    public ProjectVersionDescription withTrainingEndTimestamp(Date date) {
        this.trainingEndTimestamp = date;
        return this;
    }

    public void setStatus(ProjectVersionStatus projectVersionStatus) {
        this.status = projectVersionStatus.toString();
    }

    public ProjectVersionDescription withStatus(ProjectVersionStatus projectVersionStatus) {
        this.status = projectVersionStatus.toString();
        return this;
    }
}
