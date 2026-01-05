package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class CreateProductPlanSubscriptionInput implements InputType {
    private final String accountId;
    private final String addedById;
    private final Input<Integer> amount;
    private final Input<String> createdAt;
    private final Input<String> currency;
    private final Input<String> id;
    private final Input<Integer> numberOfFreeUnits;
    private final Input<Integer> numberOfUnits;
    private final Input<String> period;
    private final Input<Integer> planFeePerUnit;
    private final Input<Integer> planFeeProRataPerUnit;
    private final Input<String> productAccountId;
    private final String productPlanId;
    private final Input<String> status;
    private final Input<String> subscriptionEndDate;
    private final Input<String> subscriptionPaymentStatus;
    private final String subscriptionStartDate;
    private final Input<String> unitType;
    private final Input<String> updatedAt;

    public static final class Builder {
        private String accountId;
        private String addedById;
        private String productPlanId;
        private String subscriptionStartDate;
        private Input<String> id = Input.absent();
        private Input<String> productAccountId = Input.absent();
        private Input<Integer> planFeePerUnit = Input.absent();
        private Input<Integer> planFeeProRataPerUnit = Input.absent();
        private Input<String> period = Input.absent();
        private Input<Integer> amount = Input.absent();
        private Input<String> currency = Input.absent();
        private Input<String> status = Input.absent();
        private Input<Integer> numberOfUnits = Input.absent();
        private Input<Integer> numberOfFreeUnits = Input.absent();
        private Input<String> unitType = Input.absent();
        private Input<String> subscriptionPaymentStatus = Input.absent();
        private Input<String> subscriptionEndDate = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public Builder addedById(String str) {
            this.addedById = str;
            return this;
        }

        public Builder amount(Integer num) {
            this.amount = Input.fromNullable(num);
            return this;
        }

        public CreateProductPlanSubscriptionInput build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            Utils.checkNotNull(this.addedById, "addedById == null");
            Utils.checkNotNull(this.productPlanId, "productPlanId == null");
            Utils.checkNotNull(this.subscriptionStartDate, "subscriptionStartDate == null");
            return new CreateProductPlanSubscriptionInput(this.id, this.accountId, this.addedById, this.productAccountId, this.productPlanId, this.planFeePerUnit, this.planFeeProRataPerUnit, this.period, this.amount, this.currency, this.status, this.numberOfUnits, this.numberOfFreeUnits, this.unitType, this.subscriptionPaymentStatus, this.subscriptionStartDate, this.subscriptionEndDate, this.createdAt, this.updatedAt);
        }

        public Builder createdAt(String str) {
            this.createdAt = Input.fromNullable(str);
            return this;
        }

        public Builder currency(String str) {
            this.currency = Input.fromNullable(str);
            return this;
        }

        public Builder id(String str) {
            this.id = Input.fromNullable(str);
            return this;
        }

        public Builder numberOfFreeUnits(Integer num) {
            this.numberOfFreeUnits = Input.fromNullable(num);
            return this;
        }

        public Builder numberOfUnits(Integer num) {
            this.numberOfUnits = Input.fromNullable(num);
            return this;
        }

        public Builder period(String str) {
            this.period = Input.fromNullable(str);
            return this;
        }

        public Builder planFeePerUnit(Integer num) {
            this.planFeePerUnit = Input.fromNullable(num);
            return this;
        }

        public Builder planFeeProRataPerUnit(Integer num) {
            this.planFeeProRataPerUnit = Input.fromNullable(num);
            return this;
        }

        public Builder productAccountId(String str) {
            this.productAccountId = Input.fromNullable(str);
            return this;
        }

        public Builder productPlanId(String str) {
            this.productPlanId = str;
            return this;
        }

        public Builder status(String str) {
            this.status = Input.fromNullable(str);
            return this;
        }

        public Builder subscriptionEndDate(String str) {
            this.subscriptionEndDate = Input.fromNullable(str);
            return this;
        }

        public Builder subscriptionPaymentStatus(String str) {
            this.subscriptionPaymentStatus = Input.fromNullable(str);
            return this;
        }

        public Builder subscriptionStartDate(String str) {
            this.subscriptionStartDate = str;
            return this;
        }

        public Builder unitType(String str) {
            this.unitType = Input.fromNullable(str);
            return this;
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }
    }

    public CreateProductPlanSubscriptionInput(Input<String> input, String str, String str2, Input<String> input2, String str3, Input<Integer> input3, Input<Integer> input4, Input<String> input5, Input<Integer> input6, Input<String> input7, Input<String> input8, Input<Integer> input9, Input<Integer> input10, Input<String> input11, Input<String> input12, String str4, Input<String> input13, Input<String> input14, Input<String> input15) {
        this.id = input;
        this.accountId = str;
        this.addedById = str2;
        this.productAccountId = input2;
        this.productPlanId = str3;
        this.planFeePerUnit = input3;
        this.planFeeProRataPerUnit = input4;
        this.period = input5;
        this.amount = input6;
        this.currency = input7;
        this.status = input8;
        this.numberOfUnits = input9;
        this.numberOfFreeUnits = input10;
        this.unitType = input11;
        this.subscriptionPaymentStatus = input12;
        this.subscriptionStartDate = str4;
        this.subscriptionEndDate = input13;
        this.createdAt = input14;
        this.updatedAt = input15;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId;
    }

    public String addedById() {
        return this.addedById;
    }

    public Integer amount() {
        return this.amount.value;
    }

    public String createdAt() {
        return this.createdAt.value;
    }

    public String currency() {
        return this.currency.value;
    }

    public String id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateProductPlanSubscriptionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (CreateProductPlanSubscriptionInput.this.id.defined) {
                    inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, (String) CreateProductPlanSubscriptionInput.this.id.value);
                }
                inputFieldWriter.writeString("accountId", CreateProductPlanSubscriptionInput.this.accountId);
                inputFieldWriter.writeString("addedById", CreateProductPlanSubscriptionInput.this.addedById);
                if (CreateProductPlanSubscriptionInput.this.productAccountId.defined) {
                    inputFieldWriter.writeString("productAccountId", (String) CreateProductPlanSubscriptionInput.this.productAccountId.value);
                }
                inputFieldWriter.writeString("productPlanId", CreateProductPlanSubscriptionInput.this.productPlanId);
                if (CreateProductPlanSubscriptionInput.this.planFeePerUnit.defined) {
                    inputFieldWriter.writeInt("planFeePerUnit", (Integer) CreateProductPlanSubscriptionInput.this.planFeePerUnit.value);
                }
                if (CreateProductPlanSubscriptionInput.this.planFeeProRataPerUnit.defined) {
                    inputFieldWriter.writeInt("planFeeProRataPerUnit", (Integer) CreateProductPlanSubscriptionInput.this.planFeeProRataPerUnit.value);
                }
                if (CreateProductPlanSubscriptionInput.this.period.defined) {
                    inputFieldWriter.writeString("period", (String) CreateProductPlanSubscriptionInput.this.period.value);
                }
                if (CreateProductPlanSubscriptionInput.this.amount.defined) {
                    inputFieldWriter.writeInt("amount", (Integer) CreateProductPlanSubscriptionInput.this.amount.value);
                }
                if (CreateProductPlanSubscriptionInput.this.currency.defined) {
                    inputFieldWriter.writeString(FirebaseAnalytics.Param.CURRENCY, (String) CreateProductPlanSubscriptionInput.this.currency.value);
                }
                if (CreateProductPlanSubscriptionInput.this.status.defined) {
                    inputFieldWriter.writeString("status", (String) CreateProductPlanSubscriptionInput.this.status.value);
                }
                if (CreateProductPlanSubscriptionInput.this.numberOfUnits.defined) {
                    inputFieldWriter.writeInt("numberOfUnits", (Integer) CreateProductPlanSubscriptionInput.this.numberOfUnits.value);
                }
                if (CreateProductPlanSubscriptionInput.this.numberOfFreeUnits.defined) {
                    inputFieldWriter.writeInt("numberOfFreeUnits", (Integer) CreateProductPlanSubscriptionInput.this.numberOfFreeUnits.value);
                }
                if (CreateProductPlanSubscriptionInput.this.unitType.defined) {
                    inputFieldWriter.writeString("unitType", (String) CreateProductPlanSubscriptionInput.this.unitType.value);
                }
                if (CreateProductPlanSubscriptionInput.this.subscriptionPaymentStatus.defined) {
                    inputFieldWriter.writeString("subscriptionPaymentStatus", (String) CreateProductPlanSubscriptionInput.this.subscriptionPaymentStatus.value);
                }
                inputFieldWriter.writeString("subscriptionStartDate", CreateProductPlanSubscriptionInput.this.subscriptionStartDate);
                if (CreateProductPlanSubscriptionInput.this.subscriptionEndDate.defined) {
                    inputFieldWriter.writeString("subscriptionEndDate", (String) CreateProductPlanSubscriptionInput.this.subscriptionEndDate.value);
                }
                if (CreateProductPlanSubscriptionInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) CreateProductPlanSubscriptionInput.this.createdAt.value);
                }
                if (CreateProductPlanSubscriptionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) CreateProductPlanSubscriptionInput.this.updatedAt.value);
                }
            }
        };
    }

    public Integer numberOfFreeUnits() {
        return this.numberOfFreeUnits.value;
    }

    public Integer numberOfUnits() {
        return this.numberOfUnits.value;
    }

    public String period() {
        return this.period.value;
    }

    public Integer planFeePerUnit() {
        return this.planFeePerUnit.value;
    }

    public Integer planFeeProRataPerUnit() {
        return this.planFeeProRataPerUnit.value;
    }

    public String productAccountId() {
        return this.productAccountId.value;
    }

    public String productPlanId() {
        return this.productPlanId;
    }

    public String status() {
        return this.status.value;
    }

    public String subscriptionEndDate() {
        return this.subscriptionEndDate.value;
    }

    public String subscriptionPaymentStatus() {
        return this.subscriptionPaymentStatus.value;
    }

    public String subscriptionStartDate() {
        return this.subscriptionStartDate;
    }

    public String unitType() {
        return this.unitType.value;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }
}
