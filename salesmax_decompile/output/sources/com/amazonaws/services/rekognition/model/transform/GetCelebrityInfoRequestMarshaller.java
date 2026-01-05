package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.auth.policy.internal.JsonDocumentFields;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.rekognition.model.GetCelebrityInfoRequest;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;
import java.io.StringWriter;

/* loaded from: classes5.dex */
public class GetCelebrityInfoRequestMarshaller implements Marshaller<Request<GetCelebrityInfoRequest>, GetCelebrityInfoRequest> {
    @Override // com.amazonaws.transform.Marshaller
    public Request<GetCelebrityInfoRequest> marshall(GetCelebrityInfoRequest getCelebrityInfoRequest) {
        if (getCelebrityInfoRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(GetCelebrityInfoRequest)");
        }
        DefaultRequest defaultRequest = new DefaultRequest(getCelebrityInfoRequest, "AmazonRekognition");
        defaultRequest.addHeader("X-Amz-Target", "RekognitionService.GetCelebrityInfo");
        defaultRequest.setHttpMethod(HttpMethodName.POST);
        defaultRequest.setResourcePath("/");
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();
            if (getCelebrityInfoRequest.getId() != null) {
                String id = getCelebrityInfoRequest.getId();
                jsonWriter.name(JsonDocumentFields.POLICY_ID);
                jsonWriter.value(id);
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
