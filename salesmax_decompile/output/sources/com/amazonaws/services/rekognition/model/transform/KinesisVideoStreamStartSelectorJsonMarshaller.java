package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.KinesisVideoStreamStartSelector;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class KinesisVideoStreamStartSelectorJsonMarshaller {
    private static KinesisVideoStreamStartSelectorJsonMarshaller instance;

    public static KinesisVideoStreamStartSelectorJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new KinesisVideoStreamStartSelectorJsonMarshaller();
        }
        return instance;
    }

    public void marshall(KinesisVideoStreamStartSelector kinesisVideoStreamStartSelector, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (kinesisVideoStreamStartSelector.getProducerTimestamp() != null) {
            Long producerTimestamp = kinesisVideoStreamStartSelector.getProducerTimestamp();
            awsJsonWriter.name("ProducerTimestamp");
            awsJsonWriter.value(producerTimestamp);
        }
        if (kinesisVideoStreamStartSelector.getFragmentNumber() != null) {
            String fragmentNumber = kinesisVideoStreamStartSelector.getFragmentNumber();
            awsJsonWriter.name("FragmentNumber");
            awsJsonWriter.value(fragmentNumber);
        }
        awsJsonWriter.endObject();
    }
}
