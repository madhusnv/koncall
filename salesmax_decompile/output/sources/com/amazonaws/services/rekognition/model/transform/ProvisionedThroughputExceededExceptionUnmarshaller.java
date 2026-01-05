package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.JsonErrorResponseHandler;
import com.amazonaws.services.rekognition.model.ProvisionedThroughputExceededException;
import com.amazonaws.transform.JsonErrorUnmarshaller;

/* loaded from: classes5.dex */
public class ProvisionedThroughputExceededExceptionUnmarshaller extends JsonErrorUnmarshaller {
    public ProvisionedThroughputExceededExceptionUnmarshaller() {
        super(ProvisionedThroughputExceededException.class);
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller
    public boolean match(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) {
        return jsonErrorResponse.getErrorCode().equals("ProvisionedThroughputExceededException");
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller, com.amazonaws.transform.Unmarshaller
    public AmazonServiceException unmarshall(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) {
        ProvisionedThroughputExceededException provisionedThroughputExceededException = (ProvisionedThroughputExceededException) super.unmarshall(jsonErrorResponse);
        provisionedThroughputExceededException.setErrorCode("ProvisionedThroughputExceededException");
        return provisionedThroughputExceededException;
    }
}
