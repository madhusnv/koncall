package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.SegmentDetection;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class SegmentDetectionJsonUnmarshaller implements Unmarshaller<SegmentDetection, JsonUnmarshallerContext> {
    private static SegmentDetectionJsonUnmarshaller instance;

    public static SegmentDetectionJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new SegmentDetectionJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public SegmentDetection unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        SegmentDetection segmentDetection = new SegmentDetection();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("Type")) {
                segmentDetection.setType(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("StartTimestampMillis")) {
                segmentDetection.setStartTimestampMillis(SimpleTypeJsonUnmarshallers.LongJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("EndTimestampMillis")) {
                segmentDetection.setEndTimestampMillis(SimpleTypeJsonUnmarshallers.LongJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("DurationMillis")) {
                segmentDetection.setDurationMillis(SimpleTypeJsonUnmarshallers.LongJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("StartTimecodeSMPTE")) {
                segmentDetection.setStartTimecodeSMPTE(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("EndTimecodeSMPTE")) {
                segmentDetection.setEndTimecodeSMPTE(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("DurationSMPTE")) {
                segmentDetection.setDurationSMPTE(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("TechnicalCueSegment")) {
                segmentDetection.setTechnicalCueSegment(TechnicalCueSegmentJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("ShotSegment")) {
                segmentDetection.setShotSegment(ShotSegmentJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("StartFrameNumber")) {
                segmentDetection.setStartFrameNumber(SimpleTypeJsonUnmarshallers.LongJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("EndFrameNumber")) {
                segmentDetection.setEndFrameNumber(SimpleTypeJsonUnmarshallers.LongJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("DurationFrames")) {
                segmentDetection.setDurationFrames(SimpleTypeJsonUnmarshallers.LongJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return segmentDetection;
    }
}
