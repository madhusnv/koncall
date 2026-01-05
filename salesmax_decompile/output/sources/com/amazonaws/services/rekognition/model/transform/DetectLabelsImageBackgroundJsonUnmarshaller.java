package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.DetectLabelsImageBackground;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class DetectLabelsImageBackgroundJsonUnmarshaller implements Unmarshaller<DetectLabelsImageBackground, JsonUnmarshallerContext> {
    private static DetectLabelsImageBackgroundJsonUnmarshaller instance;

    public static DetectLabelsImageBackgroundJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new DetectLabelsImageBackgroundJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public DetectLabelsImageBackground unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DetectLabelsImageBackground detectLabelsImageBackground = new DetectLabelsImageBackground();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("Quality")) {
                detectLabelsImageBackground.setQuality(DetectLabelsImageQualityJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("DominantColors")) {
                detectLabelsImageBackground.setDominantColors(new ListUnmarshaller(DominantColorJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return detectLabelsImageBackground;
    }
}
