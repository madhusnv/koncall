package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.JsonErrorResponseHandler;
import com.amazonaws.services.rekognition.model.ResourceNotFoundException;
import com.amazonaws.transform.JsonErrorUnmarshaller;

/* loaded from: classes5.dex */
public class ResourceNotFoundExceptionUnmarshaller extends JsonErrorUnmarshaller {
    public ResourceNotFoundExceptionUnmarshaller() {
        super(ResourceNotFoundException.class);
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller
    public boolean match(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) {
        return jsonErrorResponse.getErrorCode().equals("ResourceNotFoundException");
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller, com.amazonaws.transform.Unmarshaller
    public AmazonServiceException unmarshall(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) {
        ResourceNotFoundException resourceNotFoundException = (ResourceNotFoundException) super.unmarshall(jsonErrorResponse);
        resourceNotFoundException.setErrorCode("ResourceNotFoundException");
        return resourceNotFoundException;
    }
}
