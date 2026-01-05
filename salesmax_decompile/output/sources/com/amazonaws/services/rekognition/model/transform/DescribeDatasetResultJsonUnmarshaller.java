package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.DescribeDatasetResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
public class DescribeDatasetResultJsonUnmarshaller implements Unmarshaller<DescribeDatasetResult, JsonUnmarshallerContext> {
    private static DescribeDatasetResultJsonUnmarshaller instance;

    public static DescribeDatasetResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new DescribeDatasetResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public DescribeDatasetResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        DescribeDatasetResult describeDatasetResult = new DescribeDatasetResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("DatasetDescription")) {
                describeDatasetResult.setDatasetDescription(DatasetDescriptionJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return describeDatasetResult;
    }
}
