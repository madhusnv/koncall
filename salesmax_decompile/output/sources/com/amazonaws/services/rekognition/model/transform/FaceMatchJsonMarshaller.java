package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.Face;
import com.amazonaws.services.rekognition.model.FaceMatch;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class FaceMatchJsonMarshaller {
    private static FaceMatchJsonMarshaller instance;

    public static FaceMatchJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new FaceMatchJsonMarshaller();
        }
        return instance;
    }

    public void marshall(FaceMatch faceMatch, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (faceMatch.getSimilarity() != null) {
            Float similarity = faceMatch.getSimilarity();
            awsJsonWriter.name("Similarity");
            awsJsonWriter.value(similarity);
        }
        if (faceMatch.getFace() != null) {
            Face face = faceMatch.getFace();
            awsJsonWriter.name("Face");
            FaceJsonMarshaller.getInstance().marshall(face, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
