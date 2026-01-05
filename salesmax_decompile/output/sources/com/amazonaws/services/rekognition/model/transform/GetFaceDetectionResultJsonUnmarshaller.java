package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.GetFaceDetectionResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
public class GetFaceDetectionResultJsonUnmarshaller implements Unmarshaller<GetFaceDetectionResult, JsonUnmarshallerContext> {
    private static GetFaceDetectionResultJsonUnmarshaller instance;

    public static GetFaceDetectionResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new GetFaceDetectionResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public GetFaceDetectionResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        GetFaceDetectionResult getFaceDetectionResult = new GetFaceDetectionResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("JobStatus")) {
                getFaceDetectionResult.setJobStatus(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("StatusMessage")) {
                getFaceDetectionResult.setStatusMessage(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("VideoMetadata")) {
                getFaceDetectionResult.setVideoMetadata(VideoMetadataJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("NextToken")) {
                getFaceDetectionResult.setNextToken(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Faces")) {
                getFaceDetectionResult.setFaces(new ListUnmarshaller(FaceDetectionJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("JobId")) {
                getFaceDetectionResult.setJobId(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Video")) {
                getFaceDetectionResult.setVideo(VideoJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("JobTag")) {
                getFaceDetectionResult.setJobTag(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return getFaceDetectionResult;
    }
}
