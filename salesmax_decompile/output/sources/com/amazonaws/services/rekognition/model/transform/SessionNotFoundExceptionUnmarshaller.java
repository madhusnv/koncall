package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.JsonErrorResponseHandler;
import com.amazonaws.services.rekognition.model.SessionNotFoundException;
import com.amazonaws.transform.JsonErrorUnmarshaller;

/* loaded from: classes5.dex */
public class SessionNotFoundExceptionUnmarshaller extends JsonErrorUnmarshaller {
    public SessionNotFoundExceptionUnmarshaller() {
        super(SessionNotFoundException.class);
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller
    public boolean match(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) {
        return jsonErrorResponse.getErrorCode().equals("SessionNotFoundException");
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller, com.amazonaws.transform.Unmarshaller
    public AmazonServiceException unmarshall(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) {
        SessionNotFoundException sessionNotFoundException = (SessionNotFoundException) super.unmarshall(jsonErrorResponse);
        sessionNotFoundException.setErrorCode("SessionNotFoundException");
        return sessionNotFoundException;
    }
}
