package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.CelebrityRecognition;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class CelebrityRecognitionJsonUnmarshaller implements Unmarshaller<CelebrityRecognition, JsonUnmarshallerContext> {
    private static CelebrityRecognitionJsonUnmarshaller instance;

    public static CelebrityRecognitionJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new CelebrityRecognitionJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public CelebrityRecognition unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        CelebrityRecognition celebrityRecognition = new CelebrityRecognition();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("Timestamp")) {
                celebrityRecognition.setTimestamp(SimpleTypeJsonUnmarshallers.LongJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Celebrity")) {
                celebrityRecognition.setCelebrity(CelebrityDetailJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return celebrityRecognition;
    }
}
