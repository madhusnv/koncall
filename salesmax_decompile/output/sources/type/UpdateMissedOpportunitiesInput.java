package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;

/* loaded from: classes7.dex */
public final class UpdateMissedOpportunitiesInput implements InputType {
    private final String accountId;
    private final Input<String> callLaterDateTime;
    private final String contactId;
    private final Input<String> createdAt;
    private final Input<String> messageBody;
    private final MissedOpportunityType missedOpportunityType;
    private final String ownerId;
    private final Input<String> primaryTeamId;
    private final Input<String> relatedEngagementId;
    private final Input<String> updatedAt;

    public static final class Builder {
        private String accountId;
        private String contactId;
        private MissedOpportunityType missedOpportunityType;
        private String ownerId;
        private Input<String> primaryTeamId = Input.absent();
        private Input<String> messageBody = Input.absent();
        private Input<String> callLaterDateTime = Input.absent();
        private Input<String> relatedEngagementId = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public UpdateMissedOpportunitiesInput build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            Utils.checkNotNull(this.ownerId, "ownerId == null");
            Utils.checkNotNull(this.contactId, "contactId == null");
            Utils.checkNotNull(this.missedOpportunityType, "missedOpportunityType == null");
            return new UpdateMissedOpportunitiesInput(this.accountId, this.ownerId, this.primaryTeamId, this.contactId, this.messageBody, this.missedOpportunityType, this.callLaterDateTime, this.relatedEngagementId, this.createdAt, this.updatedAt);
        }

        public Builder callLaterDateTime(String str) {
            this.callLaterDateTime = Input.fromNullable(str);
            return this;
        }

        public Builder contactId(String str) {
            this.contactId = str;
            return this;
        }

        public Builder createdAt(String str) {
            this.createdAt = Input.fromNullable(str);
            return this;
        }

        public Builder messageBody(String str) {
            this.messageBody = Input.fromNullable(str);
            return this;
        }

        public Builder missedOpportunityType(MissedOpportunityType missedOpportunityType) {
            this.missedOpportunityType = missedOpportunityType;
            return this;
        }

        public Builder ownerId(String str) {
            this.ownerId = str;
            return this;
        }

        public Builder primaryTeamId(String str) {
            this.primaryTeamId = Input.fromNullable(str);
            return this;
        }

        public Builder relatedEngagementId(String str) {
            this.relatedEngagementId = Input.fromNullable(str);
            return this;
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }
    }

    public UpdateMissedOpportunitiesInput(String str, String str2, Input<String> input, String str3, Input<String> input2, MissedOpportunityType missedOpportunityType, Input<String> input3, Input<String> input4, Input<String> input5, Input<String> input6) {
        this.accountId = str;
        this.ownerId = str2;
        this.primaryTeamId = input;
        this.contactId = str3;
        this.messageBody = input2;
        this.missedOpportunityType = missedOpportunityType;
        this.callLaterDateTime = input3;
        this.relatedEngagementId = input4;
        this.createdAt = input5;
        this.updatedAt = input6;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId;
    }

    public String callLaterDateTime() {
        return this.callLaterDateTime.value;
    }

    public String contactId() {
        return this.contactId;
    }

    public String createdAt() {
        return this.createdAt.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.UpdateMissedOpportunitiesInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString("accountId", UpdateMissedOpportunitiesInput.this.accountId);
                inputFieldWriter.writeString("ownerId", UpdateMissedOpportunitiesInput.this.ownerId);
                if (UpdateMissedOpportunitiesInput.this.primaryTeamId.defined) {
                    inputFieldWriter.writeString("primaryTeamId", (String) UpdateMissedOpportunitiesInput.this.primaryTeamId.value);
                }
                inputFieldWriter.writeString("contactId", UpdateMissedOpportunitiesInput.this.contactId);
                if (UpdateMissedOpportunitiesInput.this.messageBody.defined) {
                    inputFieldWriter.writeString("messageBody", (String) UpdateMissedOpportunitiesInput.this.messageBody.value);
                }
                inputFieldWriter.writeString("missedOpportunityType", UpdateMissedOpportunitiesInput.this.missedOpportunityType.name());
                if (UpdateMissedOpportunitiesInput.this.callLaterDateTime.defined) {
                    inputFieldWriter.writeString("callLaterDateTime", (String) UpdateMissedOpportunitiesInput.this.callLaterDateTime.value);
                }
                if (UpdateMissedOpportunitiesInput.this.relatedEngagementId.defined) {
                    inputFieldWriter.writeString("relatedEngagementId", (String) UpdateMissedOpportunitiesInput.this.relatedEngagementId.value);
                }
                if (UpdateMissedOpportunitiesInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) UpdateMissedOpportunitiesInput.this.createdAt.value);
                }
                if (UpdateMissedOpportunitiesInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) UpdateMissedOpportunitiesInput.this.updatedAt.value);
                }
            }
        };
    }

    public String messageBody() {
        return this.messageBody.value;
    }

    public MissedOpportunityType missedOpportunityType() {
        return this.missedOpportunityType;
    }

    public String ownerId() {
        return this.ownerId;
    }

    public String primaryTeamId() {
        return this.primaryTeamId.value;
    }

    public String relatedEngagementId() {
        return this.relatedEngagementId.value;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }
}
