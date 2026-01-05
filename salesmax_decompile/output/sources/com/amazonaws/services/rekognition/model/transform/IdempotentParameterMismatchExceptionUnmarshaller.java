package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.JsonErrorResponseHandler;
import com.amazonaws.services.rekognition.model.IdempotentParameterMismatchException;
import com.amazonaws.transform.JsonErrorUnmarshaller;

/* loaded from: classes5.dex */
public class IdempotentParameterMismatchExceptionUnmarshaller extends JsonErrorUnmarshaller {
    public IdempotentParameterMismatchExceptionUnmarshaller() {
        super(IdempotentParameterMismatchException.class);
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller
    public boolean match(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) {
        return jsonErrorResponse.getErrorCode().equals("IdempotentParameterMismatchException");
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller, com.amazonaws.transform.Unmarshaller
    public AmazonServiceException unmarshall(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) {
        IdempotentParameterMismatchException idempotentParameterMismatchException = (IdempotentParameterMismatchException) super.unmarshall(jsonErrorResponse);
        idempotentParameterMismatchException.setErrorCode("IdempotentParameterMismatchException");
        return idempotentParameterMismatchException;
    }
}
