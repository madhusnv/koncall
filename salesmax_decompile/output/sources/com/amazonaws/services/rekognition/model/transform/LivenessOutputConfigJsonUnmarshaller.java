package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.LivenessOutputConfig;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class LivenessOutputConfigJsonUnmarshaller implements Unmarshaller<LivenessOutputConfig, JsonUnmarshallerContext> {
    private static LivenessOutputConfigJsonUnmarshaller instance;

    public static LivenessOutputConfigJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new LivenessOutputConfigJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public LivenessOutputConfig unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        LivenessOutputConfig livenessOutputConfig = new LivenessOutputConfig();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("S3Bucket")) {
                livenessOutputConfig.setS3Bucket(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("S3KeyPrefix")) {
                livenessOutputConfig.setS3KeyPrefix(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return livenessOutputConfig;
    }
}
