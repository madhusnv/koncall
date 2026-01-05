package ai.salesmax.services.model;

import java.util.List;

/* loaded from: classes.dex */
public class CloudTelephonyAgent {
    private String accountId;
    private String agentId;
    private String agentNumber;
    private String cloudTelephonyProvider;
    private String remoteUserId;
    private String userId;
    private List<String> virtualNumbers;

    public String getAccountId() {
        return this.accountId;
    }

    public String getAgentId() {
        return this.agentId;
    }

    public String getAgentNumber() {
        return this.agentNumber;
    }

    public String getCloudTelephonyProvider() {
        return this.cloudTelephonyProvider;
    }

    public String getRemoteUserId() {
        return this.remoteUserId;
    }

    public String getUserId() {
        return this.userId;
    }

    public List<String> getVirtualNumbers() {
        return this.virtualNumbers;
    }

    public void setAccountId(String str) {
        this.accountId = str;
    }

    public void setAgentId(String str) {
        this.agentId = str;
    }

    public void setAgentNumber(String str) {
        this.agentNumber = str;
    }

    public void setCloudTelephonyProvider(String str) {
        this.cloudTelephonyProvider = str;
    }

    public void setRemoteUserId(String str) {
        this.remoteUserId = str;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public void setVirtualNumbers(List<String> list) {
        this.virtualNumbers = list;
    }
}
