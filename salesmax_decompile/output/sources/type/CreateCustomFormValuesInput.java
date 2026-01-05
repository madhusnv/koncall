package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class CreateCustomFormValuesInput implements InputType {
    private final String accountId;
    private final Input<String> id;
    private final Input<String> parentObject;
    private final String parentObjectId;
    private final String propertyDefinitionId;
    private final Input<String> value;

    public static final class Builder {
        private String accountId;
        private String parentObjectId;
        private String propertyDefinitionId;
        private Input<String> id = Input.absent();
        private Input<String> parentObject = Input.absent();
        private Input<String> value = Input.absent();

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public CreateCustomFormValuesInput build() {
            Utils.checkNotNull(this.propertyDefinitionId, "propertyDefinitionId == null");
            Utils.checkNotNull(this.accountId, "accountId == null");
            Utils.checkNotNull(this.parentObjectId, "parentObjectId == null");
            return new CreateCustomFormValuesInput(this.id, this.propertyDefinitionId, this.accountId, this.parentObjectId, this.parentObject, this.value);
        }

        public Builder id(String str) {
            this.id = Input.fromNullable(str);
            return this;
        }

        public Builder parentObject(String str) {
            this.parentObject = Input.fromNullable(str);
            return this;
        }

        public Builder parentObjectId(String str) {
            this.parentObjectId = str;
            return this;
        }

        public Builder propertyDefinitionId(String str) {
            this.propertyDefinitionId = str;
            return this;
        }

        public Builder value(String str) {
            this.value = Input.fromNullable(str);
            return this;
        }
    }

    public CreateCustomFormValuesInput(Input<String> input, String str, String str2, String str3, Input<String> input2, Input<String> input3) {
        this.id = input;
        this.propertyDefinitionId = str;
        this.accountId = str2;
        this.parentObjectId = str3;
        this.parentObject = input2;
        this.value = input3;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId;
    }

    public String id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateCustomFormValuesInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (CreateCustomFormValuesInput.this.id.defined) {
                    inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, (String) CreateCustomFormValuesInput.this.id.value);
                }
                inputFieldWriter.writeString("propertyDefinitionId", CreateCustomFormValuesInput.this.propertyDefinitionId);
                inputFieldWriter.writeString("accountId", CreateCustomFormValuesInput.this.accountId);
                inputFieldWriter.writeString("parentObjectId", CreateCustomFormValuesInput.this.parentObjectId);
                if (CreateCustomFormValuesInput.this.parentObject.defined) {
                    inputFieldWriter.writeString("parentObject", (String) CreateCustomFormValuesInput.this.parentObject.value);
                }
                if (CreateCustomFormValuesInput.this.value.defined) {
                    inputFieldWriter.writeString("value", (String) CreateCustomFormValuesInput.this.value.value);
                }
            }
        };
    }

    public String parentObject() {
        return this.parentObject.value;
    }

    public String parentObjectId() {
        return this.parentObjectId;
    }

    public String propertyDefinitionId() {
        return this.propertyDefinitionId;
    }

    public String value() {
        return this.value.value;
    }
}
