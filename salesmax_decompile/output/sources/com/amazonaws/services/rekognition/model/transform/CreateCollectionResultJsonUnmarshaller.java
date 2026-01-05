package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.CreateCollectionResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
public class CreateCollectionResultJsonUnmarshaller implements Unmarshaller<CreateCollectionResult, JsonUnmarshallerContext> {
    private static CreateCollectionResultJsonUnmarshaller instance;

    public static CreateCollectionResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new CreateCollectionResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public CreateCollectionResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        CreateCollectionResult createCollectionResult = new CreateCollectionResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("StatusCode")) {
                createCollectionResult.setStatusCode(SimpleTypeJsonUnmarshallers.IntegerJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("CollectionArn")) {
                createCollectionResult.setCollectionArn(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("FaceModelVersion")) {
                createCollectionResult.setFaceModelVersion(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return createCollectionResult;
    }
}
