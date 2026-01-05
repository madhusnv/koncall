package ai.salesmax.services.model;

import type.CallDirection;

/* loaded from: classes.dex */
public class CloudTelephonyClickToCallResponse {
    String agentNumber;
    CallDirection callDirection;
    String callId;
    String customerNumber;
    Boolean isSuccess;
    String message;
    String providerName;

    public CloudTelephonyClickToCallResponse(Boolean bool, String str, String str2) {
        this.isSuccess = bool;
        this.message = str;
        this.callId = str2;
    }

    public String getAgentNumber() {
        return this.agentNumber;
    }

    public CallDirection getCallDirection() {
        return this.callDirection;
    }

    public String getCallId() {
        return this.callId;
    }

    public String getCustomerNumber() {
        return this.customerNumber;
    }

    public String getMessage() {
        return this.message;
    }

    public String getProviderName() {
        return this.providerName;
    }

    public Boolean getSuccess() {
        return this.isSuccess;
    }

    public void setAgentNumber(String str) {
        this.agentNumber = str;
    }

    public void setCallDirection(CallDirection callDirection) {
        this.callDirection = callDirection;
    }

    public void setCallId(String str) {
        this.callId = str;
    }

    public void setCustomerNumber(String str) {
        this.customerNumber = str;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setProviderName(String str) {
        this.providerName = str;
    }

    public void setSuccess(Boolean bool) {
        this.isSuccess = bool;
    }
}
