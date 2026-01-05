package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.Video;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class VideoJsonUnmarshaller implements Unmarshaller<Video, JsonUnmarshallerContext> {
    private static VideoJsonUnmarshaller instance;

    public static VideoJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new VideoJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public Video unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Video video = new Video();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("S3Object")) {
                video.setS3Object(S3ObjectJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return video;
    }
}
