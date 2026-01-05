package ai.salesmax.services.model;

import ai.salesmax.model.LeadsSummary;
import ai.salesmax.model.Tasks;
import java.util.Objects;

/* loaded from: classes.dex */
public class ActiveCall {
    private final String callStatus;
    private final Boolean isActiveCall;
    private final LeadsSummary leadSummary;
    private final String phoneNumber;
    private final Tasks tasks;

    public static class Builder {
        private String callStatus;
        private Boolean isActiveCall;
        private LeadsSummary leadSummary;
        private String phoneNumber;
        private Tasks tasks;

        public ActiveCall build() {
            return new ActiveCall(this);
        }

        public Builder callStatus(String str) {
            this.callStatus = str;
            return this;
        }

        public Builder isActiveCall(Boolean bool) {
            this.isActiveCall = bool;
            return this;
        }

        public Builder leadSummary(LeadsSummary leadsSummary) {
            this.leadSummary = leadsSummary;
            return this;
        }

        public Builder phoneNumber(String str) {
            this.phoneNumber = str;
            return this;
        }

        public Builder tasks(Tasks tasks) {
            this.tasks = tasks;
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ActiveCall activeCall = (ActiveCall) obj;
        return Objects.equals(this.isActiveCall, activeCall.isActiveCall) && Objects.equals(this.callStatus, activeCall.callStatus) && Objects.equals(this.phoneNumber, activeCall.phoneNumber) && Objects.equals(this.leadSummary, activeCall.leadSummary) && Objects.equals(this.tasks, activeCall.tasks);
    }

    public String getCallStatus() {
        return this.callStatus;
    }

    public Boolean getIsActiveCall() {
        return this.isActiveCall;
    }

    public LeadsSummary getLeadSummary() {
        return this.leadSummary;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public Tasks getTasks() {
        return this.tasks;
    }

    public int hashCode() {
        return Objects.hash(this.isActiveCall, this.callStatus, this.phoneNumber, this.leadSummary, this.tasks);
    }

    public String toString() {
        return "ActiveCall{isActiveCall=" + this.isActiveCall + ", callStatus='" + this.callStatus + "', phoneNumber='" + this.phoneNumber + "', leadSummary=" + this.leadSummary + ", tasks=" + this.tasks + '}';
    }

    private ActiveCall(Builder builder) {
        this.isActiveCall = builder.isActiveCall;
        this.callStatus = builder.callStatus;
        this.phoneNumber = builder.phoneNumber;
        this.leadSummary = builder.leadSummary;
        this.tasks = builder.tasks;
    }
}
