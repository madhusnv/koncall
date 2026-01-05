package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.rekognition.model.CreateProjectVersionRequest;
import com.amazonaws.services.rekognition.model.OutputConfig;
import com.amazonaws.services.rekognition.model.TestingData;
import com.amazonaws.services.rekognition.model.TrainingData;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;
import java.io.StringWriter;
import java.util.Map;

/* loaded from: classes5.dex */
public class CreateProjectVersionRequestMarshaller implements Marshaller<Request<CreateProjectVersionRequest>, CreateProjectVersionRequest> {
    @Override // com.amazonaws.transform.Marshaller
    public Request<CreateProjectVersionRequest> marshall(CreateProjectVersionRequest createProjectVersionRequest) {
        if (createProjectVersionRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(CreateProjectVersionRequest)");
        }
        DefaultRequest defaultRequest = new DefaultRequest(createProjectVersionRequest, "AmazonRekognition");
        defaultRequest.addHeader("X-Amz-Target", "RekognitionService.CreateProjectVersion");
        defaultRequest.setHttpMethod(HttpMethodName.POST);
        defaultRequest.setResourcePath("/");
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();
            if (createProjectVersionRequest.getProjectArn() != null) {
                String projectArn = createProjectVersionRequest.getProjectArn();
                jsonWriter.name("ProjectArn");
                jsonWriter.value(projectArn);
            }
            if (createProjectVersionRequest.getVersionName() != null) {
                String versionName = createProjectVersionRequest.getVersionName();
                jsonWriter.name("VersionName");
                jsonWriter.value(versionName);
            }
            if (createProjectVersionRequest.getOutputConfig() != null) {
                OutputConfig outputConfig = createProjectVersionRequest.getOutputConfig();
                jsonWriter.name("OutputConfig");
                OutputConfigJsonMarshaller.getInstance().marshall(outputConfig, jsonWriter);
            }
            if (createProjectVersionRequest.getTrainingData() != null) {
                TrainingData trainingData = createProjectVersionRequest.getTrainingData();
                jsonWriter.name("TrainingData");
                TrainingDataJsonMarshaller.getInstance().marshall(trainingData, jsonWriter);
            }
            if (createProjectVersionRequest.getTestingData() != null) {
                TestingData testingData = createProjectVersionRequest.getTestingData();
                jsonWriter.name("TestingData");
                TestingDataJsonMarshaller.getInstance().marshall(testingData, jsonWriter);
            }
            if (createProjectVersionRequest.getTags() != null) {
                Map<String, String> tags = createProjectVersionRequest.getTags();
                jsonWriter.name("Tags");
                jsonWriter.beginObject();
                for (Map.Entry<String, String> entry : tags.entrySet()) {
                    String value = entry.getValue();
                    if (value != null) {
                        jsonWriter.name(entry.getKey());
                        jsonWriter.value(value);
                    }
                }
                jsonWriter.endObject();
            }
            if (createProjectVersionRequest.getKmsKeyId() != null) {
                String kmsKeyId = createProjectVersionRequest.getKmsKeyId();
                jsonWriter.name("KmsKeyId");
                jsonWriter.value(kmsKeyId);
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
