package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.rekognition.model.GetLabelDetectionRequest;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;
import java.io.StringWriter;

/* loaded from: classes5.dex */
public class GetLabelDetectionRequestMarshaller implements Marshaller<Request<GetLabelDetectionRequest>, GetLabelDetectionRequest> {
    @Override // com.amazonaws.transform.Marshaller
    public Request<GetLabelDetectionRequest> marshall(GetLabelDetectionRequest getLabelDetectionRequest) {
        if (getLabelDetectionRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(GetLabelDetectionRequest)");
        }
        DefaultRequest defaultRequest = new DefaultRequest(getLabelDetectionRequest, "AmazonRekognition");
        defaultRequest.addHeader("X-Amz-Target", "RekognitionService.GetLabelDetection");
        defaultRequest.setHttpMethod(HttpMethodName.POST);
        defaultRequest.setResourcePath("/");
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();
            if (getLabelDetectionRequest.getJobId() != null) {
                String jobId = getLabelDetectionRequest.getJobId();
                jsonWriter.name("JobId");
                jsonWriter.value(jobId);
            }
            if (getLabelDetectionRequest.getMaxResults() != null) {
                Integer maxResults = getLabelDetectionRequest.getMaxResults();
                jsonWriter.name("MaxResults");
                jsonWriter.value(maxResults);
            }
            if (getLabelDetectionRequest.getNextToken() != null) {
                String nextToken = getLabelDetectionRequest.getNextToken();
                jsonWriter.name("NextToken");
                jsonWriter.value(nextToken);
            }
            if (getLabelDetectionRequest.getSortBy() != null) {
                String sortBy = getLabelDetectionRequest.getSortBy();
                jsonWriter.name("SortBy");
                jsonWriter.value(sortBy);
            }
            if (getLabelDetectionRequest.getAggregateBy() != null) {
                String aggregateBy = getLabelDetectionRequest.getAggregateBy();
                jsonWriter.name("AggregateBy");
                jsonWriter.value(aggregateBy);
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
