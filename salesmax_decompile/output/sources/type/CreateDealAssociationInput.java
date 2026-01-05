package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class CreateDealAssociationInput implements InputType {
    private final String accountId;
    private final Input<String> businessId;
    private final Input<String> contactId;
    private final Input<String> createdAt;
    private final String dealId;
    private final Input<String> id;
    private final Input<String> productId;
    private final Input<String> updatedAt;

    public static final class Builder {
        private String accountId;
        private String dealId;
        private Input<String> id = Input.absent();
        private Input<String> contactId = Input.absent();
        private Input<String> businessId = Input.absent();
        private Input<String> productId = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public CreateDealAssociationInput build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            Utils.checkNotNull(this.dealId, "dealId == null");
            return new CreateDealAssociationInput(this.id, this.accountId, this.dealId, this.contactId, this.businessId, this.productId, this.createdAt, this.updatedAt);
        }

        public Builder businessId(String str) {
            this.businessId = Input.fromNullable(str);
            return this;
        }

        public Builder contactId(String str) {
            this.contactId = Input.fromNullable(str);
            return this;
        }

        public Builder createdAt(String str) {
            this.createdAt = Input.fromNullable(str);
            return this;
        }

        public Builder dealId(String str) {
            this.dealId = str;
            return this;
        }

        public Builder id(String str) {
            this.id = Input.fromNullable(str);
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
    }

    public CreateDealAssociationInput(Input<String> input, String str, String str2, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<String> input6) {
        this.id = input;
        this.accountId = str;
        this.dealId = str2;
        this.contactId = input2;
        this.businessId = input3;
        this.productId = input4;
        this.createdAt = input5;
        this.updatedAt = input6;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId;
    }

    public String businessId() {
        return this.businessId.value;
    }

    public String contactId() {
        return this.contactId.value;
    }

    public String createdAt() {
        return this.createdAt.value;
    }

    public String dealId() {
        return this.dealId;
    }

    public String id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateDealAssociationInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (CreateDealAssociationInput.this.id.defined) {
                    inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, (String) CreateDealAssociationInput.this.id.value);
                }
                inputFieldWriter.writeString("accountId", CreateDealAssociationInput.this.accountId);
                inputFieldWriter.writeString("dealId", CreateDealAssociationInput.this.dealId);
                if (CreateDealAssociationInput.this.contactId.defined) {
                    inputFieldWriter.writeString("contactId", (String) CreateDealAssociationInput.this.contactId.value);
                }
                if (CreateDealAssociationInput.this.businessId.defined) {
                    inputFieldWriter.writeString("businessId", (String) CreateDealAssociationInput.this.businessId.value);
                }
                if (CreateDealAssociationInput.this.productId.defined) {
                    inputFieldWriter.writeString("productId", (String) CreateDealAssociationInput.this.productId.value);
                }
                if (CreateDealAssociationInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) CreateDealAssociationInput.this.createdAt.value);
                }
                if (CreateDealAssociationInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) CreateDealAssociationInput.this.updatedAt.value);
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
}
