package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.rekognition.model.AssociateFacesRequest;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;
import java.io.StringWriter;
import java.util.List;

/* loaded from: classes5.dex */
public class AssociateFacesRequestMarshaller implements Marshaller<Request<AssociateFacesRequest>, AssociateFacesRequest> {
    @Override // com.amazonaws.transform.Marshaller
    public Request<AssociateFacesRequest> marshall(AssociateFacesRequest associateFacesRequest) {
        if (associateFacesRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(AssociateFacesRequest)");
        }
        DefaultRequest defaultRequest = new DefaultRequest(associateFacesRequest, "AmazonRekognition");
        defaultRequest.addHeader("X-Amz-Target", "RekognitionService.AssociateFaces");
        defaultRequest.setHttpMethod(HttpMethodName.POST);
        defaultRequest.setResourcePath("/");
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();
            if (associateFacesRequest.getCollectionId() != null) {
                String collectionId = associateFacesRequest.getCollectionId();
                jsonWriter.name("CollectionId");
                jsonWriter.value(collectionId);
            }
            if (associateFacesRequest.getUserId() != null) {
                String userId = associateFacesRequest.getUserId();
                jsonWriter.name("UserId");
                jsonWriter.value(userId);
            }
            if (associateFacesRequest.getFaceIds() != null) {
                List<String> faceIds = associateFacesRequest.getFaceIds();
                jsonWriter.name("FaceIds");
                jsonWriter.beginArray();
                for (String str : faceIds) {
                    if (str != null) {
                        jsonWriter.value(str);
                    }
                }
                jsonWriter.endArray();
            }
            if (associateFacesRequest.getUserMatchThreshold() != null) {
                Float userMatchThreshold = associateFacesRequest.getUserMatchThreshold();
                jsonWriter.name("UserMatchThreshold");
                jsonWriter.value(userMatchThreshold);
            }
            if (associateFacesRequest.getClientRequestToken() != null) {
                String clientRequestToken = associateFacesRequest.getClientRequestToken();
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
