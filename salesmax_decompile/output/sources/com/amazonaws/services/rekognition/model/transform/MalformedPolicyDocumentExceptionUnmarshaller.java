package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.JsonErrorResponseHandler;
import com.amazonaws.services.rekognition.model.MalformedPolicyDocumentException;
import com.amazonaws.transform.JsonErrorUnmarshaller;

/* loaded from: classes5.dex */
public class MalformedPolicyDocumentExceptionUnmarshaller extends JsonErrorUnmarshaller {
    public MalformedPolicyDocumentExceptionUnmarshaller() {
        super(MalformedPolicyDocumentException.class);
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller
    public boolean match(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) {
        return jsonErrorResponse.getErrorCode().equals("MalformedPolicyDocumentException");
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller, com.amazonaws.transform.Unmarshaller
    public AmazonServiceException unmarshall(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) {
        MalformedPolicyDocumentException malformedPolicyDocumentException = (MalformedPolicyDocumentException) super.unmarshall(jsonErrorResponse);
        malformedPolicyDocumentException.setErrorCode("MalformedPolicyDocumentException");
        return malformedPolicyDocumentException;
    }
}
