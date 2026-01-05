package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class CreateProductServiceAssociationInput implements InputType {
    private final String accountId;
    private final Input<String> contactId;
    private final Input<String> createdAt;
    private final Input<String> createdById;
    private final Input<String> id;
    private final String productId;
    private final Input<String> updatedAt;
    private final Input<String> updatedById;

    public static final class Builder {
        private String accountId;
        private String productId;
        private Input<String> id = Input.absent();
        private Input<String> contactId = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();
        private Input<String> createdById = Input.absent();
        private Input<String> updatedById = Input.absent();

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public CreateProductServiceAssociationInput build() {
            Utils.checkNotNull(this.productId, "productId == null");
            Utils.checkNotNull(this.accountId, "accountId == null");
            return new CreateProductServiceAssociationInput(this.id, this.productId, this.accountId, this.contactId, this.createdAt, this.updatedAt, this.createdById, this.updatedById);
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
            this.id = Input.fromNullable(str);
            return this;
        }

        public Builder productId(String str) {
            this.productId = str;
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

    public CreateProductServiceAssociationInput(Input<String> input, String str, String str2, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<String> input6) {
        this.id = input;
        this.productId = str;
        this.accountId = str2;
        this.contactId = input2;
        this.createdAt = input3;
        this.updatedAt = input4;
        this.createdById = input5;
        this.updatedById = input6;
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

    public String createdById() {
        return this.createdById.value;
    }

    public String id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateProductServiceAssociationInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (CreateProductServiceAssociationInput.this.id.defined) {
                    inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, (String) CreateProductServiceAssociationInput.this.id.value);
                }
                inputFieldWriter.writeString("productId", CreateProductServiceAssociationInput.this.productId);
                inputFieldWriter.writeString("accountId", CreateProductServiceAssociationInput.this.accountId);
                if (CreateProductServiceAssociationInput.this.contactId.defined) {
                    inputFieldWriter.writeString("contactId", (String) CreateProductServiceAssociationInput.this.contactId.value);
                }
                if (CreateProductServiceAssociationInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) CreateProductServiceAssociationInput.this.createdAt.value);
                }
                if (CreateProductServiceAssociationInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) CreateProductServiceAssociationInput.this.updatedAt.value);
                }
                if (CreateProductServiceAssociationInput.this.createdById.defined) {
                    inputFieldWriter.writeString("createdById", (String) CreateProductServiceAssociationInput.this.createdById.value);
                }
                if (CreateProductServiceAssociationInput.this.updatedById.defined) {
                    inputFieldWriter.writeString("updatedById", (String) CreateProductServiceAssociationInput.this.updatedById.value);
                }
            }
        };
    }

    public String productId() {
        return this.productId;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }

    public String updatedById() {
        return this.updatedById.value;
    }
}
