package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.DetectLabelsSettings;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class DetectLabelsSettingsJsonUnmarshaller implements Unmarshaller<DetectLabelsSettings, JsonUnmarshallerContext> {
    private static DetectLabelsSettingsJsonUnmarshaller instance;

    public static DetectLabelsSettingsJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new DetectLabelsSettingsJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public DetectLabelsSettings unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DetectLabelsSettings detectLabelsSettings = new DetectLabelsSettings();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("GeneralLabels")) {
                detectLabelsSettings.setGeneralLabels(GeneralLabelsSettingsJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("ImageProperties")) {
                detectLabelsSettings.setImageProperties(DetectLabelsImagePropertiesSettingsJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return detectLabelsSettings;
    }
}
