package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.JsonErrorResponseHandler;
import com.amazonaws.services.rekognition.model.InternalServerErrorException;
import com.amazonaws.transform.JsonErrorUnmarshaller;

/* loaded from: classes5.dex */
public class InternalServerErrorExceptionUnmarshaller extends JsonErrorUnmarshaller {
    public InternalServerErrorExceptionUnmarshaller() {
        super(InternalServerErrorException.class);
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller
    public boolean match(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) {
        return jsonErrorResponse.getErrorCode().equals("InternalServerError");
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller, com.amazonaws.transform.Unmarshaller
    public AmazonServiceException unmarshall(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) {
        InternalServerErrorException internalServerErrorException = (InternalServerErrorException) super.unmarshall(jsonErrorResponse);
        internalServerErrorException.setErrorCode("InternalServerError");
        return internalServerErrorException;
    }
}
