package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.S3Object;
import com.amazonaws.services.rekognition.model.Summary;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class SummaryJsonMarshaller {
    private static SummaryJsonMarshaller instance;

    public static SummaryJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new SummaryJsonMarshaller();
        }
        return instance;
    }

    public void marshall(Summary summary, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (summary.getS3Object() != null) {
            S3Object s3Object = summary.getS3Object();
            awsJsonWriter.name("S3Object");
            S3ObjectJsonMarshaller.getInstance().marshall(s3Object, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
