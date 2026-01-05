package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class CreateContactNumberInput implements InputType {
    private final String accountId;
    private final Input<String> contactId;
    private final Input<ContactNumberType> contactNumberType;
    private final Input<String> createdAt;
    private final Input<Boolean> doNotTrack;
    private final Input<String> doNotTrackSetBy;
    private final Input<String> id;
    private final Input<Boolean> isPrimary;
    private final Input<Boolean> isSpam;
    private final Input<Boolean> isValid;
    private final Input<Boolean> isVerified;
    private final Input<Boolean> isWhatsappNumber;
    private final Input<Boolean> isWrongNumber;
    private final String phoneNumber;
    private final Input<String> updatedAt;

    public static final class Builder {
        private String accountId;
        private String phoneNumber;
        private Input<String> id = Input.absent();
        private Input<String> contactId = Input.absent();
        private Input<ContactNumberType> contactNumberType = Input.absent();
        private Input<Boolean> isPrimary = Input.absent();
        private Input<Boolean> isValid = Input.absent();
        private Input<Boolean> isVerified = Input.absent();
        private Input<Boolean> isWhatsappNumber = Input.absent();
        private Input<Boolean> isWrongNumber = Input.absent();
        private Input<Boolean> isSpam = Input.absent();
        private Input<Boolean> doNotTrack = Input.absent();
        private Input<String> doNotTrackSetBy = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public CreateContactNumberInput build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            Utils.checkNotNull(this.phoneNumber, "phoneNumber == null");
            return new CreateContactNumberInput(this.id, this.contactId, this.accountId, this.contactNumberType, this.isPrimary, this.isValid, this.isVerified, this.isWhatsappNumber, this.isWrongNumber, this.isSpam, this.doNotTrack, this.doNotTrackSetBy, this.phoneNumber, this.createdAt, this.updatedAt);
        }

        public Builder contactId(String str) {
            this.contactId = Input.fromNullable(str);
            return this;
        }

        public Builder contactNumberType(ContactNumberType contactNumberType) {
            this.contactNumberType = Input.fromNullable(contactNumberType);
            return this;
        }

        public Builder createdAt(String str) {
            this.createdAt = Input.fromNullable(str);
            return this;
        }

        public Builder doNotTrack(Boolean bool) {
            this.doNotTrack = Input.fromNullable(bool);
            return this;
        }

        public Builder doNotTrackSetBy(String str) {
            this.doNotTrackSetBy = Input.fromNullable(str);
            return this;
        }

        public Builder id(String str) {
            this.id = Input.fromNullable(str);
            return this;
        }

        public Builder isPrimary(Boolean bool) {
            this.isPrimary = Input.fromNullable(bool);
            return this;
        }

        public Builder isSpam(Boolean bool) {
            this.isSpam = Input.fromNullable(bool);
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
            this.phoneNumber = str;
            return this;
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }
    }

    public CreateContactNumberInput(Input<String> input, Input<String> input2, String str, Input<ContactNumberType> input3, Input<Boolean> input4, Input<Boolean> input5, Input<Boolean> input6, Input<Boolean> input7, Input<Boolean> input8, Input<Boolean> input9, Input<Boolean> input10, Input<String> input11, String str2, Input<String> input12, Input<String> input13) {
        this.id = input;
        this.contactId = input2;
        this.accountId = str;
        this.contactNumberType = input3;
        this.isPrimary = input4;
        this.isValid = input5;
        this.isVerified = input6;
        this.isWhatsappNumber = input7;
        this.isWrongNumber = input8;
        this.isSpam = input9;
        this.doNotTrack = input10;
        this.doNotTrackSetBy = input11;
        this.phoneNumber = str2;
        this.createdAt = input12;
        this.updatedAt = input13;
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

    public ContactNumberType contactNumberType() {
        return this.contactNumberType.value;
    }

    public String createdAt() {
        return this.createdAt.value;
    }

    public Boolean doNotTrack() {
        return this.doNotTrack.value;
    }

    public String doNotTrackSetBy() {
        return this.doNotTrackSetBy.value;
    }

    public String id() {
        return this.id.value;
    }

    public Boolean isPrimary() {
        return this.isPrimary.value;
    }

    public Boolean isSpam() {
        return this.isSpam.value;
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
        return new InputFieldMarshaller() { // from class: type.CreateContactNumberInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (CreateContactNumberInput.this.id.defined) {
                    inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, (String) CreateContactNumberInput.this.id.value);
                }
                if (CreateContactNumberInput.this.contactId.defined) {
                    inputFieldWriter.writeString("contactId", (String) CreateContactNumberInput.this.contactId.value);
                }
                inputFieldWriter.writeString("accountId", CreateContactNumberInput.this.accountId);
                if (CreateContactNumberInput.this.contactNumberType.defined) {
                    inputFieldWriter.writeString("contactNumberType", CreateContactNumberInput.this.contactNumberType.value != 0 ? ((ContactNumberType) CreateContactNumberInput.this.contactNumberType.value).name() : null);
                }
                if (CreateContactNumberInput.this.isPrimary.defined) {
                    inputFieldWriter.writeBoolean("isPrimary", (Boolean) CreateContactNumberInput.this.isPrimary.value);
                }
                if (CreateContactNumberInput.this.isValid.defined) {
                    inputFieldWriter.writeBoolean("isValid", (Boolean) CreateContactNumberInput.this.isValid.value);
                }
                if (CreateContactNumberInput.this.isVerified.defined) {
                    inputFieldWriter.writeBoolean("isVerified", (Boolean) CreateContactNumberInput.this.isVerified.value);
                }
                if (CreateContactNumberInput.this.isWhatsappNumber.defined) {
                    inputFieldWriter.writeBoolean("isWhatsappNumber", (Boolean) CreateContactNumberInput.this.isWhatsappNumber.value);
                }
                if (CreateContactNumberInput.this.isWrongNumber.defined) {
                    inputFieldWriter.writeBoolean("isWrongNumber", (Boolean) CreateContactNumberInput.this.isWrongNumber.value);
                }
                if (CreateContactNumberInput.this.isSpam.defined) {
                    inputFieldWriter.writeBoolean("isSpam", (Boolean) CreateContactNumberInput.this.isSpam.value);
                }
                if (CreateContactNumberInput.this.doNotTrack.defined) {
                    inputFieldWriter.writeBoolean("doNotTrack", (Boolean) CreateContactNumberInput.this.doNotTrack.value);
                }
                if (CreateContactNumberInput.this.doNotTrackSetBy.defined) {
                    inputFieldWriter.writeString("doNotTrackSetBy", (String) CreateContactNumberInput.this.doNotTrackSetBy.value);
                }
                inputFieldWriter.writeString("phoneNumber", CreateContactNumberInput.this.phoneNumber);
                if (CreateContactNumberInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) CreateContactNumberInput.this.createdAt.value);
                }
                if (CreateContactNumberInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) CreateContactNumberInput.this.updatedAt.value);
                }
            }
        };
    }

    public String phoneNumber() {
        return this.phoneNumber;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }
}
