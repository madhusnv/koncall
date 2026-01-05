package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.GetLabelDetectionRequestMetadata;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class GetLabelDetectionRequestMetadataJsonUnmarshaller implements Unmarshaller<GetLabelDetectionRequestMetadata, JsonUnmarshallerContext> {
    private static GetLabelDetectionRequestMetadataJsonUnmarshaller instance;

    public static GetLabelDetectionRequestMetadataJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new GetLabelDetectionRequestMetadataJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public GetLabelDetectionRequestMetadata unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        GetLabelDetectionRequestMetadata getLabelDetectionRequestMetadata = new GetLabelDetectionRequestMetadata();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("SortBy")) {
                getLabelDetectionRequestMetadata.setSortBy(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("AggregateBy")) {
                getLabelDetectionRequestMetadata.setAggregateBy(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return getLabelDetectionRequestMetadata;
    }
}
