package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.MatchedUser;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class MatchedUserJsonMarshaller {
    private static MatchedUserJsonMarshaller instance;

    public static MatchedUserJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new MatchedUserJsonMarshaller();
        }
        return instance;
    }

    public void marshall(MatchedUser matchedUser, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (matchedUser.getUserId() != null) {
            String userId = matchedUser.getUserId();
            awsJsonWriter.name("UserId");
            awsJsonWriter.value(userId);
        }
        if (matchedUser.getUserStatus() != null) {
            String userStatus = matchedUser.getUserStatus();
            awsJsonWriter.name("UserStatus");
            awsJsonWriter.value(userStatus);
        }
        awsJsonWriter.endObject();
    }
}
