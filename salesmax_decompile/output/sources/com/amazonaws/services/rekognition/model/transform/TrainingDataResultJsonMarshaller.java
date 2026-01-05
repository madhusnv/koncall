package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.TrainingData;
import com.amazonaws.services.rekognition.model.TrainingDataResult;
import com.amazonaws.services.rekognition.model.ValidationData;
import com.amazonaws.util.json.AwsJsonWriter;

/* loaded from: classes5.dex */
class TrainingDataResultJsonMarshaller {
    private static TrainingDataResultJsonMarshaller instance;

    public static TrainingDataResultJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new TrainingDataResultJsonMarshaller();
        }
        return instance;
    }

    public void marshall(TrainingDataResult trainingDataResult, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (trainingDataResult.getInput() != null) {
            TrainingData input = trainingDataResult.getInput();
            awsJsonWriter.name("Input");
            TrainingDataJsonMarshaller.getInstance().marshall(input, awsJsonWriter);
        }
        if (trainingDataResult.getOutput() != null) {
            TrainingData output = trainingDataResult.getOutput();
            awsJsonWriter.name("Output");
            TrainingDataJsonMarshaller.getInstance().marshall(output, awsJsonWriter);
        }
        if (trainingDataResult.getValidation() != null) {
            ValidationData validation = trainingDataResult.getValidation();
            awsJsonWriter.name("Validation");
            ValidationDataJsonMarshaller.getInstance().marshall(validation, awsJsonWriter);
        }
        awsJsonWriter.endObject();
    }
}
