package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.DistributeDataset;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class DistributeDatasetJsonMarshaller {
    private static DistributeDatasetJsonMarshaller instance;

    public static DistributeDatasetJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new DistributeDatasetJsonMarshaller();
        }
        return instance;
    }

    public void marshall(DistributeDataset distributeDataset, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (distributeDataset.getArn() != null) {
            String arn = distributeDataset.getArn();
            awsJsonWriter.name("Arn");
            awsJsonWriter.value(arn);
        }
        awsJsonWriter.endObject();
    }
}
