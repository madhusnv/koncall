package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.StartShotDetectionFilter;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class StartShotDetectionFilterJsonUnmarshaller implements Unmarshaller<StartShotDetectionFilter, JsonUnmarshallerContext> {
    private static StartShotDetectionFilterJsonUnmarshaller instance;

    public static StartShotDetectionFilterJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new StartShotDetectionFilterJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public StartShotDetectionFilter unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        StartShotDetectionFilter startShotDetectionFilter = new StartShotDetectionFilter();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("MinSegmentConfidence")) {
                startShotDetectionFilter.setMinSegmentConfidence(SimpleTypeJsonUnmarshallers.FloatJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return startShotDetectionFilter;
    }
}
