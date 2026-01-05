package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.Asset;
import com.amazonaws.services.rekognition.model.TrainingData;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.List;

/* loaded from: classes5.dex */
class TrainingDataJsonMarshaller {
    private static TrainingDataJsonMarshaller instance;

    public static TrainingDataJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new TrainingDataJsonMarshaller();
        }
        return instance;
    }

    public void marshall(TrainingData trainingData, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (trainingData.getAssets() != null) {
            List<Asset> assets = trainingData.getAssets();
            awsJsonWriter.name("Assets");
            awsJsonWriter.beginArray();
            for (Asset asset : assets) {
                if (asset != null) {
                    AssetJsonMarshaller.getInstance().marshall(asset, awsJsonWriter);
                }
            }
            awsJsonWriter.endArray();
        }
        awsJsonWriter.endObject();
    }
}
