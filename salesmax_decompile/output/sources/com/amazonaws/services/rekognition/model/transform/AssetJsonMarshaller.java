package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.Asset;
import com.amazonaws.services.rekognition.model.GroundTruthManifest;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class AssetJsonMarshaller {
    private static AssetJsonMarshaller instance;

    public static AssetJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new AssetJsonMarshaller();
        }
        return instance;
    }

    public void marshall(Asset asset, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (asset.getGroundTruthManifest() != null) {
            GroundTruthManifest groundTruthManifest = asset.getGroundTruthManifest();
            awsJsonWriter.name("GroundTruthManifest");
            GroundTruthManifestJsonMarshaller.getInstance().marshall(groundTruthManifest, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
