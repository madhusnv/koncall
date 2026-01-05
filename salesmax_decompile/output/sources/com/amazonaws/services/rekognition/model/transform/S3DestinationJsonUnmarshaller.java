package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.S3Destination;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class S3DestinationJsonUnmarshaller implements Unmarshaller<S3Destination, JsonUnmarshallerContext> {
    private static S3DestinationJsonUnmarshaller instance;

    public static S3DestinationJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new S3DestinationJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public S3Destination unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        S3Destination s3Destination = new S3Destination();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("Bucket")) {
                s3Destination.setBucket(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("KeyPrefix")) {
                s3Destination.setKeyPrefix(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return s3Destination;
    }
}
