package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.DetectLabelsImagePropertiesSettings;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class DetectLabelsImagePropertiesSettingsJsonMarshaller {
    private static DetectLabelsImagePropertiesSettingsJsonMarshaller instance;

    public static DetectLabelsImagePropertiesSettingsJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new DetectLabelsImagePropertiesSettingsJsonMarshaller();
        }
        return instance;
    }

    public void marshall(DetectLabelsImagePropertiesSettings detectLabelsImagePropertiesSettings, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (detectLabelsImagePropertiesSettings.getMaxDominantColors() != null) {
            Integer maxDominantColors = detectLabelsImagePropertiesSettings.getMaxDominantColors();
            awsJsonWriter.name("MaxDominantColors");
            awsJsonWriter.value(maxDominantColors);
        }
        awsJsonWriter.endObject();
    }
}
