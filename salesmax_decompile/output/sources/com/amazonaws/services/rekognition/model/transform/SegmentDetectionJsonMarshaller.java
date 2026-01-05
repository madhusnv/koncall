package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.SegmentDetection;
import com.amazonaws.services.rekognition.model.ShotSegment;
import com.amazonaws.services.rekognition.model.TechnicalCueSegment;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class SegmentDetectionJsonMarshaller {
    private static SegmentDetectionJsonMarshaller instance;

    public static SegmentDetectionJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new SegmentDetectionJsonMarshaller();
        }
        return instance;
    }

    public void marshall(SegmentDetection segmentDetection, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (segmentDetection.getType() != null) {
            String type2 = segmentDetection.getType();
            awsJsonWriter.name("Type");
            awsJsonWriter.value(type2);
        }
        if (segmentDetection.getStartTimestampMillis() != null) {
            Long startTimestampMillis = segmentDetection.getStartTimestampMillis();
            awsJsonWriter.name("StartTimestampMillis");
            awsJsonWriter.value(startTimestampMillis);
        }
        if (segmentDetection.getEndTimestampMillis() != null) {
            Long endTimestampMillis = segmentDetection.getEndTimestampMillis();
            awsJsonWriter.name("EndTimestampMillis");
            awsJsonWriter.value(endTimestampMillis);
        }
        if (segmentDetection.getDurationMillis() != null) {
            Long durationMillis = segmentDetection.getDurationMillis();
            awsJsonWriter.name("DurationMillis");
            awsJsonWriter.value(durationMillis);
        }
        if (segmentDetection.getStartTimecodeSMPTE() != null) {
            String startTimecodeSMPTE = segmentDetection.getStartTimecodeSMPTE();
            awsJsonWriter.name("StartTimecodeSMPTE");
            awsJsonWriter.value(startTimecodeSMPTE);
        }
        if (segmentDetection.getEndTimecodeSMPTE() != null) {
            String endTimecodeSMPTE = segmentDetection.getEndTimecodeSMPTE();
            awsJsonWriter.name("EndTimecodeSMPTE");
            awsJsonWriter.value(endTimecodeSMPTE);
        }
        if (segmentDetection.getDurationSMPTE() != null) {
            String durationSMPTE = segmentDetection.getDurationSMPTE();
            awsJsonWriter.name("DurationSMPTE");
            awsJsonWriter.value(durationSMPTE);
        }
        if (segmentDetection.getTechnicalCueSegment() != null) {
            TechnicalCueSegment technicalCueSegment = segmentDetection.getTechnicalCueSegment();
            awsJsonWriter.name("TechnicalCueSegment");
            TechnicalCueSegmentJsonMarshaller.getInstance().marshall(technicalCueSegment, awsJsonWriter);
        }
        if (segmentDetection.getShotSegment() != null) {
            ShotSegment shotSegment = segmentDetection.getShotSegment();
            awsJsonWriter.name("ShotSegment");
            ShotSegmentJsonMarshaller.getInstance().marshall(shotSegment, awsJsonWriter);
        }
        if (segmentDetection.getStartFrameNumber() != null) {
            Long startFrameNumber = segmentDetection.getStartFrameNumber();
            awsJsonWriter.name("StartFrameNumber");
            awsJsonWriter.value(startFrameNumber);
        }
        if (segmentDetection.getEndFrameNumber() != null) {
            Long endFrameNumber = segmentDetection.getEndFrameNumber();
            awsJsonWriter.name("EndFrameNumber");
            awsJsonWriter.value(endFrameNumber);
        }
        if (segmentDetection.getDurationFrames() != null) {
            Long durationFrames = segmentDetection.getDurationFrames();
            awsJsonWriter.name("DurationFrames");
            awsJsonWriter.value(durationFrames);
        }
        awsJsonWriter.endObject();
    }
}
