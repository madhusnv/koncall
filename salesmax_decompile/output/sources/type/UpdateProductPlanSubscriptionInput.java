package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class UpdateProductPlanSubscriptionInput implements InputType {
    private final Input<String> accountId;
    private final Input<String> addedById;
    private final Input<Integer> amount;
    private final Input<String> createdAt;
    private final Input<String> currency;
    private final String id;
    private final Input<Integer> numberOfFreeUnits;
    private final Input<Integer> numberOfUnits;
    private final Input<String> period;
    private final Input<String> planDescription;
    private final Input<Integer> planFeePerUnit;
    private final Input<Integer> planFeeProRataPerUnit;
    private final Input<String> planStatus;
    private final Input<String> productAccountId;
    private final Input<String> productPlanId;
    private final Input<String> status;
    private final Input<String> subscriptionEndDate;
    private final Input<String> subscriptionPaymentStatus;
    private final Input<String> subscriptionStartDate;
    private final Input<String> unitType;
    private final Input<String> updatedAt;

    public static final class Builder {
        private String id;
        private Input<String> accountId = Input.absent();
        private Input<String> addedById = Input.absent();
        private Input<String> productAccountId = Input.absent();
        private Input<String> productPlanId = Input.absent();
        private Input<String> planDescription = Input.absent();
        private Input<String> planStatus = Input.absent();
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
        private Input<String> subscriptionStartDate = Input.absent();
        private Input<String> subscriptionEndDate = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = Input.fromNullable(str);
            return this;
        }

        public Builder addedById(String str) {
            this.addedById = Input.fromNullable(str);
            return this;
        }

        public Builder amount(Integer num) {
            this.amount = Input.fromNullable(num);
            return this;
        }

        public UpdateProductPlanSubscriptionInput build() {
            Utils.checkNotNull(this.id, "id == null");
            return new UpdateProductPlanSubscriptionInput(this.id, this.accountId, this.addedById, this.productAccountId, this.productPlanId, this.planDescription, this.planStatus, this.planFeePerUnit, this.planFeeProRataPerUnit, this.period, this.amount, this.currency, this.status, this.numberOfUnits, this.numberOfFreeUnits, this.unitType, this.subscriptionPaymentStatus, this.subscriptionStartDate, this.subscriptionEndDate, this.createdAt, this.updatedAt);
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
            this.id = str;
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

        public Builder planDescription(String str) {
            this.planDescription = Input.fromNullable(str);
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

        public Builder planStatus(String str) {
            this.planStatus = Input.fromNullable(str);
            return this;
        }

        public Builder productAccountId(String str) {
            this.productAccountId = Input.fromNullable(str);
            return this;
        }

        public Builder productPlanId(String str) {
            this.productPlanId = Input.fromNullable(str);
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
            this.subscriptionStartDate = Input.fromNullable(str);
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

    public UpdateProductPlanSubscriptionInput(String str, Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<String> input6, Input<Integer> input7, Input<Integer> input8, Input<String> input9, Input<Integer> input10, Input<String> input11, Input<String> input12, Input<Integer> input13, Input<Integer> input14, Input<String> input15, Input<String> input16, Input<String> input17, Input<String> input18, Input<String> input19, Input<String> input20) {
        this.id = str;
        this.accountId = input;
        this.addedById = input2;
        this.productAccountId = input3;
        this.productPlanId = input4;
        this.planDescription = input5;
        this.planStatus = input6;
        this.planFeePerUnit = input7;
        this.planFeeProRataPerUnit = input8;
        this.period = input9;
        this.amount = input10;
        this.currency = input11;
        this.status = input12;
        this.numberOfUnits = input13;
        this.numberOfFreeUnits = input14;
        this.unitType = input15;
        this.subscriptionPaymentStatus = input16;
        this.subscriptionStartDate = input17;
        this.subscriptionEndDate = input18;
        this.createdAt = input19;
        this.updatedAt = input20;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId.value;
    }

    public String addedById() {
        return this.addedById.value;
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
        return this.id;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.UpdateProductPlanSubscriptionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, UpdateProductPlanSubscriptionInput.this.id);
                if (UpdateProductPlanSubscriptionInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) UpdateProductPlanSubscriptionInput.this.accountId.value);
                }
                if (UpdateProductPlanSubscriptionInput.this.addedById.defined) {
                    inputFieldWriter.writeString("addedById", (String) UpdateProductPlanSubscriptionInput.this.addedById.value);
                }
                if (UpdateProductPlanSubscriptionInput.this.productAccountId.defined) {
                    inputFieldWriter.writeString("productAccountId", (String) UpdateProductPlanSubscriptionInput.this.productAccountId.value);
                }
                if (UpdateProductPlanSubscriptionInput.this.productPlanId.defined) {
                    inputFieldWriter.writeString("productPlanId", (String) UpdateProductPlanSubscriptionInput.this.productPlanId.value);
                }
                if (UpdateProductPlanSubscriptionInput.this.planDescription.defined) {
                    inputFieldWriter.writeString("planDescription", (String) UpdateProductPlanSubscriptionInput.this.planDescription.value);
                }
                if (UpdateProductPlanSubscriptionInput.this.planStatus.defined) {
                    inputFieldWriter.writeString("planStatus", (String) UpdateProductPlanSubscriptionInput.this.planStatus.value);
                }
                if (UpdateProductPlanSubscriptionInput.this.planFeePerUnit.defined) {
                    inputFieldWriter.writeInt("planFeePerUnit", (Integer) UpdateProductPlanSubscriptionInput.this.planFeePerUnit.value);
                }
                if (UpdateProductPlanSubscriptionInput.this.planFeeProRataPerUnit.defined) {
                    inputFieldWriter.writeInt("planFeeProRataPerUnit", (Integer) UpdateProductPlanSubscriptionInput.this.planFeeProRataPerUnit.value);
                }
                if (UpdateProductPlanSubscriptionInput.this.period.defined) {
                    inputFieldWriter.writeString("period", (String) UpdateProductPlanSubscriptionInput.this.period.value);
                }
                if (UpdateProductPlanSubscriptionInput.this.amount.defined) {
                    inputFieldWriter.writeInt("amount", (Integer) UpdateProductPlanSubscriptionInput.this.amount.value);
                }
                if (UpdateProductPlanSubscriptionInput.this.currency.defined) {
                    inputFieldWriter.writeString(FirebaseAnalytics.Param.CURRENCY, (String) UpdateProductPlanSubscriptionInput.this.currency.value);
                }
                if (UpdateProductPlanSubscriptionInput.this.status.defined) {
                    inputFieldWriter.writeString("status", (String) UpdateProductPlanSubscriptionInput.this.status.value);
                }
                if (UpdateProductPlanSubscriptionInput.this.numberOfUnits.defined) {
                    inputFieldWriter.writeInt("numberOfUnits", (Integer) UpdateProductPlanSubscriptionInput.this.numberOfUnits.value);
                }
                if (UpdateProductPlanSubscriptionInput.this.numberOfFreeUnits.defined) {
                    inputFieldWriter.writeInt("numberOfFreeUnits", (Integer) UpdateProductPlanSubscriptionInput.this.numberOfFreeUnits.value);
                }
                if (UpdateProductPlanSubscriptionInput.this.unitType.defined) {
                    inputFieldWriter.writeString("unitType", (String) UpdateProductPlanSubscriptionInput.this.unitType.value);
                }
                if (UpdateProductPlanSubscriptionInput.this.subscriptionPaymentStatus.defined) {
                    inputFieldWriter.writeString("subscriptionPaymentStatus", (String) UpdateProductPlanSubscriptionInput.this.subscriptionPaymentStatus.value);
                }
                if (UpdateProductPlanSubscriptionInput.this.subscriptionStartDate.defined) {
                    inputFieldWriter.writeString("subscriptionStartDate", (String) UpdateProductPlanSubscriptionInput.this.subscriptionStartDate.value);
                }
                if (UpdateProductPlanSubscriptionInput.this.subscriptionEndDate.defined) {
                    inputFieldWriter.writeString("subscriptionEndDate", (String) UpdateProductPlanSubscriptionInput.this.subscriptionEndDate.value);
                }
                if (UpdateProductPlanSubscriptionInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) UpdateProductPlanSubscriptionInput.this.createdAt.value);
                }
                if (UpdateProductPlanSubscriptionInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) UpdateProductPlanSubscriptionInput.this.updatedAt.value);
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

    public String planDescription() {
        return this.planDescription.value;
    }

    public Integer planFeePerUnit() {
        return this.planFeePerUnit.value;
    }

    public Integer planFeeProRataPerUnit() {
        return this.planFeeProRataPerUnit.value;
    }

    public String planStatus() {
        return this.planStatus.value;
    }

    public String productAccountId() {
        return this.productAccountId.value;
    }

    public String productPlanId() {
        return this.productPlanId.value;
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
        return this.subscriptionStartDate.value;
    }

    public String unitType() {
        return this.unitType.value;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }
}
