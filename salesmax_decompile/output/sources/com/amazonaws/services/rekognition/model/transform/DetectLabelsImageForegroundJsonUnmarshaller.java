package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.DetectLabelsImageForeground;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class DetectLabelsImageForegroundJsonUnmarshaller implements Unmarshaller<DetectLabelsImageForeground, JsonUnmarshallerContext> {
    private static DetectLabelsImageForegroundJsonUnmarshaller instance;

    public static DetectLabelsImageForegroundJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new DetectLabelsImageForegroundJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public DetectLabelsImageForeground unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DetectLabelsImageForeground detectLabelsImageForeground = new DetectLabelsImageForeground();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("Quality")) {
                detectLabelsImageForeground.setQuality(DetectLabelsImageQualityJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("DominantColors")) {
                detectLabelsImageForeground.setDominantColors(new ListUnmarshaller(DominantColorJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return detectLabelsImageForeground;
    }
}
