package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.GetContentModerationRequestMetadata;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class GetContentModerationRequestMetadataJsonMarshaller {
    private static GetContentModerationRequestMetadataJsonMarshaller instance;

    public static GetContentModerationRequestMetadataJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new GetContentModerationRequestMetadataJsonMarshaller();
        }
        return instance;
    }

    public void marshall(GetContentModerationRequestMetadata getContentModerationRequestMetadata, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (getContentModerationRequestMetadata.getSortBy() != null) {
            String sortBy = getContentModerationRequestMetadata.getSortBy();
            awsJsonWriter.name("SortBy");
            awsJsonWriter.value(sortBy);
        }
        if (getContentModerationRequestMetadata.getAggregateBy() != null) {
            String aggregateBy = getContentModerationRequestMetadata.getAggregateBy();
            awsJsonWriter.name("AggregateBy");
            awsJsonWriter.value(aggregateBy);
        }
        awsJsonWriter.endObject();
    }
}
