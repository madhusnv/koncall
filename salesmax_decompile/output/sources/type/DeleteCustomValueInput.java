package type;

import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;

/* loaded from: classes7.dex */
public final class DeleteCustomValueInput implements InputType {
    private final String accountId;
    private final String parentObjectId;
    private final String propertyDefinitionId;

    public static final class Builder {
        private String accountId;
        private String parentObjectId;
        private String propertyDefinitionId;

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public DeleteCustomValueInput build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            Utils.checkNotNull(this.parentObjectId, "parentObjectId == null");
            Utils.checkNotNull(this.propertyDefinitionId, "propertyDefinitionId == null");
            return new DeleteCustomValueInput(this.accountId, this.parentObjectId, this.propertyDefinitionId);
        }

        public Builder parentObjectId(String str) {
            this.parentObjectId = str;
            return this;
        }

        public Builder propertyDefinitionId(String str) {
            this.propertyDefinitionId = str;
            return this;
        }
    }

    public DeleteCustomValueInput(String str, String str2, String str3) {
        this.accountId = str;
        this.parentObjectId = str2;
        this.propertyDefinitionId = str3;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.DeleteCustomValueInput.1
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString("accountId", DeleteCustomValueInput.this.accountId);
                inputFieldWriter.writeString("parentObjectId", DeleteCustomValueInput.this.parentObjectId);
                inputFieldWriter.writeString("propertyDefinitionId", DeleteCustomValueInput.this.propertyDefinitionId);
            }
        };
    }

    public String parentObjectId() {
        return this.parentObjectId;
    }

    public String propertyDefinitionId() {
        return this.propertyDefinitionId;
    }
}
