package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.StartSegmentDetectionFilters;
import com.amazonaws.services.rekognition.model.StartShotDetectionFilter;
import com.amazonaws.services.rekognition.model.StartTechnicalCueDetectionFilter;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class StartSegmentDetectionFiltersJsonMarshaller {
    private static StartSegmentDetectionFiltersJsonMarshaller instance;

    public static StartSegmentDetectionFiltersJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new StartSegmentDetectionFiltersJsonMarshaller();
        }
        return instance;
    }

    public void marshall(StartSegmentDetectionFilters startSegmentDetectionFilters, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (startSegmentDetectionFilters.getTechnicalCueFilter() != null) {
            StartTechnicalCueDetectionFilter technicalCueFilter = startSegmentDetectionFilters.getTechnicalCueFilter();
            awsJsonWriter.name("TechnicalCueFilter");
            StartTechnicalCueDetectionFilterJsonMarshaller.getInstance().marshall(technicalCueFilter, awsJsonWriter);
        }
        if (startSegmentDetectionFilters.getShotFilter() != null) {
            StartShotDetectionFilter shotFilter = startSegmentDetectionFilters.getShotFilter();
            awsJsonWriter.name("ShotFilter");
            StartShotDetectionFilterJsonMarshaller.getInstance().marshall(shotFilter, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
