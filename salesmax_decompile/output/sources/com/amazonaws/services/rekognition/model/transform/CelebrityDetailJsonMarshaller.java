package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.auth.policy.internal.JsonDocumentFields;
import com.amazonaws.services.rekognition.model.BoundingBox;
import com.amazonaws.services.rekognition.model.CelebrityDetail;
import com.amazonaws.services.rekognition.model.FaceDetail;
import com.amazonaws.services.rekognition.model.KnownGender;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.List;

/* loaded from: classes5.dex */
class CelebrityDetailJsonMarshaller {
    private static CelebrityDetailJsonMarshaller instance;

    public static CelebrityDetailJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new CelebrityDetailJsonMarshaller();
        }
        return instance;
    }

    public void marshall(CelebrityDetail celebrityDetail, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (celebrityDetail.getUrls() != null) {
            List<String> urls = celebrityDetail.getUrls();
            awsJsonWriter.name("Urls");
            awsJsonWriter.beginArray();
            for (String str : urls) {
                if (str != null) {
                    awsJsonWriter.value(str);
                }
            }
            awsJsonWriter.endArray();
        }
        if (celebrityDetail.getName() != null) {
            String name = celebrityDetail.getName();
            awsJsonWriter.name("Name");
            awsJsonWriter.value(name);
        }
        if (celebrityDetail.getId() != null) {
            String id = celebrityDetail.getId();
            awsJsonWriter.name(JsonDocumentFields.POLICY_ID);
            awsJsonWriter.value(id);
        }
        if (celebrityDetail.getConfidence() != null) {
            Float confidence = celebrityDetail.getConfidence();
            awsJsonWriter.name("Confidence");
            awsJsonWriter.value(confidence);
        }
        if (celebrityDetail.getBoundingBox() != null) {
            BoundingBox boundingBox = celebrityDetail.getBoundingBox();
            awsJsonWriter.name("BoundingBox");
            BoundingBoxJsonMarshaller.getInstance().marshall(boundingBox, awsJsonWriter);
        }
        if (celebrityDetail.getFace() != null) {
            FaceDetail face = celebrityDetail.getFace();
            awsJsonWriter.name("Face");
            FaceDetailJsonMarshaller.getInstance().marshall(face, awsJsonWriter);
        }
        if (celebrityDetail.getKnownGender() != null) {
            KnownGender knownGender = celebrityDetail.getKnownGender();
            awsJsonWriter.name("KnownGender");
            KnownGenderJsonMarshaller.getInstance().marshall(knownGender, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
