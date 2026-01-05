package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.DescribeProjectVersionsResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
public class DescribeProjectVersionsResultJsonUnmarshaller implements Unmarshaller<DescribeProjectVersionsResult, JsonUnmarshallerContext> {
    private static DescribeProjectVersionsResultJsonUnmarshaller instance;

    public static DescribeProjectVersionsResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new DescribeProjectVersionsResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public DescribeProjectVersionsResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        DescribeProjectVersionsResult describeProjectVersionsResult = new DescribeProjectVersionsResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("ProjectVersionDescriptions")) {
                describeProjectVersionsResult.setProjectVersionDescriptions(new ListUnmarshaller(ProjectVersionDescriptionJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("NextToken")) {
                describeProjectVersionsResult.setNextToken(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return describeProjectVersionsResult;
    }
}
