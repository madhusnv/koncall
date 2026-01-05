package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.ProjectDescription;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* loaded from: classes5.dex */
class ProjectDescriptionJsonUnmarshaller implements Unmarshaller<ProjectDescription, JsonUnmarshallerContext> {
    private static ProjectDescriptionJsonUnmarshaller instance;

    public static ProjectDescriptionJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new ProjectDescriptionJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public ProjectDescription unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ProjectDescription projectDescription = new ProjectDescription();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (strNextName.equals("ProjectArn")) {
                projectDescription.setProjectArn(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("CreationTimestamp")) {
                projectDescription.setCreationTimestamp(SimpleTypeJsonUnmarshallers.DateJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Status")) {
                projectDescription.setStatus(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (strNextName.equals("Datasets")) {
                projectDescription.setDatasets(new ListUnmarshaller(DatasetMetadataJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return projectDescription;
    }
}
