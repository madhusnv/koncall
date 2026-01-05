package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.rekognition.model.GetCelebrityRecognitionRequest;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;
import java.io.StringWriter;

/* loaded from: classes5.dex */
public class GetCelebrityRecognitionRequestMarshaller implements Marshaller<Request<GetCelebrityRecognitionRequest>, GetCelebrityRecognitionRequest> {
    @Override // com.amazonaws.transform.Marshaller
    public Request<GetCelebrityRecognitionRequest> marshall(GetCelebrityRecognitionRequest getCelebrityRecognitionRequest) {
        if (getCelebrityRecognitionRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(GetCelebrityRecognitionRequest)");
        }
        DefaultRequest defaultRequest = new DefaultRequest(getCelebrityRecognitionRequest, "AmazonRekognition");
        defaultRequest.addHeader("X-Amz-Target", "RekognitionService.GetCelebrityRecognition");
        defaultRequest.setHttpMethod(HttpMethodName.POST);
        defaultRequest.setResourcePath("/");
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();
            if (getCelebrityRecognitionRequest.getJobId() != null) {
                String jobId = getCelebrityRecognitionRequest.getJobId();
                jsonWriter.name("JobId");
                jsonWriter.value(jobId);
            }
            if (getCelebrityRecognitionRequest.getMaxResults() != null) {
                Integer maxResults = getCelebrityRecognitionRequest.getMaxResults();
                jsonWriter.name("MaxResults");
                jsonWriter.value(maxResults);
            }
            if (getCelebrityRecognitionRequest.getNextToken() != null) {
                String nextToken = getCelebrityRecognitionRequest.getNextToken();
                jsonWriter.name("NextToken");
                jsonWriter.value(nextToken);
            }
            if (getCelebrityRecognitionRequest.getSortBy() != null) {
                String sortBy = getCelebrityRecognitionRequest.getSortBy();
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
