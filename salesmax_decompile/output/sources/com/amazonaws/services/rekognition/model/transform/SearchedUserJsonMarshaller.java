package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.SearchedUser;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class SearchedUserJsonMarshaller {
    private static SearchedUserJsonMarshaller instance;

    public static SearchedUserJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new SearchedUserJsonMarshaller();
        }
        return instance;
    }

    public void marshall(SearchedUser searchedUser, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (searchedUser.getUserId() != null) {
            String userId = searchedUser.getUserId();
            awsJsonWriter.name("UserId");
            awsJsonWriter.value(userId);
        }
        awsJsonWriter.endObject();
    }
}
