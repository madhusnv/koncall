package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.ListDatasetEntriesResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
public class ListDatasetEntriesResultJsonUnmarshaller implements Unmarshaller<ListDatasetEntriesResult, JsonUnmarshallerContext> {
    private static ListDatasetEntriesResultJsonUnmarshaller instance;

    public static ListDatasetEntriesResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new ListDatasetEntriesResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public ListDatasetEntriesResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        ListDatasetEntriesResult listDatasetEntriesResult = new ListDatasetEntriesResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("DatasetEntries")) {
                listDatasetEntriesResult.setDatasetEntries(new ListUnmarshaller(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("NextToken")) {
                listDatasetEntriesResult.setNextToken(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return listDatasetEntriesResult;
    }
}
