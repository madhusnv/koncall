package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.Asset;
import com.amazonaws.services.rekognition.model.TestingData;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.List;

/* loaded from: classes5.dex */
class TestingDataJsonMarshaller {
    private static TestingDataJsonMarshaller instance;

    public static TestingDataJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new TestingDataJsonMarshaller();
        }
        return instance;
    }

    public void marshall(TestingData testingData, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (testingData.getAssets() != null) {
            List<Asset> assets = testingData.getAssets();
            awsJsonWriter.name("Assets");
            awsJsonWriter.beginArray();
            for (Asset asset : assets) {
                if (asset != null) {
                    AssetJsonMarshaller.getInstance().marshall(asset, awsJsonWriter);
                }
            }
            awsJsonWriter.endArray();
        }
        if (testingData.getAutoCreate() != null) {
            Boolean autoCreate = testingData.getAutoCreate();
            awsJsonWriter.name("AutoCreate");
            awsJsonWriter.value(autoCreate.booleanValue());
        }
        awsJsonWriter.endObject();
    }
}
