package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.S3Object;
import com.amazonaws.services.rekognition.model.Video;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class VideoJsonMarshaller {
    private static VideoJsonMarshaller instance;

    public static VideoJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new VideoJsonMarshaller();
        }
        return instance;
    }

    public void marshall(Video video, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (video.getS3Object() != null) {
            S3Object s3Object = video.getS3Object();
            awsJsonWriter.name("S3Object");
            S3ObjectJsonMarshaller.getInstance().marshall(s3Object, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
