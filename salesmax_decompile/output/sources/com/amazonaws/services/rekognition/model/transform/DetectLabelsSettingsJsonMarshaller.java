package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.DetectLabelsImagePropertiesSettings;
import com.amazonaws.services.rekognition.model.DetectLabelsSettings;
import com.amazonaws.services.rekognition.model.GeneralLabelsSettings;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class DetectLabelsSettingsJsonMarshaller {
    private static DetectLabelsSettingsJsonMarshaller instance;

    public static DetectLabelsSettingsJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new DetectLabelsSettingsJsonMarshaller();
        }
        return instance;
    }

    public void marshall(DetectLabelsSettings detectLabelsSettings, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (detectLabelsSettings.getGeneralLabels() != null) {
            GeneralLabelsSettings generalLabels = detectLabelsSettings.getGeneralLabels();
            awsJsonWriter.name("GeneralLabels");
            GeneralLabelsSettingsJsonMarshaller.getInstance().marshall(generalLabels, awsJsonWriter);
        }
        if (detectLabelsSettings.getImageProperties() != null) {
            DetectLabelsImagePropertiesSettings imageProperties = detectLabelsSettings.getImageProperties();
            awsJsonWriter.name("ImageProperties");
            DetectLabelsImagePropertiesSettingsJsonMarshaller.getInstance().marshall(imageProperties, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
