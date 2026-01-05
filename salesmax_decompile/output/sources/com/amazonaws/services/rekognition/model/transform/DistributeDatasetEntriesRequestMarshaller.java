package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.rekognition.model.DistributeDataset;
import com.amazonaws.services.rekognition.model.DistributeDatasetEntriesRequest;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;
import java.io.StringWriter;
import java.util.List;

/* loaded from: classes5.dex */
public class DistributeDatasetEntriesRequestMarshaller implements Marshaller<Request<DistributeDatasetEntriesRequest>, DistributeDatasetEntriesRequest> {
    @Override // com.amazonaws.transform.Marshaller
    public Request<DistributeDatasetEntriesRequest> marshall(DistributeDatasetEntriesRequest distributeDatasetEntriesRequest) {
        if (distributeDatasetEntriesRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(DistributeDatasetEntriesRequest)");
        }
        DefaultRequest defaultRequest = new DefaultRequest(distributeDatasetEntriesRequest, "AmazonRekognition");
        defaultRequest.addHeader("X-Amz-Target", "RekognitionService.DistributeDatasetEntries");
        defaultRequest.setHttpMethod(HttpMethodName.POST);
        defaultRequest.setResourcePath("/");
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();
            if (distributeDatasetEntriesRequest.getDatasets() != null) {
                List<DistributeDataset> datasets = distributeDatasetEntriesRequest.getDatasets();
                jsonWriter.name("Datasets");
                jsonWriter.beginArray();
                for (DistributeDataset distributeDataset : datasets) {
                    if (distributeDataset != null) {
                        DistributeDatasetJsonMarshaller.getInstance().marshall(distributeDataset, jsonWriter);
                    }
                }
                jsonWriter.endArray();
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
