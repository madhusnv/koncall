package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.auth.policy.internal.JsonDocumentFields;
import com.amazonaws.services.rekognition.model.Celebrity;
import com.amazonaws.services.rekognition.model.ComparedFace;
import com.amazonaws.services.rekognition.model.KnownGender;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.List;

/* loaded from: classes5.dex */
class CelebrityJsonMarshaller {
    private static CelebrityJsonMarshaller instance;

    public static CelebrityJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new CelebrityJsonMarshaller();
        }
        return instance;
    }

    public void marshall(Celebrity celebrity, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (celebrity.getUrls() != null) {
            List<String> urls = celebrity.getUrls();
            awsJsonWriter.name("Urls");
            awsJsonWriter.beginArray();
            for (String str : urls) {
                if (str != null) {
                    awsJsonWriter.value(str);
                }
            }
            awsJsonWriter.endArray();
        }
        if (celebrity.getName() != null) {
            String name = celebrity.getName();
            awsJsonWriter.name("Name");
            awsJsonWriter.value(name);
        }
        if (celebrity.getId() != null) {
            String id = celebrity.getId();
            awsJsonWriter.name(JsonDocumentFields.POLICY_ID);
            awsJsonWriter.value(id);
        }
        if (celebrity.getFace() != null) {
            ComparedFace face = celebrity.getFace();
            awsJsonWriter.name("Face");
            ComparedFaceJsonMarshaller.getInstance().marshall(face, awsJsonWriter);
        }
        if (celebrity.getMatchConfidence() != null) {
            Float matchConfidence = celebrity.getMatchConfidence();
            awsJsonWriter.name("MatchConfidence");
            awsJsonWriter.value(matchConfidence);
        }
        if (celebrity.getKnownGender() != null) {
            KnownGender knownGender = celebrity.getKnownGender();
            awsJsonWriter.name("KnownGender");
            KnownGenderJsonMarshaller.getInstance().marshall(knownGender, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
