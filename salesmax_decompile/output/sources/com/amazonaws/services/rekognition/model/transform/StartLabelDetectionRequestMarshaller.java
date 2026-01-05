package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.rekognition.model.LabelDetectionSettings;
import com.amazonaws.services.rekognition.model.NotificationChannel;
import com.amazonaws.services.rekognition.model.StartLabelDetectionRequest;
import com.amazonaws.services.rekognition.model.Video;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;
import java.io.StringWriter;
import java.util.List;

/* loaded from: classes5.dex */
public class StartLabelDetectionRequestMarshaller implements Marshaller<Request<StartLabelDetectionRequest>, StartLabelDetectionRequest> {
    @Override // com.amazonaws.transform.Marshaller
    public Request<StartLabelDetectionRequest> marshall(StartLabelDetectionRequest startLabelDetectionRequest) {
        if (startLabelDetectionRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(StartLabelDetectionRequest)");
        }
        DefaultRequest defaultRequest = new DefaultRequest(startLabelDetectionRequest, "AmazonRekognition");
        defaultRequest.addHeader("X-Amz-Target", "RekognitionService.StartLabelDetection");
        defaultRequest.setHttpMethod(HttpMethodName.POST);
        defaultRequest.setResourcePath("/");
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();
            if (startLabelDetectionRequest.getVideo() != null) {
                Video video = startLabelDetectionRequest.getVideo();
                jsonWriter.name("Video");
                VideoJsonMarshaller.getInstance().marshall(video, jsonWriter);
            }
            if (startLabelDetectionRequest.getClientRequestToken() != null) {
                String clientRequestToken = startLabelDetectionRequest.getClientRequestToken();
                jsonWriter.name("ClientRequestToken");
                jsonWriter.value(clientRequestToken);
            }
            if (startLabelDetectionRequest.getMinConfidence() != null) {
                Float minConfidence = startLabelDetectionRequest.getMinConfidence();
                jsonWriter.name("MinConfidence");
                jsonWriter.value(minConfidence);
            }
            if (startLabelDetectionRequest.getNotificationChannel() != null) {
                NotificationChannel notificationChannel = startLabelDetectionRequest.getNotificationChannel();
                jsonWriter.name("NotificationChannel");
                NotificationChannelJsonMarshaller.getInstance().marshall(notificationChannel, jsonWriter);
            }
            if (startLabelDetectionRequest.getJobTag() != null) {
                String jobTag = startLabelDetectionRequest.getJobTag();
                jsonWriter.name("JobTag");
                jsonWriter.value(jobTag);
            }
            if (startLabelDetectionRequest.getFeatures() != null) {
                List<String> features = startLabelDetectionRequest.getFeatures();
                jsonWriter.name("Features");
                jsonWriter.beginArray();
                for (String str : features) {
                    if (str != null) {
                        jsonWriter.value(str);
                    }
                }
                jsonWriter.endArray();
            }
            if (startLabelDetectionRequest.getSettings() != null) {
                LabelDetectionSettings settings = startLabelDetectionRequest.getSettings();
                jsonWriter.name("Settings");
                LabelDetectionSettingsJsonMarshaller.getInstance().marshall(settings, jsonWriter);
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
