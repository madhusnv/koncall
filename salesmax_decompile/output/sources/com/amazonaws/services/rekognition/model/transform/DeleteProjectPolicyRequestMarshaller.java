package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.rekognition.model.DeleteProjectPolicyRequest;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;
import java.io.StringWriter;

/* loaded from: classes5.dex */
public class DeleteProjectPolicyRequestMarshaller implements Marshaller<Request<DeleteProjectPolicyRequest>, DeleteProjectPolicyRequest> {
    @Override // com.amazonaws.transform.Marshaller
    public Request<DeleteProjectPolicyRequest> marshall(DeleteProjectPolicyRequest deleteProjectPolicyRequest) {
        if (deleteProjectPolicyRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(DeleteProjectPolicyRequest)");
        }
        DefaultRequest defaultRequest = new DefaultRequest(deleteProjectPolicyRequest, "AmazonRekognition");
        defaultRequest.addHeader("X-Amz-Target", "RekognitionService.DeleteProjectPolicy");
        defaultRequest.setHttpMethod(HttpMethodName.POST);
        defaultRequest.setResourcePath("/");
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();
            if (deleteProjectPolicyRequest.getProjectArn() != null) {
                String projectArn = deleteProjectPolicyRequest.getProjectArn();
                jsonWriter.name("ProjectArn");
                jsonWriter.value(projectArn);
            }
            if (deleteProjectPolicyRequest.getPolicyName() != null) {
                String policyName = deleteProjectPolicyRequest.getPolicyName();
                jsonWriter.name("PolicyName");
                jsonWriter.value(policyName);
            }
            if (deleteProjectPolicyRequest.getPolicyRevisionId() != null) {
                String policyRevisionId = deleteProjectPolicyRequest.getPolicyRevisionId();
                jsonWriter.name("PolicyRevisionId");
                jsonWriter.value(policyRevisionId);
            }
            jsonWriter.endObject();
            jsonWriter.close();
            String string = stringWriter.toString();
            byte[] bytes = string.getBytes(StringUtils.UTF8);
            defaultRequest.setContent(new StringInputStream(string));
            defaultRequest.addHeader("Content-Length", Integer.toString(bytes.length));
            if (!defaultRequest.getHeaders().containsKey("Content-Type")) {
                defaultRequest.addHeader("Content-Type", "application/x-amz-json-1.1");
            }
            return defaultRequest;
        } catch (Throwable th) {
            throw new AmazonClientException("Unable to marshall request to JSON: " + th.getMessage(), th);
        }
    }
}
