package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.S3Destination;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class S3DestinationJsonMarshaller {
    private static S3DestinationJsonMarshaller instance;

    public static S3DestinationJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new S3DestinationJsonMarshaller();
        }
        return instance;
    }

    public void marshall(S3Destination s3Destination, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (s3Destination.getBucket() != null) {
            String bucket = s3Destination.getBucket();
            awsJsonWriter.name("Bucket");
            awsJsonWriter.value(bucket);
        }
        if (s3Destination.getKeyPrefix() != null) {
            String keyPrefix = s3Destination.getKeyPrefix();
            awsJsonWriter.name("KeyPrefix");
            awsJsonWriter.value(keyPrefix);
        }
        awsJsonWriter.endObject();
    }
}
