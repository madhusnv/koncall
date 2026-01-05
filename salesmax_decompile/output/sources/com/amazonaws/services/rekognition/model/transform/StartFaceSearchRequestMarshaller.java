package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.rekognition.model.NotificationChannel;
import com.amazonaws.services.rekognition.model.StartFaceSearchRequest;
import com.amazonaws.services.rekognition.model.Video;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;
import java.io.StringWriter;

/* loaded from: classes5.dex */
public class StartFaceSearchRequestMarshaller implements Marshaller<Request<StartFaceSearchRequest>, StartFaceSearchRequest> {
    @Override // com.amazonaws.transform.Marshaller
    public Request<StartFaceSearchRequest> marshall(StartFaceSearchRequest startFaceSearchRequest) {
        if (startFaceSearchRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(StartFaceSearchRequest)");
        }
        DefaultRequest defaultRequest = new DefaultRequest(startFaceSearchRequest, "AmazonRekognition");
        defaultRequest.addHeader("X-Amz-Target", "RekognitionService.StartFaceSearch");
        defaultRequest.setHttpMethod(HttpMethodName.POST);
        defaultRequest.setResourcePath("/");
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();
            if (startFaceSearchRequest.getVideo() != null) {
                Video video = startFaceSearchRequest.getVideo();
                jsonWriter.name("Video");
                VideoJsonMarshaller.getInstance().marshall(video, jsonWriter);
            }
            if (startFaceSearchRequest.getClientRequestToken() != null) {
                String clientRequestToken = startFaceSearchRequest.getClientRequestToken();
                jsonWriter.name("ClientRequestToken");
                jsonWriter.value(clientRequestToken);
            }
            if (startFaceSearchRequest.getFaceMatchThreshold() != null) {
                Float faceMatchThreshold = startFaceSearchRequest.getFaceMatchThreshold();
                jsonWriter.name("FaceMatchThreshold");
                jsonWriter.value(faceMatchThreshold);
            }
            if (startFaceSearchRequest.getCollectionId() != null) {
                String collectionId = startFaceSearchRequest.getCollectionId();
                jsonWriter.name("CollectionId");
                jsonWriter.value(collectionId);
            }
            if (startFaceSearchRequest.getNotificationChannel() != null) {
                NotificationChannel notificationChannel = startFaceSearchRequest.getNotificationChannel();
                jsonWriter.name("NotificationChannel");
                NotificationChannelJsonMarshaller.getInstance().marshall(notificationChannel, jsonWriter);
            }
            if (startFaceSearchRequest.getJobTag() != null) {
                String jobTag = startFaceSearchRequest.getJobTag();
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
