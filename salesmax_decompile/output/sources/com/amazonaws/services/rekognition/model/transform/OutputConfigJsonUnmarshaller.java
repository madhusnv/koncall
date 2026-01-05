package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.OutputConfig;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class OutputConfigJsonUnmarshaller implements Unmarshaller<OutputConfig, JsonUnmarshallerContext> {
    private static OutputConfigJsonUnmarshaller instance;

    public static OutputConfigJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new OutputConfigJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public OutputConfig unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        OutputConfig outputConfig = new OutputConfig();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("S3Bucket")) {
                outputConfig.setS3Bucket(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("S3KeyPrefix")) {
                outputConfig.setS3KeyPrefix(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return outputConfig;
    }
}
