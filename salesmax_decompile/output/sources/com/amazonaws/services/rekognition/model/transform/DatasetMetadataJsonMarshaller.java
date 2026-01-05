package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.DatasetMetadata;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.Date;

/* loaded from: classes5.dex */
class DatasetMetadataJsonMarshaller {
    private static DatasetMetadataJsonMarshaller instance;

    public static DatasetMetadataJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new DatasetMetadataJsonMarshaller();
        }
        return instance;
    }

    public void marshall(DatasetMetadata datasetMetadata, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (datasetMetadata.getCreationTimestamp() != null) {
            Date creationTimestamp = datasetMetadata.getCreationTimestamp();
            awsJsonWriter.name("CreationTimestamp");
            awsJsonWriter.value(creationTimestamp);
        }
        if (datasetMetadata.getDatasetType() != null) {
            String datasetType = datasetMetadata.getDatasetType();
            awsJsonWriter.name("DatasetType");
            awsJsonWriter.value(datasetType);
        }
        if (datasetMetadata.getDatasetArn() != null) {
            String datasetArn = datasetMetadata.getDatasetArn();
            awsJsonWriter.name("DatasetArn");
            awsJsonWriter.value(datasetArn);
        }
        if (datasetMetadata.getStatus() != null) {
            String status = datasetMetadata.getStatus();
            awsJsonWriter.name("Status");
            awsJsonWriter.value(status);
        }
        if (datasetMetadata.getStatusMessage() != null) {
            String statusMessage = datasetMetadata.getStatusMessage();
            awsJsonWriter.name("StatusMessage");
            awsJsonWriter.value(statusMessage);
        }
        if (datasetMetadata.getStatusMessageCode() != null) {
            String statusMessageCode = datasetMetadata.getStatusMessageCode();
            awsJsonWriter.name("StatusMessageCode");
            awsJsonWriter.value(statusMessageCode);
        }
        awsJsonWriter.endObject();
    }
}
