package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.auth.policy.internal.JsonDocumentFields;
import com.amazonaws.services.rekognition.model.S3Object;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class S3ObjectJsonUnmarshaller implements Unmarshaller<S3Object, JsonUnmarshallerContext> {
    private static S3ObjectJsonUnmarshaller instance;

    public static S3ObjectJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new S3ObjectJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public S3Object unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        S3Object s3Object = new S3Object();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("Bucket")) {
                s3Object.setBucket(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Name")) {
                s3Object.setName(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals(JsonDocumentFields.VERSION)) {
                s3Object.setVersion(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return s3Object;
    }
}
