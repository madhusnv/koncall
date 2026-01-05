package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.JsonErrorResponseHandler;
import com.amazonaws.services.rekognition.model.ImageTooLargeException;
import com.amazonaws.transform.JsonErrorUnmarshaller;

/* loaded from: classes5.dex */
public class ImageTooLargeExceptionUnmarshaller extends JsonErrorUnmarshaller {
    public ImageTooLargeExceptionUnmarshaller() {
        super(ImageTooLargeException.class);
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller
    public boolean match(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) {
        return jsonErrorResponse.getErrorCode().equals("ImageTooLargeException");
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller, com.amazonaws.transform.Unmarshaller
    public AmazonServiceException unmarshall(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) {
        ImageTooLargeException imageTooLargeException = (ImageTooLargeException) super.unmarshall(jsonErrorResponse);
        imageTooLargeException.setErrorCode("ImageTooLargeException");
        return imageTooLargeException;
    }
}
