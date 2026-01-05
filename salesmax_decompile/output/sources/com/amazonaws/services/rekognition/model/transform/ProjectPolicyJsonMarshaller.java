package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.ProjectPolicy;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.Date;

/* loaded from: classes5.dex */
class ProjectPolicyJsonMarshaller {
    private static ProjectPolicyJsonMarshaller instance;

    public static ProjectPolicyJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new ProjectPolicyJsonMarshaller();
        }
        return instance;
    }

    public void marshall(ProjectPolicy projectPolicy, AwsJsonWriter awsJsonWriter) {
        awsJsonWriter.beginObject();
        if (projectPolicy.getProjectArn() != null) {
            String projectArn = projectPolicy.getProjectArn();
            awsJsonWriter.name("ProjectArn");
            awsJsonWriter.value(projectArn);
        }
        if (projectPolicy.getPolicyName() != null) {
            String policyName = projectPolicy.getPolicyName();
            awsJsonWriter.name("PolicyName");
            awsJsonWriter.value(policyName);
        }
        if (projectPolicy.getPolicyRevisionId() != null) {
            String policyRevisionId = projectPolicy.getPolicyRevisionId();
            awsJsonWriter.name("PolicyRevisionId");
            awsJsonWriter.value(policyRevisionId);
        }
        if (projectPolicy.getPolicyDocument() != null) {
            String policyDocument = projectPolicy.getPolicyDocument();
            awsJsonWriter.name("PolicyDocument");
            awsJsonWriter.value(policyDocument);
        }
        if (projectPolicy.getCreationTimestamp() != null) {
            Date creationTimestamp = projectPolicy.getCreationTimestamp();
            awsJsonWriter.name("CreationTimestamp");
            awsJsonWriter.value(creationTimestamp);
        }
        if (projectPolicy.getLastUpdatedTimestamp() != null) {
            Date lastUpdatedTimestamp = projectPolicy.getLastUpdatedTimestamp();
            awsJsonWriter.name("LastUpdatedTimestamp");
            awsJsonWriter.value(lastUpdatedTimestamp);
        }
        awsJsonWriter.endObject();
    }
}
