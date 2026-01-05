package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.StreamProcessingStopSelector;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class StreamProcessingStopSelectorJsonUnmarshaller implements Unmarshaller<StreamProcessingStopSelector, JsonUnmarshallerContext> {
    private static StreamProcessingStopSelectorJsonUnmarshaller instance;

    public static StreamProcessingStopSelectorJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new StreamProcessingStopSelectorJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public StreamProcessingStopSelector unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        StreamProcessingStopSelector streamProcessingStopSelector = new StreamProcessingStopSelector();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("MaxDurationInSeconds")) {
                streamProcessingStopSelector.setMaxDurationInSeconds(SimpleTypeJsonUnmarshallers.LongJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return streamProcessingStopSelector;
    }
}
