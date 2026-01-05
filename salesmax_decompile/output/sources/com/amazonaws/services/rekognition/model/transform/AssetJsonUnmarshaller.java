package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.Asset;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class AssetJsonUnmarshaller implements Unmarshaller<Asset, JsonUnmarshallerContext> {
    private static AssetJsonUnmarshaller instance;

    public static AssetJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new AssetJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public Asset unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Asset asset = new Asset();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("GroundTruthManifest")) {
                asset.setGroundTruthManifest(GroundTruthManifestJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return asset;
    }
}
