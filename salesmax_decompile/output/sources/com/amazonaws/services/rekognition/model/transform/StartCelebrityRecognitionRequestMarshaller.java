package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.rekognition.model.NotificationChannel;
import com.amazonaws.services.rekognition.model.StartCelebrityRecognitionRequest;
import com.amazonaws.services.rekognition.model.Video;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;
import java.io.StringWriter;

/* loaded from: classes5.dex */
public class StartCelebrityRecognitionRequestMarshaller implements Marshaller<Request<StartCelebrityRecognitionRequest>, StartCelebrityRecognitionRequest> {
    @Override // com.amazonaws.transform.Marshaller
    public Request<StartCelebrityRecognitionRequest> marshall(StartCelebrityRecognitionRequest startCelebrityRecognitionRequest) {
        if (startCelebrityRecognitionRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(StartCelebrityRecognitionRequest)");
        }
        DefaultRequest defaultRequest = new DefaultRequest(startCelebrityRecognitionRequest, "AmazonRekognition");
        defaultRequest.addHeader("X-Amz-Target", "RekognitionService.StartCelebrityRecognition");
        defaultRequest.setHttpMethod(HttpMethodName.POST);
        defaultRequest.setResourcePath("/");
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();
            if (startCelebrityRecognitionRequest.getVideo() != null) {
                Video video = startCelebrityRecognitionRequest.getVideo();
                jsonWriter.name("Video");
                VideoJsonMarshaller.getInstance().marshall(video, jsonWriter);
            }
            if (startCelebrityRecognitionRequest.getClientRequestToken() != null) {
                String clientRequestToken = startCelebrityRecognitionRequest.getClientRequestToken();
                jsonWriter.name("ClientRequestToken");
                jsonWriter.value(clientRequestToken);
            }
            if (startCelebrityRecognitionRequest.getNotificationChannel() != null) {
                NotificationChannel notificationChannel = startCelebrityRecognitionRequest.getNotificationChannel();
                jsonWriter.name("NotificationChannel");
                NotificationChannelJsonMarshaller.getInstance().marshall(notificationChannel, jsonWriter);
            }
            if (startCelebrityRecognitionRequest.getJobTag() != null) {
                String jobTag = startCelebrityRecognitionRequest.getJobTag();
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
