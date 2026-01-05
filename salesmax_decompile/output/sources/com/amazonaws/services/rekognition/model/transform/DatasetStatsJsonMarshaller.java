package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.DatasetStats;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class DatasetStatsJsonMarshaller {
    private static DatasetStatsJsonMarshaller instance;

    public static DatasetStatsJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new DatasetStatsJsonMarshaller();
        }
        return instance;
    }

    public void marshall(DatasetStats datasetStats, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (datasetStats.getLabeledEntries() != null) {
            Integer labeledEntries = datasetStats.getLabeledEntries();
            awsJsonWriter.name("LabeledEntries");
            awsJsonWriter.value(labeledEntries);
        }
        if (datasetStats.getTotalEntries() != null) {
            Integer totalEntries = datasetStats.getTotalEntries();
            awsJsonWriter.name("TotalEntries");
            awsJsonWriter.value(totalEntries);
        }
        if (datasetStats.getTotalLabels() != null) {
            Integer totalLabels = datasetStats.getTotalLabels();
            awsJsonWriter.name("TotalLabels");
            awsJsonWriter.value(totalLabels);
        }
        if (datasetStats.getErrorEntries() != null) {
            Integer errorEntries = datasetStats.getErrorEntries();
            awsJsonWriter.name("ErrorEntries");
            awsJsonWriter.value(errorEntries);
        }
        awsJsonWriter.endObject();
    }
}
