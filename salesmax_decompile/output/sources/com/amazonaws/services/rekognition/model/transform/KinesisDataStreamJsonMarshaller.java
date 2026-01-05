package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.KinesisDataStream;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class KinesisDataStreamJsonMarshaller {
    private static KinesisDataStreamJsonMarshaller instance;

    public static KinesisDataStreamJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new KinesisDataStreamJsonMarshaller();
        }
        return instance;
    }

    public void marshall(KinesisDataStream kinesisDataStream, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (kinesisDataStream.getArn() != null) {
            String arn = kinesisDataStream.getArn();
            awsJsonWriter.name("Arn");
            awsJsonWriter.value(arn);
        }
        awsJsonWriter.endObject();
    }
}
