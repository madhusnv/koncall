package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.Asset;
import com.amazonaws.services.rekognition.model.ValidationData;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.List;

/* loaded from: classes5.dex */
class ValidationDataJsonMarshaller {
    private static ValidationDataJsonMarshaller instance;

    public static ValidationDataJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new ValidationDataJsonMarshaller();
        }
        return instance;
    }

    public void marshall(ValidationData validationData, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (validationData.getAssets() != null) {
            List<Asset> assets = validationData.getAssets();
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
