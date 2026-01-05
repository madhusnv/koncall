package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.DominantColor;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class DominantColorJsonMarshaller {
    private static DominantColorJsonMarshaller instance;

    public static DominantColorJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new DominantColorJsonMarshaller();
        }
        return instance;
    }

    public void marshall(DominantColor dominantColor, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (dominantColor.getRed() != null) {
            Integer red = dominantColor.getRed();
            awsJsonWriter.name("Red");
            awsJsonWriter.value(red);
        }
        if (dominantColor.getBlue() != null) {
            Integer blue = dominantColor.getBlue();
            awsJsonWriter.name("Blue");
            awsJsonWriter.value(blue);
        }
        if (dominantColor.getGreen() != null) {
            Integer green = dominantColor.getGreen();
            awsJsonWriter.name("Green");
            awsJsonWriter.value(green);
        }
        if (dominantColor.getHexCode() != null) {
            String hexCode = dominantColor.getHexCode();
            awsJsonWriter.name("HexCode");
            awsJsonWriter.value(hexCode);
        }
        if (dominantColor.getCSSColor() != null) {
            String cSSColor = dominantColor.getCSSColor();
            awsJsonWriter.name("CSSColor");
            awsJsonWriter.value(cSSColor);
        }
        if (dominantColor.getSimplifiedColor() != null) {
            String simplifiedColor = dominantColor.getSimplifiedColor();
            awsJsonWriter.name("SimplifiedColor");
            awsJsonWriter.value(simplifiedColor);
        }
        if (dominantColor.getPixelPercent() != null) {
            Float pixelPercent = dominantColor.getPixelPercent();
            awsJsonWriter.name("PixelPercent");
            awsJsonWriter.value(pixelPercent);
        }
        awsJsonWriter.endObject();
    }
}
