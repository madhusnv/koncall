package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.CreateDatasetResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
public class CreateDatasetResultJsonUnmarshaller implements Unmarshaller<CreateDatasetResult, JsonUnmarshallerContext> {
    private static CreateDatasetResultJsonUnmarshaller instance;

    public static CreateDatasetResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new CreateDatasetResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public CreateDatasetResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        CreateDatasetResult createDatasetResult = new CreateDatasetResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("DatasetArn")) {
                createDatasetResult.setDatasetArn(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return createDatasetResult;
    }
}
