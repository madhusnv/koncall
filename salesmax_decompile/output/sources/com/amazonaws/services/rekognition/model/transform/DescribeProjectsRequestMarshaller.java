package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.rekognition.model.DescribeProjectsRequest;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;
import java.io.StringWriter;
import java.util.List;

/* loaded from: classes5.dex */
public class DescribeProjectsRequestMarshaller implements Marshaller<Request<DescribeProjectsRequest>, DescribeProjectsRequest> {
    @Override // com.amazonaws.transform.Marshaller
    public Request<DescribeProjectsRequest> marshall(DescribeProjectsRequest describeProjectsRequest) {
        if (describeProjectsRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(DescribeProjectsRequest)");
        }
        DefaultRequest defaultRequest = new DefaultRequest(describeProjectsRequest, "AmazonRekognition");
        defaultRequest.addHeader("X-Amz-Target", "RekognitionService.DescribeProjects");
        defaultRequest.setHttpMethod(HttpMethodName.POST);
        defaultRequest.setResourcePath("/");
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();
            if (describeProjectsRequest.getNextToken() != null) {
                String nextToken = describeProjectsRequest.getNextToken();
                jsonWriter.name("NextToken");
                jsonWriter.value(nextToken);
            }
            if (describeProjectsRequest.getMaxResults() != null) {
                Integer maxResults = describeProjectsRequest.getMaxResults();
                jsonWriter.name("MaxResults");
                jsonWriter.value(maxResults);
            }
            if (describeProjectsRequest.getProjectNames() != null) {
                List<String> projectNames = describeProjectsRequest.getProjectNames();
                jsonWriter.name("ProjectNames");
                jsonWriter.beginArray();
                for (String str : projectNames) {
                    if (str != null) {
                        jsonWriter.value(str);
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
