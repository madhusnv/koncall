package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.rekognition.model.GetPersonTrackingRequest;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;
import java.io.StringWriter;

/* loaded from: classes5.dex */
public class GetPersonTrackingRequestMarshaller implements Marshaller<Request<GetPersonTrackingRequest>, GetPersonTrackingRequest> {
    @Override // com.amazonaws.transform.Marshaller
    public Request<GetPersonTrackingRequest> marshall(GetPersonTrackingRequest getPersonTrackingRequest) {
        if (getPersonTrackingRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(GetPersonTrackingRequest)");
        }
        DefaultRequest defaultRequest = new DefaultRequest(getPersonTrackingRequest, "AmazonRekognition");
        defaultRequest.addHeader("X-Amz-Target", "RekognitionService.GetPersonTracking");
        defaultRequest.setHttpMethod(HttpMethodName.POST);
        defaultRequest.setResourcePath("/");
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();
            if (getPersonTrackingRequest.getJobId() != null) {
                String jobId = getPersonTrackingRequest.getJobId();
                jsonWriter.name("JobId");
                jsonWriter.value(jobId);
            }
            if (getPersonTrackingRequest.getMaxResults() != null) {
                Integer maxResults = getPersonTrackingRequest.getMaxResults();
                jsonWriter.name("MaxResults");
                jsonWriter.value(maxResults);
            }
            if (getPersonTrackingRequest.getNextToken() != null) {
                String nextToken = getPersonTrackingRequest.getNextToken();
                jsonWriter.name("NextToken");
                jsonWriter.value(nextToken);
            }
            if (getPersonTrackingRequest.getSortBy() != null) {
                String sortBy = getPersonTrackingRequest.getSortBy();
                jsonWriter.name("SortBy");
                jsonWriter.value(sortBy);
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
