package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.JsonErrorResponseHandler;
import com.amazonaws.services.rekognition.model.InvalidPaginationTokenException;
import com.amazonaws.transform.JsonErrorUnmarshaller;

/* loaded from: classes5.dex */
public class InvalidPaginationTokenExceptionUnmarshaller extends JsonErrorUnmarshaller {
    public InvalidPaginationTokenExceptionUnmarshaller() {
        super(InvalidPaginationTokenException.class);
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller
    public boolean match(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) {
        return jsonErrorResponse.getErrorCode().equals("InvalidPaginationTokenException");
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller, com.amazonaws.transform.Unmarshaller
    public AmazonServiceException unmarshall(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) {
        InvalidPaginationTokenException invalidPaginationTokenException = (InvalidPaginationTokenException) super.unmarshall(jsonErrorResponse);
        invalidPaginationTokenException.setErrorCode("InvalidPaginationTokenException");
        return invalidPaginationTokenException;
    }
}
