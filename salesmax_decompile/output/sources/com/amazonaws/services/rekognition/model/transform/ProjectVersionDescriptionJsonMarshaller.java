package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.EvaluationResult;
import com.amazonaws.services.rekognition.model.GroundTruthManifest;
import com.amazonaws.services.rekognition.model.OutputConfig;
import com.amazonaws.services.rekognition.model.ProjectVersionDescription;
import com.amazonaws.services.rekognition.model.TestingDataResult;
import com.amazonaws.services.rekognition.model.TrainingDataResult;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.Date;

/* loaded from: classes5.dex */
class ProjectVersionDescriptionJsonMarshaller {
    private static ProjectVersionDescriptionJsonMarshaller instance;

    public static ProjectVersionDescriptionJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new ProjectVersionDescriptionJsonMarshaller();
        }
        return instance;
    }

    public void marshall(ProjectVersionDescription projectVersionDescription, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (projectVersionDescription.getProjectVersionArn() != null) {
            String projectVersionArn = projectVersionDescription.getProjectVersionArn();
            awsJsonWriter.name("ProjectVersionArn");
            awsJsonWriter.value(projectVersionArn);
        }
        if (projectVersionDescription.getCreationTimestamp() != null) {
            Date creationTimestamp = projectVersionDescription.getCreationTimestamp();
            awsJsonWriter.name("CreationTimestamp");
            awsJsonWriter.value(creationTimestamp);
        }
        if (projectVersionDescription.getMinInferenceUnits() != null) {
            Integer minInferenceUnits = projectVersionDescription.getMinInferenceUnits();
            awsJsonWriter.name("MinInferenceUnits");
            awsJsonWriter.value(minInferenceUnits);
        }
        if (projectVersionDescription.getStatus() != null) {
            String status = projectVersionDescription.getStatus();
            awsJsonWriter.name("Status");
            awsJsonWriter.value(status);
        }
        if (projectVersionDescription.getStatusMessage() != null) {
            String statusMessage = projectVersionDescription.getStatusMessage();
            awsJsonWriter.name("StatusMessage");
            awsJsonWriter.value(statusMessage);
        }
        if (projectVersionDescription.getBillableTrainingTimeInSeconds() != null) {
            Long billableTrainingTimeInSeconds = projectVersionDescription.getBillableTrainingTimeInSeconds();
            awsJsonWriter.name("BillableTrainingTimeInSeconds");
            awsJsonWriter.value(billableTrainingTimeInSeconds);
        }
        if (projectVersionDescription.getTrainingEndTimestamp() != null) {
            Date trainingEndTimestamp = projectVersionDescription.getTrainingEndTimestamp();
            awsJsonWriter.name("TrainingEndTimestamp");
            awsJsonWriter.value(trainingEndTimestamp);
        }
        if (projectVersionDescription.getOutputConfig() != null) {
            OutputConfig outputConfig = projectVersionDescription.getOutputConfig();
            awsJsonWriter.name("OutputConfig");
            OutputConfigJsonMarshaller.getInstance().marshall(outputConfig, awsJsonWriter);
        }
        if (projectVersionDescription.getTrainingDataResult() != null) {
            TrainingDataResult trainingDataResult = projectVersionDescription.getTrainingDataResult();
            awsJsonWriter.name("TrainingDataResult");
            TrainingDataResultJsonMarshaller.getInstance().marshall(trainingDataResult, awsJsonWriter);
        }
        if (projectVersionDescription.getTestingDataResult() != null) {
            TestingDataResult testingDataResult = projectVersionDescription.getTestingDataResult();
            awsJsonWriter.name("TestingDataResult");
            TestingDataResultJsonMarshaller.getInstance().marshall(testingDataResult, awsJsonWriter);
        }
        if (projectVersionDescription.getEvaluationResult() != null) {
            EvaluationResult evaluationResult = projectVersionDescription.getEvaluationResult();
            awsJsonWriter.name("EvaluationResult");
            EvaluationResultJsonMarshaller.getInstance().marshall(evaluationResult, awsJsonWriter);
        }
        if (projectVersionDescription.getManifestSummary() != null) {
            GroundTruthManifest manifestSummary = projectVersionDescription.getManifestSummary();
            awsJsonWriter.name("ManifestSummary");
            GroundTruthManifestJsonMarshaller.getInstance().marshall(manifestSummary, awsJsonWriter);
        }
        if (projectVersionDescription.getKmsKeyId() != null) {
            String kmsKeyId = projectVersionDescription.getKmsKeyId();
            awsJsonWriter.name("KmsKeyId");
            awsJsonWriter.value(kmsKeyId);
        }
        if (projectVersionDescription.getMaxInferenceUnits() != null) {
            Integer maxInferenceUnits = projectVersionDescription.getMaxInferenceUnits();
            awsJsonWriter.name("MaxInferenceUnits");
            awsJsonWriter.value(maxInferenceUnits);
        }
        if (projectVersionDescription.getSourceProjectVersionArn() != null) {
            String sourceProjectVersionArn = projectVersionDescription.getSourceProjectVersionArn();
            awsJsonWriter.name("SourceProjectVersionArn");
            awsJsonWriter.value(sourceProjectVersionArn);
        }
        awsJsonWriter.endObject();
    }
}
