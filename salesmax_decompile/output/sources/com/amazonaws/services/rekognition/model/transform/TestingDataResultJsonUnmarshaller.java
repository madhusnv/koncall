package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.TestingDataResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class TestingDataResultJsonUnmarshaller implements Unmarshaller<TestingDataResult, JsonUnmarshallerContext> {
    private static TestingDataResultJsonUnmarshaller instance;

    public static TestingDataResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new TestingDataResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public TestingDataResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        TestingDataResult testingDataResult = new TestingDataResult();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("Input")) {
                testingDataResult.setInput(TestingDataJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Output")) {
                testingDataResult.setOutput(TestingDataJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Validation")) {
                testingDataResult.setValidation(ValidationDataJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return testingDataResult;
    }
}
