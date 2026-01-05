package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.KinesisVideoStream;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class KinesisVideoStreamJsonMarshaller {
    private static KinesisVideoStreamJsonMarshaller instance;

    public static KinesisVideoStreamJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new KinesisVideoStreamJsonMarshaller();
        }
        return instance;
    }

    public void marshall(KinesisVideoStream kinesisVideoStream, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (kinesisVideoStream.getArn() != null) {
            String arn = kinesisVideoStream.getArn();
            awsJsonWriter.name("Arn");
            awsJsonWriter.value(arn);
        }
        awsJsonWriter.endObject();
    }
}
