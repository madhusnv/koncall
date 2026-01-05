package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.google.firebase.messaging.Constants;

/* loaded from: classes7.dex */
public final class MutationIntegrationActionsQueryInput implements InputType {
    private final Input<String> accountId;
    private final Input<String> action;
    private final Input<String> data;
    private final Input<String> networkType;
    private final Input<String> userId;

    public static final class Builder {
        private Input<String> action = Input.absent();
        private Input<String> data = Input.absent();
        private Input<String> accountId = Input.absent();
        private Input<String> networkType = Input.absent();
        private Input<String> userId = Input.absent();

        public Builder accountId(String str) {
            this.accountId = Input.fromNullable(str);
            return this;
        }

        public Builder action(String str) {
            this.action = Input.fromNullable(str);
            return this;
        }

        public MutationIntegrationActionsQueryInput build() {
            return new MutationIntegrationActionsQueryInput(this.action, this.data, this.accountId, this.networkType, this.userId);
        }

        public Builder data(String str) {
            this.data = Input.fromNullable(str);
            return this;
        }

        public Builder networkType(String str) {
            this.networkType = Input.fromNullable(str);
            return this;
        }

        public Builder userId(String str) {
            this.userId = Input.fromNullable(str);
            return this;
        }
    }

    public MutationIntegrationActionsQueryInput(Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5) {
        this.action = input;
        this.data = input2;
        this.accountId = input3;
        this.networkType = input4;
        this.userId = input5;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId.value;
    }

    public String action() {
        return this.action.value;
    }

    public String data() {
        return this.data.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.MutationIntegrationActionsQueryInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (MutationIntegrationActionsQueryInput.this.action.defined) {
                    inputFieldWriter.writeString("action", (String) MutationIntegrationActionsQueryInput.this.action.value);
                }
                if (MutationIntegrationActionsQueryInput.this.data.defined) {
                    inputFieldWriter.writeString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, (String) MutationIntegrationActionsQueryInput.this.data.value);
                }
                if (MutationIntegrationActionsQueryInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) MutationIntegrationActionsQueryInput.this.accountId.value);
                }
                if (MutationIntegrationActionsQueryInput.this.networkType.defined) {
                    inputFieldWriter.writeString("networkType", (String) MutationIntegrationActionsQueryInput.this.networkType.value);
                }
                if (MutationIntegrationActionsQueryInput.this.userId.defined) {
                    inputFieldWriter.writeString("userId", (String) MutationIntegrationActionsQueryInput.this.userId.value);
                }
            }
        };
    }

    public String networkType() {
        return this.networkType.value;
    }

    public String userId() {
        return this.userId.value;
    }
}
