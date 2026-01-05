package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.DetectLabelsResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
public class DetectLabelsResultJsonUnmarshaller implements Unmarshaller<DetectLabelsResult, JsonUnmarshallerContext> {
    private static DetectLabelsResultJsonUnmarshaller instance;

    public static DetectLabelsResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new DetectLabelsResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public DetectLabelsResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        DetectLabelsResult detectLabelsResult = new DetectLabelsResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("Labels")) {
                detectLabelsResult.setLabels(new ListUnmarshaller(LabelJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("OrientationCorrection")) {
                detectLabelsResult.setOrientationCorrection(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("LabelModelVersion")) {
                detectLabelsResult.setLabelModelVersion(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("ImageProperties")) {
                detectLabelsResult.setImageProperties(DetectLabelsImagePropertiesJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return detectLabelsResult;
    }
}
