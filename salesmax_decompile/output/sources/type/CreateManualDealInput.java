package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes7.dex */
public final class CreateManualDealInput implements InputType {
    private final String accountId;
    private final Input<Double> amount;
    private final String contactId;
    private final Input<String> currency;
    private final Input<String> customDealData;
    private final String dealStage;
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
        private String contactId;
        private String dealStage;
        private String userId;
        private Input<Double> amount = Input.absent();
        private Input<String> currency = Input.absent();
        private Input<String> primaryTeamId = Input.absent();
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

        public CreateManualDealInput build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            Utils.checkNotNull(this.contactId, "contactId == null");
            Utils.checkNotNull(this.userId, "userId == null");
            Utils.checkNotNull(this.dealStage, "dealStage == null");
            return new CreateManualDealInput(this.accountId, this.contactId, this.amount, this.currency, this.userId, this.primaryTeamId, this.dealStage, this.nextFollowUpOn, this.parentEngagementId, this.taskBody, this.taskAssigneeUserId, this.taskAssigneeTeamId, this.transferLead, this.customDealData, this.formId);
        }

        public Builder contactId(String str) {
            this.contactId = str;
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

        public Builder dealStage(String str) {
            this.dealStage = str;
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

    public CreateManualDealInput(String str, String str2, Input<Double> input, Input<String> input2, String str3, Input<String> input3, String str4, Input<String> input4, Input<String> input5, Input<String> input6, Input<String> input7, Input<String> input8, Input<Boolean> input9, Input<String> input10, Input<String> input11) {
        this.accountId = str;
        this.contactId = str2;
        this.amount = input;
        this.currency = input2;
        this.userId = str3;
        this.primaryTeamId = input3;
        this.dealStage = str4;
        this.nextFollowUpOn = input4;
        this.parentEngagementId = input5;
        this.taskBody = input6;
        this.taskAssigneeUserId = input7;
        this.taskAssigneeTeamId = input8;
        this.transferLead = input9;
        this.customDealData = input10;
        this.formId = input11;
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
        return this.contactId;
    }

    public String currency() {
        return this.currency.value;
    }

    public String customDealData() {
        return this.customDealData.value;
    }

    public String dealStage() {
        return this.dealStage;
    }

    public String formId() {
        return this.formId.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateManualDealInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString("accountId", CreateManualDealInput.this.accountId);
                inputFieldWriter.writeString("contactId", CreateManualDealInput.this.contactId);
                if (CreateManualDealInput.this.amount.defined) {
                    inputFieldWriter.writeDouble("amount", (Double) CreateManualDealInput.this.amount.value);
                }
                if (CreateManualDealInput.this.currency.defined) {
                    inputFieldWriter.writeString(FirebaseAnalytics.Param.CURRENCY, (String) CreateManualDealInput.this.currency.value);
                }
                inputFieldWriter.writeString("userId", CreateManualDealInput.this.userId);
                if (CreateManualDealInput.this.primaryTeamId.defined) {
                    inputFieldWriter.writeString("primaryTeamId", (String) CreateManualDealInput.this.primaryTeamId.value);
                }
                inputFieldWriter.writeString("dealStage", CreateManualDealInput.this.dealStage);
                if (CreateManualDealInput.this.nextFollowUpOn.defined) {
                    inputFieldWriter.writeString("nextFollowUpOn", (String) CreateManualDealInput.this.nextFollowUpOn.value);
                }
                if (CreateManualDealInput.this.parentEngagementId.defined) {
                    inputFieldWriter.writeString("parentEngagementId", (String) CreateManualDealInput.this.parentEngagementId.value);
                }
                if (CreateManualDealInput.this.taskBody.defined) {
                    inputFieldWriter.writeString("taskBody", (String) CreateManualDealInput.this.taskBody.value);
                }
                if (CreateManualDealInput.this.taskAssigneeUserId.defined) {
                    inputFieldWriter.writeString("taskAssigneeUserId", (String) CreateManualDealInput.this.taskAssigneeUserId.value);
                }
                if (CreateManualDealInput.this.taskAssigneeTeamId.defined) {
                    inputFieldWriter.writeString("taskAssigneeTeamId", (String) CreateManualDealInput.this.taskAssigneeTeamId.value);
                }
                if (CreateManualDealInput.this.transferLead.defined) {
                    inputFieldWriter.writeBoolean("transferLead", (Boolean) CreateManualDealInput.this.transferLead.value);
                }
                if (CreateManualDealInput.this.customDealData.defined) {
                    inputFieldWriter.writeString("customDealData", (String) CreateManualDealInput.this.customDealData.value);
                }
                if (CreateManualDealInput.this.formId.defined) {
                    inputFieldWriter.writeString("formId", (String) CreateManualDealInput.this.formId.value);
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
