package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.GetLabelDetectionRequestMetadata;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class GetLabelDetectionRequestMetadataJsonMarshaller {
    private static GetLabelDetectionRequestMetadataJsonMarshaller instance;

    public static GetLabelDetectionRequestMetadataJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new GetLabelDetectionRequestMetadataJsonMarshaller();
        }
        return instance;
    }

    public void marshall(GetLabelDetectionRequestMetadata getLabelDetectionRequestMetadata, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (getLabelDetectionRequestMetadata.getSortBy() != null) {
            String sortBy = getLabelDetectionRequestMetadata.getSortBy();
            awsJsonWriter.name("SortBy");
            awsJsonWriter.value(sortBy);
        }
        if (getLabelDetectionRequestMetadata.getAggregateBy() != null) {
            String aggregateBy = getLabelDetectionRequestMetadata.getAggregateBy();
            awsJsonWriter.name("AggregateBy");
            awsJsonWriter.value(aggregateBy);
        }
        awsJsonWriter.endObject();
    }
}
