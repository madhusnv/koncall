package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.rekognition.model.CreateCollectionRequest;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;
import java.io.StringWriter;
import java.util.Map;

/* loaded from: classes5.dex */
public class CreateCollectionRequestMarshaller implements Marshaller<Request<CreateCollectionRequest>, CreateCollectionRequest> {
    @Override // com.amazonaws.transform.Marshaller
    public Request<CreateCollectionRequest> marshall(CreateCollectionRequest createCollectionRequest) {
        if (createCollectionRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(CreateCollectionRequest)");
        }
        DefaultRequest defaultRequest = new DefaultRequest(createCollectionRequest, "AmazonRekognition");
        defaultRequest.addHeader("X-Amz-Target", "RekognitionService.CreateCollection");
        defaultRequest.setHttpMethod(HttpMethodName.POST);
        defaultRequest.setResourcePath("/");
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();
            if (createCollectionRequest.getCollectionId() != null) {
                String collectionId = createCollectionRequest.getCollectionId();
                jsonWriter.name("CollectionId");
                jsonWriter.value(collectionId);
            }
            if (createCollectionRequest.getTags() != null) {
                Map<String, String> tags = createCollectionRequest.getTags();
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
