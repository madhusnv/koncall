package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.FaceSearchSettings;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class FaceSearchSettingsJsonUnmarshaller implements Unmarshaller<FaceSearchSettings, JsonUnmarshallerContext> {
    private static FaceSearchSettingsJsonUnmarshaller instance;

    public static FaceSearchSettingsJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new FaceSearchSettingsJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public FaceSearchSettings unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        FaceSearchSettings faceSearchSettings = new FaceSearchSettings();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("CollectionId")) {
                faceSearchSettings.setCollectionId(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("FaceMatchThreshold")) {
                faceSearchSettings.setFaceMatchThreshold(SimpleTypeJsonUnmarshallers.FloatJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return faceSearchSettings;
    }
}
