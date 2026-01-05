package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.DetectTextFilters;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class DetectTextFiltersJsonUnmarshaller implements Unmarshaller<DetectTextFilters, JsonUnmarshallerContext> {
    private static DetectTextFiltersJsonUnmarshaller instance;

    public static DetectTextFiltersJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new DetectTextFiltersJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public DetectTextFilters unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DetectTextFilters detectTextFilters = new DetectTextFilters();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("WordFilter")) {
                detectTextFilters.setWordFilter(DetectionFilterJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("RegionsOfInterest")) {
                detectTextFilters.setRegionsOfInterest(new ListUnmarshaller(RegionOfInterestJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return detectTextFilters;
    }
}
