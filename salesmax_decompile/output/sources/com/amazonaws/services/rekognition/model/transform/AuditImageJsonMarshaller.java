package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.AuditImage;
import com.amazonaws.services.rekognition.model.BoundingBox;
import com.amazonaws.services.rekognition.model.S3Object;
import com.amazonaws.util.json.AwsJsonWriter;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
class AuditImageJsonMarshaller {
    private static AuditImageJsonMarshaller instance;

    public static AuditImageJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new AuditImageJsonMarshaller();
        }
        return instance;
    }

    public void marshall(AuditImage auditImage, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (auditImage.getBytes() != null) {
            ByteBuffer bytes = auditImage.getBytes();
            awsJsonWriter.name("Bytes");
            awsJsonWriter.value(bytes);
        }
        if (auditImage.getS3Object() != null) {
            S3Object s3Object = auditImage.getS3Object();
            awsJsonWriter.name("S3Object");
            S3ObjectJsonMarshaller.getInstance().marshall(s3Object, awsJsonWriter);
        }
        if (auditImage.getBoundingBox() != null) {
            BoundingBox boundingBox = auditImage.getBoundingBox();
            awsJsonWriter.name("BoundingBox");
            BoundingBoxJsonMarshaller.getInstance().marshall(boundingBox, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
