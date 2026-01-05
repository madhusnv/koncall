package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.DatasetLabelDescription;
import com.amazonaws.services.rekognition.model.DatasetLabelStats;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class DatasetLabelDescriptionJsonMarshaller {
    private static DatasetLabelDescriptionJsonMarshaller instance;

    public static DatasetLabelDescriptionJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new DatasetLabelDescriptionJsonMarshaller();
        }
        return instance;
    }

    public void marshall(DatasetLabelDescription datasetLabelDescription, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (datasetLabelDescription.getLabelName() != null) {
            String labelName = datasetLabelDescription.getLabelName();
            awsJsonWriter.name("LabelName");
            awsJsonWriter.value(labelName);
        }
        if (datasetLabelDescription.getLabelStats() != null) {
            DatasetLabelStats labelStats = datasetLabelDescription.getLabelStats();
            awsJsonWriter.name("LabelStats");
            DatasetLabelStatsJsonMarshaller.getInstance().marshall(labelStats, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
