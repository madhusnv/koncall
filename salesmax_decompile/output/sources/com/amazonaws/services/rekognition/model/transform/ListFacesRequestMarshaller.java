package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.rekognition.model.ListFacesRequest;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;
import java.io.StringWriter;
import java.util.List;

/* loaded from: classes5.dex */
public class ListFacesRequestMarshaller implements Marshaller<Request<ListFacesRequest>, ListFacesRequest> {
    @Override // com.amazonaws.transform.Marshaller
    public Request<ListFacesRequest> marshall(ListFacesRequest listFacesRequest) {
        if (listFacesRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(ListFacesRequest)");
        }
        DefaultRequest defaultRequest = new DefaultRequest(listFacesRequest, "AmazonRekognition");
        defaultRequest.addHeader("X-Amz-Target", "RekognitionService.ListFaces");
        defaultRequest.setHttpMethod(HttpMethodName.POST);
        defaultRequest.setResourcePath("/");
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();
            if (listFacesRequest.getCollectionId() != null) {
                String collectionId = listFacesRequest.getCollectionId();
                jsonWriter.name("CollectionId");
                jsonWriter.value(collectionId);
            }
            if (listFacesRequest.getNextToken() != null) {
                String nextToken = listFacesRequest.getNextToken();
                jsonWriter.name("NextToken");
                jsonWriter.value(nextToken);
            }
            if (listFacesRequest.getMaxResults() != null) {
                Integer maxResults = listFacesRequest.getMaxResults();
                jsonWriter.name("MaxResults");
                jsonWriter.value(maxResults);
            }
            if (listFacesRequest.getUserId() != null) {
                String userId = listFacesRequest.getUserId();
                jsonWriter.name("UserId");
                jsonWriter.value(userId);
            }
            if (listFacesRequest.getFaceIds() != null) {
                List<String> faceIds = listFacesRequest.getFaceIds();
                jsonWriter.name("FaceIds");
                jsonWriter.beginArray();
                for (String str : faceIds) {
                    if (str != null) {
                        jsonWriter.value(str);
                    }
                }
                jsonWriter.endArray();
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
