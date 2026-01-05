package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class UpdateContactNumberInput implements InputType {
    private final Input<String> accountId;
    private final Input<String> contactId;
    private final Input<ContactNumberType> contactNumberType;
    private final Input<String> createdAt;
    private final Input<Boolean> doNotTrack;
    private final Input<String> doNotTrackSetBy;
    private final String id;
    private final Input<Boolean> isPrimary;
    private final Input<Boolean> isSpam;
    private final Input<Boolean> isValid;
    private final Input<Boolean> isVerified;
    private final Input<Boolean> isWhatsappNumber;
    private final Input<Boolean> isWrongNumber;
    private final Input<String> phoneNumber;
    private final Input<String> updatedAt;

    public static final class Builder {
        private String id;
        private Input<String> contactId = Input.absent();
        private Input<String> accountId = Input.absent();
        private Input<ContactNumberType> contactNumberType = Input.absent();
        private Input<Boolean> isPrimary = Input.absent();
        private Input<Boolean> isValid = Input.absent();
        private Input<Boolean> isVerified = Input.absent();
        private Input<Boolean> isWhatsappNumber = Input.absent();
        private Input<Boolean> isWrongNumber = Input.absent();
        private Input<Boolean> isSpam = Input.absent();
        private Input<Boolean> doNotTrack = Input.absent();
        private Input<String> doNotTrackSetBy = Input.absent();
        private Input<String> phoneNumber = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = Input.fromNullable(str);
            return this;
        }

        public UpdateContactNumberInput build() {
            Utils.checkNotNull(this.id, "id == null");
            return new UpdateContactNumberInput(this.id, this.contactId, this.accountId, this.contactNumberType, this.isPrimary, this.isValid, this.isVerified, this.isWhatsappNumber, this.isWrongNumber, this.isSpam, this.doNotTrack, this.doNotTrackSetBy, this.phoneNumber, this.createdAt, this.updatedAt);
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
            this.id = str;
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
            this.phoneNumber = Input.fromNullable(str);
            return this;
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }
    }

    public UpdateContactNumberInput(String str, Input<String> input, Input<String> input2, Input<ContactNumberType> input3, Input<Boolean> input4, Input<Boolean> input5, Input<Boolean> input6, Input<Boolean> input7, Input<Boolean> input8, Input<Boolean> input9, Input<Boolean> input10, Input<String> input11, Input<String> input12, Input<String> input13, Input<String> input14) {
        this.id = str;
        this.contactId = input;
        this.accountId = input2;
        this.contactNumberType = input3;
        this.isPrimary = input4;
        this.isValid = input5;
        this.isVerified = input6;
        this.isWhatsappNumber = input7;
        this.isWrongNumber = input8;
        this.isSpam = input9;
        this.doNotTrack = input10;
        this.doNotTrackSetBy = input11;
        this.phoneNumber = input12;
        this.createdAt = input13;
        this.updatedAt = input14;
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
        return this.id;
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
        return new InputFieldMarshaller() { // from class: type.UpdateContactNumberInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, UpdateContactNumberInput.this.id);
                if (UpdateContactNumberInput.this.contactId.defined) {
                    inputFieldWriter.writeString("contactId", (String) UpdateContactNumberInput.this.contactId.value);
                }
                if (UpdateContactNumberInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) UpdateContactNumberInput.this.accountId.value);
                }
                if (UpdateContactNumberInput.this.contactNumberType.defined) {
                    inputFieldWriter.writeString("contactNumberType", UpdateContactNumberInput.this.contactNumberType.value != 0 ? ((ContactNumberType) UpdateContactNumberInput.this.contactNumberType.value).name() : null);
                }
                if (UpdateContactNumberInput.this.isPrimary.defined) {
                    inputFieldWriter.writeBoolean("isPrimary", (Boolean) UpdateContactNumberInput.this.isPrimary.value);
                }
                if (UpdateContactNumberInput.this.isValid.defined) {
                    inputFieldWriter.writeBoolean("isValid", (Boolean) UpdateContactNumberInput.this.isValid.value);
                }
                if (UpdateContactNumberInput.this.isVerified.defined) {
                    inputFieldWriter.writeBoolean("isVerified", (Boolean) UpdateContactNumberInput.this.isVerified.value);
                }
                if (UpdateContactNumberInput.this.isWhatsappNumber.defined) {
                    inputFieldWriter.writeBoolean("isWhatsappNumber", (Boolean) UpdateContactNumberInput.this.isWhatsappNumber.value);
                }
                if (UpdateContactNumberInput.this.isWrongNumber.defined) {
                    inputFieldWriter.writeBoolean("isWrongNumber", (Boolean) UpdateContactNumberInput.this.isWrongNumber.value);
                }
                if (UpdateContactNumberInput.this.isSpam.defined) {
                    inputFieldWriter.writeBoolean("isSpam", (Boolean) UpdateContactNumberInput.this.isSpam.value);
                }
                if (UpdateContactNumberInput.this.doNotTrack.defined) {
                    inputFieldWriter.writeBoolean("doNotTrack", (Boolean) UpdateContactNumberInput.this.doNotTrack.value);
                }
                if (UpdateContactNumberInput.this.doNotTrackSetBy.defined) {
                    inputFieldWriter.writeString("doNotTrackSetBy", (String) UpdateContactNumberInput.this.doNotTrackSetBy.value);
                }
                if (UpdateContactNumberInput.this.phoneNumber.defined) {
                    inputFieldWriter.writeString("phoneNumber", (String) UpdateContactNumberInput.this.phoneNumber.value);
                }
                if (UpdateContactNumberInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) UpdateContactNumberInput.this.createdAt.value);
                }
                if (UpdateContactNumberInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) UpdateContactNumberInput.this.updatedAt.value);
                }
            }
        };
    }

    public String phoneNumber() {
        return this.phoneNumber.value;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }
}
