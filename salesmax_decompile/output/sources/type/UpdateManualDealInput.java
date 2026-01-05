package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes7.dex */
public final class UpdateManualDealInput implements InputType {
    private final String accountId;
    private final Input<Double> amount;
    private final Input<String> contactId;
    private final Input<String> currency;
    private final Input<String> customDealData;
    private final String dealId;
    private final Input<String> dealStage;
    private final Input<String> formId;
    private final Input<String> nextFollowUpOn;
    private final Input<String> parentEngagementId;
    private final Input<String> primaryTeamId;
    private final Input<String> taskAssigneeTeamId;
    private final Input<String> taskAssigneeUserId;
    private final Input<String> taskBody;
    private final Input<Boolean> transferLead;
    private final String userId;

    public static final class Builder {
        private String accountId;
        private String dealId;
        private String userId;
        private Input<String> contactId = Input.absent();
        private Input<Double> amount = Input.absent();
        private Input<String> currency = Input.absent();
        private Input<String> primaryTeamId = Input.absent();
        private Input<String> dealStage = Input.absent();
        private Input<String> nextFollowUpOn = Input.absent();
        private Input<String> parentEngagementId = Input.absent();
        private Input<String> taskBody = Input.absent();
        private Input<String> taskAssigneeUserId = Input.absent();
        private Input<String> taskAssigneeTeamId = Input.absent();
        private Input<Boolean> transferLead = Input.absent();
        private Input<String> customDealData = Input.absent();
        private Input<String> formId = Input.absent();

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public Builder amount(Double d) {
            this.amount = Input.fromNullable(d);
            return this;
        }

        public UpdateManualDealInput build() {
            Utils.checkNotNull(this.dealId, "dealId == null");
            Utils.checkNotNull(this.accountId, "accountId == null");
            Utils.checkNotNull(this.userId, "userId == null");
            return new UpdateManualDealInput(this.dealId, this.accountId, this.contactId, this.amount, this.currency, this.userId, this.primaryTeamId, this.dealStage, this.nextFollowUpOn, this.parentEngagementId, this.taskBody, this.taskAssigneeUserId, this.taskAssigneeTeamId, this.transferLead, this.customDealData, this.formId);
        }

        public Builder contactId(String str) {
            this.contactId = Input.fromNullable(str);
            return this;
        }

        public Builder currency(String str) {
            this.currency = Input.fromNullable(str);
            return this;
        }

        public Builder customDealData(String str) {
            this.customDealData = Input.fromNullable(str);
            return this;
        }

        public Builder dealId(String str) {
            this.dealId = str;
            return this;
        }

        public Builder dealStage(String str) {
            this.dealStage = Input.fromNullable(str);
            return this;
        }

        public Builder formId(String str) {
            this.formId = Input.fromNullable(str);
            return this;
        }

        public Builder nextFollowUpOn(String str) {
            this.nextFollowUpOn = Input.fromNullable(str);
            return this;
        }

        public Builder parentEngagementId(String str) {
            this.parentEngagementId = Input.fromNullable(str);
            return this;
        }

        public Builder primaryTeamId(String str) {
            this.primaryTeamId = Input.fromNullable(str);
            return this;
        }

        public Builder taskAssigneeTeamId(String str) {
            this.taskAssigneeTeamId = Input.fromNullable(str);
            return this;
        }

        public Builder taskAssigneeUserId(String str) {
            this.taskAssigneeUserId = Input.fromNullable(str);
            return this;
        }

        public Builder taskBody(String str) {
            this.taskBody = Input.fromNullable(str);
            return this;
        }

        public Builder transferLead(Boolean bool) {
            this.transferLead = Input.fromNullable(bool);
            return this;
        }

        public Builder userId(String str) {
            this.userId = str;
            return this;
        }
    }

    public UpdateManualDealInput(String str, String str2, Input<String> input, Input<Double> input2, Input<String> input3, String str3, Input<String> input4, Input<String> input5, Input<String> input6, Input<String> input7, Input<String> input8, Input<String> input9, Input<String> input10, Input<Boolean> input11, Input<String> input12, Input<String> input13) {
        this.dealId = str;
        this.accountId = str2;
        this.contactId = input;
        this.amount = input2;
        this.currency = input3;
        this.userId = str3;
        this.primaryTeamId = input4;
        this.dealStage = input5;
        this.nextFollowUpOn = input6;
        this.parentEngagementId = input7;
        this.taskBody = input8;
        this.taskAssigneeUserId = input9;
        this.taskAssigneeTeamId = input10;
        this.transferLead = input11;
        this.customDealData = input12;
        this.formId = input13;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId;
    }

    public Double amount() {
        return this.amount.value;
    }

    public String contactId() {
        return this.contactId.value;
    }

    public String currency() {
        return this.currency.value;
    }

    public String customDealData() {
        return this.customDealData.value;
    }

    public String dealId() {
        return this.dealId;
    }

    public String dealStage() {
        return this.dealStage.value;
    }

    public String formId() {
        return this.formId.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.UpdateManualDealInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString("dealId", UpdateManualDealInput.this.dealId);
                inputFieldWriter.writeString("accountId", UpdateManualDealInput.this.accountId);
                if (UpdateManualDealInput.this.contactId.defined) {
                    inputFieldWriter.writeString("contactId", (String) UpdateManualDealInput.this.contactId.value);
                }
                if (UpdateManualDealInput.this.amount.defined) {
                    inputFieldWriter.writeDouble("amount", (Double) UpdateManualDealInput.this.amount.value);
                }
                if (UpdateManualDealInput.this.currency.defined) {
                    inputFieldWriter.writeString(FirebaseAnalytics.Param.CURRENCY, (String) UpdateManualDealInput.this.currency.value);
                }
                inputFieldWriter.writeString("userId", UpdateManualDealInput.this.userId);
                if (UpdateManualDealInput.this.primaryTeamId.defined) {
                    inputFieldWriter.writeString("primaryTeamId", (String) UpdateManualDealInput.this.primaryTeamId.value);
                }
                if (UpdateManualDealInput.this.dealStage.defined) {
                    inputFieldWriter.writeString("dealStage", (String) UpdateManualDealInput.this.dealStage.value);
                }
                if (UpdateManualDealInput.this.nextFollowUpOn.defined) {
                    inputFieldWriter.writeString("nextFollowUpOn", (String) UpdateManualDealInput.this.nextFollowUpOn.value);
                }
                if (UpdateManualDealInput.this.parentEngagementId.defined) {
                    inputFieldWriter.writeString("parentEngagementId", (String) UpdateManualDealInput.this.parentEngagementId.value);
                }
                if (UpdateManualDealInput.this.taskBody.defined) {
                    inputFieldWriter.writeString("taskBody", (String) UpdateManualDealInput.this.taskBody.value);
                }
                if (UpdateManualDealInput.this.taskAssigneeUserId.defined) {
                    inputFieldWriter.writeString("taskAssigneeUserId", (String) UpdateManualDealInput.this.taskAssigneeUserId.value);
                }
                if (UpdateManualDealInput.this.taskAssigneeTeamId.defined) {
                    inputFieldWriter.writeString("taskAssigneeTeamId", (String) UpdateManualDealInput.this.taskAssigneeTeamId.value);
                }
                if (UpdateManualDealInput.this.transferLead.defined) {
                    inputFieldWriter.writeBoolean("transferLead", (Boolean) UpdateManualDealInput.this.transferLead.value);
                }
                if (UpdateManualDealInput.this.customDealData.defined) {
                    inputFieldWriter.writeString("customDealData", (String) UpdateManualDealInput.this.customDealData.value);
                }
                if (UpdateManualDealInput.this.formId.defined) {
                    inputFieldWriter.writeString("formId", (String) UpdateManualDealInput.this.formId.value);
                }
            }
        };
    }

    public String nextFollowUpOn() {
        return this.nextFollowUpOn.value;
    }

    public String parentEngagementId() {
        return this.parentEngagementId.value;
    }

    public String primaryTeamId() {
        return this.primaryTeamId.value;
    }

    public String taskAssigneeTeamId() {
        return this.taskAssigneeTeamId.value;
    }

    public String taskAssigneeUserId() {
        return this.taskAssigneeUserId.value;
    }

    public String taskBody() {
        return this.taskBody.value;
    }

    public Boolean transferLead() {
        return this.transferLead.value;
    }

    public String userId() {
        return this.userId;
    }
}
