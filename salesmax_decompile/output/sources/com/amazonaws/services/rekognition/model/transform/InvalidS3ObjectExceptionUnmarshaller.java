package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.JsonErrorResponseHandler;
import com.amazonaws.services.rekognition.model.InvalidS3ObjectException;
import com.amazonaws.transform.JsonErrorUnmarshaller;

/* loaded from: classes5.dex */
public class InvalidS3ObjectExceptionUnmarshaller extends JsonErrorUnmarshaller {
    public InvalidS3ObjectExceptionUnmarshaller() {
        super(InvalidS3ObjectException.class);
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller
    public boolean match(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) {
        return jsonErrorResponse.getErrorCode().equals("InvalidS3ObjectException");
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller, com.amazonaws.transform.Unmarshaller
    public AmazonServiceException unmarshall(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) {
        InvalidS3ObjectException invalidS3ObjectException = (InvalidS3ObjectException) super.unmarshall(jsonErrorResponse);
        invalidS3ObjectException.setErrorCode("InvalidS3ObjectException");
        return invalidS3ObjectException;
    }
}
