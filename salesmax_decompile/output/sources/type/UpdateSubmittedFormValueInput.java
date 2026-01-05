package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class UpdateSubmittedFormValueInput implements InputType {
    private final Input<String> accountId;
    private final Input<String> contactId;
    private final Input<String> createdAt;
    private final Input<String> extensionOfObject;
    private final Input<String> extensionOfProperty;
    private final Input<String> formId;
    private final String id;
    private final Input<String> objectId;
    private final Input<String> submittedBy;
    private final Input<String> submittedByIdType;
    private final Input<String> updatedAt;
    private final Input<String> value;

    public static final class Builder {
        private String id;
        private Input<String> accountId = Input.absent();
        private Input<String> formId = Input.absent();
        private Input<String> value = Input.absent();
        private Input<String> extensionOfProperty = Input.absent();
        private Input<String> extensionOfObject = Input.absent();
        private Input<String> objectId = Input.absent();
        private Input<String> contactId = Input.absent();
        private Input<String> submittedBy = Input.absent();
        private Input<String> submittedByIdType = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = Input.fromNullable(str);
            return this;
        }

        public UpdateSubmittedFormValueInput build() {
            Utils.checkNotNull(this.id, "id == null");
            return new UpdateSubmittedFormValueInput(this.id, this.accountId, this.formId, this.value, this.extensionOfProperty, this.extensionOfObject, this.objectId, this.contactId, this.submittedBy, this.submittedByIdType, this.createdAt, this.updatedAt);
        }

        public Builder contactId(String str) {
            this.contactId = Input.fromNullable(str);
            return this;
        }

        public Builder createdAt(String str) {
            this.createdAt = Input.fromNullable(str);
            return this;
        }

        public Builder extensionOfObject(String str) {
            this.extensionOfObject = Input.fromNullable(str);
            return this;
        }

        public Builder extensionOfProperty(String str) {
            this.extensionOfProperty = Input.fromNullable(str);
            return this;
        }

        public Builder formId(String str) {
            this.formId = Input.fromNullable(str);
            return this;
        }

        public Builder id(String str) {
            this.id = str;
            return this;
        }

        public Builder objectId(String str) {
            this.objectId = Input.fromNullable(str);
            return this;
        }

        public Builder submittedBy(String str) {
            this.submittedBy = Input.fromNullable(str);
            return this;
        }

        public Builder submittedByIdType(String str) {
            this.submittedByIdType = Input.fromNullable(str);
            return this;
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }

        public Builder value(String str) {
            this.value = Input.fromNullable(str);
            return this;
        }
    }

    public UpdateSubmittedFormValueInput(String str, Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<String> input6, Input<String> input7, Input<String> input8, Input<String> input9, Input<String> input10, Input<String> input11) {
        this.id = str;
        this.accountId = input;
        this.formId = input2;
        this.value = input3;
        this.extensionOfProperty = input4;
        this.extensionOfObject = input5;
        this.objectId = input6;
        this.contactId = input7;
        this.submittedBy = input8;
        this.submittedByIdType = input9;
        this.createdAt = input10;
        this.updatedAt = input11;
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

    public String createdAt() {
        return this.createdAt.value;
    }

    public String extensionOfObject() {
        return this.extensionOfObject.value;
    }

    public String extensionOfProperty() {
        return this.extensionOfProperty.value;
    }

    public String formId() {
        return this.formId.value;
    }

    public String id() {
        return this.id;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.UpdateSubmittedFormValueInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, UpdateSubmittedFormValueInput.this.id);
                if (UpdateSubmittedFormValueInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) UpdateSubmittedFormValueInput.this.accountId.value);
                }
                if (UpdateSubmittedFormValueInput.this.formId.defined) {
                    inputFieldWriter.writeString("formId", (String) UpdateSubmittedFormValueInput.this.formId.value);
                }
                if (UpdateSubmittedFormValueInput.this.value.defined) {
                    inputFieldWriter.writeString("value", (String) UpdateSubmittedFormValueInput.this.value.value);
                }
                if (UpdateSubmittedFormValueInput.this.extensionOfProperty.defined) {
                    inputFieldWriter.writeString("extensionOfProperty", (String) UpdateSubmittedFormValueInput.this.extensionOfProperty.value);
                }
                if (UpdateSubmittedFormValueInput.this.extensionOfObject.defined) {
                    inputFieldWriter.writeString("extensionOfObject", (String) UpdateSubmittedFormValueInput.this.extensionOfObject.value);
                }
                if (UpdateSubmittedFormValueInput.this.objectId.defined) {
                    inputFieldWriter.writeString("objectId", (String) UpdateSubmittedFormValueInput.this.objectId.value);
                }
                if (UpdateSubmittedFormValueInput.this.contactId.defined) {
                    inputFieldWriter.writeString("contactId", (String) UpdateSubmittedFormValueInput.this.contactId.value);
                }
                if (UpdateSubmittedFormValueInput.this.submittedBy.defined) {
                    inputFieldWriter.writeString("submittedBy", (String) UpdateSubmittedFormValueInput.this.submittedBy.value);
                }
                if (UpdateSubmittedFormValueInput.this.submittedByIdType.defined) {
                    inputFieldWriter.writeString("submittedByIdType", (String) UpdateSubmittedFormValueInput.this.submittedByIdType.value);
                }
                if (UpdateSubmittedFormValueInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) UpdateSubmittedFormValueInput.this.createdAt.value);
                }
                if (UpdateSubmittedFormValueInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) UpdateSubmittedFormValueInput.this.updatedAt.value);
                }
            }
        };
    }

    public String objectId() {
        return this.objectId.value;
    }

    public String submittedBy() {
        return this.submittedBy.value;
    }

    public String submittedByIdType() {
        return this.submittedByIdType.value;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }

    public String value() {
        return this.value.value;
    }
}
