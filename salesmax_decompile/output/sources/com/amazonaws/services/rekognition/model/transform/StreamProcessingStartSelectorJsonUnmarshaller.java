package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.StreamProcessingStartSelector;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class StreamProcessingStartSelectorJsonUnmarshaller implements Unmarshaller<StreamProcessingStartSelector, JsonUnmarshallerContext> {
    private static StreamProcessingStartSelectorJsonUnmarshaller instance;

    public static StreamProcessingStartSelectorJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new StreamProcessingStartSelectorJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public StreamProcessingStartSelector unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        StreamProcessingStartSelector streamProcessingStartSelector = new StreamProcessingStartSelector();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("KVSStreamStartSelector")) {
                streamProcessingStartSelector.setKVSStreamStartSelector(KinesisVideoStreamStartSelectorJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return streamProcessingStartSelector;
    }
}
