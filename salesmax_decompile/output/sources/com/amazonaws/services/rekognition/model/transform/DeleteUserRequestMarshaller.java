package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.rekognition.model.DeleteUserRequest;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;
import java.io.StringWriter;

/* loaded from: classes5.dex */
public class DeleteUserRequestMarshaller implements Marshaller<Request<DeleteUserRequest>, DeleteUserRequest> {
    @Override // com.amazonaws.transform.Marshaller
    public Request<DeleteUserRequest> marshall(DeleteUserRequest deleteUserRequest) {
        if (deleteUserRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(DeleteUserRequest)");
        }
        DefaultRequest defaultRequest = new DefaultRequest(deleteUserRequest, "AmazonRekognition");
        defaultRequest.addHeader("X-Amz-Target", "RekognitionService.DeleteUser");
        defaultRequest.setHttpMethod(HttpMethodName.POST);
        defaultRequest.setResourcePath("/");
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();
            if (deleteUserRequest.getCollectionId() != null) {
                String collectionId = deleteUserRequest.getCollectionId();
                jsonWriter.name("CollectionId");
                jsonWriter.value(collectionId);
            }
            if (deleteUserRequest.getUserId() != null) {
                String userId = deleteUserRequest.getUserId();
                jsonWriter.name("UserId");
                jsonWriter.value(userId);
            }
            if (deleteUserRequest.getClientRequestToken() != null) {
                String clientRequestToken = deleteUserRequest.getClientRequestToken();
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
