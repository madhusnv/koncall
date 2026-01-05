package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.rekognition.model.SearchFacesRequest;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;
import java.io.StringWriter;

/* loaded from: classes5.dex */
public class SearchFacesRequestMarshaller implements Marshaller<Request<SearchFacesRequest>, SearchFacesRequest> {
    @Override // com.amazonaws.transform.Marshaller
    public Request<SearchFacesRequest> marshall(SearchFacesRequest searchFacesRequest) {
        if (searchFacesRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(SearchFacesRequest)");
        }
        DefaultRequest defaultRequest = new DefaultRequest(searchFacesRequest, "AmazonRekognition");
        defaultRequest.addHeader("X-Amz-Target", "RekognitionService.SearchFaces");
        defaultRequest.setHttpMethod(HttpMethodName.POST);
        defaultRequest.setResourcePath("/");
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();
            if (searchFacesRequest.getCollectionId() != null) {
                String collectionId = searchFacesRequest.getCollectionId();
                jsonWriter.name("CollectionId");
                jsonWriter.value(collectionId);
            }
            if (searchFacesRequest.getFaceId() != null) {
                String faceId = searchFacesRequest.getFaceId();
                jsonWriter.name("FaceId");
                jsonWriter.value(faceId);
            }
            if (searchFacesRequest.getMaxFaces() != null) {
                Integer maxFaces = searchFacesRequest.getMaxFaces();
                jsonWriter.name("MaxFaces");
                jsonWriter.value(maxFaces);
            }
            if (searchFacesRequest.getFaceMatchThreshold() != null) {
                Float faceMatchThreshold = searchFacesRequest.getFaceMatchThreshold();
                jsonWriter.name("FaceMatchThreshold");
                jsonWriter.value(faceMatchThreshold);
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
