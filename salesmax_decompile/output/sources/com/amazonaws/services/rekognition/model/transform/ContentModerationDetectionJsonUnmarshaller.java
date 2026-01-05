package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.ContentModerationDetection;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class ContentModerationDetectionJsonUnmarshaller implements Unmarshaller<ContentModerationDetection, JsonUnmarshallerContext> {
    private static ContentModerationDetectionJsonUnmarshaller instance;

    public static ContentModerationDetectionJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new ContentModerationDetectionJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public ContentModerationDetection unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ContentModerationDetection contentModerationDetection = new ContentModerationDetection();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("Timestamp")) {
                contentModerationDetection.setTimestamp(SimpleTypeJsonUnmarshallers.LongJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("ModerationLabel")) {
                contentModerationDetection.setModerationLabel(ModerationLabelJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("StartTimestampMillis")) {
                contentModerationDetection.setStartTimestampMillis(SimpleTypeJsonUnmarshallers.LongJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("EndTimestampMillis")) {
                contentModerationDetection.setEndTimestampMillis(SimpleTypeJsonUnmarshallers.LongJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("DurationMillis")) {
                contentModerationDetection.setDurationMillis(SimpleTypeJsonUnmarshallers.LongJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return contentModerationDetection;
    }
}
