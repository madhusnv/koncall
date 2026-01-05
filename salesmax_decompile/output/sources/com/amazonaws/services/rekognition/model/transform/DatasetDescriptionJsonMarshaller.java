package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.DatasetDescription;
import com.amazonaws.services.rekognition.model.DatasetStats;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.Date;

/* loaded from: classes5.dex */
class DatasetDescriptionJsonMarshaller {
    private static DatasetDescriptionJsonMarshaller instance;

    public static DatasetDescriptionJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new DatasetDescriptionJsonMarshaller();
        }
        return instance;
    }

    public void marshall(DatasetDescription datasetDescription, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (datasetDescription.getCreationTimestamp() != null) {
            Date creationTimestamp = datasetDescription.getCreationTimestamp();
            awsJsonWriter.name("CreationTimestamp");
            awsJsonWriter.value(creationTimestamp);
        }
        if (datasetDescription.getLastUpdatedTimestamp() != null) {
            Date lastUpdatedTimestamp = datasetDescription.getLastUpdatedTimestamp();
            awsJsonWriter.name("LastUpdatedTimestamp");
            awsJsonWriter.value(lastUpdatedTimestamp);
        }
        if (datasetDescription.getStatus() != null) {
            String status = datasetDescription.getStatus();
            awsJsonWriter.name("Status");
            awsJsonWriter.value(status);
        }
        if (datasetDescription.getStatusMessage() != null) {
            String statusMessage = datasetDescription.getStatusMessage();
            awsJsonWriter.name("StatusMessage");
            awsJsonWriter.value(statusMessage);
        }
        if (datasetDescription.getStatusMessageCode() != null) {
            String statusMessageCode = datasetDescription.getStatusMessageCode();
            awsJsonWriter.name("StatusMessageCode");
            awsJsonWriter.value(statusMessageCode);
        }
        if (datasetDescription.getDatasetStats() != null) {
            DatasetStats datasetStats = datasetDescription.getDatasetStats();
            awsJsonWriter.name("DatasetStats");
            DatasetStatsJsonMarshaller.getInstance().marshall(datasetStats, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
