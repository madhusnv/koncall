package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.DatasetLabelStats;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class DatasetLabelStatsJsonMarshaller {
    private static DatasetLabelStatsJsonMarshaller instance;

    public static DatasetLabelStatsJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new DatasetLabelStatsJsonMarshaller();
        }
        return instance;
    }

    public void marshall(DatasetLabelStats datasetLabelStats, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (datasetLabelStats.getEntryCount() != null) {
            Integer entryCount = datasetLabelStats.getEntryCount();
            awsJsonWriter.name("EntryCount");
            awsJsonWriter.value(entryCount);
        }
        if (datasetLabelStats.getBoundingBoxCount() != null) {
            Integer boundingBoxCount = datasetLabelStats.getBoundingBoxCount();
            awsJsonWriter.name("BoundingBoxCount");
            awsJsonWriter.value(boundingBoxCount);
        }
        awsJsonWriter.endObject();
    }
}
