package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.ProjectVersionDescription;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class ProjectVersionDescriptionJsonUnmarshaller implements Unmarshaller<ProjectVersionDescription, JsonUnmarshallerContext> {
    private static ProjectVersionDescriptionJsonUnmarshaller instance;

    public static ProjectVersionDescriptionJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new ProjectVersionDescriptionJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public ProjectVersionDescription unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ProjectVersionDescription projectVersionDescription = new ProjectVersionDescription();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("ProjectVersionArn")) {
                projectVersionDescription.setProjectVersionArn(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("CreationTimestamp")) {
                projectVersionDescription.setCreationTimestamp(SimpleTypeJsonUnmarshallers.DateJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("MinInferenceUnits")) {
                projectVersionDescription.setMinInferenceUnits(SimpleTypeJsonUnmarshallers.IntegerJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Status")) {
                projectVersionDescription.setStatus(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("StatusMessage")) {
                projectVersionDescription.setStatusMessage(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("BillableTrainingTimeInSeconds")) {
                projectVersionDescription.setBillableTrainingTimeInSeconds(SimpleTypeJsonUnmarshallers.LongJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("TrainingEndTimestamp")) {
                projectVersionDescription.setTrainingEndTimestamp(SimpleTypeJsonUnmarshallers.DateJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("OutputConfig")) {
                projectVersionDescription.setOutputConfig(OutputConfigJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("TrainingDataResult")) {
                projectVersionDescription.setTrainingDataResult(TrainingDataResultJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("TestingDataResult")) {
                projectVersionDescription.setTestingDataResult(TestingDataResultJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("EvaluationResult")) {
                projectVersionDescription.setEvaluationResult(EvaluationResultJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("ManifestSummary")) {
                projectVersionDescription.setManifestSummary(GroundTruthManifestJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("KmsKeyId")) {
                projectVersionDescription.setKmsKeyId(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("MaxInferenceUnits")) {
                projectVersionDescription.setMaxInferenceUnits(SimpleTypeJsonUnmarshallers.IntegerJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("SourceProjectVersionArn")) {
                projectVersionDescription.setSourceProjectVersionArn(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return projectVersionDescription;
    }
}
