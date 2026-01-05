package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.GroundTruthManifest;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class GroundTruthManifestJsonUnmarshaller implements Unmarshaller<GroundTruthManifest, JsonUnmarshallerContext> {
    private static GroundTruthManifestJsonUnmarshaller instance;

    public static GroundTruthManifestJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new GroundTruthManifestJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public GroundTruthManifest unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        GroundTruthManifest groundTruthManifest = new GroundTruthManifest();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("S3Object")) {
                groundTruthManifest.setS3Object(S3ObjectJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return groundTruthManifest;
    }
}
