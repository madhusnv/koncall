package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.Image;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class ImageJsonUnmarshaller implements Unmarshaller<Image, JsonUnmarshallerContext> {
    private static ImageJsonUnmarshaller instance;

    public static ImageJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new ImageJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public Image unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Image image = new Image();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("Bytes")) {
                image.setBytes(SimpleTypeJsonUnmarshallers.ByteBufferJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("S3Object")) {
                image.setS3Object(S3ObjectJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return image;
    }
}
