package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.JsonErrorResponseHandler;
import com.amazonaws.services.rekognition.model.ServiceQuotaExceededException;
import com.amazonaws.transform.JsonErrorUnmarshaller;

/* loaded from: classes5.dex */
public class ServiceQuotaExceededExceptionUnmarshaller extends JsonErrorUnmarshaller {
    public ServiceQuotaExceededExceptionUnmarshaller() {
        super(ServiceQuotaExceededException.class);
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller
    public boolean match(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) {
        return jsonErrorResponse.getErrorCode().equals("ServiceQuotaExceededException");
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller, com.amazonaws.transform.Unmarshaller
    public AmazonServiceException unmarshall(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) {
        ServiceQuotaExceededException serviceQuotaExceededException = (ServiceQuotaExceededException) super.unmarshall(jsonErrorResponse);
        serviceQuotaExceededException.setErrorCode("ServiceQuotaExceededException");
        return serviceQuotaExceededException;
    }
}
