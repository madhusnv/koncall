package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.rekognition.model.GetContentModerationRequest;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;
import java.io.StringWriter;

/* loaded from: classes5.dex */
public class GetContentModerationRequestMarshaller implements Marshaller<Request<GetContentModerationRequest>, GetContentModerationRequest> {
    @Override // com.amazonaws.transform.Marshaller
    public Request<GetContentModerationRequest> marshall(GetContentModerationRequest getContentModerationRequest) {
        if (getContentModerationRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(GetContentModerationRequest)");
        }
        DefaultRequest defaultRequest = new DefaultRequest(getContentModerationRequest, "AmazonRekognition");
        defaultRequest.addHeader("X-Amz-Target", "RekognitionService.GetContentModeration");
        defaultRequest.setHttpMethod(HttpMethodName.POST);
        defaultRequest.setResourcePath("/");
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();
            if (getContentModerationRequest.getJobId() != null) {
                String jobId = getContentModerationRequest.getJobId();
                jsonWriter.name("JobId");
                jsonWriter.value(jobId);
            }
            if (getContentModerationRequest.getMaxResults() != null) {
                Integer maxResults = getContentModerationRequest.getMaxResults();
                jsonWriter.name("MaxResults");
                jsonWriter.value(maxResults);
            }
            if (getContentModerationRequest.getNextToken() != null) {
                String nextToken = getContentModerationRequest.getNextToken();
                jsonWriter.name("NextToken");
                jsonWriter.value(nextToken);
            }
            if (getContentModerationRequest.getSortBy() != null) {
                String sortBy = getContentModerationRequest.getSortBy();
                jsonWriter.name("SortBy");
                jsonWriter.value(sortBy);
            }
            if (getContentModerationRequest.getAggregateBy() != null) {
                String aggregateBy = getContentModerationRequest.getAggregateBy();
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
