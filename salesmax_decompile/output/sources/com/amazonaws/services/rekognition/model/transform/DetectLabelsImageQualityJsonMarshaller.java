package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.DetectLabelsImageQuality;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class DetectLabelsImageQualityJsonMarshaller {
    private static DetectLabelsImageQualityJsonMarshaller instance;

    public static DetectLabelsImageQualityJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new DetectLabelsImageQualityJsonMarshaller();
        }
        return instance;
    }

    public void marshall(DetectLabelsImageQuality detectLabelsImageQuality, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (detectLabelsImageQuality.getBrightness() != null) {
            Float brightness = detectLabelsImageQuality.getBrightness();
            awsJsonWriter.name("Brightness");
            awsJsonWriter.value(brightness);
        }
        if (detectLabelsImageQuality.getSharpness() != null) {
            Float sharpness = detectLabelsImageQuality.getSharpness();
            awsJsonWriter.name("Sharpness");
            awsJsonWriter.value(sharpness);
        }
        if (detectLabelsImageQuality.getContrast() != null) {
            Float contrast = detectLabelsImageQuality.getContrast();
            awsJsonWriter.name("Contrast");
            awsJsonWriter.value(contrast);
        }
        awsJsonWriter.endObject();
    }
}
