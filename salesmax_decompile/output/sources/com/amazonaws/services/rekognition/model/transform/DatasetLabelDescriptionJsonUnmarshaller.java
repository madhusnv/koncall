package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.DatasetLabelDescription;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class DatasetLabelDescriptionJsonUnmarshaller implements Unmarshaller<DatasetLabelDescription, JsonUnmarshallerContext> {
    private static DatasetLabelDescriptionJsonUnmarshaller instance;

    public static DatasetLabelDescriptionJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new DatasetLabelDescriptionJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public DatasetLabelDescription unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DatasetLabelDescription datasetLabelDescription = new DatasetLabelDescription();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("LabelName")) {
                datasetLabelDescription.setLabelName(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("LabelStats")) {
                datasetLabelDescription.setLabelStats(DatasetLabelStatsJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return datasetLabelDescription;
    }
}
