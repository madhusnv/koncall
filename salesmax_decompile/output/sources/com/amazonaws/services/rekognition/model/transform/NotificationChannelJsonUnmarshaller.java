package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.NotificationChannel;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class NotificationChannelJsonUnmarshaller implements Unmarshaller<NotificationChannel, JsonUnmarshallerContext> {
    private static NotificationChannelJsonUnmarshaller instance;

    public static NotificationChannelJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new NotificationChannelJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public NotificationChannel unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        NotificationChannel notificationChannel = new NotificationChannel();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("SNSTopicArn")) {
                notificationChannel.setSNSTopicArn(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("RoleArn")) {
                notificationChannel.setRoleArn(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return notificationChannel;
    }
}
