package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.rekognition.model.DeleteFacesRequest;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;
import java.io.StringWriter;
import java.util.List;

/* loaded from: classes5.dex */
public class DeleteFacesRequestMarshaller implements Marshaller<Request<DeleteFacesRequest>, DeleteFacesRequest> {
    @Override // com.amazonaws.transform.Marshaller
    public Request<DeleteFacesRequest> marshall(DeleteFacesRequest deleteFacesRequest) {
        if (deleteFacesRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(DeleteFacesRequest)");
        }
        DefaultRequest defaultRequest = new DefaultRequest(deleteFacesRequest, "AmazonRekognition");
        defaultRequest.addHeader("X-Amz-Target", "RekognitionService.DeleteFaces");
        defaultRequest.setHttpMethod(HttpMethodName.POST);
        defaultRequest.setResourcePath("/");
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();
            if (deleteFacesRequest.getCollectionId() != null) {
                String collectionId = deleteFacesRequest.getCollectionId();
                jsonWriter.name("CollectionId");
                jsonWriter.value(collectionId);
            }
            if (deleteFacesRequest.getFaceIds() != null) {
                List<String> faceIds = deleteFacesRequest.getFaceIds();
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
