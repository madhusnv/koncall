package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.JsonErrorResponseHandler;
import com.amazonaws.services.rekognition.model.ResourceNotReadyException;
import com.amazonaws.transform.JsonErrorUnmarshaller;

/* loaded from: classes5.dex */
public class ResourceNotReadyExceptionUnmarshaller extends JsonErrorUnmarshaller {
    public ResourceNotReadyExceptionUnmarshaller() {
        super(ResourceNotReadyException.class);
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller
    public boolean match(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) {
        return jsonErrorResponse.getErrorCode().equals("ResourceNotReadyException");
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller, com.amazonaws.transform.Unmarshaller
    public AmazonServiceException unmarshall(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) {
        ResourceNotReadyException resourceNotReadyException = (ResourceNotReadyException) super.unmarshall(jsonErrorResponse);
        resourceNotReadyException.setErrorCode("ResourceNotReadyException");
        return resourceNotReadyException;
    }
}
