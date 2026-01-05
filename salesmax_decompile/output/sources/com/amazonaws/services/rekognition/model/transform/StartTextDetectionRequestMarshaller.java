package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.rekognition.model.NotificationChannel;
import com.amazonaws.services.rekognition.model.StartTextDetectionFilters;
import com.amazonaws.services.rekognition.model.StartTextDetectionRequest;
import com.amazonaws.services.rekognition.model.Video;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;
import java.io.StringWriter;

/* loaded from: classes5.dex */
public class StartTextDetectionRequestMarshaller implements Marshaller<Request<StartTextDetectionRequest>, StartTextDetectionRequest> {
    @Override // com.amazonaws.transform.Marshaller
    public Request<StartTextDetectionRequest> marshall(StartTextDetectionRequest startTextDetectionRequest) {
        if (startTextDetectionRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(StartTextDetectionRequest)");
        }
        DefaultRequest defaultRequest = new DefaultRequest(startTextDetectionRequest, "AmazonRekognition");
        defaultRequest.addHeader("X-Amz-Target", "RekognitionService.StartTextDetection");
        defaultRequest.setHttpMethod(HttpMethodName.POST);
        defaultRequest.setResourcePath("/");
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();
            if (startTextDetectionRequest.getVideo() != null) {
                Video video = startTextDetectionRequest.getVideo();
                jsonWriter.name("Video");
                VideoJsonMarshaller.getInstance().marshall(video, jsonWriter);
            }
            if (startTextDetectionRequest.getClientRequestToken() != null) {
                String clientRequestToken = startTextDetectionRequest.getClientRequestToken();
                jsonWriter.name("ClientRequestToken");
                jsonWriter.value(clientRequestToken);
            }
            if (startTextDetectionRequest.getNotificationChannel() != null) {
                NotificationChannel notificationChannel = startTextDetectionRequest.getNotificationChannel();
                jsonWriter.name("NotificationChannel");
                NotificationChannelJsonMarshaller.getInstance().marshall(notificationChannel, jsonWriter);
            }
            if (startTextDetectionRequest.getJobTag() != null) {
                String jobTag = startTextDetectionRequest.getJobTag();
                jsonWriter.name("JobTag");
                jsonWriter.value(jobTag);
            }
            if (startTextDetectionRequest.getFilters() != null) {
                StartTextDetectionFilters filters = startTextDetectionRequest.getFilters();
                jsonWriter.name("Filters");
                StartTextDetectionFiltersJsonMarshaller.getInstance().marshall(filters, jsonWriter);
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
