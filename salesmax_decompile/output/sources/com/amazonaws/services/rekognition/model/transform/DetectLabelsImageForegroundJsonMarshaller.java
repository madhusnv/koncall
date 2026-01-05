package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.DetectLabelsImageForeground;
import com.amazonaws.services.rekognition.model.DetectLabelsImageQuality;
import com.amazonaws.services.rekognition.model.DominantColor;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.List;

/* loaded from: classes5.dex */
class DetectLabelsImageForegroundJsonMarshaller {
    private static DetectLabelsImageForegroundJsonMarshaller instance;

    public static DetectLabelsImageForegroundJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new DetectLabelsImageForegroundJsonMarshaller();
        }
        return instance;
    }

    public void marshall(DetectLabelsImageForeground detectLabelsImageForeground, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (detectLabelsImageForeground.getQuality() != null) {
            DetectLabelsImageQuality quality = detectLabelsImageForeground.getQuality();
            awsJsonWriter.name("Quality");
            DetectLabelsImageQualityJsonMarshaller.getInstance().marshall(quality, awsJsonWriter);
        }
        if (detectLabelsImageForeground.getDominantColors() != null) {
            List<DominantColor> dominantColors = detectLabelsImageForeground.getDominantColors();
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
