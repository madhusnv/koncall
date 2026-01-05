package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.JsonErrorResponseHandler;
import com.amazonaws.services.rekognition.model.InvalidParameterException;
import com.amazonaws.transform.JsonErrorUnmarshaller;

/* loaded from: classes5.dex */
public class InvalidParameterExceptionUnmarshaller extends JsonErrorUnmarshaller {
    public InvalidParameterExceptionUnmarshaller() {
        super(InvalidParameterException.class);
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller
    public boolean match(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) {
        return jsonErrorResponse.getErrorCode().equals("InvalidParameterException");
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller, com.amazonaws.transform.Unmarshaller
    public AmazonServiceException unmarshall(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) {
        InvalidParameterException invalidParameterException = (InvalidParameterException) super.unmarshall(jsonErrorResponse);
        invalidParameterException.setErrorCode("InvalidParameterException");
        return invalidParameterException;
    }
}
