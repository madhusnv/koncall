package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.CompareFacesResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
public class CompareFacesResultJsonUnmarshaller implements Unmarshaller<CompareFacesResult, JsonUnmarshallerContext> {
    private static CompareFacesResultJsonUnmarshaller instance;

    public static CompareFacesResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new CompareFacesResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public CompareFacesResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        CompareFacesResult compareFacesResult = new CompareFacesResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("SourceImageFace")) {
                compareFacesResult.setSourceImageFace(ComparedSourceImageFaceJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("FaceMatches")) {
                compareFacesResult.setFaceMatches(new ListUnmarshaller(CompareFacesMatchJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("UnmatchedFaces")) {
                compareFacesResult.setUnmatchedFaces(new ListUnmarshaller(ComparedFaceJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("SourceImageOrientationCorrection")) {
                compareFacesResult.setSourceImageOrientationCorrection(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("TargetImageOrientationCorrection")) {
                compareFacesResult.setTargetImageOrientationCorrection(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return compareFacesResult;
    }
}
