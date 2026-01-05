package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.PersonMatch;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class PersonMatchJsonUnmarshaller implements Unmarshaller<PersonMatch, JsonUnmarshallerContext> {
    private static PersonMatchJsonUnmarshaller instance;

    public static PersonMatchJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new PersonMatchJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public PersonMatch unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        PersonMatch personMatch = new PersonMatch();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("Timestamp")) {
                personMatch.setTimestamp(SimpleTypeJsonUnmarshallers.LongJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Person")) {
                personMatch.setPerson(PersonDetailJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("FaceMatches")) {
                personMatch.setFaceMatches(new ListUnmarshaller(FaceMatchJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return personMatch;
    }
}
