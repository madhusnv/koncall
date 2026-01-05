package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.DetectLabelsImagePropertiesSettings;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class DetectLabelsImagePropertiesSettingsJsonUnmarshaller implements Unmarshaller<DetectLabelsImagePropertiesSettings, JsonUnmarshallerContext> {
    private static DetectLabelsImagePropertiesSettingsJsonUnmarshaller instance;

    public static DetectLabelsImagePropertiesSettingsJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new DetectLabelsImagePropertiesSettingsJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public DetectLabelsImagePropertiesSettings unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DetectLabelsImagePropertiesSettings detectLabelsImagePropertiesSettings = new DetectLabelsImagePropertiesSettings();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("MaxDominantColors")) {
                detectLabelsImagePropertiesSettings.setMaxDominantColors(SimpleTypeJsonUnmarshallers.IntegerJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return detectLabelsImagePropertiesSettings;
    }
}
