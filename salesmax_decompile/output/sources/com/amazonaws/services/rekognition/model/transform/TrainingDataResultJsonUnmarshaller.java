package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.TrainingDataResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class TrainingDataResultJsonUnmarshaller implements Unmarshaller<TrainingDataResult, JsonUnmarshallerContext> {
    private static TrainingDataResultJsonUnmarshaller instance;

    public static TrainingDataResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new TrainingDataResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public TrainingDataResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        TrainingDataResult trainingDataResult = new TrainingDataResult();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("Input")) {
                trainingDataResult.setInput(TrainingDataJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Output")) {
                trainingDataResult.setOutput(TrainingDataJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Validation")) {
                trainingDataResult.setValidation(ValidationDataJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return trainingDataResult;
    }
}
