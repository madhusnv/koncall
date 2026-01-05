package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.DistributeDataset;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class DistributeDatasetJsonUnmarshaller implements Unmarshaller<DistributeDataset, JsonUnmarshallerContext> {
    private static DistributeDatasetJsonUnmarshaller instance;

    public static DistributeDatasetJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new DistributeDatasetJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public DistributeDataset unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DistributeDataset distributeDataset = new DistributeDataset();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("Arn")) {
                distributeDataset.setArn(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return distributeDataset;
    }
}
