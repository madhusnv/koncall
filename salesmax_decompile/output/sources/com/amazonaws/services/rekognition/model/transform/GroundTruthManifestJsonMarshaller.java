package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.GroundTruthManifest;
import com.amazonaws.services.rekognition.model.S3Object;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class GroundTruthManifestJsonMarshaller {
    private static GroundTruthManifestJsonMarshaller instance;

    public static GroundTruthManifestJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new GroundTruthManifestJsonMarshaller();
        }
        return instance;
    }

    public void marshall(GroundTruthManifest groundTruthManifest, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (groundTruthManifest.getS3Object() != null) {
            S3Object s3Object = groundTruthManifest.getS3Object();
            awsJsonWriter.name("S3Object");
            S3ObjectJsonMarshaller.getInstance().marshall(s3Object, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
