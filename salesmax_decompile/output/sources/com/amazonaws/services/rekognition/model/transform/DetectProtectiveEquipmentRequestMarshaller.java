package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.rekognition.model.DetectProtectiveEquipmentRequest;
import com.amazonaws.services.rekognition.model.Image;
import com.amazonaws.services.rekognition.model.ProtectiveEquipmentSummarizationAttributes;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;
import java.io.StringWriter;

/* loaded from: classes5.dex */
public class DetectProtectiveEquipmentRequestMarshaller implements Marshaller<Request<DetectProtectiveEquipmentRequest>, DetectProtectiveEquipmentRequest> {
    @Override // com.amazonaws.transform.Marshaller
    public Request<DetectProtectiveEquipmentRequest> marshall(DetectProtectiveEquipmentRequest detectProtectiveEquipmentRequest) {
        if (detectProtectiveEquipmentRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(DetectProtectiveEquipmentRequest)");
        }
        DefaultRequest defaultRequest = new DefaultRequest(detectProtectiveEquipmentRequest, "AmazonRekognition");
        defaultRequest.addHeader("X-Amz-Target", "RekognitionService.DetectProtectiveEquipment");
        defaultRequest.setHttpMethod(HttpMethodName.POST);
        defaultRequest.setResourcePath("/");
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();
            if (detectProtectiveEquipmentRequest.getImage() != null) {
                Image image = detectProtectiveEquipmentRequest.getImage();
                jsonWriter.name("Image");
                ImageJsonMarshaller.getInstance().marshall(image, jsonWriter);
            }
            if (detectProtectiveEquipmentRequest.getSummarizationAttributes() != null) {
                ProtectiveEquipmentSummarizationAttributes summarizationAttributes = detectProtectiveEquipmentRequest.getSummarizationAttributes();
                jsonWriter.name("SummarizationAttributes");
                ProtectiveEquipmentSummarizationAttributesJsonMarshaller.getInstance().marshall(summarizationAttributes, jsonWriter);
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
