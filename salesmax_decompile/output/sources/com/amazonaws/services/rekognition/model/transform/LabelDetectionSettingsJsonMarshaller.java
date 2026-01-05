package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.GeneralLabelsSettings;
import com.amazonaws.services.rekognition.model.LabelDetectionSettings;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class LabelDetectionSettingsJsonMarshaller {
    private static LabelDetectionSettingsJsonMarshaller instance;

    public static LabelDetectionSettingsJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new LabelDetectionSettingsJsonMarshaller();
        }
        return instance;
    }

    public void marshall(LabelDetectionSettings labelDetectionSettings, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (labelDetectionSettings.getGeneralLabels() != null) {
            GeneralLabelsSettings generalLabels = labelDetectionSettings.getGeneralLabels();
            awsJsonWriter.name("GeneralLabels");
            GeneralLabelsSettingsJsonMarshaller.getInstance().marshall(generalLabels, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
