package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.LabelDetection;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class LabelDetectionJsonUnmarshaller implements Unmarshaller<LabelDetection, JsonUnmarshallerContext> {
    private static LabelDetectionJsonUnmarshaller instance;

    public static LabelDetectionJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new LabelDetectionJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public LabelDetection unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        LabelDetection labelDetection = new LabelDetection();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("Timestamp")) {
                labelDetection.setTimestamp(SimpleTypeJsonUnmarshallers.LongJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Label")) {
                labelDetection.setLabel(LabelJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("StartTimestampMillis")) {
                labelDetection.setStartTimestampMillis(SimpleTypeJsonUnmarshallers.LongJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("EndTimestampMillis")) {
                labelDetection.setEndTimestampMillis(SimpleTypeJsonUnmarshallers.LongJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("DurationMillis")) {
                labelDetection.setDurationMillis(SimpleTypeJsonUnmarshallers.LongJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return labelDetection;
    }
}
