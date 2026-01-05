package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;

/* loaded from: classes7.dex */
public final class VerifyEmailInput implements InputType {
    private final String accountId;
    private final Input<String> emailToVerify;
    private final Input<String> enteredCode;
    private final Input<String> name;
    private final Input<String> phoneToVerify;
    private final Input<String> verificationPurpose;
    private final Input<String> verifyId;

    public static final class Builder {
        private String accountId;
        private Input<String> name = Input.absent();
        private Input<String> emailToVerify = Input.absent();
        private Input<String> phoneToVerify = Input.absent();
        private Input<String> verifyId = Input.absent();
        private Input<String> enteredCode = Input.absent();
        private Input<String> verificationPurpose = Input.absent();

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public VerifyEmailInput build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            return new VerifyEmailInput(this.name, this.emailToVerify, this.phoneToVerify, this.verifyId, this.enteredCode, this.accountId, this.verificationPurpose);
        }

        public Builder emailToVerify(String str) {
            this.emailToVerify = Input.fromNullable(str);
            return this;
        }

        public Builder enteredCode(String str) {
            this.enteredCode = Input.fromNullable(str);
            return this;
        }

        public Builder name(String str) {
            this.name = Input.fromNullable(str);
            return this;
        }

        public Builder phoneToVerify(String str) {
            this.phoneToVerify = Input.fromNullable(str);
            return this;
        }

        public Builder verificationPurpose(String str) {
            this.verificationPurpose = Input.fromNullable(str);
            return this;
        }

        public Builder verifyId(String str) {
            this.verifyId = Input.fromNullable(str);
            return this;
        }
    }

    public VerifyEmailInput(Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, String str, Input<String> input6) {
        this.name = input;
        this.emailToVerify = input2;
        this.phoneToVerify = input3;
        this.verifyId = input4;
        this.enteredCode = input5;
        this.accountId = str;
        this.verificationPurpose = input6;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId;
    }

    public String emailToVerify() {
        return this.emailToVerify.value;
    }

    public String enteredCode() {
        return this.enteredCode.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.VerifyEmailInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (VerifyEmailInput.this.name.defined) {
                    inputFieldWriter.writeString("name", (String) VerifyEmailInput.this.name.value);
                }
                if (VerifyEmailInput.this.emailToVerify.defined) {
                    inputFieldWriter.writeString("emailToVerify", (String) VerifyEmailInput.this.emailToVerify.value);
                }
                if (VerifyEmailInput.this.phoneToVerify.defined) {
                    inputFieldWriter.writeString("phoneToVerify", (String) VerifyEmailInput.this.phoneToVerify.value);
                }
                if (VerifyEmailInput.this.verifyId.defined) {
                    inputFieldWriter.writeString("verifyId", (String) VerifyEmailInput.this.verifyId.value);
                }
                if (VerifyEmailInput.this.enteredCode.defined) {
                    inputFieldWriter.writeString("enteredCode", (String) VerifyEmailInput.this.enteredCode.value);
                }
                inputFieldWriter.writeString("accountId", VerifyEmailInput.this.accountId);
                if (VerifyEmailInput.this.verificationPurpose.defined) {
                    inputFieldWriter.writeString("verificationPurpose", (String) VerifyEmailInput.this.verificationPurpose.value);
                }
            }
        };
    }

    public String name() {
        return this.name.value;
    }

    public String phoneToVerify() {
        return this.phoneToVerify.value;
    }

    public String verificationPurpose() {
        return this.verificationPurpose.value;
    }

    public String verifyId() {
        return this.verifyId.value;
    }
}
