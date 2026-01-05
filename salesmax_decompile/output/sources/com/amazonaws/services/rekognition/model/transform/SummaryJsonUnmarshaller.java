package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.Summary;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class SummaryJsonUnmarshaller implements Unmarshaller<Summary, JsonUnmarshallerContext> {
    private static SummaryJsonUnmarshaller instance;

    public static SummaryJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new SummaryJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public Summary unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Summary summary = new Summary();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("S3Object")) {
                summary.setS3Object(S3ObjectJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return summary;
    }
}
