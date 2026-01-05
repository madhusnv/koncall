package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.LabelDetectionSettings;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class LabelDetectionSettingsJsonUnmarshaller implements Unmarshaller<LabelDetectionSettings, JsonUnmarshallerContext> {
    private static LabelDetectionSettingsJsonUnmarshaller instance;

    public static LabelDetectionSettingsJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new LabelDetectionSettingsJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public LabelDetectionSettings unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        LabelDetectionSettings labelDetectionSettings = new LabelDetectionSettings();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("GeneralLabels")) {
                labelDetectionSettings.setGeneralLabels(GeneralLabelsSettingsJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return labelDetectionSettings;
    }
}
