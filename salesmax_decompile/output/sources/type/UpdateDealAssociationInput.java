package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class UpdateDealAssociationInput implements InputType {
    private final Input<String> accountId;
    private final Input<String> businessId;
    private final Input<String> contactId;
    private final Input<String> createdAt;
    private final Input<String> dealId;
    private final String id;
    private final Input<String> productId;
    private final Input<String> updatedAt;

    public static final class Builder {
        private String id;
        private Input<String> accountId = Input.absent();
        private Input<String> dealId = Input.absent();
        private Input<String> contactId = Input.absent();
        private Input<String> businessId = Input.absent();
        private Input<String> productId = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = Input.fromNullable(str);
            return this;
        }

        public UpdateDealAssociationInput build() {
            Utils.checkNotNull(this.id, "id == null");
            return new UpdateDealAssociationInput(this.id, this.accountId, this.dealId, this.contactId, this.businessId, this.productId, this.createdAt, this.updatedAt);
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
            this.dealId = Input.fromNullable(str);
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
    }

    public UpdateDealAssociationInput(String str, Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<String> input6, Input<String> input7) {
        this.id = str;
        this.accountId = input;
        this.dealId = input2;
        this.contactId = input3;
        this.businessId = input4;
        this.productId = input5;
        this.createdAt = input6;
        this.updatedAt = input7;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId.value;
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
        return this.dealId.value;
    }

    public String id() {
        return this.id;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.UpdateDealAssociationInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, UpdateDealAssociationInput.this.id);
                if (UpdateDealAssociationInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) UpdateDealAssociationInput.this.accountId.value);
                }
                if (UpdateDealAssociationInput.this.dealId.defined) {
                    inputFieldWriter.writeString("dealId", (String) UpdateDealAssociationInput.this.dealId.value);
                }
                if (UpdateDealAssociationInput.this.contactId.defined) {
                    inputFieldWriter.writeString("contactId", (String) UpdateDealAssociationInput.this.contactId.value);
                }
                if (UpdateDealAssociationInput.this.businessId.defined) {
                    inputFieldWriter.writeString("businessId", (String) UpdateDealAssociationInput.this.businessId.value);
                }
                if (UpdateDealAssociationInput.this.productId.defined) {
                    inputFieldWriter.writeString("productId", (String) UpdateDealAssociationInput.this.productId.value);
                }
                if (UpdateDealAssociationInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) UpdateDealAssociationInput.this.createdAt.value);
                }
                if (UpdateDealAssociationInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) UpdateDealAssociationInput.this.updatedAt.value);
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
