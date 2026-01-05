package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;

/* loaded from: classes7.dex */
public final class CreateCustomValueInput implements InputType {
    private final String accountId;
    private final Input<String> createSourceId;
    private final Input<String> createSourceType;
    private final Input<String> createdAt;
    private final String parentObjectId;
    private final Input<String> parentObjectType;
    private final String propertyDefinitionId;
    private final Input<String> updatedAt;
    private final String value;

    public static final class Builder {
        private String accountId;
        private String parentObjectId;
        private String propertyDefinitionId;
        private String value;
        private Input<String> parentObjectType = Input.absent();
        private Input<String> createSourceId = Input.absent();
        private Input<String> createSourceType = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public CreateCustomValueInput build() {
            Utils.checkNotNull(this.propertyDefinitionId, "propertyDefinitionId == null");
            Utils.checkNotNull(this.accountId, "accountId == null");
            Utils.checkNotNull(this.parentObjectId, "parentObjectId == null");
            Utils.checkNotNull(this.value, "value == null");
            return new CreateCustomValueInput(this.propertyDefinitionId, this.accountId, this.parentObjectId, this.parentObjectType, this.value, this.createSourceId, this.createSourceType, this.createdAt, this.updatedAt);
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

        public Builder parentObjectId(String str) {
            this.parentObjectId = str;
            return this;
        }

        public Builder parentObjectType(String str) {
            this.parentObjectType = Input.fromNullable(str);
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

    public CreateCustomValueInput(String str, String str2, String str3, Input<String> input, String str4, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5) {
        this.propertyDefinitionId = str;
        this.accountId = str2;
        this.parentObjectId = str3;
        this.parentObjectType = input;
        this.value = str4;
        this.createSourceId = input2;
        this.createSourceType = input3;
        this.createdAt = input4;
        this.updatedAt = input5;
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

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateCustomValueInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString("propertyDefinitionId", CreateCustomValueInput.this.propertyDefinitionId);
                inputFieldWriter.writeString("accountId", CreateCustomValueInput.this.accountId);
                inputFieldWriter.writeString("parentObjectId", CreateCustomValueInput.this.parentObjectId);
                if (CreateCustomValueInput.this.parentObjectType.defined) {
                    inputFieldWriter.writeString("parentObjectType", (String) CreateCustomValueInput.this.parentObjectType.value);
                }
                inputFieldWriter.writeString("value", CreateCustomValueInput.this.value);
                if (CreateCustomValueInput.this.createSourceId.defined) {
                    inputFieldWriter.writeString("createSourceId", (String) CreateCustomValueInput.this.createSourceId.value);
                }
                if (CreateCustomValueInput.this.createSourceType.defined) {
                    inputFieldWriter.writeString("createSourceType", (String) CreateCustomValueInput.this.createSourceType.value);
                }
                if (CreateCustomValueInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) CreateCustomValueInput.this.createdAt.value);
                }
                if (CreateCustomValueInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) CreateCustomValueInput.this.updatedAt.value);
                }
            }
        };
    }

    public String parentObjectId() {
        return this.parentObjectId;
    }

    public String parentObjectType() {
        return this.parentObjectType.value;
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
