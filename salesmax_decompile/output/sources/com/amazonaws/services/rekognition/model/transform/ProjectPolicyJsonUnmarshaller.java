package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.ProjectPolicy;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class ProjectPolicyJsonUnmarshaller implements Unmarshaller<ProjectPolicy, JsonUnmarshallerContext> {
    private static ProjectPolicyJsonUnmarshaller instance;

    public static ProjectPolicyJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new ProjectPolicyJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public ProjectPolicy unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ProjectPolicy projectPolicy = new ProjectPolicy();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("ProjectArn")) {
                projectPolicy.setProjectArn(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("PolicyName")) {
                projectPolicy.setPolicyName(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("PolicyRevisionId")) {
                projectPolicy.setPolicyRevisionId(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("PolicyDocument")) {
                projectPolicy.setPolicyDocument(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("CreationTimestamp")) {
                projectPolicy.setCreationTimestamp(SimpleTypeJsonUnmarshallers.DateJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("LastUpdatedTimestamp")) {
                projectPolicy.setLastUpdatedTimestamp(SimpleTypeJsonUnmarshallers.DateJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return projectPolicy;
    }
}
