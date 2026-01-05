package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;

/* loaded from: classes7.dex */
public final class QueryMissedOpportunitiesListInput implements InputType {
    private final String accountId;
    private final Input<String> contactId;
    private final Input<String> ownerId;
    private final Input<MissedOpportunitiesListQueryType> queryType;
    private final Input<String> teamId;
    private final Input<ModelStringKeyConditionInput> updatedAt;

    public static final class Builder {
        private String accountId;
        private Input<String> ownerId = Input.absent();
        private Input<String> teamId = Input.absent();
        private Input<MissedOpportunitiesListQueryType> queryType = Input.absent();
        private Input<String> contactId = Input.absent();
        private Input<ModelStringKeyConditionInput> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public QueryMissedOpportunitiesListInput build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            return new QueryMissedOpportunitiesListInput(this.accountId, this.ownerId, this.teamId, this.queryType, this.contactId, this.updatedAt);
        }

        public Builder contactId(String str) {
            this.contactId = Input.fromNullable(str);
            return this;
        }

        public Builder ownerId(String str) {
            this.ownerId = Input.fromNullable(str);
            return this;
        }

        public Builder queryType(MissedOpportunitiesListQueryType missedOpportunitiesListQueryType) {
            this.queryType = Input.fromNullable(missedOpportunitiesListQueryType);
            return this;
        }

        public Builder teamId(String str) {
            this.teamId = Input.fromNullable(str);
            return this;
        }

        public Builder updatedAt(ModelStringKeyConditionInput modelStringKeyConditionInput) {
            this.updatedAt = Input.fromNullable(modelStringKeyConditionInput);
            return this;
        }
    }

    public QueryMissedOpportunitiesListInput(String str, Input<String> input, Input<String> input2, Input<MissedOpportunitiesListQueryType> input3, Input<String> input4, Input<ModelStringKeyConditionInput> input5) {
        this.accountId = str;
        this.ownerId = input;
        this.teamId = input2;
        this.queryType = input3;
        this.contactId = input4;
        this.updatedAt = input5;
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

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.QueryMissedOpportunitiesListInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString("accountId", QueryMissedOpportunitiesListInput.this.accountId);
                if (QueryMissedOpportunitiesListInput.this.ownerId.defined) {
                    inputFieldWriter.writeString("ownerId", (String) QueryMissedOpportunitiesListInput.this.ownerId.value);
                }
                if (QueryMissedOpportunitiesListInput.this.teamId.defined) {
                    inputFieldWriter.writeString("teamId", (String) QueryMissedOpportunitiesListInput.this.teamId.value);
                }
                if (QueryMissedOpportunitiesListInput.this.queryType.defined) {
                    inputFieldWriter.writeString("queryType", QueryMissedOpportunitiesListInput.this.queryType.value != 0 ? ((MissedOpportunitiesListQueryType) QueryMissedOpportunitiesListInput.this.queryType.value).name() : null);
                }
                if (QueryMissedOpportunitiesListInput.this.contactId.defined) {
                    inputFieldWriter.writeString("contactId", (String) QueryMissedOpportunitiesListInput.this.contactId.value);
                }
                if (QueryMissedOpportunitiesListInput.this.updatedAt.defined) {
                    inputFieldWriter.writeObject("updatedAt", QueryMissedOpportunitiesListInput.this.updatedAt.value != 0 ? ((ModelStringKeyConditionInput) QueryMissedOpportunitiesListInput.this.updatedAt.value).marshaller() : null);
                }
            }
        };
    }

    public String ownerId() {
        return this.ownerId.value;
    }

    public MissedOpportunitiesListQueryType queryType() {
        return this.queryType.value;
    }

    public String teamId() {
        return this.teamId.value;
    }

    public ModelStringKeyConditionInput updatedAt() {
        return this.updatedAt.value;
    }
}
