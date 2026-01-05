package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.DescribeProjectsResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
public class DescribeProjectsResultJsonUnmarshaller implements Unmarshaller<DescribeProjectsResult, JsonUnmarshallerContext> {
    private static DescribeProjectsResultJsonUnmarshaller instance;

    public static DescribeProjectsResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new DescribeProjectsResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public DescribeProjectsResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        DescribeProjectsResult describeProjectsResult = new DescribeProjectsResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("ProjectDescriptions")) {
                describeProjectsResult.setProjectDescriptions(new ListUnmarshaller(ProjectDescriptionJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("NextToken")) {
                describeProjectsResult.setNextToken(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return describeProjectsResult;
    }
}
