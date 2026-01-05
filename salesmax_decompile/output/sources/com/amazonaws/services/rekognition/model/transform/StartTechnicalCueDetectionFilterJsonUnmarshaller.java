package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.StartTechnicalCueDetectionFilter;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class StartTechnicalCueDetectionFilterJsonUnmarshaller implements Unmarshaller<StartTechnicalCueDetectionFilter, JsonUnmarshallerContext> {
    private static StartTechnicalCueDetectionFilterJsonUnmarshaller instance;

    public static StartTechnicalCueDetectionFilterJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new StartTechnicalCueDetectionFilterJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public StartTechnicalCueDetectionFilter unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        StartTechnicalCueDetectionFilter startTechnicalCueDetectionFilter = new StartTechnicalCueDetectionFilter();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("MinSegmentConfidence")) {
                startTechnicalCueDetectionFilter.setMinSegmentConfidence(SimpleTypeJsonUnmarshallers.FloatJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("BlackFrame")) {
                startTechnicalCueDetectionFilter.setBlackFrame(BlackFrameJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return startTechnicalCueDetectionFilter;
    }
}
