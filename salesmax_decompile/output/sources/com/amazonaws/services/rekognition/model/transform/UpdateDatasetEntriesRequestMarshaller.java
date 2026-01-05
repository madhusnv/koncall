package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.rekognition.model.DatasetChanges;
import com.amazonaws.services.rekognition.model.UpdateDatasetEntriesRequest;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;
import java.io.StringWriter;

/* loaded from: classes5.dex */
public class UpdateDatasetEntriesRequestMarshaller implements Marshaller<Request<UpdateDatasetEntriesRequest>, UpdateDatasetEntriesRequest> {
    @Override // com.amazonaws.transform.Marshaller
    public Request<UpdateDatasetEntriesRequest> marshall(UpdateDatasetEntriesRequest updateDatasetEntriesRequest) {
        if (updateDatasetEntriesRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(UpdateDatasetEntriesRequest)");
        }
        DefaultRequest defaultRequest = new DefaultRequest(updateDatasetEntriesRequest, "AmazonRekognition");
        defaultRequest.addHeader("X-Amz-Target", "RekognitionService.UpdateDatasetEntries");
        defaultRequest.setHttpMethod(HttpMethodName.POST);
        defaultRequest.setResourcePath("/");
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();
            if (updateDatasetEntriesRequest.getDatasetArn() != null) {
                String datasetArn = updateDatasetEntriesRequest.getDatasetArn();
                jsonWriter.name("DatasetArn");
                jsonWriter.value(datasetArn);
            }
            if (updateDatasetEntriesRequest.getChanges() != null) {
                DatasetChanges changes = updateDatasetEntriesRequest.getChanges();
                jsonWriter.name("Changes");
                DatasetChangesJsonMarshaller.getInstance().marshall(changes, jsonWriter);
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
