package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.DetectionFilter;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class DetectionFilterJsonUnmarshaller implements Unmarshaller<DetectionFilter, JsonUnmarshallerContext> {
    private static DetectionFilterJsonUnmarshaller instance;

    public static DetectionFilterJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new DetectionFilterJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public DetectionFilter unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DetectionFilter detectionFilter = new DetectionFilter();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("MinConfidence")) {
                detectionFilter.setMinConfidence(SimpleTypeJsonUnmarshallers.FloatJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("MinBoundingBoxHeight")) {
                detectionFilter.setMinBoundingBoxHeight(SimpleTypeJsonUnmarshallers.FloatJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("MinBoundingBoxWidth")) {
                detectionFilter.setMinBoundingBoxWidth(SimpleTypeJsonUnmarshallers.FloatJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return detectionFilter;
    }
}
