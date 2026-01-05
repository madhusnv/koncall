package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.DatasetChanges;
import com.amazonaws.util.json.AwsJsonWriter;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
class DatasetChangesJsonMarshaller {
    private static DatasetChangesJsonMarshaller instance;

    public static DatasetChangesJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new DatasetChangesJsonMarshaller();
        }
        return instance;
    }

    public void marshall(DatasetChanges datasetChanges, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (datasetChanges.getGroundTruth() != null) {
            ByteBuffer groundTruth = datasetChanges.getGroundTruth();
            awsJsonWriter.name("GroundTruth");
            awsJsonWriter.value(groundTruth);
        }
        awsJsonWriter.endObject();
    }
}
