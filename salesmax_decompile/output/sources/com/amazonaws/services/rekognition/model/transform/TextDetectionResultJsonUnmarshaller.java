package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.TextDetectionResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class TextDetectionResultJsonUnmarshaller implements Unmarshaller<TextDetectionResult, JsonUnmarshallerContext> {
    private static TextDetectionResultJsonUnmarshaller instance;

    public static TextDetectionResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new TextDetectionResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public TextDetectionResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        TextDetectionResult textDetectionResult = new TextDetectionResult();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("Timestamp")) {
                textDetectionResult.setTimestamp(SimpleTypeJsonUnmarshallers.LongJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("TextDetection")) {
                textDetectionResult.setTextDetection(TextDetectionJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return textDetectionResult;
    }
}
