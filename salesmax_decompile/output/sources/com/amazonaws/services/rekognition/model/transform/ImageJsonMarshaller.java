package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.Image;
import com.amazonaws.services.rekognition.model.S3Object;
import com.amazonaws.util.json.AwsJsonWriter;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
class ImageJsonMarshaller {
    private static ImageJsonMarshaller instance;

    public static ImageJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new ImageJsonMarshaller();
        }
        return instance;
    }

    public void marshall(Image image, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (image.getBytes() != null) {
            ByteBuffer bytes = image.getBytes();
            awsJsonWriter.name("Bytes");
            awsJsonWriter.value(bytes);
        }
        if (image.getS3Object() != null) {
            S3Object s3Object = image.getS3Object();
            awsJsonWriter.name("S3Object");
            S3ObjectJsonMarshaller.getInstance().marshall(s3Object, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
