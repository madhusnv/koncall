package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.PersonDetection;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class PersonDetectionJsonUnmarshaller implements Unmarshaller<PersonDetection, JsonUnmarshallerContext> {
    private static PersonDetectionJsonUnmarshaller instance;

    public static PersonDetectionJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new PersonDetectionJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public PersonDetection unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        PersonDetection personDetection = new PersonDetection();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("Timestamp")) {
                personDetection.setTimestamp(SimpleTypeJsonUnmarshallers.LongJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Person")) {
                personDetection.setPerson(PersonDetailJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return personDetection;
    }
}
