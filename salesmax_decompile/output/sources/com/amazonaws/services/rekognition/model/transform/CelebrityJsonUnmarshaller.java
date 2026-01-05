package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.auth.policy.internal.JsonDocumentFields;
import com.amazonaws.services.rekognition.model.Celebrity;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class CelebrityJsonUnmarshaller implements Unmarshaller<Celebrity, JsonUnmarshallerContext> {
    private static CelebrityJsonUnmarshaller instance;

    public static CelebrityJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new CelebrityJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public Celebrity unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Celebrity celebrity = new Celebrity();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("Urls")) {
                celebrity.setUrls(new ListUnmarshaller(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Name")) {
                celebrity.setName(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals(JsonDocumentFields.POLICY_ID)) {
                celebrity.setId(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Face")) {
                celebrity.setFace(ComparedFaceJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("MatchConfidence")) {
                celebrity.setMatchConfidence(SimpleTypeJsonUnmarshallers.FloatJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("KnownGender")) {
                celebrity.setKnownGender(KnownGenderJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return celebrity;
    }
}
