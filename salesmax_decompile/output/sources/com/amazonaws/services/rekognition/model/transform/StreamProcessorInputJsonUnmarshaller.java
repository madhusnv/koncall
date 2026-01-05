package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.StreamProcessorInput;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class StreamProcessorInputJsonUnmarshaller implements Unmarshaller<StreamProcessorInput, JsonUnmarshallerContext> {
    private static StreamProcessorInputJsonUnmarshaller instance;

    public static StreamProcessorInputJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new StreamProcessorInputJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public StreamProcessorInput unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        StreamProcessorInput streamProcessorInput = new StreamProcessorInput();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("KinesisVideoStream")) {
                streamProcessorInput.setKinesisVideoStream(KinesisVideoStreamJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return streamProcessorInput;
    }
}
