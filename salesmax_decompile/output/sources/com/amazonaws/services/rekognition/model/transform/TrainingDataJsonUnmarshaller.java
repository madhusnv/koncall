package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.TrainingData;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class TrainingDataJsonUnmarshaller implements Unmarshaller<TrainingData, JsonUnmarshallerContext> {
    private static TrainingDataJsonUnmarshaller instance;

    public static TrainingDataJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new TrainingDataJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public TrainingData unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        TrainingData trainingData = new TrainingData();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("Assets")) {
                trainingData.setAssets(new ListUnmarshaller(AssetJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return trainingData;
    }
}
