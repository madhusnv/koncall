package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.CelebrityDetail;
import com.amazonaws.services.rekognition.model.CelebrityRecognition;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class CelebrityRecognitionJsonMarshaller {
    private static CelebrityRecognitionJsonMarshaller instance;

    public static CelebrityRecognitionJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new CelebrityRecognitionJsonMarshaller();
        }
        return instance;
    }

    public void marshall(CelebrityRecognition celebrityRecognition, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (celebrityRecognition.getTimestamp() != null) {
            Long timestamp = celebrityRecognition.getTimestamp();
            awsJsonWriter.name("Timestamp");
            awsJsonWriter.value(timestamp);
        }
        if (celebrityRecognition.getCelebrity() != null) {
            CelebrityDetail celebrity = celebrityRecognition.getCelebrity();
            awsJsonWriter.name("Celebrity");
            CelebrityDetailJsonMarshaller.getInstance().marshall(celebrity, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
