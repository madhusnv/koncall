package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.google.firebase.messaging.Constants;

/* loaded from: classes7.dex */
public final class MutationIntegrationActionsBodyInput implements InputType {
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

        public MutationIntegrationActionsBodyInput build() {
            return new MutationIntegrationActionsBodyInput(this.action, this.data, this.accountId, this.networkType, this.userId);
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

    public MutationIntegrationActionsBodyInput(Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5) {
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
        return new InputFieldMarshaller() { // from class: type.MutationIntegrationActionsBodyInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (MutationIntegrationActionsBodyInput.this.action.defined) {
                    inputFieldWriter.writeString("action", (String) MutationIntegrationActionsBodyInput.this.action.value);
                }
                if (MutationIntegrationActionsBodyInput.this.data.defined) {
                    inputFieldWriter.writeString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, (String) MutationIntegrationActionsBodyInput.this.data.value);
                }
                if (MutationIntegrationActionsBodyInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) MutationIntegrationActionsBodyInput.this.accountId.value);
                }
                if (MutationIntegrationActionsBodyInput.this.networkType.defined) {
                    inputFieldWriter.writeString("networkType", (String) MutationIntegrationActionsBodyInput.this.networkType.value);
                }
                if (MutationIntegrationActionsBodyInput.this.userId.defined) {
                    inputFieldWriter.writeString("userId", (String) MutationIntegrationActionsBodyInput.this.userId.value);
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
