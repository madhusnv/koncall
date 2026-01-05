package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.KinesisVideoStreamStartSelector;
import com.amazonaws.services.rekognition.model.StreamProcessingStartSelector;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class StreamProcessingStartSelectorJsonMarshaller {
    private static StreamProcessingStartSelectorJsonMarshaller instance;

    public static StreamProcessingStartSelectorJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new StreamProcessingStartSelectorJsonMarshaller();
        }
        return instance;
    }

    public void marshall(StreamProcessingStartSelector streamProcessingStartSelector, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (streamProcessingStartSelector.getKVSStreamStartSelector() != null) {
            KinesisVideoStreamStartSelector kVSStreamStartSelector = streamProcessingStartSelector.getKVSStreamStartSelector();
            awsJsonWriter.name("KVSStreamStartSelector");
            KinesisVideoStreamStartSelectorJsonMarshaller.getInstance().marshall(kVSStreamStartSelector, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
