package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.rekognition.model.DescribeProjectVersionsRequest;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;
import java.io.StringWriter;
import java.util.List;

/* loaded from: classes5.dex */
public class DescribeProjectVersionsRequestMarshaller implements Marshaller<Request<DescribeProjectVersionsRequest>, DescribeProjectVersionsRequest> {
    @Override // com.amazonaws.transform.Marshaller
    public Request<DescribeProjectVersionsRequest> marshall(DescribeProjectVersionsRequest describeProjectVersionsRequest) {
        if (describeProjectVersionsRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(DescribeProjectVersionsRequest)");
        }
        DefaultRequest defaultRequest = new DefaultRequest(describeProjectVersionsRequest, "AmazonRekognition");
        defaultRequest.addHeader("X-Amz-Target", "RekognitionService.DescribeProjectVersions");
        defaultRequest.setHttpMethod(HttpMethodName.POST);
        defaultRequest.setResourcePath("/");
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();
            if (describeProjectVersionsRequest.getProjectArn() != null) {
                String projectArn = describeProjectVersionsRequest.getProjectArn();
                jsonWriter.name("ProjectArn");
                jsonWriter.value(projectArn);
            }
            if (describeProjectVersionsRequest.getVersionNames() != null) {
                List<String> versionNames = describeProjectVersionsRequest.getVersionNames();
                jsonWriter.name("VersionNames");
                jsonWriter.beginArray();
                for (String str : versionNames) {
                    if (str != null) {
                        jsonWriter.value(str);
                    }
                }
                jsonWriter.endArray();
            }
            if (describeProjectVersionsRequest.getNextToken() != null) {
                String nextToken = describeProjectVersionsRequest.getNextToken();
                jsonWriter.name("NextToken");
                jsonWriter.value(nextToken);
            }
            if (describeProjectVersionsRequest.getMaxResults() != null) {
                Integer maxResults = describeProjectVersionsRequest.getMaxResults();
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
