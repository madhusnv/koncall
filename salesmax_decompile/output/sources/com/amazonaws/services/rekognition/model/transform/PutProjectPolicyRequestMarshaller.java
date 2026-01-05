package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.rekognition.model.PutProjectPolicyRequest;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;
import java.io.StringWriter;

/* loaded from: classes5.dex */
public class PutProjectPolicyRequestMarshaller implements Marshaller<Request<PutProjectPolicyRequest>, PutProjectPolicyRequest> {
    @Override // com.amazonaws.transform.Marshaller
    public Request<PutProjectPolicyRequest> marshall(PutProjectPolicyRequest putProjectPolicyRequest) {
        if (putProjectPolicyRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(PutProjectPolicyRequest)");
        }
        DefaultRequest defaultRequest = new DefaultRequest(putProjectPolicyRequest, "AmazonRekognition");
        defaultRequest.addHeader("X-Amz-Target", "RekognitionService.PutProjectPolicy");
        defaultRequest.setHttpMethod(HttpMethodName.POST);
        defaultRequest.setResourcePath("/");
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();
            if (putProjectPolicyRequest.getProjectArn() != null) {
                String projectArn = putProjectPolicyRequest.getProjectArn();
                jsonWriter.name("ProjectArn");
                jsonWriter.value(projectArn);
            }
            if (putProjectPolicyRequest.getPolicyName() != null) {
                String policyName = putProjectPolicyRequest.getPolicyName();
                jsonWriter.name("PolicyName");
                jsonWriter.value(policyName);
            }
            if (putProjectPolicyRequest.getPolicyRevisionId() != null) {
                String policyRevisionId = putProjectPolicyRequest.getPolicyRevisionId();
                jsonWriter.name("PolicyRevisionId");
                jsonWriter.value(policyRevisionId);
            }
            if (putProjectPolicyRequest.getPolicyDocument() != null) {
                String policyDocument = putProjectPolicyRequest.getPolicyDocument();
                jsonWriter.name("PolicyDocument");
                jsonWriter.value(policyDocument);
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
