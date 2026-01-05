package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.LivenessOutputConfig;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class LivenessOutputConfigJsonMarshaller {
    private static LivenessOutputConfigJsonMarshaller instance;

    public static LivenessOutputConfigJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new LivenessOutputConfigJsonMarshaller();
        }
        return instance;
    }

    public void marshall(LivenessOutputConfig livenessOutputConfig, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (livenessOutputConfig.getS3Bucket() != null) {
            String s3Bucket = livenessOutputConfig.getS3Bucket();
            awsJsonWriter.name("S3Bucket");
            awsJsonWriter.value(s3Bucket);
        }
        if (livenessOutputConfig.getS3KeyPrefix() != null) {
            String s3KeyPrefix = livenessOutputConfig.getS3KeyPrefix();
            awsJsonWriter.name("S3KeyPrefix");
            awsJsonWriter.value(s3KeyPrefix);
        }
        awsJsonWriter.endObject();
    }
}
