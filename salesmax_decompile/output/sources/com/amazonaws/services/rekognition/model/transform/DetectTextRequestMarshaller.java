package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.rekognition.model.DetectTextFilters;
import com.amazonaws.services.rekognition.model.DetectTextRequest;
import com.amazonaws.services.rekognition.model.Image;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;
import java.io.StringWriter;

/* loaded from: classes5.dex */
public class DetectTextRequestMarshaller implements Marshaller<Request<DetectTextRequest>, DetectTextRequest> {
    @Override // com.amazonaws.transform.Marshaller
    public Request<DetectTextRequest> marshall(DetectTextRequest detectTextRequest) {
        if (detectTextRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(DetectTextRequest)");
        }
        DefaultRequest defaultRequest = new DefaultRequest(detectTextRequest, "AmazonRekognition");
        defaultRequest.addHeader("X-Amz-Target", "RekognitionService.DetectText");
        defaultRequest.setHttpMethod(HttpMethodName.POST);
        defaultRequest.setResourcePath("/");
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();
            if (detectTextRequest.getImage() != null) {
                Image image = detectTextRequest.getImage();
                jsonWriter.name("Image");
                ImageJsonMarshaller.getInstance().marshall(image, jsonWriter);
            }
            if (detectTextRequest.getFilters() != null) {
                DetectTextFilters filters = detectTextRequest.getFilters();
                jsonWriter.name("Filters");
                DetectTextFiltersJsonMarshaller.getInstance().marshall(filters, jsonWriter);
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
