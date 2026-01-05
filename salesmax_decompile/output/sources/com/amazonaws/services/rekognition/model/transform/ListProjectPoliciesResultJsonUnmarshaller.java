package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.ListProjectPoliciesResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
public class ListProjectPoliciesResultJsonUnmarshaller implements Unmarshaller<ListProjectPoliciesResult, JsonUnmarshallerContext> {
    private static ListProjectPoliciesResultJsonUnmarshaller instance;

    public static ListProjectPoliciesResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new ListProjectPoliciesResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public ListProjectPoliciesResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        ListProjectPoliciesResult listProjectPoliciesResult = new ListProjectPoliciesResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("ProjectPolicies")) {
                listProjectPoliciesResult.setProjectPolicies(new ListUnmarshaller(ProjectPolicyJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("NextToken")) {
                listProjectPoliciesResult.setNextToken(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return listProjectPoliciesResult;
    }
}
