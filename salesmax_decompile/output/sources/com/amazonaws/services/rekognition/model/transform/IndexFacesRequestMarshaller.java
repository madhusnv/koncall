package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.rekognition.model.Image;
import com.amazonaws.services.rekognition.model.IndexFacesRequest;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;
import java.io.StringWriter;
import java.util.List;

/* loaded from: classes5.dex */
public class IndexFacesRequestMarshaller implements Marshaller<Request<IndexFacesRequest>, IndexFacesRequest> {
    @Override // com.amazonaws.transform.Marshaller
    public Request<IndexFacesRequest> marshall(IndexFacesRequest indexFacesRequest) {
        if (indexFacesRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(IndexFacesRequest)");
        }
        DefaultRequest defaultRequest = new DefaultRequest(indexFacesRequest, "AmazonRekognition");
        defaultRequest.addHeader("X-Amz-Target", "RekognitionService.IndexFaces");
        defaultRequest.setHttpMethod(HttpMethodName.POST);
        defaultRequest.setResourcePath("/");
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();
            if (indexFacesRequest.getCollectionId() != null) {
                String collectionId = indexFacesRequest.getCollectionId();
                jsonWriter.name("CollectionId");
                jsonWriter.value(collectionId);
            }
            if (indexFacesRequest.getImage() != null) {
                Image image = indexFacesRequest.getImage();
                jsonWriter.name("Image");
                ImageJsonMarshaller.getInstance().marshall(image, jsonWriter);
            }
            if (indexFacesRequest.getExternalImageId() != null) {
                String externalImageId = indexFacesRequest.getExternalImageId();
                jsonWriter.name("ExternalImageId");
                jsonWriter.value(externalImageId);
            }
            if (indexFacesRequest.getDetectionAttributes() != null) {
                List<String> detectionAttributes = indexFacesRequest.getDetectionAttributes();
                jsonWriter.name("DetectionAttributes");
                jsonWriter.beginArray();
                for (String str : detectionAttributes) {
                    if (str != null) {
                        jsonWriter.value(str);
                    }
                }
                jsonWriter.endArray();
            }
            if (indexFacesRequest.getMaxFaces() != null) {
                Integer maxFaces = indexFacesRequest.getMaxFaces();
                jsonWriter.name("MaxFaces");
                jsonWriter.value(maxFaces);
            }
            if (indexFacesRequest.getQualityFilter() != null) {
                String qualityFilter = indexFacesRequest.getQualityFilter();
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
