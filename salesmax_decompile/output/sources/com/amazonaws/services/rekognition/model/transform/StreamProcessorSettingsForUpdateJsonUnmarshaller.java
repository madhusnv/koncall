package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.StreamProcessorSettingsForUpdate;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class StreamProcessorSettingsForUpdateJsonUnmarshaller implements Unmarshaller<StreamProcessorSettingsForUpdate, JsonUnmarshallerContext> {
    private static StreamProcessorSettingsForUpdateJsonUnmarshaller instance;

    public static StreamProcessorSettingsForUpdateJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new StreamProcessorSettingsForUpdateJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public StreamProcessorSettingsForUpdate unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        StreamProcessorSettingsForUpdate streamProcessorSettingsForUpdate = new StreamProcessorSettingsForUpdate();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("ConnectedHomeForUpdate")) {
                streamProcessorSettingsForUpdate.setConnectedHomeForUpdate(ConnectedHomeSettingsForUpdateJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return streamProcessorSettingsForUpdate;
    }
}
