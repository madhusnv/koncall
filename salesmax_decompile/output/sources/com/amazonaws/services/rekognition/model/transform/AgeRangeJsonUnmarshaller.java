package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.AgeRange;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class AgeRangeJsonUnmarshaller implements Unmarshaller<AgeRange, JsonUnmarshallerContext> {
    private static AgeRangeJsonUnmarshaller instance;

    public static AgeRangeJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new AgeRangeJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public AgeRange unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AgeRange ageRange = new AgeRange();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("Low")) {
                ageRange.setLow(SimpleTypeJsonUnmarshallers.IntegerJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("High")) {
                ageRange.setHigh(SimpleTypeJsonUnmarshallers.IntegerJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return ageRange;
    }
}
