package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.AgeRange;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class AgeRangeJsonMarshaller {
    private static AgeRangeJsonMarshaller instance;

    public static AgeRangeJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new AgeRangeJsonMarshaller();
        }
        return instance;
    }

    public void marshall(AgeRange ageRange, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (ageRange.getLow() != null) {
            Integer low = ageRange.getLow();
            awsJsonWriter.name("Low");
            awsJsonWriter.value(low);
        }
        if (ageRange.getHigh() != null) {
            Integer high = ageRange.getHigh();
            awsJsonWriter.name("High");
            awsJsonWriter.value(high);
        }
        awsJsonWriter.endObject();
    }
}
