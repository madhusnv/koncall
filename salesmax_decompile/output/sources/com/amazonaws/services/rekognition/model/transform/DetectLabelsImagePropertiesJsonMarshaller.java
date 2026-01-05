package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.DetectLabelsImageBackground;
import com.amazonaws.services.rekognition.model.DetectLabelsImageForeground;
import com.amazonaws.services.rekognition.model.DetectLabelsImageProperties;
import com.amazonaws.services.rekognition.model.DetectLabelsImageQuality;
import com.amazonaws.services.rekognition.model.DominantColor;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.List;

/* loaded from: classes5.dex */
class DetectLabelsImagePropertiesJsonMarshaller {
    private static DetectLabelsImagePropertiesJsonMarshaller instance;

    public static DetectLabelsImagePropertiesJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new DetectLabelsImagePropertiesJsonMarshaller();
        }
        return instance;
    }

    public void marshall(DetectLabelsImageProperties detectLabelsImageProperties, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (detectLabelsImageProperties.getQuality() != null) {
            DetectLabelsImageQuality quality = detectLabelsImageProperties.getQuality();
            awsJsonWriter.name("Quality");
            DetectLabelsImageQualityJsonMarshaller.getInstance().marshall(quality, awsJsonWriter);
        }
        if (detectLabelsImageProperties.getDominantColors() != null) {
            List<DominantColor> dominantColors = detectLabelsImageProperties.getDominantColors();
            awsJsonWriter.name("DominantColors");
            awsJsonWriter.beginArray();
            for (DominantColor dominantColor : dominantColors) {
                if (dominantColor != null) {
                    DominantColorJsonMarshaller.getInstance().marshall(dominantColor, awsJsonWriter);
                }
            }
            awsJsonWriter.endArray();
        }
        if (detectLabelsImageProperties.getForeground() != null) {
            DetectLabelsImageForeground foreground = detectLabelsImageProperties.getForeground();
            awsJsonWriter.name("Foreground");
            DetectLabelsImageForegroundJsonMarshaller.getInstance().marshall(foreground, awsJsonWriter);
        }
        if (detectLabelsImageProperties.getBackground() != null) {
            DetectLabelsImageBackground background = detectLabelsImageProperties.getBackground();
            awsJsonWriter.name("Background");
            DetectLabelsImageBackgroundJsonMarshaller.getInstance().marshall(background, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
