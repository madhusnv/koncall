package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.rekognition.model.NotificationChannel;
import com.amazonaws.services.rekognition.model.StartContentModerationRequest;
import com.amazonaws.services.rekognition.model.Video;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;
import java.io.StringWriter;

/* loaded from: classes5.dex */
public class StartContentModerationRequestMarshaller implements Marshaller<Request<StartContentModerationRequest>, StartContentModerationRequest> {
    @Override // com.amazonaws.transform.Marshaller
    public Request<StartContentModerationRequest> marshall(StartContentModerationRequest startContentModerationRequest) {
        if (startContentModerationRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(StartContentModerationRequest)");
        }
        DefaultRequest defaultRequest = new DefaultRequest(startContentModerationRequest, "AmazonRekognition");
        defaultRequest.addHeader("X-Amz-Target", "RekognitionService.StartContentModeration");
        defaultRequest.setHttpMethod(HttpMethodName.POST);
        defaultRequest.setResourcePath("/");
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();
            if (startContentModerationRequest.getVideo() != null) {
                Video video = startContentModerationRequest.getVideo();
                jsonWriter.name("Video");
                VideoJsonMarshaller.getInstance().marshall(video, jsonWriter);
            }
            if (startContentModerationRequest.getMinConfidence() != null) {
                Float minConfidence = startContentModerationRequest.getMinConfidence();
                jsonWriter.name("MinConfidence");
                jsonWriter.value(minConfidence);
            }
            if (startContentModerationRequest.getClientRequestToken() != null) {
                String clientRequestToken = startContentModerationRequest.getClientRequestToken();
                jsonWriter.name("ClientRequestToken");
                jsonWriter.value(clientRequestToken);
            }
            if (startContentModerationRequest.getNotificationChannel() != null) {
                NotificationChannel notificationChannel = startContentModerationRequest.getNotificationChannel();
                jsonWriter.name("NotificationChannel");
                NotificationChannelJsonMarshaller.getInstance().marshall(notificationChannel, jsonWriter);
            }
            if (startContentModerationRequest.getJobTag() != null) {
                String jobTag = startContentModerationRequest.getJobTag();
                jsonWriter.name("JobTag");
                jsonWriter.value(jobTag);
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
