package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class UpdateCustomPropertyValuesInput implements InputType {
    private final Input<String> accountId;
    private final Input<String> createSourceId;
    private final Input<String> createSourceType;
    private final Input<String> createdAt;
    private final String id;
    private final Input<String> parentObject;
    private final Input<String> parentObjectId;
    private final Input<String> propertyDefinitionId;
    private final Input<String> updatedAt;
    private final Input<String> value;

    public static final class Builder {
        private String id;
        private Input<String> propertyDefinitionId = Input.absent();
        private Input<String> accountId = Input.absent();
        private Input<String> parentObjectId = Input.absent();
        private Input<String> parentObject = Input.absent();
        private Input<String> value = Input.absent();
        private Input<String> createSourceId = Input.absent();
        private Input<String> createSourceType = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = Input.fromNullable(str);
            return this;
        }

        public UpdateCustomPropertyValuesInput build() {
            Utils.checkNotNull(this.id, "id == null");
            return new UpdateCustomPropertyValuesInput(this.id, this.propertyDefinitionId, this.accountId, this.parentObjectId, this.parentObject, this.value, this.createSourceId, this.createSourceType, this.createdAt, this.updatedAt);
        }

        public Builder createSourceId(String str) {
            this.createSourceId = Input.fromNullable(str);
            return this;
        }

        public Builder createSourceType(String str) {
            this.createSourceType = Input.fromNullable(str);
            return this;
        }

        public Builder createdAt(String str) {
            this.createdAt = Input.fromNullable(str);
            return this;
        }

        public Builder id(String str) {
            this.id = str;
            return this;
        }

        public Builder parentObject(String str) {
            this.parentObject = Input.fromNullable(str);
            return this;
        }

        public Builder parentObjectId(String str) {
            this.parentObjectId = Input.fromNullable(str);
            return this;
        }

        public Builder propertyDefinitionId(String str) {
            this.propertyDefinitionId = Input.fromNullable(str);
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

    public UpdateCustomPropertyValuesInput(String str, Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<String> input6, Input<String> input7, Input<String> input8, Input<String> input9) {
        this.id = str;
        this.propertyDefinitionId = input;
        this.accountId = input2;
        this.parentObjectId = input3;
        this.parentObject = input4;
        this.value = input5;
        this.createSourceId = input6;
        this.createSourceType = input7;
        this.createdAt = input8;
        this.updatedAt = input9;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId.value;
    }

    public String createSourceId() {
        return this.createSourceId.value;
    }

    public String createSourceType() {
        return this.createSourceType.value;
    }

    public String createdAt() {
        return this.createdAt.value;
    }

    public String id() {
        return this.id;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.UpdateCustomPropertyValuesInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, UpdateCustomPropertyValuesInput.this.id);
                if (UpdateCustomPropertyValuesInput.this.propertyDefinitionId.defined) {
                    inputFieldWriter.writeString("propertyDefinitionId", (String) UpdateCustomPropertyValuesInput.this.propertyDefinitionId.value);
                }
                if (UpdateCustomPropertyValuesInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) UpdateCustomPropertyValuesInput.this.accountId.value);
                }
                if (UpdateCustomPropertyValuesInput.this.parentObjectId.defined) {
                    inputFieldWriter.writeString("parentObjectId", (String) UpdateCustomPropertyValuesInput.this.parentObjectId.value);
                }
                if (UpdateCustomPropertyValuesInput.this.parentObject.defined) {
                    inputFieldWriter.writeString("parentObject", (String) UpdateCustomPropertyValuesInput.this.parentObject.value);
                }
                if (UpdateCustomPropertyValuesInput.this.value.defined) {
                    inputFieldWriter.writeString("value", (String) UpdateCustomPropertyValuesInput.this.value.value);
                }
                if (UpdateCustomPropertyValuesInput.this.createSourceId.defined) {
                    inputFieldWriter.writeString("createSourceId", (String) UpdateCustomPropertyValuesInput.this.createSourceId.value);
                }
                if (UpdateCustomPropertyValuesInput.this.createSourceType.defined) {
                    inputFieldWriter.writeString("createSourceType", (String) UpdateCustomPropertyValuesInput.this.createSourceType.value);
                }
                if (UpdateCustomPropertyValuesInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) UpdateCustomPropertyValuesInput.this.createdAt.value);
                }
                if (UpdateCustomPropertyValuesInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) UpdateCustomPropertyValuesInput.this.updatedAt.value);
                }
            }
        };
    }

    public String parentObject() {
        return this.parentObject.value;
    }

    public String parentObjectId() {
        return this.parentObjectId.value;
    }

    public String propertyDefinitionId() {
        return this.propertyDefinitionId.value;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }

    public String value() {
        return this.value.value;
    }
}
