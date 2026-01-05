package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.User;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class UserJsonMarshaller {
    private static UserJsonMarshaller instance;

    public static UserJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new UserJsonMarshaller();
        }
        return instance;
    }

    public void marshall(User user, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (user.getUserId() != null) {
            String userId = user.getUserId();
            awsJsonWriter.name("UserId");
            awsJsonWriter.value(userId);
        }
        if (user.getUserStatus() != null) {
            String userStatus = user.getUserStatus();
            awsJsonWriter.name("UserStatus");
            awsJsonWriter.value(userStatus);
        }
        awsJsonWriter.endObject();
    }
}
