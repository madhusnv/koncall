package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.ListDatasetLabelsResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
public class ListDatasetLabelsResultJsonUnmarshaller implements Unmarshaller<ListDatasetLabelsResult, JsonUnmarshallerContext> {
    private static ListDatasetLabelsResultJsonUnmarshaller instance;

    public static ListDatasetLabelsResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new ListDatasetLabelsResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public ListDatasetLabelsResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        ListDatasetLabelsResult listDatasetLabelsResult = new ListDatasetLabelsResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("DatasetLabelDescriptions")) {
                listDatasetLabelsResult.setDatasetLabelDescriptions(new ListUnmarshaller(DatasetLabelDescriptionJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("NextToken")) {
                listDatasetLabelsResult.setNextToken(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return listDatasetLabelsResult;
    }
}
