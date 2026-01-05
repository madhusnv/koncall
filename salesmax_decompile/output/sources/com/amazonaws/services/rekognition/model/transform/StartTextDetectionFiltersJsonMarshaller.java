package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.DetectionFilter;
import com.amazonaws.services.rekognition.model.RegionOfInterest;
import com.amazonaws.services.rekognition.model.StartTextDetectionFilters;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.List;

/* loaded from: classes5.dex */
class StartTextDetectionFiltersJsonMarshaller {
    private static StartTextDetectionFiltersJsonMarshaller instance;

    public static StartTextDetectionFiltersJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new StartTextDetectionFiltersJsonMarshaller();
        }
        return instance;
    }

    public void marshall(StartTextDetectionFilters startTextDetectionFilters, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (startTextDetectionFilters.getWordFilter() != null) {
            DetectionFilter wordFilter = startTextDetectionFilters.getWordFilter();
            awsJsonWriter.name("WordFilter");
            DetectionFilterJsonMarshaller.getInstance().marshall(wordFilter, awsJsonWriter);
        }
        if (startTextDetectionFilters.getRegionsOfInterest() != null) {
            List<RegionOfInterest> regionsOfInterest = startTextDetectionFilters.getRegionsOfInterest();
            awsJsonWriter.name("RegionsOfInterest");
            awsJsonWriter.beginArray();
            for (RegionOfInterest regionOfInterest : regionsOfInterest) {
                if (regionOfInterest != null) {
                    RegionOfInterestJsonMarshaller.getInstance().marshall(regionOfInterest, awsJsonWriter);
                }
            }
            awsJsonWriter.endArray();
        }
        awsJsonWriter.endObject();
    }
}
