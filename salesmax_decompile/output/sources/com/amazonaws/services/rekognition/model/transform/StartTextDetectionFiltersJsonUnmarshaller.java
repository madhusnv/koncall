package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.StartTextDetectionFilters;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class StartTextDetectionFiltersJsonUnmarshaller implements Unmarshaller<StartTextDetectionFilters, JsonUnmarshallerContext> {
    private static StartTextDetectionFiltersJsonUnmarshaller instance;

    public static StartTextDetectionFiltersJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new StartTextDetectionFiltersJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public StartTextDetectionFilters unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        StartTextDetectionFilters startTextDetectionFilters = new StartTextDetectionFilters();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("WordFilter")) {
                startTextDetectionFilters.setWordFilter(DetectionFilterJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("RegionsOfInterest")) {
                startTextDetectionFilters.setRegionsOfInterest(new ListUnmarshaller(RegionOfInterestJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return startTextDetectionFilters;
    }
}
