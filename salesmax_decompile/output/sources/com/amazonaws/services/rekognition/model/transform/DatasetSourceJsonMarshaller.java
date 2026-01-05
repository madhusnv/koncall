package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.DatasetSource;
import com.amazonaws.services.rekognition.model.GroundTruthManifest;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class DatasetSourceJsonMarshaller {
    private static DatasetSourceJsonMarshaller instance;

    public static DatasetSourceJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new DatasetSourceJsonMarshaller();
        }
        return instance;
    }

    public void marshall(DatasetSource datasetSource, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (datasetSource.getGroundTruthManifest() != null) {
            GroundTruthManifest groundTruthManifest = datasetSource.getGroundTruthManifest();
            awsJsonWriter.name("GroundTruthManifest");
            GroundTruthManifestJsonMarshaller.getInstance().marshall(groundTruthManifest, awsJsonWriter);
        }
        if (datasetSource.getDatasetArn() != null) {
            String datasetArn = datasetSource.getDatasetArn();
            awsJsonWriter.name("DatasetArn");
            awsJsonWriter.value(datasetArn);
        }
        awsJsonWriter.endObject();
    }
}
