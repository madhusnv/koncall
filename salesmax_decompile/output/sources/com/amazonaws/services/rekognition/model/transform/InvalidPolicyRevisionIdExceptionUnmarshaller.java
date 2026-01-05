package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.JsonErrorResponseHandler;
import com.amazonaws.services.rekognition.model.InvalidPolicyRevisionIdException;
import com.amazonaws.transform.JsonErrorUnmarshaller;

/* loaded from: classes5.dex */
public class InvalidPolicyRevisionIdExceptionUnmarshaller extends JsonErrorUnmarshaller {
    public InvalidPolicyRevisionIdExceptionUnmarshaller() {
        super(InvalidPolicyRevisionIdException.class);
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller
    public boolean match(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) {
        return jsonErrorResponse.getErrorCode().equals("InvalidPolicyRevisionIdException");
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller, com.amazonaws.transform.Unmarshaller
    public AmazonServiceException unmarshall(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) {
        InvalidPolicyRevisionIdException invalidPolicyRevisionIdException = (InvalidPolicyRevisionIdException) super.unmarshall(jsonErrorResponse);
        invalidPolicyRevisionIdException.setErrorCode("InvalidPolicyRevisionIdException");
        return invalidPolicyRevisionIdException;
    }
}
