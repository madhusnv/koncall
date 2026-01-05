package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class QueryGetClickToCallUrlQueryInput implements InputType {
    private final Input<String> accountId;
    private final Input<String> contactId;
    private final Input<String> phoneNumber;
    private final Input<String> providerName;
    private final Input<String> userId;

    public static final class Builder {
        private Input<String> accountId = Input.absent();
        private Input<String> contactId = Input.absent();
        private Input<String> phoneNumber = Input.absent();
        private Input<String> providerName = Input.absent();
        private Input<String> userId = Input.absent();

        public Builder accountId(String str) {
            this.accountId = Input.fromNullable(str);
            return this;
        }

        public QueryGetClickToCallUrlQueryInput build() {
            return new QueryGetClickToCallUrlQueryInput(this.accountId, this.contactId, this.phoneNumber, this.providerName, this.userId);
        }

        public Builder contactId(String str) {
            this.contactId = Input.fromNullable(str);
            return this;
        }

        public Builder phoneNumber(String str) {
            this.phoneNumber = Input.fromNullable(str);
            return this;
        }

        public Builder providerName(String str) {
            this.providerName = Input.fromNullable(str);
            return this;
        }

        public Builder userId(String str) {
            this.userId = Input.fromNullable(str);
            return this;
        }
    }

    public QueryGetClickToCallUrlQueryInput(Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5) {
        this.accountId = input;
        this.contactId = input2;
        this.phoneNumber = input3;
        this.providerName = input4;
        this.userId = input5;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId.value;
    }

    public String contactId() {
        return this.contactId.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.QueryGetClickToCallUrlQueryInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (QueryGetClickToCallUrlQueryInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) QueryGetClickToCallUrlQueryInput.this.accountId.value);
                }
                if (QueryGetClickToCallUrlQueryInput.this.contactId.defined) {
                    inputFieldWriter.writeString("contactId", (String) QueryGetClickToCallUrlQueryInput.this.contactId.value);
                }
                if (QueryGetClickToCallUrlQueryInput.this.phoneNumber.defined) {
                    inputFieldWriter.writeString("phoneNumber", (String) QueryGetClickToCallUrlQueryInput.this.phoneNumber.value);
                }
                if (QueryGetClickToCallUrlQueryInput.this.providerName.defined) {
                    inputFieldWriter.writeString("providerName", (String) QueryGetClickToCallUrlQueryInput.this.providerName.value);
                }
                if (QueryGetClickToCallUrlQueryInput.this.userId.defined) {
                    inputFieldWriter.writeString("userId", (String) QueryGetClickToCallUrlQueryInput.this.userId.value);
                }
            }
        };
    }

    public String phoneNumber() {
        return this.phoneNumber.value;
    }

    public String providerName() {
        return this.providerName.value;
    }

    public String userId() {
        return this.userId.value;
    }
}
