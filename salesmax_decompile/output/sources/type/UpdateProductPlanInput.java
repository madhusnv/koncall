package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class UpdateProductPlanInput implements InputType {
    private final Input<String> accountId;
    private final Input<String> createdAt;
    private final Input<String> currency;
    private final Input<Integer> fee;
    private final String id;
    private final Input<String> period;
    private final Input<String> planDescription;
    private final Input<String> planStatus;
    private final Input<Integer> proRataFee;
    private final Input<String> productId;
    private final Input<String> updatedAt;

    public static final class Builder {
        private String id;
        private Input<String> accountId = Input.absent();
        private Input<String> productId = Input.absent();
        private Input<String> planDescription = Input.absent();
        private Input<String> planStatus = Input.absent();
        private Input<String> period = Input.absent();
        private Input<Integer> fee = Input.absent();
        private Input<Integer> proRataFee = Input.absent();
        private Input<String> currency = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = Input.fromNullable(str);
            return this;
        }

        public UpdateProductPlanInput build() {
            Utils.checkNotNull(this.id, "id == null");
            return new UpdateProductPlanInput(this.id, this.accountId, this.productId, this.planDescription, this.planStatus, this.period, this.fee, this.proRataFee, this.currency, this.createdAt, this.updatedAt);
        }

        public Builder createdAt(String str) {
            this.createdAt = Input.fromNullable(str);
            return this;
        }

        public Builder currency(String str) {
            this.currency = Input.fromNullable(str);
            return this;
        }

        public Builder fee(Integer num) {
            this.fee = Input.fromNullable(num);
            return this;
        }

        public Builder id(String str) {
            this.id = str;
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

        public Builder planStatus(String str) {
            this.planStatus = Input.fromNullable(str);
            return this;
        }

        public Builder proRataFee(Integer num) {
            this.proRataFee = Input.fromNullable(num);
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

    public UpdateProductPlanInput(String str, Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<Integer> input6, Input<Integer> input7, Input<String> input8, Input<String> input9, Input<String> input10) {
        this.id = str;
        this.accountId = input;
        this.productId = input2;
        this.planDescription = input3;
        this.planStatus = input4;
        this.period = input5;
        this.fee = input6;
        this.proRataFee = input7;
        this.currency = input8;
        this.createdAt = input9;
        this.updatedAt = input10;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId.value;
    }

    public String createdAt() {
        return this.createdAt.value;
    }

    public String currency() {
        return this.currency.value;
    }

    public Integer fee() {
        return this.fee.value;
    }

    public String id() {
        return this.id;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.UpdateProductPlanInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, UpdateProductPlanInput.this.id);
                if (UpdateProductPlanInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) UpdateProductPlanInput.this.accountId.value);
                }
                if (UpdateProductPlanInput.this.productId.defined) {
                    inputFieldWriter.writeString("productId", (String) UpdateProductPlanInput.this.productId.value);
                }
                if (UpdateProductPlanInput.this.planDescription.defined) {
                    inputFieldWriter.writeString("planDescription", (String) UpdateProductPlanInput.this.planDescription.value);
                }
                if (UpdateProductPlanInput.this.planStatus.defined) {
                    inputFieldWriter.writeString("planStatus", (String) UpdateProductPlanInput.this.planStatus.value);
                }
                if (UpdateProductPlanInput.this.period.defined) {
                    inputFieldWriter.writeString("period", (String) UpdateProductPlanInput.this.period.value);
                }
                if (UpdateProductPlanInput.this.fee.defined) {
                    inputFieldWriter.writeInt("fee", (Integer) UpdateProductPlanInput.this.fee.value);
                }
                if (UpdateProductPlanInput.this.proRataFee.defined) {
                    inputFieldWriter.writeInt("proRataFee", (Integer) UpdateProductPlanInput.this.proRataFee.value);
                }
                if (UpdateProductPlanInput.this.currency.defined) {
                    inputFieldWriter.writeString(FirebaseAnalytics.Param.CURRENCY, (String) UpdateProductPlanInput.this.currency.value);
                }
                if (UpdateProductPlanInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) UpdateProductPlanInput.this.createdAt.value);
                }
                if (UpdateProductPlanInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) UpdateProductPlanInput.this.updatedAt.value);
                }
            }
        };
    }

    public String period() {
        return this.period.value;
    }

    public String planDescription() {
        return this.planDescription.value;
    }

    public String planStatus() {
        return this.planStatus.value;
    }

    public Integer proRataFee() {
        return this.proRataFee.value;
    }

    public String productId() {
        return this.productId.value;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }
}
