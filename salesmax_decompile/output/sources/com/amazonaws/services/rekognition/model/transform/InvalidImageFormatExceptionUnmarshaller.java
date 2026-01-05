package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.JsonErrorResponseHandler;
import com.amazonaws.services.rekognition.model.InvalidImageFormatException;
import com.amazonaws.transform.JsonErrorUnmarshaller;

/* loaded from: classes5.dex */
public class InvalidImageFormatExceptionUnmarshaller extends JsonErrorUnmarshaller {
    public InvalidImageFormatExceptionUnmarshaller() {
        super(InvalidImageFormatException.class);
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller
    public boolean match(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) {
        return jsonErrorResponse.getErrorCode().equals("InvalidImageFormatException");
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller, com.amazonaws.transform.Unmarshaller
    public AmazonServiceException unmarshall(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) {
        InvalidImageFormatException invalidImageFormatException = (InvalidImageFormatException) super.unmarshall(jsonErrorResponse);
        invalidImageFormatException.setErrorCode("InvalidImageFormatException");
        return invalidImageFormatException;
    }
}
