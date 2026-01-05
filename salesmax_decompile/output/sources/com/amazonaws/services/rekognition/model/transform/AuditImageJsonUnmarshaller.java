package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.AuditImage;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class AuditImageJsonUnmarshaller implements Unmarshaller<AuditImage, JsonUnmarshallerContext> {
    private static AuditImageJsonUnmarshaller instance;

    public static AuditImageJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new AuditImageJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public AuditImage unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AuditImage auditImage = new AuditImage();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("Bytes")) {
                auditImage.setBytes(SimpleTypeJsonUnmarshallers.ByteBufferJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("S3Object")) {
                auditImage.setS3Object(S3ObjectJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("BoundingBox")) {
                auditImage.setBoundingBox(BoundingBoxJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return auditImage;
    }
}
