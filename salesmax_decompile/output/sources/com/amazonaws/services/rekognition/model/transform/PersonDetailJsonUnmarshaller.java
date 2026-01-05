package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.PersonDetail;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class PersonDetailJsonUnmarshaller implements Unmarshaller<PersonDetail, JsonUnmarshallerContext> {
    private static PersonDetailJsonUnmarshaller instance;

    public static PersonDetailJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new PersonDetailJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public PersonDetail unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        PersonDetail personDetail = new PersonDetail();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("Index")) {
                personDetail.setIndex(SimpleTypeJsonUnmarshallers.LongJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("BoundingBox")) {
                personDetail.setBoundingBox(BoundingBoxJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Face")) {
                personDetail.setFace(FaceDetailJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return personDetail;
    }
}
