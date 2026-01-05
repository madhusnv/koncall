package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.FaceMatch;
import com.amazonaws.services.rekognition.model.PersonDetail;
import com.amazonaws.services.rekognition.model.PersonMatch;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.List;

/* loaded from: classes5.dex */
class PersonMatchJsonMarshaller {
    private static PersonMatchJsonMarshaller instance;

    public static PersonMatchJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new PersonMatchJsonMarshaller();
        }
        return instance;
    }

    public void marshall(PersonMatch personMatch, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (personMatch.getTimestamp() != null) {
            Long timestamp = personMatch.getTimestamp();
            awsJsonWriter.name("Timestamp");
            awsJsonWriter.value(timestamp);
        }
        if (personMatch.getPerson() != null) {
            PersonDetail person = personMatch.getPerson();
            awsJsonWriter.name("Person");
            PersonDetailJsonMarshaller.getInstance().marshall(person, awsJsonWriter);
        }
        if (personMatch.getFaceMatches() != null) {
            List<FaceMatch> faceMatches = personMatch.getFaceMatches();
            awsJsonWriter.name("FaceMatches");
            awsJsonWriter.beginArray();
            for (FaceMatch faceMatch : faceMatches) {
                if (faceMatch != null) {
                    FaceMatchJsonMarshaller.getInstance().marshall(faceMatch, awsJsonWriter);
                }
            }
            awsJsonWriter.endArray();
        }
        awsJsonWriter.endObject();
    }
}
