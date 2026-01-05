package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;

/* loaded from: classes7.dex */
public final class UpdateWebInitiatedCallInput implements InputType {
    private final String accountId;
    private final Input<String> callId;
    private final Input<String> status;
    private final String userId;

    public static final class Builder {
        private String accountId;
        private Input<String> callId = Input.absent();
        private Input<String> status = Input.absent();
        private String userId;

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public UpdateWebInitiatedCallInput build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            Utils.checkNotNull(this.userId, "userId == null");
            return new UpdateWebInitiatedCallInput(this.accountId, this.userId, this.callId, this.status);
        }

        public Builder callId(String str) {
            this.callId = Input.fromNullable(str);
            return this;
        }

        public Builder status(String str) {
            this.status = Input.fromNullable(str);
            return this;
        }

        public Builder userId(String str) {
            this.userId = str;
            return this;
        }
    }

    public UpdateWebInitiatedCallInput(String str, String str2, Input<String> input, Input<String> input2) {
        this.accountId = str;
        this.userId = str2;
        this.callId = input;
        this.status = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId;
    }

    public String callId() {
        return this.callId.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.UpdateWebInitiatedCallInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString("accountId", UpdateWebInitiatedCallInput.this.accountId);
                inputFieldWriter.writeString("userId", UpdateWebInitiatedCallInput.this.userId);
                if (UpdateWebInitiatedCallInput.this.callId.defined) {
                    inputFieldWriter.writeString("callId", (String) UpdateWebInitiatedCallInput.this.callId.value);
                }
                if (UpdateWebInitiatedCallInput.this.status.defined) {
                    inputFieldWriter.writeString("status", (String) UpdateWebInitiatedCallInput.this.status.value);
                }
            }
        };
    }

    public String status() {
        return this.status.value;
    }

    public String userId() {
        return this.userId;
    }
}
