package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.GetPersonTrackingResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
public class GetPersonTrackingResultJsonUnmarshaller implements Unmarshaller<GetPersonTrackingResult, JsonUnmarshallerContext> {
    private static GetPersonTrackingResultJsonUnmarshaller instance;

    public static GetPersonTrackingResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new GetPersonTrackingResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public GetPersonTrackingResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        GetPersonTrackingResult getPersonTrackingResult = new GetPersonTrackingResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("JobStatus")) {
                getPersonTrackingResult.setJobStatus(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("StatusMessage")) {
                getPersonTrackingResult.setStatusMessage(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("VideoMetadata")) {
                getPersonTrackingResult.setVideoMetadata(VideoMetadataJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("NextToken")) {
                getPersonTrackingResult.setNextToken(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Persons")) {
                getPersonTrackingResult.setPersons(new ListUnmarshaller(PersonDetectionJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("JobId")) {
                getPersonTrackingResult.setJobId(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Video")) {
                getPersonTrackingResult.setVideo(VideoJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("JobTag")) {
                getPersonTrackingResult.setJobTag(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return getPersonTrackingResult;
    }
}
