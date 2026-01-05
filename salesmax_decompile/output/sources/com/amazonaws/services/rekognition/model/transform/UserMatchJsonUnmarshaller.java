package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.UserMatch;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class UserMatchJsonUnmarshaller implements Unmarshaller<UserMatch, JsonUnmarshallerContext> {
    private static UserMatchJsonUnmarshaller instance;

    public static UserMatchJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new UserMatchJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public UserMatch unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        UserMatch userMatch = new UserMatch();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("Similarity")) {
                userMatch.setSimilarity(SimpleTypeJsonUnmarshallers.FloatJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("User")) {
                userMatch.setUser(MatchedUserJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return userMatch;
    }
}
