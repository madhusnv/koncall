package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.DatasetChanges;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class DatasetChangesJsonUnmarshaller implements Unmarshaller<DatasetChanges, JsonUnmarshallerContext> {
    private static DatasetChangesJsonUnmarshaller instance;

    public static DatasetChangesJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new DatasetChangesJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public DatasetChanges unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DatasetChanges datasetChanges = new DatasetChanges();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("GroundTruth")) {
                datasetChanges.setGroundTruth(SimpleTypeJsonUnmarshallers.ByteBufferJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return datasetChanges;
    }
}
