package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ContactNumberDetailInput implements InputType {
    private final Input<ContactNumberType> contactNumberType;
    private final Input<Boolean> isPrimary;
    private final Input<Boolean> isValid;
    private final Input<Boolean> isVerified;
    private final Input<Boolean> isWhatsappNumber;
    private final Input<Boolean> isWrongNumber;
    private final Input<String> phoneNumber;

    public static final class Builder {
        private Input<ContactNumberType> contactNumberType = Input.absent();
        private Input<Boolean> isPrimary = Input.absent();
        private Input<Boolean> isValid = Input.absent();
        private Input<Boolean> isWhatsappNumber = Input.absent();
        private Input<Boolean> isVerified = Input.absent();
        private Input<Boolean> isWrongNumber = Input.absent();
        private Input<String> phoneNumber = Input.absent();

        public ContactNumberDetailInput build() {
            return new ContactNumberDetailInput(this.contactNumberType, this.isPrimary, this.isValid, this.isWhatsappNumber, this.isVerified, this.isWrongNumber, this.phoneNumber);
        }

        public Builder contactNumberType(ContactNumberType contactNumberType) {
            this.contactNumberType = Input.fromNullable(contactNumberType);
            return this;
        }

        public Builder isPrimary(Boolean bool) {
            this.isPrimary = Input.fromNullable(bool);
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

        public Builder isWhatsappNumber(Boolean bool) {
            this.isWhatsappNumber = Input.fromNullable(bool);
            return this;
        }

        public Builder isWrongNumber(Boolean bool) {
            this.isWrongNumber = Input.fromNullable(bool);
            return this;
        }

        public Builder phoneNumber(String str) {
            this.phoneNumber = Input.fromNullable(str);
            return this;
        }
    }

    public ContactNumberDetailInput(Input<ContactNumberType> input, Input<Boolean> input2, Input<Boolean> input3, Input<Boolean> input4, Input<Boolean> input5, Input<Boolean> input6, Input<String> input7) {
        this.contactNumberType = input;
        this.isPrimary = input2;
        this.isValid = input3;
        this.isWhatsappNumber = input4;
        this.isVerified = input5;
        this.isWrongNumber = input6;
        this.phoneNumber = input7;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ContactNumberType contactNumberType() {
        return this.contactNumberType.value;
    }

    public Boolean isPrimary() {
        return this.isPrimary.value;
    }

    public Boolean isValid() {
        return this.isValid.value;
    }

    public Boolean isVerified() {
        return this.isVerified.value;
    }

    public Boolean isWhatsappNumber() {
        return this.isWhatsappNumber.value;
    }

    public Boolean isWrongNumber() {
        return this.isWrongNumber.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ContactNumberDetailInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ContactNumberDetailInput.this.contactNumberType.defined) {
                    inputFieldWriter.writeString("contactNumberType", ContactNumberDetailInput.this.contactNumberType.value != 0 ? ((ContactNumberType) ContactNumberDetailInput.this.contactNumberType.value).name() : null);
                }
                if (ContactNumberDetailInput.this.isPrimary.defined) {
                    inputFieldWriter.writeBoolean("isPrimary", (Boolean) ContactNumberDetailInput.this.isPrimary.value);
                }
                if (ContactNumberDetailInput.this.isValid.defined) {
                    inputFieldWriter.writeBoolean("isValid", (Boolean) ContactNumberDetailInput.this.isValid.value);
                }
                if (ContactNumberDetailInput.this.isWhatsappNumber.defined) {
                    inputFieldWriter.writeBoolean("isWhatsappNumber", (Boolean) ContactNumberDetailInput.this.isWhatsappNumber.value);
                }
                if (ContactNumberDetailInput.this.isVerified.defined) {
                    inputFieldWriter.writeBoolean("isVerified", (Boolean) ContactNumberDetailInput.this.isVerified.value);
                }
                if (ContactNumberDetailInput.this.isWrongNumber.defined) {
                    inputFieldWriter.writeBoolean("isWrongNumber", (Boolean) ContactNumberDetailInput.this.isWrongNumber.value);
                }
                if (ContactNumberDetailInput.this.phoneNumber.defined) {
                    inputFieldWriter.writeString("phoneNumber", (String) ContactNumberDetailInput.this.phoneNumber.value);
                }
            }
        };
    }

    public String phoneNumber() {
        return this.phoneNumber.value;
    }
}
