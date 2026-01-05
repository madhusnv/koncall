package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.StreamProcessorDataSharingPreference;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class StreamProcessorDataSharingPreferenceJsonUnmarshaller implements Unmarshaller<StreamProcessorDataSharingPreference, JsonUnmarshallerContext> {
    private static StreamProcessorDataSharingPreferenceJsonUnmarshaller instance;

    public static StreamProcessorDataSharingPreferenceJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new StreamProcessorDataSharingPreferenceJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public StreamProcessorDataSharingPreference unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        StreamProcessorDataSharingPreference streamProcessorDataSharingPreference = new StreamProcessorDataSharingPreference();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("OptIn")) {
                streamProcessorDataSharingPreference.setOptIn(SimpleTypeJsonUnmarshallers.BooleanJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return streamProcessorDataSharingPreference;
    }
}
