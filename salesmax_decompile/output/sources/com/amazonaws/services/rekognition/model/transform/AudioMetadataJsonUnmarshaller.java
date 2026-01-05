package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.AudioMetadata;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class AudioMetadataJsonUnmarshaller implements Unmarshaller<AudioMetadata, JsonUnmarshallerContext> {
    private static AudioMetadataJsonUnmarshaller instance;

    public static AudioMetadataJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new AudioMetadataJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public AudioMetadata unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AudioMetadata audioMetadata = new AudioMetadata();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("Codec")) {
                audioMetadata.setCodec(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("DurationMillis")) {
                audioMetadata.setDurationMillis(SimpleTypeJsonUnmarshallers.LongJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("SampleRate")) {
                audioMetadata.setSampleRate(SimpleTypeJsonUnmarshallers.LongJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("NumberOfChannels")) {
                audioMetadata.setNumberOfChannels(SimpleTypeJsonUnmarshallers.LongJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return audioMetadata;
    }
}
