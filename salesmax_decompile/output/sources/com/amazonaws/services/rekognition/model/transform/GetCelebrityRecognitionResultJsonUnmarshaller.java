package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.GetCelebrityRecognitionResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
public class GetCelebrityRecognitionResultJsonUnmarshaller implements Unmarshaller<GetCelebrityRecognitionResult, JsonUnmarshallerContext> {
    private static GetCelebrityRecognitionResultJsonUnmarshaller instance;

    public static GetCelebrityRecognitionResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new GetCelebrityRecognitionResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public GetCelebrityRecognitionResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        GetCelebrityRecognitionResult getCelebrityRecognitionResult = new GetCelebrityRecognitionResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("JobStatus")) {
                getCelebrityRecognitionResult.setJobStatus(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("StatusMessage")) {
                getCelebrityRecognitionResult.setStatusMessage(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("VideoMetadata")) {
                getCelebrityRecognitionResult.setVideoMetadata(VideoMetadataJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("NextToken")) {
                getCelebrityRecognitionResult.setNextToken(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Celebrities")) {
                getCelebrityRecognitionResult.setCelebrities(new ListUnmarshaller(CelebrityRecognitionJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("JobId")) {
                getCelebrityRecognitionResult.setJobId(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Video")) {
                getCelebrityRecognitionResult.setVideo(VideoJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("JobTag")) {
                getCelebrityRecognitionResult.setJobTag(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return getCelebrityRecognitionResult;
    }
}
