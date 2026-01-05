package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.StreamProcessorNotificationChannel;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class StreamProcessorNotificationChannelJsonUnmarshaller implements Unmarshaller<StreamProcessorNotificationChannel, JsonUnmarshallerContext> {
    private static StreamProcessorNotificationChannelJsonUnmarshaller instance;

    public static StreamProcessorNotificationChannelJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new StreamProcessorNotificationChannelJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public StreamProcessorNotificationChannel unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        StreamProcessorNotificationChannel streamProcessorNotificationChannel = new StreamProcessorNotificationChannel();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("SNSTopicArn")) {
                streamProcessorNotificationChannel.setSNSTopicArn(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return streamProcessorNotificationChannel;
    }
}
