package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.JsonErrorResponseHandler;
import com.amazonaws.services.rekognition.model.ResourceAlreadyExistsException;
import com.amazonaws.transform.JsonErrorUnmarshaller;

/* loaded from: classes5.dex */
public class ResourceAlreadyExistsExceptionUnmarshaller extends JsonErrorUnmarshaller {
    public ResourceAlreadyExistsExceptionUnmarshaller() {
        super(ResourceAlreadyExistsException.class);
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller
    public boolean match(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) {
        return jsonErrorResponse.getErrorCode().equals("ResourceAlreadyExistsException");
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller, com.amazonaws.transform.Unmarshaller
    public AmazonServiceException unmarshall(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) {
        ResourceAlreadyExistsException resourceAlreadyExistsException = (ResourceAlreadyExistsException) super.unmarshall(jsonErrorResponse);
        resourceAlreadyExistsException.setErrorCode("ResourceAlreadyExistsException");
        return resourceAlreadyExistsException;
    }
}
