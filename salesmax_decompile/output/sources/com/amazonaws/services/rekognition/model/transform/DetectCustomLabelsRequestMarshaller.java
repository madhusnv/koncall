package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.rekognition.model.DetectCustomLabelsRequest;
import com.amazonaws.services.rekognition.model.Image;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;
import java.io.StringWriter;

/* loaded from: classes5.dex */
public class DetectCustomLabelsRequestMarshaller implements Marshaller<Request<DetectCustomLabelsRequest>, DetectCustomLabelsRequest> {
    @Override // com.amazonaws.transform.Marshaller
    public Request<DetectCustomLabelsRequest> marshall(DetectCustomLabelsRequest detectCustomLabelsRequest) {
        if (detectCustomLabelsRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(DetectCustomLabelsRequest)");
        }
        DefaultRequest defaultRequest = new DefaultRequest(detectCustomLabelsRequest, "AmazonRekognition");
        defaultRequest.addHeader("X-Amz-Target", "RekognitionService.DetectCustomLabels");
        defaultRequest.setHttpMethod(HttpMethodName.POST);
        defaultRequest.setResourcePath("/");
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();
            if (detectCustomLabelsRequest.getProjectVersionArn() != null) {
                String projectVersionArn = detectCustomLabelsRequest.getProjectVersionArn();
                jsonWriter.name("ProjectVersionArn");
                jsonWriter.value(projectVersionArn);
            }
            if (detectCustomLabelsRequest.getImage() != null) {
                Image image = detectCustomLabelsRequest.getImage();
                jsonWriter.name("Image");
                ImageJsonMarshaller.getInstance().marshall(image, jsonWriter);
            }
            if (detectCustomLabelsRequest.getMaxResults() != null) {
                Integer maxResults = detectCustomLabelsRequest.getMaxResults();
                jsonWriter.name("MaxResults");
                jsonWriter.value(maxResults);
            }
            if (detectCustomLabelsRequest.getMinConfidence() != null) {
                Float minConfidence = detectCustomLabelsRequest.getMinConfidence();
                jsonWriter.name("MinConfidence");
                jsonWriter.value(minConfidence);
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
