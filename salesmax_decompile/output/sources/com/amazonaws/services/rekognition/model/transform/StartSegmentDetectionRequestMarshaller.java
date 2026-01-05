package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.rekognition.model.NotificationChannel;
import com.amazonaws.services.rekognition.model.StartSegmentDetectionFilters;
import com.amazonaws.services.rekognition.model.StartSegmentDetectionRequest;
import com.amazonaws.services.rekognition.model.Video;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;
import java.io.StringWriter;
import java.util.List;

/* loaded from: classes5.dex */
public class StartSegmentDetectionRequestMarshaller implements Marshaller<Request<StartSegmentDetectionRequest>, StartSegmentDetectionRequest> {
    @Override // com.amazonaws.transform.Marshaller
    public Request<StartSegmentDetectionRequest> marshall(StartSegmentDetectionRequest startSegmentDetectionRequest) {
        if (startSegmentDetectionRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(StartSegmentDetectionRequest)");
        }
        DefaultRequest defaultRequest = new DefaultRequest(startSegmentDetectionRequest, "AmazonRekognition");
        defaultRequest.addHeader("X-Amz-Target", "RekognitionService.StartSegmentDetection");
        defaultRequest.setHttpMethod(HttpMethodName.POST);
        defaultRequest.setResourcePath("/");
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();
            if (startSegmentDetectionRequest.getVideo() != null) {
                Video video = startSegmentDetectionRequest.getVideo();
                jsonWriter.name("Video");
                VideoJsonMarshaller.getInstance().marshall(video, jsonWriter);
            }
            if (startSegmentDetectionRequest.getClientRequestToken() != null) {
                String clientRequestToken = startSegmentDetectionRequest.getClientRequestToken();
                jsonWriter.name("ClientRequestToken");
                jsonWriter.value(clientRequestToken);
            }
            if (startSegmentDetectionRequest.getNotificationChannel() != null) {
                NotificationChannel notificationChannel = startSegmentDetectionRequest.getNotificationChannel();
                jsonWriter.name("NotificationChannel");
                NotificationChannelJsonMarshaller.getInstance().marshall(notificationChannel, jsonWriter);
            }
            if (startSegmentDetectionRequest.getJobTag() != null) {
                String jobTag = startSegmentDetectionRequest.getJobTag();
                jsonWriter.name("JobTag");
                jsonWriter.value(jobTag);
            }
            if (startSegmentDetectionRequest.getFilters() != null) {
                StartSegmentDetectionFilters filters = startSegmentDetectionRequest.getFilters();
                jsonWriter.name("Filters");
                StartSegmentDetectionFiltersJsonMarshaller.getInstance().marshall(filters, jsonWriter);
            }
            if (startSegmentDetectionRequest.getSegmentTypes() != null) {
                List<String> segmentTypes = startSegmentDetectionRequest.getSegmentTypes();
                jsonWriter.name("SegmentTypes");
                jsonWriter.beginArray();
                for (String str : segmentTypes) {
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
