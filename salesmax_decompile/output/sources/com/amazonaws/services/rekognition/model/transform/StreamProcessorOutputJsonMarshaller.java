package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.KinesisDataStream;
import com.amazonaws.services.rekognition.model.S3Destination;
import com.amazonaws.services.rekognition.model.StreamProcessorOutput;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class StreamProcessorOutputJsonMarshaller {
    private static StreamProcessorOutputJsonMarshaller instance;

    public static StreamProcessorOutputJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new StreamProcessorOutputJsonMarshaller();
        }
        return instance;
    }

    public void marshall(StreamProcessorOutput streamProcessorOutput, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (streamProcessorOutput.getKinesisDataStream() != null) {
            KinesisDataStream kinesisDataStream = streamProcessorOutput.getKinesisDataStream();
            awsJsonWriter.name("KinesisDataStream");
            KinesisDataStreamJsonMarshaller.getInstance().marshall(kinesisDataStream, awsJsonWriter);
        }
        if (streamProcessorOutput.getS3Destination() != null) {
            S3Destination s3Destination = streamProcessorOutput.getS3Destination();
            awsJsonWriter.name("S3Destination");
            S3DestinationJsonMarshaller.getInstance().marshall(s3Destination, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
