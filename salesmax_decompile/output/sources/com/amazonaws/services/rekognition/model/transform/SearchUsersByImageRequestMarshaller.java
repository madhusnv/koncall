package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.rekognition.model.Image;
import com.amazonaws.services.rekognition.model.SearchUsersByImageRequest;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;
import java.io.StringWriter;

/* loaded from: classes5.dex */
public class SearchUsersByImageRequestMarshaller implements Marshaller<Request<SearchUsersByImageRequest>, SearchUsersByImageRequest> {
    @Override // com.amazonaws.transform.Marshaller
    public Request<SearchUsersByImageRequest> marshall(SearchUsersByImageRequest searchUsersByImageRequest) {
        if (searchUsersByImageRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(SearchUsersByImageRequest)");
        }
        DefaultRequest defaultRequest = new DefaultRequest(searchUsersByImageRequest, "AmazonRekognition");
        defaultRequest.addHeader("X-Amz-Target", "RekognitionService.SearchUsersByImage");
        defaultRequest.setHttpMethod(HttpMethodName.POST);
        defaultRequest.setResourcePath("/");
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();
            if (searchUsersByImageRequest.getCollectionId() != null) {
                String collectionId = searchUsersByImageRequest.getCollectionId();
                jsonWriter.name("CollectionId");
                jsonWriter.value(collectionId);
            }
            if (searchUsersByImageRequest.getImage() != null) {
                Image image = searchUsersByImageRequest.getImage();
                jsonWriter.name("Image");
                ImageJsonMarshaller.getInstance().marshall(image, jsonWriter);
            }
            if (searchUsersByImageRequest.getUserMatchThreshold() != null) {
                Float userMatchThreshold = searchUsersByImageRequest.getUserMatchThreshold();
                jsonWriter.name("UserMatchThreshold");
                jsonWriter.value(userMatchThreshold);
            }
            if (searchUsersByImageRequest.getMaxUsers() != null) {
                Integer maxUsers = searchUsersByImageRequest.getMaxUsers();
                jsonWriter.name("MaxUsers");
                jsonWriter.value(maxUsers);
            }
            if (searchUsersByImageRequest.getQualityFilter() != null) {
                String qualityFilter = searchUsersByImageRequest.getQualityFilter();
                jsonWriter.name("QualityFilter");
                jsonWriter.value(qualityFilter);
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
