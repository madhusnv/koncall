package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.MatchedUser;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class MatchedUserJsonUnmarshaller implements Unmarshaller<MatchedUser, JsonUnmarshallerContext> {
    private static MatchedUserJsonUnmarshaller instance;

    public static MatchedUserJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new MatchedUserJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public MatchedUser unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        MatchedUser matchedUser = new MatchedUser();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("UserId")) {
                matchedUser.setUserId(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("UserStatus")) {
                matchedUser.setUserStatus(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return matchedUser;
    }
}
