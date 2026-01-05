package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.DetectTextFilters;
import com.amazonaws.services.rekognition.model.DetectionFilter;
import com.amazonaws.services.rekognition.model.RegionOfInterest;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.List;

/* loaded from: classes5.dex */
class DetectTextFiltersJsonMarshaller {
    private static DetectTextFiltersJsonMarshaller instance;

    public static DetectTextFiltersJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new DetectTextFiltersJsonMarshaller();
        }
        return instance;
    }

    public void marshall(DetectTextFilters detectTextFilters, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (detectTextFilters.getWordFilter() != null) {
            DetectionFilter wordFilter = detectTextFilters.getWordFilter();
            awsJsonWriter.name("WordFilter");
            DetectionFilterJsonMarshaller.getInstance().marshall(wordFilter, awsJsonWriter);
        }
        if (detectTextFilters.getRegionsOfInterest() != null) {
            List<RegionOfInterest> regionsOfInterest = detectTextFilters.getRegionsOfInterest();
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
