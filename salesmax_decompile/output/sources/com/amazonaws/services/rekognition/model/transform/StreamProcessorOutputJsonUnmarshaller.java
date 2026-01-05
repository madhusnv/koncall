package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.StreamProcessorOutput;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class StreamProcessorOutputJsonUnmarshaller implements Unmarshaller<StreamProcessorOutput, JsonUnmarshallerContext> {
    private static StreamProcessorOutputJsonUnmarshaller instance;

    public static StreamProcessorOutputJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new StreamProcessorOutputJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public StreamProcessorOutput unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        StreamProcessorOutput streamProcessorOutput = new StreamProcessorOutput();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("KinesisDataStream")) {
                streamProcessorOutput.setKinesisDataStream(KinesisDataStreamJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("S3Destination")) {
                streamProcessorOutput.setS3Destination(S3DestinationJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return streamProcessorOutput;
    }
}
