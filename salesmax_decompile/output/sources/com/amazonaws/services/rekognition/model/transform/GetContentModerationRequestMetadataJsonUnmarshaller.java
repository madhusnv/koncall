package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.GetContentModerationRequestMetadata;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class GetContentModerationRequestMetadataJsonUnmarshaller implements Unmarshaller<GetContentModerationRequestMetadata, JsonUnmarshallerContext> {
    private static GetContentModerationRequestMetadataJsonUnmarshaller instance;

    public static GetContentModerationRequestMetadataJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new GetContentModerationRequestMetadataJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public GetContentModerationRequestMetadata unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        GetContentModerationRequestMetadata getContentModerationRequestMetadata = new GetContentModerationRequestMetadata();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("SortBy")) {
                getContentModerationRequestMetadata.setSortBy(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("AggregateBy")) {
                getContentModerationRequestMetadata.setAggregateBy(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return getContentModerationRequestMetadata;
    }
}
