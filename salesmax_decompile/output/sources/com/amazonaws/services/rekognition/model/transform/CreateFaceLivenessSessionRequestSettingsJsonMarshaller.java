package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.CreateFaceLivenessSessionRequestSettings;
import com.amazonaws.services.rekognition.model.LivenessOutputConfig;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class CreateFaceLivenessSessionRequestSettingsJsonMarshaller {
    private static CreateFaceLivenessSessionRequestSettingsJsonMarshaller instance;

    public static CreateFaceLivenessSessionRequestSettingsJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new CreateFaceLivenessSessionRequestSettingsJsonMarshaller();
        }
        return instance;
    }

    public void marshall(CreateFaceLivenessSessionRequestSettings createFaceLivenessSessionRequestSettings, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (createFaceLivenessSessionRequestSettings.getOutputConfig() != null) {
            LivenessOutputConfig outputConfig = createFaceLivenessSessionRequestSettings.getOutputConfig();
            awsJsonWriter.name("OutputConfig");
            LivenessOutputConfigJsonMarshaller.getInstance().marshall(outputConfig, awsJsonWriter);
        }
        if (createFaceLivenessSessionRequestSettings.getAuditImagesLimit() != null) {
            Integer auditImagesLimit = createFaceLivenessSessionRequestSettings.getAuditImagesLimit();
            awsJsonWriter.name("AuditImagesLimit");
            awsJsonWriter.value(auditImagesLimit);
        }
        awsJsonWriter.endObject();
    }
}
