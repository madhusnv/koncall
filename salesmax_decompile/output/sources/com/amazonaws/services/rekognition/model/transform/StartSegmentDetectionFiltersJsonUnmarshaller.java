package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.StartSegmentDetectionFilters;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class StartSegmentDetectionFiltersJsonUnmarshaller implements Unmarshaller<StartSegmentDetectionFilters, JsonUnmarshallerContext> {
    private static StartSegmentDetectionFiltersJsonUnmarshaller instance;

    public static StartSegmentDetectionFiltersJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new StartSegmentDetectionFiltersJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public StartSegmentDetectionFilters unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        StartSegmentDetectionFilters startSegmentDetectionFilters = new StartSegmentDetectionFilters();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("TechnicalCueFilter")) {
                startSegmentDetectionFilters.setTechnicalCueFilter(StartTechnicalCueDetectionFilterJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("ShotFilter")) {
                startSegmentDetectionFilters.setShotFilter(StartShotDetectionFilterJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return startSegmentDetectionFilters;
    }
}
