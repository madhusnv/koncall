package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;

/* loaded from: classes7.dex */
public final class QueryEngagementListInput implements InputType {
    private final String accountId;
    private final Input<String> contactId;
    private final Input<EngagementStatus> engagementStatus;
    private final Input<EngagementType> engagementType;
    private final Input<ModelStringKeyConditionInput> engagementUpdatedAtInput;
    private final Input<String> ownerId;
    private final Input<String> parentEngagementId;
    private final Input<EngagementListQueryType> queryType;
    private final Input<String> teamId;

    public static final class Builder {
        private String accountId;
        private Input<String> ownerId = Input.absent();
        private Input<String> teamId = Input.absent();
        private Input<EngagementListQueryType> queryType = Input.absent();
        private Input<EngagementStatus> engagementStatus = Input.absent();
        private Input<EngagementType> engagementType = Input.absent();
        private Input<String> contactId = Input.absent();
        private Input<String> parentEngagementId = Input.absent();
        private Input<ModelStringKeyConditionInput> engagementUpdatedAtInput = Input.absent();

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public QueryEngagementListInput build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            return new QueryEngagementListInput(this.accountId, this.ownerId, this.teamId, this.queryType, this.engagementStatus, this.engagementType, this.contactId, this.parentEngagementId, this.engagementUpdatedAtInput);
        }

        public Builder contactId(String str) {
            this.contactId = Input.fromNullable(str);
            return this;
        }

        public Builder engagementStatus(EngagementStatus engagementStatus) {
            this.engagementStatus = Input.fromNullable(engagementStatus);
            return this;
        }

        public Builder engagementType(EngagementType engagementType) {
            this.engagementType = Input.fromNullable(engagementType);
            return this;
        }

        public Builder engagementUpdatedAtInput(ModelStringKeyConditionInput modelStringKeyConditionInput) {
            this.engagementUpdatedAtInput = Input.fromNullable(modelStringKeyConditionInput);
            return this;
        }

        public Builder ownerId(String str) {
            this.ownerId = Input.fromNullable(str);
            return this;
        }

        public Builder parentEngagementId(String str) {
            this.parentEngagementId = Input.fromNullable(str);
            return this;
        }

        public Builder queryType(EngagementListQueryType engagementListQueryType) {
            this.queryType = Input.fromNullable(engagementListQueryType);
            return this;
        }

        public Builder teamId(String str) {
            this.teamId = Input.fromNullable(str);
            return this;
        }
    }

    public QueryEngagementListInput(String str, Input<String> input, Input<String> input2, Input<EngagementListQueryType> input3, Input<EngagementStatus> input4, Input<EngagementType> input5, Input<String> input6, Input<String> input7, Input<ModelStringKeyConditionInput> input8) {
        this.accountId = str;
        this.ownerId = input;
        this.teamId = input2;
        this.queryType = input3;
        this.engagementStatus = input4;
        this.engagementType = input5;
        this.contactId = input6;
        this.parentEngagementId = input7;
        this.engagementUpdatedAtInput = input8;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId;
    }

    public String contactId() {
        return this.contactId.value;
    }

    public EngagementStatus engagementStatus() {
        return this.engagementStatus.value;
    }

    public EngagementType engagementType() {
        return this.engagementType.value;
    }

    public ModelStringKeyConditionInput engagementUpdatedAtInput() {
        return this.engagementUpdatedAtInput.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.QueryEngagementListInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString("accountId", QueryEngagementListInput.this.accountId);
                if (QueryEngagementListInput.this.ownerId.defined) {
                    inputFieldWriter.writeString("ownerId", (String) QueryEngagementListInput.this.ownerId.value);
                }
                if (QueryEngagementListInput.this.teamId.defined) {
                    inputFieldWriter.writeString("teamId", (String) QueryEngagementListInput.this.teamId.value);
                }
                if (QueryEngagementListInput.this.queryType.defined) {
                    inputFieldWriter.writeString("queryType", QueryEngagementListInput.this.queryType.value != 0 ? ((EngagementListQueryType) QueryEngagementListInput.this.queryType.value).name() : null);
                }
                if (QueryEngagementListInput.this.engagementStatus.defined) {
                    inputFieldWriter.writeString("engagementStatus", QueryEngagementListInput.this.engagementStatus.value != 0 ? ((EngagementStatus) QueryEngagementListInput.this.engagementStatus.value).name() : null);
                }
                if (QueryEngagementListInput.this.engagementType.defined) {
                    inputFieldWriter.writeString("engagementType", QueryEngagementListInput.this.engagementType.value != 0 ? ((EngagementType) QueryEngagementListInput.this.engagementType.value).name() : null);
                }
                if (QueryEngagementListInput.this.contactId.defined) {
                    inputFieldWriter.writeString("contactId", (String) QueryEngagementListInput.this.contactId.value);
                }
                if (QueryEngagementListInput.this.parentEngagementId.defined) {
                    inputFieldWriter.writeString("parentEngagementId", (String) QueryEngagementListInput.this.parentEngagementId.value);
                }
                if (QueryEngagementListInput.this.engagementUpdatedAtInput.defined) {
                    inputFieldWriter.writeObject("engagementUpdatedAtInput", QueryEngagementListInput.this.engagementUpdatedAtInput.value != 0 ? ((ModelStringKeyConditionInput) QueryEngagementListInput.this.engagementUpdatedAtInput.value).marshaller() : null);
                }
            }
        };
    }

    public String ownerId() {
        return this.ownerId.value;
    }

    public String parentEngagementId() {
        return this.parentEngagementId.value;
    }

    public EngagementListQueryType queryType() {
        return this.queryType.value;
    }

    public String teamId() {
        return this.teamId.value;
    }
}
