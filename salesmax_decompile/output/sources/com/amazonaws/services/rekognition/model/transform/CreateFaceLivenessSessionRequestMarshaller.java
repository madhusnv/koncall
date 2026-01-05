package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.rekognition.model.CreateFaceLivenessSessionRequest;
import com.amazonaws.services.rekognition.model.CreateFaceLivenessSessionRequestSettings;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;
import java.io.StringWriter;

/* loaded from: classes5.dex */
public class CreateFaceLivenessSessionRequestMarshaller implements Marshaller<Request<CreateFaceLivenessSessionRequest>, CreateFaceLivenessSessionRequest> {
    @Override // com.amazonaws.transform.Marshaller
    public Request<CreateFaceLivenessSessionRequest> marshall(CreateFaceLivenessSessionRequest createFaceLivenessSessionRequest) {
        if (createFaceLivenessSessionRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(CreateFaceLivenessSessionRequest)");
        }
        DefaultRequest defaultRequest = new DefaultRequest(createFaceLivenessSessionRequest, "AmazonRekognition");
        defaultRequest.addHeader("X-Amz-Target", "RekognitionService.CreateFaceLivenessSession");
        defaultRequest.setHttpMethod(HttpMethodName.POST);
        defaultRequest.setResourcePath("/");
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();
            if (createFaceLivenessSessionRequest.getKmsKeyId() != null) {
                String kmsKeyId = createFaceLivenessSessionRequest.getKmsKeyId();
                jsonWriter.name("KmsKeyId");
                jsonWriter.value(kmsKeyId);
            }
            if (createFaceLivenessSessionRequest.getSettings() != null) {
                CreateFaceLivenessSessionRequestSettings settings = createFaceLivenessSessionRequest.getSettings();
                jsonWriter.name("Settings");
                CreateFaceLivenessSessionRequestSettingsJsonMarshaller.getInstance().marshall(settings, jsonWriter);
            }
            if (createFaceLivenessSessionRequest.getClientRequestToken() != null) {
                String clientRequestToken = createFaceLivenessSessionRequest.getClientRequestToken();
                jsonWriter.name("ClientRequestToken");
                jsonWriter.value(clientRequestToken);
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
