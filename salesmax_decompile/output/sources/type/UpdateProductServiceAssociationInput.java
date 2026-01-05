package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class UpdateProductServiceAssociationInput implements InputType {
    private final Input<String> accountId;
    private final Input<String> contactId;
    private final Input<String> createdAt;
    private final Input<String> createdById;
    private final String id;
    private final Input<String> productId;
    private final Input<String> updatedAt;
    private final Input<String> updatedById;

    public static final class Builder {
        private String id;
        private Input<String> productId = Input.absent();
        private Input<String> accountId = Input.absent();
        private Input<String> contactId = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();
        private Input<String> createdById = Input.absent();
        private Input<String> updatedById = Input.absent();

        public Builder accountId(String str) {
            this.accountId = Input.fromNullable(str);
            return this;
        }

        public UpdateProductServiceAssociationInput build() {
            Utils.checkNotNull(this.id, "id == null");
            return new UpdateProductServiceAssociationInput(this.id, this.productId, this.accountId, this.contactId, this.createdAt, this.updatedAt, this.createdById, this.updatedById);
        }

        public Builder contactId(String str) {
            this.contactId = Input.fromNullable(str);
            return this;
        }

        public Builder createdAt(String str) {
            this.createdAt = Input.fromNullable(str);
            return this;
        }

        public Builder createdById(String str) {
            this.createdById = Input.fromNullable(str);
            return this;
        }

        public Builder id(String str) {
            this.id = str;
            return this;
        }

        public Builder productId(String str) {
            this.productId = Input.fromNullable(str);
            return this;
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }

        public Builder updatedById(String str) {
            this.updatedById = Input.fromNullable(str);
            return this;
        }
    }

    public UpdateProductServiceAssociationInput(String str, Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<String> input6, Input<String> input7) {
        this.id = str;
        this.productId = input;
        this.accountId = input2;
        this.contactId = input3;
        this.createdAt = input4;
        this.updatedAt = input5;
        this.createdById = input6;
        this.updatedById = input7;
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

    public String createdById() {
        return this.createdById.value;
    }

    public String id() {
        return this.id;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.UpdateProductServiceAssociationInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, UpdateProductServiceAssociationInput.this.id);
                if (UpdateProductServiceAssociationInput.this.productId.defined) {
                    inputFieldWriter.writeString("productId", (String) UpdateProductServiceAssociationInput.this.productId.value);
                }
                if (UpdateProductServiceAssociationInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) UpdateProductServiceAssociationInput.this.accountId.value);
                }
                if (UpdateProductServiceAssociationInput.this.contactId.defined) {
                    inputFieldWriter.writeString("contactId", (String) UpdateProductServiceAssociationInput.this.contactId.value);
                }
                if (UpdateProductServiceAssociationInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) UpdateProductServiceAssociationInput.this.createdAt.value);
                }
                if (UpdateProductServiceAssociationInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) UpdateProductServiceAssociationInput.this.updatedAt.value);
                }
                if (UpdateProductServiceAssociationInput.this.createdById.defined) {
                    inputFieldWriter.writeString("createdById", (String) UpdateProductServiceAssociationInput.this.createdById.value);
                }
                if (UpdateProductServiceAssociationInput.this.updatedById.defined) {
                    inputFieldWriter.writeString("updatedById", (String) UpdateProductServiceAssociationInput.this.updatedById.value);
                }
            }
        };
    }

    public String productId() {
        return this.productId.value;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }

    public String updatedById() {
        return this.updatedById.value;
    }
}
