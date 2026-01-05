package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;

/* loaded from: classes7.dex */
public final class QueryContactListInput implements InputType {
    private final String accountId;
    private final Input<ModelStringKeyConditionInput> contactNameInput;
    private final Input<ContactSortBy> contactSortBy;
    private final Input<ModelStringKeyConditionInput> contactUpdatedAtInput;
    private final Input<String> ownerId;
    private final Input<ContactListQueryType> queryType;
    private final Input<String> teamId;

    public static final class Builder {
        private String accountId;
        private Input<String> ownerId = Input.absent();
        private Input<String> teamId = Input.absent();
        private Input<ContactListQueryType> queryType = Input.absent();
        private Input<ContactSortBy> contactSortBy = Input.absent();
        private Input<ModelStringKeyConditionInput> contactUpdatedAtInput = Input.absent();
        private Input<ModelStringKeyConditionInput> contactNameInput = Input.absent();

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public QueryContactListInput build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            return new QueryContactListInput(this.accountId, this.ownerId, this.teamId, this.queryType, this.contactSortBy, this.contactUpdatedAtInput, this.contactNameInput);
        }

        public Builder contactNameInput(ModelStringKeyConditionInput modelStringKeyConditionInput) {
            this.contactNameInput = Input.fromNullable(modelStringKeyConditionInput);
            return this;
        }

        public Builder contactSortBy(ContactSortBy contactSortBy) {
            this.contactSortBy = Input.fromNullable(contactSortBy);
            return this;
        }

        public Builder contactUpdatedAtInput(ModelStringKeyConditionInput modelStringKeyConditionInput) {
            this.contactUpdatedAtInput = Input.fromNullable(modelStringKeyConditionInput);
            return this;
        }

        public Builder ownerId(String str) {
            this.ownerId = Input.fromNullable(str);
            return this;
        }

        public Builder queryType(ContactListQueryType contactListQueryType) {
            this.queryType = Input.fromNullable(contactListQueryType);
            return this;
        }

        public Builder teamId(String str) {
            this.teamId = Input.fromNullable(str);
            return this;
        }
    }

    public QueryContactListInput(String str, Input<String> input, Input<String> input2, Input<ContactListQueryType> input3, Input<ContactSortBy> input4, Input<ModelStringKeyConditionInput> input5, Input<ModelStringKeyConditionInput> input6) {
        this.accountId = str;
        this.ownerId = input;
        this.teamId = input2;
        this.queryType = input3;
        this.contactSortBy = input4;
        this.contactUpdatedAtInput = input5;
        this.contactNameInput = input6;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId;
    }

    public ModelStringKeyConditionInput contactNameInput() {
        return this.contactNameInput.value;
    }

    public ContactSortBy contactSortBy() {
        return this.contactSortBy.value;
    }

    public ModelStringKeyConditionInput contactUpdatedAtInput() {
        return this.contactUpdatedAtInput.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.QueryContactListInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString("accountId", QueryContactListInput.this.accountId);
                if (QueryContactListInput.this.ownerId.defined) {
                    inputFieldWriter.writeString("ownerId", (String) QueryContactListInput.this.ownerId.value);
                }
                if (QueryContactListInput.this.teamId.defined) {
                    inputFieldWriter.writeString("teamId", (String) QueryContactListInput.this.teamId.value);
                }
                if (QueryContactListInput.this.queryType.defined) {
                    inputFieldWriter.writeString("queryType", QueryContactListInput.this.queryType.value != 0 ? ((ContactListQueryType) QueryContactListInput.this.queryType.value).name() : null);
                }
                if (QueryContactListInput.this.contactSortBy.defined) {
                    inputFieldWriter.writeString("contactSortBy", QueryContactListInput.this.contactSortBy.value != 0 ? ((ContactSortBy) QueryContactListInput.this.contactSortBy.value).name() : null);
                }
                if (QueryContactListInput.this.contactUpdatedAtInput.defined) {
                    inputFieldWriter.writeObject("contactUpdatedAtInput", QueryContactListInput.this.contactUpdatedAtInput.value != 0 ? ((ModelStringKeyConditionInput) QueryContactListInput.this.contactUpdatedAtInput.value).marshaller() : null);
                }
                if (QueryContactListInput.this.contactNameInput.defined) {
                    inputFieldWriter.writeObject("contactNameInput", QueryContactListInput.this.contactNameInput.value != 0 ? ((ModelStringKeyConditionInput) QueryContactListInput.this.contactNameInput.value).marshaller() : null);
                }
            }
        };
    }

    public String ownerId() {
        return this.ownerId.value;
    }

    public ContactListQueryType queryType() {
        return this.queryType.value;
    }

    public String teamId() {
        return this.teamId.value;
    }
}
