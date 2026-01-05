package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.KinesisVideoStream;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class KinesisVideoStreamJsonUnmarshaller implements Unmarshaller<KinesisVideoStream, JsonUnmarshallerContext> {
    private static KinesisVideoStreamJsonUnmarshaller instance;

    public static KinesisVideoStreamJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new KinesisVideoStreamJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public KinesisVideoStream unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        KinesisVideoStream kinesisVideoStream = new KinesisVideoStream();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("Arn")) {
                kinesisVideoStream.setArn(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return kinesisVideoStream;
    }
}
