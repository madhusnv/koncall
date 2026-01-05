package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class CreateCustomPropertyValuesInput implements InputType {
    private final String accountId;
    private final Input<String> createSourceId;
    private final Input<String> createSourceType;
    private final Input<String> createdAt;
    private final Input<String> id;
    private final Input<String> parentObject;
    private final String parentObjectId;
    private final String propertyDefinitionId;
    private final Input<String> updatedAt;
    private final String value;

    public static final class Builder {
        private String accountId;
        private String parentObjectId;
        private String propertyDefinitionId;
        private String value;
        private Input<String> id = Input.absent();
        private Input<String> parentObject = Input.absent();
        private Input<String> createSourceId = Input.absent();
        private Input<String> createSourceType = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public CreateCustomPropertyValuesInput build() {
            Utils.checkNotNull(this.propertyDefinitionId, "propertyDefinitionId == null");
            Utils.checkNotNull(this.accountId, "accountId == null");
            Utils.checkNotNull(this.parentObjectId, "parentObjectId == null");
            Utils.checkNotNull(this.value, "value == null");
            return new CreateCustomPropertyValuesInput(this.id, this.propertyDefinitionId, this.accountId, this.parentObjectId, this.parentObject, this.value, this.createSourceId, this.createSourceType, this.createdAt, this.updatedAt);
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

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }

        public Builder value(String str) {
            this.value = str;
            return this;
        }
    }

    public CreateCustomPropertyValuesInput(Input<String> input, String str, String str2, String str3, Input<String> input2, String str4, Input<String> input3, Input<String> input4, Input<String> input5, Input<String> input6) {
        this.id = input;
        this.propertyDefinitionId = str;
        this.accountId = str2;
        this.parentObjectId = str3;
        this.parentObject = input2;
        this.value = str4;
        this.createSourceId = input3;
        this.createSourceType = input4;
        this.createdAt = input5;
        this.updatedAt = input6;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId;
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
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateCustomPropertyValuesInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (CreateCustomPropertyValuesInput.this.id.defined) {
                    inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, (String) CreateCustomPropertyValuesInput.this.id.value);
                }
                inputFieldWriter.writeString("propertyDefinitionId", CreateCustomPropertyValuesInput.this.propertyDefinitionId);
                inputFieldWriter.writeString("accountId", CreateCustomPropertyValuesInput.this.accountId);
                inputFieldWriter.writeString("parentObjectId", CreateCustomPropertyValuesInput.this.parentObjectId);
                if (CreateCustomPropertyValuesInput.this.parentObject.defined) {
                    inputFieldWriter.writeString("parentObject", (String) CreateCustomPropertyValuesInput.this.parentObject.value);
                }
                inputFieldWriter.writeString("value", CreateCustomPropertyValuesInput.this.value);
                if (CreateCustomPropertyValuesInput.this.createSourceId.defined) {
                    inputFieldWriter.writeString("createSourceId", (String) CreateCustomPropertyValuesInput.this.createSourceId.value);
                }
                if (CreateCustomPropertyValuesInput.this.createSourceType.defined) {
                    inputFieldWriter.writeString("createSourceType", (String) CreateCustomPropertyValuesInput.this.createSourceType.value);
                }
                if (CreateCustomPropertyValuesInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) CreateCustomPropertyValuesInput.this.createdAt.value);
                }
                if (CreateCustomPropertyValuesInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) CreateCustomPropertyValuesInput.this.updatedAt.value);
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

    public String updatedAt() {
        return this.updatedAt.value;
    }

    public String value() {
        return this.value;
    }
}
