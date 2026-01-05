package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.ConnectedHomeSettingsForUpdate;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class ConnectedHomeSettingsForUpdateJsonUnmarshaller implements Unmarshaller<ConnectedHomeSettingsForUpdate, JsonUnmarshallerContext> {
    private static ConnectedHomeSettingsForUpdateJsonUnmarshaller instance;

    public static ConnectedHomeSettingsForUpdateJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new ConnectedHomeSettingsForUpdateJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public ConnectedHomeSettingsForUpdate unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ConnectedHomeSettingsForUpdate connectedHomeSettingsForUpdate = new ConnectedHomeSettingsForUpdate();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("Labels")) {
                connectedHomeSettingsForUpdate.setLabels(new ListUnmarshaller(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("MinConfidence")) {
                connectedHomeSettingsForUpdate.setMinConfidence(SimpleTypeJsonUnmarshallers.FloatJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return connectedHomeSettingsForUpdate;
    }
}
