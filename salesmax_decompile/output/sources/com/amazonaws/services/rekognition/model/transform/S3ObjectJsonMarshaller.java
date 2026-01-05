package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.auth.policy.internal.JsonDocumentFields;
import com.amazonaws.services.rekognition.model.S3Object;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class S3ObjectJsonMarshaller {
    private static S3ObjectJsonMarshaller instance;

    public static S3ObjectJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new S3ObjectJsonMarshaller();
        }
        return instance;
    }

    public void marshall(S3Object s3Object, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (s3Object.getBucket() != null) {
            String bucket = s3Object.getBucket();
            awsJsonWriter.name("Bucket");
            awsJsonWriter.value(bucket);
        }
        if (s3Object.getName() != null) {
            String name = s3Object.getName();
            awsJsonWriter.name("Name");
            awsJsonWriter.value(name);
        }
        if (s3Object.getVersion() != null) {
            String version = s3Object.getVersion();
            awsJsonWriter.name(JsonDocumentFields.VERSION);
            awsJsonWriter.value(version);
        }
        awsJsonWriter.endObject();
    }
}
