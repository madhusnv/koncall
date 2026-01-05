package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.JsonErrorResponseHandler;
import com.amazonaws.services.rekognition.model.AccessDeniedException;
import com.amazonaws.transform.JsonErrorUnmarshaller;

/* loaded from: classes5.dex */
public class AccessDeniedExceptionUnmarshaller extends JsonErrorUnmarshaller {
    public AccessDeniedExceptionUnmarshaller() {
        super(AccessDeniedException.class);
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller
    public boolean match(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) {
        return jsonErrorResponse.getErrorCode().equals("AccessDeniedException");
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller, com.amazonaws.transform.Unmarshaller
    public AmazonServiceException unmarshall(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) {
        AccessDeniedException accessDeniedException = (AccessDeniedException) super.unmarshall(jsonErrorResponse);
        accessDeniedException.setErrorCode("AccessDeniedException");
        return accessDeniedException;
    }
}
