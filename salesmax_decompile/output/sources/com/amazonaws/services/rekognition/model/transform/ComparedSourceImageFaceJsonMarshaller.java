package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.BoundingBox;
import com.amazonaws.services.rekognition.model.ComparedSourceImageFace;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class ComparedSourceImageFaceJsonMarshaller {
    private static ComparedSourceImageFaceJsonMarshaller instance;

    public static ComparedSourceImageFaceJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new ComparedSourceImageFaceJsonMarshaller();
        }
        return instance;
    }

    public void marshall(ComparedSourceImageFace comparedSourceImageFace, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (comparedSourceImageFace.getBoundingBox() != null) {
            BoundingBox boundingBox = comparedSourceImageFace.getBoundingBox();
            awsJsonWriter.name("BoundingBox");
            BoundingBoxJsonMarshaller.getInstance().marshall(boundingBox, awsJsonWriter);
        }
        if (comparedSourceImageFace.getConfidence() != null) {
            Float confidence = comparedSourceImageFace.getConfidence();
            awsJsonWriter.name("Confidence");
            awsJsonWriter.value(confidence);
        }
        awsJsonWriter.endObject();
    }
}
