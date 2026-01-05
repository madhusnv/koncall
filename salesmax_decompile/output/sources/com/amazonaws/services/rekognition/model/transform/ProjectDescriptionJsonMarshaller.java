package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.DatasetMetadata;
import com.amazonaws.services.rekognition.model.ProjectDescription;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.Date;
import java.util.List;

/* loaded from: classes5.dex */
class ProjectDescriptionJsonMarshaller {
    private static ProjectDescriptionJsonMarshaller instance;

    public static ProjectDescriptionJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new ProjectDescriptionJsonMarshaller();
        }
        return instance;
    }

    public void marshall(ProjectDescription projectDescription, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (projectDescription.getProjectArn() != null) {
            String projectArn = projectDescription.getProjectArn();
            awsJsonWriter.name("ProjectArn");
            awsJsonWriter.value(projectArn);
        }
        if (projectDescription.getCreationTimestamp() != null) {
            Date creationTimestamp = projectDescription.getCreationTimestamp();
            awsJsonWriter.name("CreationTimestamp");
            awsJsonWriter.value(creationTimestamp);
        }
        if (projectDescription.getStatus() != null) {
            String status = projectDescription.getStatus();
            awsJsonWriter.name("Status");
            awsJsonWriter.value(status);
        }
        if (projectDescription.getDatasets() != null) {
            List<DatasetMetadata> datasets = projectDescription.getDatasets();
            awsJsonWriter.name("Datasets");
            awsJsonWriter.beginArray();
            for (DatasetMetadata datasetMetadata : datasets) {
                if (datasetMetadata != null) {
                    DatasetMetadataJsonMarshaller.getInstance().marshall(datasetMetadata, awsJsonWriter);
                }
            }
            awsJsonWriter.endArray();
        }
        awsJsonWriter.endObject();
    }
}
