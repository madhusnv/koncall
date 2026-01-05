package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.JsonErrorResponseHandler;
import com.amazonaws.services.rekognition.model.ThrottlingException;
import com.amazonaws.transform.JsonErrorUnmarshaller;

/* loaded from: classes5.dex */
public class ThrottlingExceptionUnmarshaller extends JsonErrorUnmarshaller {
    public ThrottlingExceptionUnmarshaller() {
        super(ThrottlingException.class);
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller
    public boolean match(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) {
        return jsonErrorResponse.getErrorCode().equals("ThrottlingException");
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller, com.amazonaws.transform.Unmarshaller
    public AmazonServiceException unmarshall(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) {
        ThrottlingException throttlingException = (ThrottlingException) super.unmarshall(jsonErrorResponse);
        throttlingException.setErrorCode("ThrottlingException");
        return throttlingException;
    }
}
