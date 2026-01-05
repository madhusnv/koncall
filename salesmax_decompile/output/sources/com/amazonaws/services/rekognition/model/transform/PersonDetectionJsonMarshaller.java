package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.PersonDetail;
import com.amazonaws.services.rekognition.model.PersonDetection;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class PersonDetectionJsonMarshaller {
    private static PersonDetectionJsonMarshaller instance;

    public static PersonDetectionJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new PersonDetectionJsonMarshaller();
        }
        return instance;
    }

    public void marshall(PersonDetection personDetection, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (personDetection.getTimestamp() != null) {
            Long timestamp = personDetection.getTimestamp();
            awsJsonWriter.name("Timestamp");
            awsJsonWriter.value(timestamp);
        }
        if (personDetection.getPerson() != null) {
            PersonDetail person = personDetection.getPerson();
            awsJsonWriter.name("Person");
            PersonDetailJsonMarshaller.getInstance().marshall(person, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
