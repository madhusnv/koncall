package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.CompareFacesMatch;
import com.amazonaws.services.rekognition.model.ComparedFace;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class CompareFacesMatchJsonMarshaller {
    private static CompareFacesMatchJsonMarshaller instance;

    public static CompareFacesMatchJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new CompareFacesMatchJsonMarshaller();
        }
        return instance;
    }

    public void marshall(CompareFacesMatch compareFacesMatch, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (compareFacesMatch.getSimilarity() != null) {
            Float similarity = compareFacesMatch.getSimilarity();
            awsJsonWriter.name("Similarity");
            awsJsonWriter.value(similarity);
        }
        if (compareFacesMatch.getFace() != null) {
            ComparedFace face = compareFacesMatch.getFace();
            awsJsonWriter.name("Face");
            ComparedFaceJsonMarshaller.getInstance().marshall(face, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
