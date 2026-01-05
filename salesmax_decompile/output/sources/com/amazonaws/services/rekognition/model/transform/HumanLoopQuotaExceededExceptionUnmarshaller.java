package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.JsonErrorResponseHandler;
import com.amazonaws.services.rekognition.model.HumanLoopQuotaExceededException;
import com.amazonaws.transform.JsonErrorUnmarshaller;

/* loaded from: classes5.dex */
public class HumanLoopQuotaExceededExceptionUnmarshaller extends JsonErrorUnmarshaller {
    public HumanLoopQuotaExceededExceptionUnmarshaller() {
        super(HumanLoopQuotaExceededException.class);
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller
    public boolean match(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) {
        return jsonErrorResponse.getErrorCode().equals("HumanLoopQuotaExceededException");
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller, com.amazonaws.transform.Unmarshaller
    public AmazonServiceException unmarshall(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) {
        HumanLoopQuotaExceededException humanLoopQuotaExceededException = (HumanLoopQuotaExceededException) super.unmarshall(jsonErrorResponse);
        humanLoopQuotaExceededException.setErrorCode("HumanLoopQuotaExceededException");
        humanLoopQuotaExceededException.setResourceType(String.valueOf(jsonErrorResponse.get("ResourceType")));
        humanLoopQuotaExceededException.setQuotaCode(String.valueOf(jsonErrorResponse.get("QuotaCode")));
        humanLoopQuotaExceededException.setServiceCode(String.valueOf(jsonErrorResponse.get("ServiceCode")));
        return humanLoopQuotaExceededException;
    }
}
