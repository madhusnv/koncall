package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.rekognition.model.DetectLabelsRequest;
import com.amazonaws.services.rekognition.model.DetectLabelsSettings;
import com.amazonaws.services.rekognition.model.Image;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;
import java.io.StringWriter;
import java.util.List;

/* loaded from: classes5.dex */
public class DetectLabelsRequestMarshaller implements Marshaller<Request<DetectLabelsRequest>, DetectLabelsRequest> {
    @Override // com.amazonaws.transform.Marshaller
    public Request<DetectLabelsRequest> marshall(DetectLabelsRequest detectLabelsRequest) {
        if (detectLabelsRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(DetectLabelsRequest)");
        }
        DefaultRequest defaultRequest = new DefaultRequest(detectLabelsRequest, "AmazonRekognition");
        defaultRequest.addHeader("X-Amz-Target", "RekognitionService.DetectLabels");
        defaultRequest.setHttpMethod(HttpMethodName.POST);
        defaultRequest.setResourcePath("/");
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();
            if (detectLabelsRequest.getImage() != null) {
                Image image = detectLabelsRequest.getImage();
                jsonWriter.name("Image");
                ImageJsonMarshaller.getInstance().marshall(image, jsonWriter);
            }
            if (detectLabelsRequest.getMaxLabels() != null) {
                Integer maxLabels = detectLabelsRequest.getMaxLabels();
                jsonWriter.name("MaxLabels");
                jsonWriter.value(maxLabels);
            }
            if (detectLabelsRequest.getMinConfidence() != null) {
                Float minConfidence = detectLabelsRequest.getMinConfidence();
                jsonWriter.name("MinConfidence");
                jsonWriter.value(minConfidence);
            }
            if (detectLabelsRequest.getFeatures() != null) {
                List<String> features = detectLabelsRequest.getFeatures();
                jsonWriter.name("Features");
                jsonWriter.beginArray();
                for (String str : features) {
                    if (str != null) {
                        jsonWriter.value(str);
                    }
                }
                jsonWriter.endArray();
            }
            if (detectLabelsRequest.getSettings() != null) {
                DetectLabelsSettings settings = detectLabelsRequest.getSettings();
                jsonWriter.name("Settings");
                DetectLabelsSettingsJsonMarshaller.getInstance().marshall(settings, jsonWriter);
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
