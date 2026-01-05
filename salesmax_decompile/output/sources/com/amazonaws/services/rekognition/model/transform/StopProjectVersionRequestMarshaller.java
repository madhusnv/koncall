package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.rekognition.model.StopProjectVersionRequest;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;
import java.io.StringWriter;

/* loaded from: classes5.dex */
public class StopProjectVersionRequestMarshaller implements Marshaller<Request<StopProjectVersionRequest>, StopProjectVersionRequest> {
    @Override // com.amazonaws.transform.Marshaller
    public Request<StopProjectVersionRequest> marshall(StopProjectVersionRequest stopProjectVersionRequest) {
        if (stopProjectVersionRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(StopProjectVersionRequest)");
        }
        DefaultRequest defaultRequest = new DefaultRequest(stopProjectVersionRequest, "AmazonRekognition");
        defaultRequest.addHeader("X-Amz-Target", "RekognitionService.StopProjectVersion");
        defaultRequest.setHttpMethod(HttpMethodName.POST);
        defaultRequest.setResourcePath("/");
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();
            if (stopProjectVersionRequest.getProjectVersionArn() != null) {
                String projectVersionArn = stopProjectVersionRequest.getProjectVersionArn();
                jsonWriter.name("ProjectVersionArn");
                jsonWriter.value(projectVersionArn);
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
