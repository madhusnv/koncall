package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.GetSegmentDetectionResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
public class GetSegmentDetectionResultJsonUnmarshaller implements Unmarshaller<GetSegmentDetectionResult, JsonUnmarshallerContext> {
    private static GetSegmentDetectionResultJsonUnmarshaller instance;

    public static GetSegmentDetectionResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new GetSegmentDetectionResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public GetSegmentDetectionResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        GetSegmentDetectionResult getSegmentDetectionResult = new GetSegmentDetectionResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("JobStatus")) {
                getSegmentDetectionResult.setJobStatus(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("StatusMessage")) {
                getSegmentDetectionResult.setStatusMessage(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("VideoMetadata")) {
                getSegmentDetectionResult.setVideoMetadata(new ListUnmarshaller(VideoMetadataJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("AudioMetadata")) {
                getSegmentDetectionResult.setAudioMetadata(new ListUnmarshaller(AudioMetadataJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("NextToken")) {
                getSegmentDetectionResult.setNextToken(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Segments")) {
                getSegmentDetectionResult.setSegments(new ListUnmarshaller(SegmentDetectionJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("SelectedSegmentTypes")) {
                getSegmentDetectionResult.setSelectedSegmentTypes(new ListUnmarshaller(SegmentTypeInfoJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("JobId")) {
                getSegmentDetectionResult.setJobId(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Video")) {
                getSegmentDetectionResult.setVideo(VideoJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("JobTag")) {
                getSegmentDetectionResult.setJobTag(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return getSegmentDetectionResult;
    }
}
