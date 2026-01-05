package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.rekognition.model.CreateUserRequest;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;
import java.io.StringWriter;

/* loaded from: classes5.dex */
public class CreateUserRequestMarshaller implements Marshaller<Request<CreateUserRequest>, CreateUserRequest> {
    @Override // com.amazonaws.transform.Marshaller
    public Request<CreateUserRequest> marshall(CreateUserRequest createUserRequest) {
        if (createUserRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(CreateUserRequest)");
        }
        DefaultRequest defaultRequest = new DefaultRequest(createUserRequest, "AmazonRekognition");
        defaultRequest.addHeader("X-Amz-Target", "RekognitionService.CreateUser");
        defaultRequest.setHttpMethod(HttpMethodName.POST);
        defaultRequest.setResourcePath("/");
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();
            if (createUserRequest.getCollectionId() != null) {
                String collectionId = createUserRequest.getCollectionId();
                jsonWriter.name("CollectionId");
                jsonWriter.value(collectionId);
            }
            if (createUserRequest.getUserId() != null) {
                String userId = createUserRequest.getUserId();
                jsonWriter.name("UserId");
                jsonWriter.value(userId);
            }
            if (createUserRequest.getClientRequestToken() != null) {
                String clientRequestToken = createUserRequest.getClientRequestToken();
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
