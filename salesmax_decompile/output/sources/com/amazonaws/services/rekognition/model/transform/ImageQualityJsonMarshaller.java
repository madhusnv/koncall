package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.ImageQuality;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class ImageQualityJsonMarshaller {
    private static ImageQualityJsonMarshaller instance;

    public static ImageQualityJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new ImageQualityJsonMarshaller();
        }
        return instance;
    }

    public void marshall(ImageQuality imageQuality, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (imageQuality.getBrightness() != null) {
            Float brightness = imageQuality.getBrightness();
            awsJsonWriter.name("Brightness");
            awsJsonWriter.value(brightness);
        }
        if (imageQuality.getSharpness() != null) {
            Float sharpness = imageQuality.getSharpness();
            awsJsonWriter.name("Sharpness");
            awsJsonWriter.value(sharpness);
        }
        awsJsonWriter.endObject();
    }
}
