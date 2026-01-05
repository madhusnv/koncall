package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.rekognition.model.ListDatasetEntriesRequest;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;
import java.io.StringWriter;
import java.util.List;

/* loaded from: classes5.dex */
public class ListDatasetEntriesRequestMarshaller implements Marshaller<Request<ListDatasetEntriesRequest>, ListDatasetEntriesRequest> {
    @Override // com.amazonaws.transform.Marshaller
    public Request<ListDatasetEntriesRequest> marshall(ListDatasetEntriesRequest listDatasetEntriesRequest) {
        if (listDatasetEntriesRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(ListDatasetEntriesRequest)");
        }
        DefaultRequest defaultRequest = new DefaultRequest(listDatasetEntriesRequest, "AmazonRekognition");
        defaultRequest.addHeader("X-Amz-Target", "RekognitionService.ListDatasetEntries");
        defaultRequest.setHttpMethod(HttpMethodName.POST);
        defaultRequest.setResourcePath("/");
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();
            if (listDatasetEntriesRequest.getDatasetArn() != null) {
                String datasetArn = listDatasetEntriesRequest.getDatasetArn();
                jsonWriter.name("DatasetArn");
                jsonWriter.value(datasetArn);
            }
            if (listDatasetEntriesRequest.getContainsLabels() != null) {
                List<String> containsLabels = listDatasetEntriesRequest.getContainsLabels();
                jsonWriter.name("ContainsLabels");
                jsonWriter.beginArray();
                for (String str : containsLabels) {
                    if (str != null) {
                        jsonWriter.value(str);
                    }
                }
                jsonWriter.endArray();
            }
            if (listDatasetEntriesRequest.getLabeled() != null) {
                Boolean labeled = listDatasetEntriesRequest.getLabeled();
                jsonWriter.name("Labeled");
                jsonWriter.value(labeled.booleanValue());
            }
            if (listDatasetEntriesRequest.getSourceRefContains() != null) {
                String sourceRefContains = listDatasetEntriesRequest.getSourceRefContains();
                jsonWriter.name("SourceRefContains");
                jsonWriter.value(sourceRefContains);
            }
            if (listDatasetEntriesRequest.getHasErrors() != null) {
                Boolean hasErrors = listDatasetEntriesRequest.getHasErrors();
                jsonWriter.name("HasErrors");
                jsonWriter.value(hasErrors.booleanValue());
            }
            if (listDatasetEntriesRequest.getNextToken() != null) {
                String nextToken = listDatasetEntriesRequest.getNextToken();
                jsonWriter.name("NextToken");
                jsonWriter.value(nextToken);
            }
            if (listDatasetEntriesRequest.getMaxResults() != null) {
                Integer maxResults = listDatasetEntriesRequest.getMaxResults();
                jsonWriter.name("MaxResults");
                jsonWriter.value(maxResults);
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
