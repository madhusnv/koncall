package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.rekognition.model.CreateDatasetRequest;
import com.amazonaws.services.rekognition.model.DatasetSource;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;
import java.io.StringWriter;

/* loaded from: classes5.dex */
public class CreateDatasetRequestMarshaller implements Marshaller<Request<CreateDatasetRequest>, CreateDatasetRequest> {
    @Override // com.amazonaws.transform.Marshaller
    public Request<CreateDatasetRequest> marshall(CreateDatasetRequest createDatasetRequest) {
        if (createDatasetRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(CreateDatasetRequest)");
        }
        DefaultRequest defaultRequest = new DefaultRequest(createDatasetRequest, "AmazonRekognition");
        defaultRequest.addHeader("X-Amz-Target", "RekognitionService.CreateDataset");
        defaultRequest.setHttpMethod(HttpMethodName.POST);
        defaultRequest.setResourcePath("/");
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();
            if (createDatasetRequest.getDatasetSource() != null) {
                DatasetSource datasetSource = createDatasetRequest.getDatasetSource();
                jsonWriter.name("DatasetSource");
                DatasetSourceJsonMarshaller.getInstance().marshall(datasetSource, jsonWriter);
            }
            if (createDatasetRequest.getDatasetType() != null) {
                String datasetType = createDatasetRequest.getDatasetType();
                jsonWriter.name("DatasetType");
                jsonWriter.value(datasetType);
            }
            if (createDatasetRequest.getProjectArn() != null) {
                String projectArn = createDatasetRequest.getProjectArn();
                jsonWriter.name("ProjectArn");
                jsonWriter.value(projectArn);
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
