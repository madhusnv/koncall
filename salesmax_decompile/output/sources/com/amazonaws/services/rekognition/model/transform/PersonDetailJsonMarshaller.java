package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.BoundingBox;
import com.amazonaws.services.rekognition.model.FaceDetail;
import com.amazonaws.services.rekognition.model.PersonDetail;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class PersonDetailJsonMarshaller {
    private static PersonDetailJsonMarshaller instance;

    public static PersonDetailJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new PersonDetailJsonMarshaller();
        }
        return instance;
    }

    public void marshall(PersonDetail personDetail, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (personDetail.getIndex() != null) {
            Long index = personDetail.getIndex();
            awsJsonWriter.name("Index");
            awsJsonWriter.value(index);
        }
        if (personDetail.getBoundingBox() != null) {
            BoundingBox boundingBox = personDetail.getBoundingBox();
            awsJsonWriter.name("BoundingBox");
            BoundingBoxJsonMarshaller.getInstance().marshall(boundingBox, awsJsonWriter);
        }
        if (personDetail.getFace() != null) {
            FaceDetail face = personDetail.getFace();
            awsJsonWriter.name("Face");
            FaceDetailJsonMarshaller.getInstance().marshall(face, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
