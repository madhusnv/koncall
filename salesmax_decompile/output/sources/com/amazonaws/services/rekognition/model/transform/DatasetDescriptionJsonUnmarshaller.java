package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.DatasetDescription;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class DatasetDescriptionJsonUnmarshaller implements Unmarshaller<DatasetDescription, JsonUnmarshallerContext> {
    private static DatasetDescriptionJsonUnmarshaller instance;

    public static DatasetDescriptionJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new DatasetDescriptionJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public DatasetDescription unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DatasetDescription datasetDescription = new DatasetDescription();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("CreationTimestamp")) {
                datasetDescription.setCreationTimestamp(SimpleTypeJsonUnmarshallers.DateJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("LastUpdatedTimestamp")) {
                datasetDescription.setLastUpdatedTimestamp(SimpleTypeJsonUnmarshallers.DateJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Status")) {
                datasetDescription.setStatus(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("StatusMessage")) {
                datasetDescription.setStatusMessage(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("StatusMessageCode")) {
                datasetDescription.setStatusMessageCode(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("DatasetStats")) {
                datasetDescription.setDatasetStats(DatasetStatsJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return datasetDescription;
    }
}
