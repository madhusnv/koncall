package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class UpdateCustomFormValuesInput implements InputType {
    private final Input<String> accountId;
    private final String id;
    private final Input<String> parentObject;
    private final Input<String> parentObjectId;
    private final Input<String> propertyDefinitionId;
    private final Input<String> value;

    public static final class Builder {
        private String id;
        private Input<String> propertyDefinitionId = Input.absent();
        private Input<String> accountId = Input.absent();
        private Input<String> parentObjectId = Input.absent();
        private Input<String> parentObject = Input.absent();
        private Input<String> value = Input.absent();

        public Builder accountId(String str) {
            this.accountId = Input.fromNullable(str);
            return this;
        }

        public UpdateCustomFormValuesInput build() {
            Utils.checkNotNull(this.id, "id == null");
            return new UpdateCustomFormValuesInput(this.id, this.propertyDefinitionId, this.accountId, this.parentObjectId, this.parentObject, this.value);
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

        public Builder value(String str) {
            this.value = Input.fromNullable(str);
            return this;
        }
    }

    public UpdateCustomFormValuesInput(String str, Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5) {
        this.id = str;
        this.propertyDefinitionId = input;
        this.accountId = input2;
        this.parentObjectId = input3;
        this.parentObject = input4;
        this.value = input5;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId.value;
    }

    public String id() {
        return this.id;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.UpdateCustomFormValuesInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, UpdateCustomFormValuesInput.this.id);
                if (UpdateCustomFormValuesInput.this.propertyDefinitionId.defined) {
                    inputFieldWriter.writeString("propertyDefinitionId", (String) UpdateCustomFormValuesInput.this.propertyDefinitionId.value);
                }
                if (UpdateCustomFormValuesInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) UpdateCustomFormValuesInput.this.accountId.value);
                }
                if (UpdateCustomFormValuesInput.this.parentObjectId.defined) {
                    inputFieldWriter.writeString("parentObjectId", (String) UpdateCustomFormValuesInput.this.parentObjectId.value);
                }
                if (UpdateCustomFormValuesInput.this.parentObject.defined) {
                    inputFieldWriter.writeString("parentObject", (String) UpdateCustomFormValuesInput.this.parentObject.value);
                }
                if (UpdateCustomFormValuesInput.this.value.defined) {
                    inputFieldWriter.writeString("value", (String) UpdateCustomFormValuesInput.this.value.value);
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

    public String value() {
        return this.value.value;
    }
}
