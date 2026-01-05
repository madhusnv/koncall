package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.KinesisDataStream;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class KinesisDataStreamJsonUnmarshaller implements Unmarshaller<KinesisDataStream, JsonUnmarshallerContext> {
    private static KinesisDataStreamJsonUnmarshaller instance;

    public static KinesisDataStreamJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new KinesisDataStreamJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public KinesisDataStream unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        KinesisDataStream kinesisDataStream = new KinesisDataStream();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("Arn")) {
                kinesisDataStream.setArn(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return kinesisDataStream;
    }
}
