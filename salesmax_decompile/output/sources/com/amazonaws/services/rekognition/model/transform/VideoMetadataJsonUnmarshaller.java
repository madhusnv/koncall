package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.VideoMetadata;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class VideoMetadataJsonUnmarshaller implements Unmarshaller<VideoMetadata, JsonUnmarshallerContext> {
    private static VideoMetadataJsonUnmarshaller instance;

    public static VideoMetadataJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new VideoMetadataJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public VideoMetadata unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        VideoMetadata videoMetadata = new VideoMetadata();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("Codec")) {
                videoMetadata.setCodec(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("DurationMillis")) {
                videoMetadata.setDurationMillis(SimpleTypeJsonUnmarshallers.LongJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Format")) {
                videoMetadata.setFormat(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("FrameRate")) {
                videoMetadata.setFrameRate(SimpleTypeJsonUnmarshallers.FloatJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("FrameHeight")) {
                videoMetadata.setFrameHeight(SimpleTypeJsonUnmarshallers.LongJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("FrameWidth")) {
                videoMetadata.setFrameWidth(SimpleTypeJsonUnmarshallers.LongJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("ColorRange")) {
                videoMetadata.setColorRange(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return videoMetadata;
    }
}
