package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.MatchedUser;
import com.amazonaws.services.rekognition.model.UserMatch;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class UserMatchJsonMarshaller {
    private static UserMatchJsonMarshaller instance;

    public static UserMatchJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new UserMatchJsonMarshaller();
        }
        return instance;
    }

    public void marshall(UserMatch userMatch, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (userMatch.getSimilarity() != null) {
            Float similarity = userMatch.getSimilarity();
            awsJsonWriter.name("Similarity");
            awsJsonWriter.value(similarity);
        }
        if (userMatch.getUser() != null) {
            MatchedUser user = userMatch.getUser();
            awsJsonWriter.name("User");
            MatchedUserJsonMarshaller.getInstance().marshall(user, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
