package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.GetFaceSearchResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
public class GetFaceSearchResultJsonUnmarshaller implements Unmarshaller<GetFaceSearchResult, JsonUnmarshallerContext> {
    private static GetFaceSearchResultJsonUnmarshaller instance;

    public static GetFaceSearchResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new GetFaceSearchResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public GetFaceSearchResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        GetFaceSearchResult getFaceSearchResult = new GetFaceSearchResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("JobStatus")) {
                getFaceSearchResult.setJobStatus(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("StatusMessage")) {
                getFaceSearchResult.setStatusMessage(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("NextToken")) {
                getFaceSearchResult.setNextToken(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("VideoMetadata")) {
                getFaceSearchResult.setVideoMetadata(VideoMetadataJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Persons")) {
                getFaceSearchResult.setPersons(new ListUnmarshaller(PersonMatchJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("JobId")) {
                getFaceSearchResult.setJobId(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Video")) {
                getFaceSearchResult.setVideo(VideoJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("JobTag")) {
                getFaceSearchResult.setJobTag(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return getFaceSearchResult;
    }
}
