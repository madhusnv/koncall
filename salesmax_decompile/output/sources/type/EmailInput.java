package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class EmailInput implements InputType {
    private final Input<String> email;
    private final Input<String> fullName;
    private final Input<Boolean> isDisposableEmail;
    private final Input<Boolean> isGenericEmail;
    private final Input<Boolean> isPrimary;
    private final Input<Boolean> isPublicEmail;
    private final Input<Boolean> isValid;
    private final Input<Boolean> isVerified;

    public static final class Builder {
        private Input<String> email = Input.absent();
        private Input<String> fullName = Input.absent();
        private Input<Boolean> isDisposableEmail = Input.absent();
        private Input<Boolean> isPrimary = Input.absent();
        private Input<Boolean> isPublicEmail = Input.absent();
        private Input<Boolean> isValid = Input.absent();
        private Input<Boolean> isVerified = Input.absent();
        private Input<Boolean> isGenericEmail = Input.absent();

        public EmailInput build() {
            return new EmailInput(this.email, this.fullName, this.isDisposableEmail, this.isPrimary, this.isPublicEmail, this.isValid, this.isVerified, this.isGenericEmail);
        }

        public Builder email(String str) {
            this.email = Input.fromNullable(str);
            return this;
        }

        public Builder fullName(String str) {
            this.fullName = Input.fromNullable(str);
            return this;
        }

        public Builder isDisposableEmail(Boolean bool) {
            this.isDisposableEmail = Input.fromNullable(bool);
            return this;
        }

        public Builder isGenericEmail(Boolean bool) {
            this.isGenericEmail = Input.fromNullable(bool);
            return this;
        }

        public Builder isPrimary(Boolean bool) {
            this.isPrimary = Input.fromNullable(bool);
            return this;
        }

        public Builder isPublicEmail(Boolean bool) {
            this.isPublicEmail = Input.fromNullable(bool);
            return this;
        }

        public Builder isValid(Boolean bool) {
            this.isValid = Input.fromNullable(bool);
            return this;
        }

        public Builder isVerified(Boolean bool) {
            this.isVerified = Input.fromNullable(bool);
            return this;
        }
    }

    public EmailInput(Input<String> input, Input<String> input2, Input<Boolean> input3, Input<Boolean> input4, Input<Boolean> input5, Input<Boolean> input6, Input<Boolean> input7, Input<Boolean> input8) {
        this.email = input;
        this.fullName = input2;
        this.isDisposableEmail = input3;
        this.isPrimary = input4;
        this.isPublicEmail = input5;
        this.isValid = input6;
        this.isVerified = input7;
        this.isGenericEmail = input8;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String email() {
        return this.email.value;
    }

    public String fullName() {
        return this.fullName.value;
    }

    public Boolean isDisposableEmail() {
        return this.isDisposableEmail.value;
    }

    public Boolean isGenericEmail() {
        return this.isGenericEmail.value;
    }

    public Boolean isPrimary() {
        return this.isPrimary.value;
    }

    public Boolean isPublicEmail() {
        return this.isPublicEmail.value;
    }

    public Boolean isValid() {
        return this.isValid.value;
    }

    public Boolean isVerified() {
        return this.isVerified.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.EmailInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (EmailInput.this.email.defined) {
                    inputFieldWriter.writeString("email", (String) EmailInput.this.email.value);
                }
                if (EmailInput.this.fullName.defined) {
                    inputFieldWriter.writeString("fullName", (String) EmailInput.this.fullName.value);
                }
                if (EmailInput.this.isDisposableEmail.defined) {
                    inputFieldWriter.writeBoolean("isDisposableEmail", (Boolean) EmailInput.this.isDisposableEmail.value);
                }
                if (EmailInput.this.isPrimary.defined) {
                    inputFieldWriter.writeBoolean("isPrimary", (Boolean) EmailInput.this.isPrimary.value);
                }
                if (EmailInput.this.isPublicEmail.defined) {
                    inputFieldWriter.writeBoolean("isPublicEmail", (Boolean) EmailInput.this.isPublicEmail.value);
                }
                if (EmailInput.this.isValid.defined) {
                    inputFieldWriter.writeBoolean("isValid", (Boolean) EmailInput.this.isValid.value);
                }
                if (EmailInput.this.isVerified.defined) {
                    inputFieldWriter.writeBoolean("isVerified", (Boolean) EmailInput.this.isVerified.value);
                }
                if (EmailInput.this.isGenericEmail.defined) {
                    inputFieldWriter.writeBoolean("isGenericEmail", (Boolean) EmailInput.this.isGenericEmail.value);
                }
            }
        };
    }
}
