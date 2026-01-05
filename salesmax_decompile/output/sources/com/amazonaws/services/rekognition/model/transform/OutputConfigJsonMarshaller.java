package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.OutputConfig;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class OutputConfigJsonMarshaller {
    private static OutputConfigJsonMarshaller instance;

    public static OutputConfigJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new OutputConfigJsonMarshaller();
        }
        return instance;
    }

    public void marshall(OutputConfig outputConfig, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (outputConfig.getS3Bucket() != null) {
            String s3Bucket = outputConfig.getS3Bucket();
            awsJsonWriter.name("S3Bucket");
            awsJsonWriter.value(s3Bucket);
        }
        if (outputConfig.getS3KeyPrefix() != null) {
            String s3KeyPrefix = outputConfig.getS3KeyPrefix();
            awsJsonWriter.name("S3KeyPrefix");
            awsJsonWriter.value(s3KeyPrefix);
        }
        awsJsonWriter.endObject();
    }
}
