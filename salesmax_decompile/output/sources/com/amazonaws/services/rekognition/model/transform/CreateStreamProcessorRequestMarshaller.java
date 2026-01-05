package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.rekognition.model.CreateStreamProcessorRequest;
import com.amazonaws.services.rekognition.model.RegionOfInterest;
import com.amazonaws.services.rekognition.model.StreamProcessorDataSharingPreference;
import com.amazonaws.services.rekognition.model.StreamProcessorInput;
import com.amazonaws.services.rekognition.model.StreamProcessorNotificationChannel;
import com.amazonaws.services.rekognition.model.StreamProcessorOutput;
import com.amazonaws.services.rekognition.model.StreamProcessorSettings;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;
import java.io.StringWriter;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class CreateStreamProcessorRequestMarshaller implements Marshaller<Request<CreateStreamProcessorRequest>, CreateStreamProcessorRequest> {
    @Override // com.amazonaws.transform.Marshaller
    public Request<CreateStreamProcessorRequest> marshall(CreateStreamProcessorRequest createStreamProcessorRequest) {
        if (createStreamProcessorRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(CreateStreamProcessorRequest)");
        }
        DefaultRequest defaultRequest = new DefaultRequest(createStreamProcessorRequest, "AmazonRekognition");
        defaultRequest.addHeader("X-Amz-Target", "RekognitionService.CreateStreamProcessor");
        defaultRequest.setHttpMethod(HttpMethodName.POST);
        defaultRequest.setResourcePath("/");
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();
            if (createStreamProcessorRequest.getInput() != null) {
                StreamProcessorInput input = createStreamProcessorRequest.getInput();
                jsonWriter.name("Input");
                StreamProcessorInputJsonMarshaller.getInstance().marshall(input, jsonWriter);
            }
            if (createStreamProcessorRequest.getOutput() != null) {
                StreamProcessorOutput output = createStreamProcessorRequest.getOutput();
                jsonWriter.name("Output");
                StreamProcessorOutputJsonMarshaller.getInstance().marshall(output, jsonWriter);
            }
            if (createStreamProcessorRequest.getName() != null) {
                String name = createStreamProcessorRequest.getName();
                jsonWriter.name("Name");
                jsonWriter.value(name);
            }
            if (createStreamProcessorRequest.getSettings() != null) {
                StreamProcessorSettings settings = createStreamProcessorRequest.getSettings();
                jsonWriter.name("Settings");
                StreamProcessorSettingsJsonMarshaller.getInstance().marshall(settings, jsonWriter);
            }
            if (createStreamProcessorRequest.getRoleArn() != null) {
                String roleArn = createStreamProcessorRequest.getRoleArn();
                jsonWriter.name("RoleArn");
                jsonWriter.value(roleArn);
            }
            if (createStreamProcessorRequest.getTags() != null) {
                Map<String, String> tags = createStreamProcessorRequest.getTags();
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
            if (createStreamProcessorRequest.getNotificationChannel() != null) {
                StreamProcessorNotificationChannel notificationChannel = createStreamProcessorRequest.getNotificationChannel();
                jsonWriter.name("NotificationChannel");
                StreamProcessorNotificationChannelJsonMarshaller.getInstance().marshall(notificationChannel, jsonWriter);
            }
            if (createStreamProcessorRequest.getKmsKeyId() != null) {
                String kmsKeyId = createStreamProcessorRequest.getKmsKeyId();
                jsonWriter.name("KmsKeyId");
                jsonWriter.value(kmsKeyId);
            }
            if (createStreamProcessorRequest.getRegionsOfInterest() != null) {
                List<RegionOfInterest> regionsOfInterest = createStreamProcessorRequest.getRegionsOfInterest();
                jsonWriter.name("RegionsOfInterest");
                jsonWriter.beginArray();
                for (RegionOfInterest regionOfInterest : regionsOfInterest) {
                    if (regionOfInterest != null) {
                        RegionOfInterestJsonMarshaller.getInstance().marshall(regionOfInterest, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (createStreamProcessorRequest.getDataSharingPreference() != null) {
                StreamProcessorDataSharingPreference dataSharingPreference = createStreamProcessorRequest.getDataSharingPreference();
                jsonWriter.name("DataSharingPreference");
                StreamProcessorDataSharingPreferenceJsonMarshaller.getInstance().marshall(dataSharingPreference, jsonWriter);
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
