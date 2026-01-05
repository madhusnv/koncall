package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.rekognition.model.CopyProjectVersionRequest;
import com.amazonaws.services.rekognition.model.OutputConfig;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;
import java.io.StringWriter;
import java.util.Map;

/* loaded from: classes5.dex */
public class CopyProjectVersionRequestMarshaller implements Marshaller<Request<CopyProjectVersionRequest>, CopyProjectVersionRequest> {
    @Override // com.amazonaws.transform.Marshaller
    public Request<CopyProjectVersionRequest> marshall(CopyProjectVersionRequest copyProjectVersionRequest) {
        if (copyProjectVersionRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(CopyProjectVersionRequest)");
        }
        DefaultRequest defaultRequest = new DefaultRequest(copyProjectVersionRequest, "AmazonRekognition");
        defaultRequest.addHeader("X-Amz-Target", "RekognitionService.CopyProjectVersion");
        defaultRequest.setHttpMethod(HttpMethodName.POST);
        defaultRequest.setResourcePath("/");
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();
            if (copyProjectVersionRequest.getSourceProjectArn() != null) {
                String sourceProjectArn = copyProjectVersionRequest.getSourceProjectArn();
                jsonWriter.name("SourceProjectArn");
                jsonWriter.value(sourceProjectArn);
            }
            if (copyProjectVersionRequest.getSourceProjectVersionArn() != null) {
                String sourceProjectVersionArn = copyProjectVersionRequest.getSourceProjectVersionArn();
                jsonWriter.name("SourceProjectVersionArn");
                jsonWriter.value(sourceProjectVersionArn);
            }
            if (copyProjectVersionRequest.getDestinationProjectArn() != null) {
                String destinationProjectArn = copyProjectVersionRequest.getDestinationProjectArn();
                jsonWriter.name("DestinationProjectArn");
                jsonWriter.value(destinationProjectArn);
            }
            if (copyProjectVersionRequest.getVersionName() != null) {
                String versionName = copyProjectVersionRequest.getVersionName();
                jsonWriter.name("VersionName");
                jsonWriter.value(versionName);
            }
            if (copyProjectVersionRequest.getOutputConfig() != null) {
                OutputConfig outputConfig = copyProjectVersionRequest.getOutputConfig();
                jsonWriter.name("OutputConfig");
                OutputConfigJsonMarshaller.getInstance().marshall(outputConfig, jsonWriter);
            }
            if (copyProjectVersionRequest.getTags() != null) {
                Map<String, String> tags = copyProjectVersionRequest.getTags();
                jsonWriter.name("Tags");
                jsonWriter.beginObject();
                for (Map.Entry<String, String> entry : tags.entrySet()) {
                    String value = entry.getValue();
                    if (value != null) {
                        jsonWriter.name(entry.getKey());
                        jsonWriter.value(value);
                    }
                }
                jsonWriter.endObject();
            }
            if (copyProjectVersionRequest.getKmsKeyId() != null) {
                String kmsKeyId = copyProjectVersionRequest.getKmsKeyId();
                jsonWriter.name("KmsKeyId");
                jsonWriter.value(kmsKeyId);
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
