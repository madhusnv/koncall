package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.KinesisVideoStream;
import com.amazonaws.services.rekognition.model.StreamProcessorInput;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class StreamProcessorInputJsonMarshaller {
    private static StreamProcessorInputJsonMarshaller instance;

    public static StreamProcessorInputJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new StreamProcessorInputJsonMarshaller();
        }
        return instance;
    }

    public void marshall(StreamProcessorInput streamProcessorInput, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (streamProcessorInput.getKinesisVideoStream() != null) {
            KinesisVideoStream kinesisVideoStream = streamProcessorInput.getKinesisVideoStream();
            awsJsonWriter.name("KinesisVideoStream");
            KinesisVideoStreamJsonMarshaller.getInstance().marshall(kinesisVideoStream, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
