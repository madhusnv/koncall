package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.DetectLabelsImageProperties;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class DetectLabelsImagePropertiesJsonUnmarshaller implements Unmarshaller<DetectLabelsImageProperties, JsonUnmarshallerContext> {
    private static DetectLabelsImagePropertiesJsonUnmarshaller instance;

    public static DetectLabelsImagePropertiesJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new DetectLabelsImagePropertiesJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public DetectLabelsImageProperties unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DetectLabelsImageProperties detectLabelsImageProperties = new DetectLabelsImageProperties();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("Quality")) {
                detectLabelsImageProperties.setQuality(DetectLabelsImageQualityJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("DominantColors")) {
                detectLabelsImageProperties.setDominantColors(new ListUnmarshaller(DominantColorJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Foreground")) {
                detectLabelsImageProperties.setForeground(DetectLabelsImageForegroundJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Background")) {
                detectLabelsImageProperties.setBackground(DetectLabelsImageBackgroundJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return detectLabelsImageProperties;
    }
}
