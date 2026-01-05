package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.DetectLabelsImageBackground;
import com.amazonaws.services.rekognition.model.DetectLabelsImageQuality;
import com.amazonaws.services.rekognition.model.DominantColor;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.List;

/* loaded from: classes5.dex */
class DetectLabelsImageBackgroundJsonMarshaller {
    private static DetectLabelsImageBackgroundJsonMarshaller instance;

    public static DetectLabelsImageBackgroundJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new DetectLabelsImageBackgroundJsonMarshaller();
        }
        return instance;
    }

    public void marshall(DetectLabelsImageBackground detectLabelsImageBackground, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (detectLabelsImageBackground.getQuality() != null) {
            DetectLabelsImageQuality quality = detectLabelsImageBackground.getQuality();
            awsJsonWriter.name("Quality");
            DetectLabelsImageQualityJsonMarshaller.getInstance().marshall(quality, awsJsonWriter);
        }
        if (detectLabelsImageBackground.getDominantColors() != null) {
            List<DominantColor> dominantColors = detectLabelsImageBackground.getDominantColors();
            awsJsonWriter.name("DominantColors");
            awsJsonWriter.beginArray();
            for (DominantColor dominantColor : dominantColors) {
                if (dominantColor != null) {
                    DominantColorJsonMarshaller.getInstance().marshall(dominantColor, awsJsonWriter);
                }
            }
            awsJsonWriter.endArray();
        }
        awsJsonWriter.endObject();
    }
}
