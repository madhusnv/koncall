package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.DetectCustomLabelsResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
public class DetectCustomLabelsResultJsonUnmarshaller implements Unmarshaller<DetectCustomLabelsResult, JsonUnmarshallerContext> {
    private static DetectCustomLabelsResultJsonUnmarshaller instance;

    public static DetectCustomLabelsResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new DetectCustomLabelsResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public DetectCustomLabelsResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        DetectCustomLabelsResult detectCustomLabelsResult = new DetectCustomLabelsResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("CustomLabels")) {
                detectCustomLabelsResult.setCustomLabels(new ListUnmarshaller(CustomLabelJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return detectCustomLabelsResult;
    }
}
