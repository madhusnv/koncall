package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class CreateSubmittedFormValueInput implements InputType {
    private final String accountId;
    private final Input<String> contactId;
    private final Input<String> createdAt;
    private final Input<String> extensionOfObject;
    private final Input<String> extensionOfProperty;
    private final String formId;
    private final Input<String> id;
    private final Input<String> objectId;
    private final Input<String> submittedBy;
    private final Input<String> submittedByIdType;
    private final Input<String> updatedAt;
    private final Input<String> value;

    public static final class Builder {
        private String accountId;
        private String formId;
        private Input<String> id = Input.absent();
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
            this.accountId = str;
            return this;
        }

        public CreateSubmittedFormValueInput build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            Utils.checkNotNull(this.formId, "formId == null");
            return new CreateSubmittedFormValueInput(this.id, this.accountId, this.formId, this.value, this.extensionOfProperty, this.extensionOfObject, this.objectId, this.contactId, this.submittedBy, this.submittedByIdType, this.createdAt, this.updatedAt);
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
            this.formId = str;
            return this;
        }

        public Builder id(String str) {
            this.id = Input.fromNullable(str);
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

    public CreateSubmittedFormValueInput(Input<String> input, String str, String str2, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<String> input6, Input<String> input7, Input<String> input8, Input<String> input9, Input<String> input10) {
        this.id = input;
        this.accountId = str;
        this.formId = str2;
        this.value = input2;
        this.extensionOfProperty = input3;
        this.extensionOfObject = input4;
        this.objectId = input5;
        this.contactId = input6;
        this.submittedBy = input7;
        this.submittedByIdType = input8;
        this.createdAt = input9;
        this.updatedAt = input10;
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
        return this.formId;
    }

    public String id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateSubmittedFormValueInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (CreateSubmittedFormValueInput.this.id.defined) {
                    inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, (String) CreateSubmittedFormValueInput.this.id.value);
                }
                inputFieldWriter.writeString("accountId", CreateSubmittedFormValueInput.this.accountId);
                inputFieldWriter.writeString("formId", CreateSubmittedFormValueInput.this.formId);
                if (CreateSubmittedFormValueInput.this.value.defined) {
                    inputFieldWriter.writeString("value", (String) CreateSubmittedFormValueInput.this.value.value);
                }
                if (CreateSubmittedFormValueInput.this.extensionOfProperty.defined) {
                    inputFieldWriter.writeString("extensionOfProperty", (String) CreateSubmittedFormValueInput.this.extensionOfProperty.value);
                }
                if (CreateSubmittedFormValueInput.this.extensionOfObject.defined) {
                    inputFieldWriter.writeString("extensionOfObject", (String) CreateSubmittedFormValueInput.this.extensionOfObject.value);
                }
                if (CreateSubmittedFormValueInput.this.objectId.defined) {
                    inputFieldWriter.writeString("objectId", (String) CreateSubmittedFormValueInput.this.objectId.value);
                }
                if (CreateSubmittedFormValueInput.this.contactId.defined) {
                    inputFieldWriter.writeString("contactId", (String) CreateSubmittedFormValueInput.this.contactId.value);
                }
                if (CreateSubmittedFormValueInput.this.submittedBy.defined) {
                    inputFieldWriter.writeString("submittedBy", (String) CreateSubmittedFormValueInput.this.submittedBy.value);
                }
                if (CreateSubmittedFormValueInput.this.submittedByIdType.defined) {
                    inputFieldWriter.writeString("submittedByIdType", (String) CreateSubmittedFormValueInput.this.submittedByIdType.value);
                }
                if (CreateSubmittedFormValueInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) CreateSubmittedFormValueInput.this.createdAt.value);
                }
                if (CreateSubmittedFormValueInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) CreateSubmittedFormValueInput.this.updatedAt.value);
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
