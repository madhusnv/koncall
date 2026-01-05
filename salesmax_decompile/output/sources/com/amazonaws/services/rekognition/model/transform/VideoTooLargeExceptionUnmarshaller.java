package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.JsonErrorResponseHandler;
import com.amazonaws.services.rekognition.model.VideoTooLargeException;
import com.amazonaws.transform.JsonErrorUnmarshaller;

/* loaded from: classes5.dex */
public class VideoTooLargeExceptionUnmarshaller extends JsonErrorUnmarshaller {
    public VideoTooLargeExceptionUnmarshaller() {
        super(VideoTooLargeException.class);
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller
    public boolean match(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) {
        return jsonErrorResponse.getErrorCode().equals("VideoTooLargeException");
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller, com.amazonaws.transform.Unmarshaller
    public AmazonServiceException unmarshall(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) {
        VideoTooLargeException videoTooLargeException = (VideoTooLargeException) super.unmarshall(jsonErrorResponse);
        videoTooLargeException.setErrorCode("VideoTooLargeException");
        return videoTooLargeException;
    }
}
