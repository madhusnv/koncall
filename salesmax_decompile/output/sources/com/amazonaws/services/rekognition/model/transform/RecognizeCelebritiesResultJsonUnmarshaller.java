package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.RecognizeCelebritiesResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
public class RecognizeCelebritiesResultJsonUnmarshaller implements Unmarshaller<RecognizeCelebritiesResult, JsonUnmarshallerContext> {
    private static RecognizeCelebritiesResultJsonUnmarshaller instance;

    public static RecognizeCelebritiesResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new RecognizeCelebritiesResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public RecognizeCelebritiesResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        RecognizeCelebritiesResult recognizeCelebritiesResult = new RecognizeCelebritiesResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("CelebrityFaces")) {
                recognizeCelebritiesResult.setCelebrityFaces(new ListUnmarshaller(CelebrityJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("UnrecognizedFaces")) {
                recognizeCelebritiesResult.setUnrecognizedFaces(new ListUnmarshaller(ComparedFaceJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("OrientationCorrection")) {
                recognizeCelebritiesResult.setOrientationCorrection(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return recognizeCelebritiesResult;
    }
}
