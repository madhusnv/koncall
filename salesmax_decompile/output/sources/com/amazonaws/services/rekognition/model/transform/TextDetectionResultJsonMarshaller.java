package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.TextDetection;
import com.amazonaws.services.rekognition.model.TextDetectionResult;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class TextDetectionResultJsonMarshaller {
    private static TextDetectionResultJsonMarshaller instance;

    public static TextDetectionResultJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new TextDetectionResultJsonMarshaller();
        }
        return instance;
    }

    public void marshall(TextDetectionResult textDetectionResult, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (textDetectionResult.getTimestamp() != null) {
            Long timestamp = textDetectionResult.getTimestamp();
            awsJsonWriter.name("Timestamp");
            awsJsonWriter.value(timestamp);
        }
        if (textDetectionResult.getTextDetection() != null) {
            TextDetection textDetection = textDetectionResult.getTextDetection();
            awsJsonWriter.name("TextDetection");
            TextDetectionJsonMarshaller.getInstance().marshall(textDetection, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
