package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.DatasetLabelStats;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class DatasetLabelStatsJsonUnmarshaller implements Unmarshaller<DatasetLabelStats, JsonUnmarshallerContext> {
    private static DatasetLabelStatsJsonUnmarshaller instance;

    public static DatasetLabelStatsJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new DatasetLabelStatsJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public DatasetLabelStats unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DatasetLabelStats datasetLabelStats = new DatasetLabelStats();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("EntryCount")) {
                datasetLabelStats.setEntryCount(SimpleTypeJsonUnmarshallers.IntegerJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("BoundingBoxCount")) {
                datasetLabelStats.setBoundingBoxCount(SimpleTypeJsonUnmarshallers.IntegerJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return datasetLabelStats;
    }
}
