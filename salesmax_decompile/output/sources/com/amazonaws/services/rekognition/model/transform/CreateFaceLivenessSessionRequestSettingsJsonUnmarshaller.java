package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.CreateFaceLivenessSessionRequestSettings;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class CreateFaceLivenessSessionRequestSettingsJsonUnmarshaller implements Unmarshaller<CreateFaceLivenessSessionRequestSettings, JsonUnmarshallerContext> {
    private static CreateFaceLivenessSessionRequestSettingsJsonUnmarshaller instance;

    public static CreateFaceLivenessSessionRequestSettingsJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new CreateFaceLivenessSessionRequestSettingsJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public CreateFaceLivenessSessionRequestSettings unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        CreateFaceLivenessSessionRequestSettings createFaceLivenessSessionRequestSettings = new CreateFaceLivenessSessionRequestSettings();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("OutputConfig")) {
                createFaceLivenessSessionRequestSettings.setOutputConfig(LivenessOutputConfigJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("AuditImagesLimit")) {
                createFaceLivenessSessionRequestSettings.setAuditImagesLimit(SimpleTypeJsonUnmarshallers.IntegerJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return createFaceLivenessSessionRequestSettings;
    }
}
