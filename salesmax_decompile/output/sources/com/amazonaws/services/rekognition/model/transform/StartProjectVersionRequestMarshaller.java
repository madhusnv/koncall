package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.rekognition.model.StartProjectVersionRequest;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;
import java.io.StringWriter;

/* loaded from: classes5.dex */
public class StartProjectVersionRequestMarshaller implements Marshaller<Request<StartProjectVersionRequest>, StartProjectVersionRequest> {
    @Override // com.amazonaws.transform.Marshaller
    public Request<StartProjectVersionRequest> marshall(StartProjectVersionRequest startProjectVersionRequest) {
        if (startProjectVersionRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(StartProjectVersionRequest)");
        }
        DefaultRequest defaultRequest = new DefaultRequest(startProjectVersionRequest, "AmazonRekognition");
        defaultRequest.addHeader("X-Amz-Target", "RekognitionService.StartProjectVersion");
        defaultRequest.setHttpMethod(HttpMethodName.POST);
        defaultRequest.setResourcePath("/");
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();
            if (startProjectVersionRequest.getProjectVersionArn() != null) {
                String projectVersionArn = startProjectVersionRequest.getProjectVersionArn();
                jsonWriter.name("ProjectVersionArn");
                jsonWriter.value(projectVersionArn);
            }
            if (startProjectVersionRequest.getMinInferenceUnits() != null) {
                Integer minInferenceUnits = startProjectVersionRequest.getMinInferenceUnits();
                jsonWriter.name("MinInferenceUnits");
                jsonWriter.value(minInferenceUnits);
            }
            if (startProjectVersionRequest.getMaxInferenceUnits() != null) {
                Integer maxInferenceUnits = startProjectVersionRequest.getMaxInferenceUnits();
                jsonWriter.name("MaxInferenceUnits");
                jsonWriter.value(maxInferenceUnits);
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
