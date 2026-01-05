package ai.salesmax.services.model;

import ai.salesmax.model.Leads;
import com.amazonaws.util.StringUtils;
import p001o.e7d;
import type.CallDirection;

/* loaded from: classes.dex */
public class CloudTelephonyCall {
    private String agentPhoneNuber;
    private CallDirection callDirection;
    private String callId;
    private String customerPhoneNumber;
    private String deskphone;
    private String provider;
    private Leads customer = null;
    private String callLogId = null;

    public String getAgentPhoneNuber() {
        return this.agentPhoneNuber;
    }

    public CallDirection getCallDirection() {
        return this.callDirection;
    }

    public String getCallId() {
        return this.callId;
    }

    public String getCallLogId() {
        return this.callLogId;
    }

    public Leads getCustomer() {
        return this.customer;
    }

    public String getCustomerPhoneNumber() {
        return this.customerPhoneNumber;
    }

    public String getDeskphone() {
        return this.deskphone;
    }

    public String getProvider() {
        return this.provider;
    }

    public boolean isBlank() {
        return StringUtils.isBlank(this.customerPhoneNumber) || StringUtils.isBlank(this.callId);
    }

    public void setAgentPhoneNuber(String str) {
        this.agentPhoneNuber = str;
    }

    public void setCallDirection(CallDirection callDirection) {
        this.callDirection = callDirection;
    }

    public void setCallId(String str) {
        this.callId = str;
    }

    public void setCallLogId(String str) {
        this.callLogId = str;
    }

    public void setCustomer(Leads leads) {
        this.customer = leads;
    }

    public void setCustomerPhoneNumber(String str) {
        this.customerPhoneNumber = e7d.m24492e(str);
    }

    public void setDeskphone(String str) {
        this.deskphone = str;
    }

    public void setProvider(String str) {
        this.provider = str;
    }

    public String toString() {
        return "CloudTelephonyCall{callDirection=" + this.callDirection + ", customerPhoneNumber='" + this.customerPhoneNumber + "', agentPhoneNuber='" + this.agentPhoneNuber + "', callId='" + this.callId + "', provider='" + this.provider + "', customer=" + this.customer + ", callLogId='" + this.callLogId + "', deskphone='" + this.deskphone + "'}";
    }
}
