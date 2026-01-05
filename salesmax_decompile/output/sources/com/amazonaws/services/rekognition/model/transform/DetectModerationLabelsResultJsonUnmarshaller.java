package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.DetectModerationLabelsResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
public class DetectModerationLabelsResultJsonUnmarshaller implements Unmarshaller<DetectModerationLabelsResult, JsonUnmarshallerContext> {
    private static DetectModerationLabelsResultJsonUnmarshaller instance;

    public static DetectModerationLabelsResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new DetectModerationLabelsResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public DetectModerationLabelsResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        DetectModerationLabelsResult detectModerationLabelsResult = new DetectModerationLabelsResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("ModerationLabels")) {
                detectModerationLabelsResult.setModerationLabels(new ListUnmarshaller(ModerationLabelJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("ModerationModelVersion")) {
                detectModerationLabelsResult.setModerationModelVersion(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("HumanLoopActivationOutput")) {
                detectModerationLabelsResult.setHumanLoopActivationOutput(HumanLoopActivationOutputJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return detectModerationLabelsResult;
    }
}
