package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.ImageQuality;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class ImageQualityJsonUnmarshaller implements Unmarshaller<ImageQuality, JsonUnmarshallerContext> {
    private static ImageQualityJsonUnmarshaller instance;

    public static ImageQualityJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new ImageQualityJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public ImageQuality unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ImageQuality imageQuality = new ImageQuality();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("Brightness")) {
                imageQuality.setBrightness(SimpleTypeJsonUnmarshallers.FloatJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Sharpness")) {
                imageQuality.setSharpness(SimpleTypeJsonUnmarshallers.FloatJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return imageQuality;
    }
}
