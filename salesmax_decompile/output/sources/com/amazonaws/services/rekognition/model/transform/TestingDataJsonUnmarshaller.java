package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.TestingData;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class TestingDataJsonUnmarshaller implements Unmarshaller<TestingData, JsonUnmarshallerContext> {
    private static TestingDataJsonUnmarshaller instance;

    public static TestingDataJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new TestingDataJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public TestingData unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        TestingData testingData = new TestingData();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("Assets")) {
                testingData.setAssets(new ListUnmarshaller(AssetJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("AutoCreate")) {
                testingData.setAutoCreate(SimpleTypeJsonUnmarshallers.BooleanJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return testingData;
    }
}
