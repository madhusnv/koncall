package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.StreamProcessorSettings;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class StreamProcessorSettingsJsonUnmarshaller implements Unmarshaller<StreamProcessorSettings, JsonUnmarshallerContext> {
    private static StreamProcessorSettingsJsonUnmarshaller instance;

    public static StreamProcessorSettingsJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new StreamProcessorSettingsJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public StreamProcessorSettings unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        StreamProcessorSettings streamProcessorSettings = new StreamProcessorSettings();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("FaceSearch")) {
                streamProcessorSettings.setFaceSearch(FaceSearchSettingsJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("ConnectedHome")) {
                streamProcessorSettings.setConnectedHome(ConnectedHomeSettingsJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return streamProcessorSettings;
    }
}
