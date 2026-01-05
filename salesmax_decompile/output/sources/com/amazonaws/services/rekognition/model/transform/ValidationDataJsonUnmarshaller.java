package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.ValidationData;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class ValidationDataJsonUnmarshaller implements Unmarshaller<ValidationData, JsonUnmarshallerContext> {
    private static ValidationDataJsonUnmarshaller instance;

    public static ValidationDataJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new ValidationDataJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public ValidationData unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ValidationData validationData = new ValidationData();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("Assets")) {
                validationData.setAssets(new ListUnmarshaller(AssetJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return validationData;
    }
}
