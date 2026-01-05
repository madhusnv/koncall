package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;

/* loaded from: classes7.dex */
public final class CreateWebInitiatedCallInput implements InputType {
    private final String accountId;
    private final String callId;
    private final Input<String> status;
    private final String userId;

    public static final class Builder {
        private String accountId;
        private String callId;
        private Input<String> status = Input.absent();
        private String userId;

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public CreateWebInitiatedCallInput build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            Utils.checkNotNull(this.userId, "userId == null");
            Utils.checkNotNull(this.callId, "callId == null");
            return new CreateWebInitiatedCallInput(this.accountId, this.userId, this.callId, this.status);
        }

        public Builder callId(String str) {
            this.callId = str;
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

    public CreateWebInitiatedCallInput(String str, String str2, String str3, Input<String> input) {
        this.accountId = str;
        this.userId = str2;
        this.callId = str3;
        this.status = input;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId;
    }

    public String callId() {
        return this.callId;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateWebInitiatedCallInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString("accountId", CreateWebInitiatedCallInput.this.accountId);
                inputFieldWriter.writeString("userId", CreateWebInitiatedCallInput.this.userId);
                inputFieldWriter.writeString("callId", CreateWebInitiatedCallInput.this.callId);
                if (CreateWebInitiatedCallInput.this.status.defined) {
                    inputFieldWriter.writeString("status", (String) CreateWebInitiatedCallInput.this.status.value);
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
