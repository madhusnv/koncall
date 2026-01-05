package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;

/* loaded from: classes7.dex */
public final class UpdateCustomValueInput implements InputType {
    private final String accountId;
    private final Input<String> createSourceId;
    private final Input<String> createSourceType;
    private final Input<String> createdAt;
    private final String parentObjectId;
    private final Input<String> parentObjectType;
    private final String propertyDefinitionId;
    private final Input<String> updatedAt;
    private final Input<String> value;

    public static final class Builder {
        private String accountId;
        private String parentObjectId;
        private String propertyDefinitionId;
        private Input<String> parentObjectType = Input.absent();
        private Input<String> value = Input.absent();
        private Input<String> createSourceId = Input.absent();
        private Input<String> createSourceType = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public UpdateCustomValueInput build() {
            Utils.checkNotNull(this.propertyDefinitionId, "propertyDefinitionId == null");
            Utils.checkNotNull(this.accountId, "accountId == null");
            Utils.checkNotNull(this.parentObjectId, "parentObjectId == null");
            return new UpdateCustomValueInput(this.propertyDefinitionId, this.accountId, this.parentObjectId, this.parentObjectType, this.value, this.createSourceId, this.createSourceType, this.createdAt, this.updatedAt);
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
            this.value = Input.fromNullable(str);
            return this;
        }
    }

    public UpdateCustomValueInput(String str, String str2, String str3, Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<String> input6) {
        this.propertyDefinitionId = str;
        this.accountId = str2;
        this.parentObjectId = str3;
        this.parentObjectType = input;
        this.value = input2;
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

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.UpdateCustomValueInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString("propertyDefinitionId", UpdateCustomValueInput.this.propertyDefinitionId);
                inputFieldWriter.writeString("accountId", UpdateCustomValueInput.this.accountId);
                inputFieldWriter.writeString("parentObjectId", UpdateCustomValueInput.this.parentObjectId);
                if (UpdateCustomValueInput.this.parentObjectType.defined) {
                    inputFieldWriter.writeString("parentObjectType", (String) UpdateCustomValueInput.this.parentObjectType.value);
                }
                if (UpdateCustomValueInput.this.value.defined) {
                    inputFieldWriter.writeString("value", (String) UpdateCustomValueInput.this.value.value);
                }
                if (UpdateCustomValueInput.this.createSourceId.defined) {
                    inputFieldWriter.writeString("createSourceId", (String) UpdateCustomValueInput.this.createSourceId.value);
                }
                if (UpdateCustomValueInput.this.createSourceType.defined) {
                    inputFieldWriter.writeString("createSourceType", (String) UpdateCustomValueInput.this.createSourceType.value);
                }
                if (UpdateCustomValueInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) UpdateCustomValueInput.this.createdAt.value);
                }
                if (UpdateCustomValueInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) UpdateCustomValueInput.this.updatedAt.value);
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
        return this.value.value;
    }
}
