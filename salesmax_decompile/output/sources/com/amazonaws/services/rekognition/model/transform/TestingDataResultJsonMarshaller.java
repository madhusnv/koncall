package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.TestingData;
import com.amazonaws.services.rekognition.model.TestingDataResult;
import com.amazonaws.services.rekognition.model.ValidationData;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class TestingDataResultJsonMarshaller {
    private static TestingDataResultJsonMarshaller instance;

    public static TestingDataResultJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new TestingDataResultJsonMarshaller();
        }
        return instance;
    }

    public void marshall(TestingDataResult testingDataResult, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (testingDataResult.getInput() != null) {
            TestingData input = testingDataResult.getInput();
            awsJsonWriter.name("Input");
            TestingDataJsonMarshaller.getInstance().marshall(input, awsJsonWriter);
        }
        if (testingDataResult.getOutput() != null) {
            TestingData output = testingDataResult.getOutput();
            awsJsonWriter.name("Output");
            TestingDataJsonMarshaller.getInstance().marshall(output, awsJsonWriter);
        }
        if (testingDataResult.getValidation() != null) {
            ValidationData validation = testingDataResult.getValidation();
            awsJsonWriter.name("Validation");
            ValidationDataJsonMarshaller.getInstance().marshall(validation, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
