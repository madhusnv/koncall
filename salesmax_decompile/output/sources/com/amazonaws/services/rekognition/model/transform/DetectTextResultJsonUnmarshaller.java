package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.DetectTextResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
public class DetectTextResultJsonUnmarshaller implements Unmarshaller<DetectTextResult, JsonUnmarshallerContext> {
    private static DetectTextResultJsonUnmarshaller instance;

    public static DetectTextResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new DetectTextResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public DetectTextResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        DetectTextResult detectTextResult = new DetectTextResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("TextDetections")) {
                detectTextResult.setTextDetections(new ListUnmarshaller(TextDetectionJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("TextModelVersion")) {
                detectTextResult.setTextModelVersion(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return detectTextResult;
    }
}
