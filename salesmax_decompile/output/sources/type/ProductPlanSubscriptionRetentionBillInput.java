package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes7.dex */
public final class ProductPlanSubscriptionRetentionBillInput implements InputType {
    private final Input<String> currency;
    private final Input<Integer> fee;
    private final Input<String> newSubscriptionEndDate;
    private final Input<String> newSubscriptionStartDate;
    private final Input<Integer> numberOfUsers;
    private final String productPlanSubscriptionId;
    private final Input<Integer> totalFees;

    public static final class Builder {
        private String productPlanSubscriptionId;
        private Input<Integer> numberOfUsers = Input.absent();
        private Input<String> newSubscriptionStartDate = Input.absent();
        private Input<String> newSubscriptionEndDate = Input.absent();
        private Input<Integer> fee = Input.absent();
        private Input<Integer> totalFees = Input.absent();
        private Input<String> currency = Input.absent();

        public ProductPlanSubscriptionRetentionBillInput build() {
            Utils.checkNotNull(this.productPlanSubscriptionId, "productPlanSubscriptionId == null");
            return new ProductPlanSubscriptionRetentionBillInput(this.productPlanSubscriptionId, this.numberOfUsers, this.newSubscriptionStartDate, this.newSubscriptionEndDate, this.fee, this.totalFees, this.currency);
        }

        public Builder currency(String str) {
            this.currency = Input.fromNullable(str);
            return this;
        }

        public Builder fee(Integer num) {
            this.fee = Input.fromNullable(num);
            return this;
        }

        public Builder newSubscriptionEndDate(String str) {
            this.newSubscriptionEndDate = Input.fromNullable(str);
            return this;
        }

        public Builder newSubscriptionStartDate(String str) {
            this.newSubscriptionStartDate = Input.fromNullable(str);
            return this;
        }

        public Builder numberOfUsers(Integer num) {
            this.numberOfUsers = Input.fromNullable(num);
            return this;
        }

        public Builder productPlanSubscriptionId(String str) {
            this.productPlanSubscriptionId = str;
            return this;
        }

        public Builder totalFees(Integer num) {
            this.totalFees = Input.fromNullable(num);
            return this;
        }
    }

    public ProductPlanSubscriptionRetentionBillInput(String str, Input<Integer> input, Input<String> input2, Input<String> input3, Input<Integer> input4, Input<Integer> input5, Input<String> input6) {
        this.productPlanSubscriptionId = str;
        this.numberOfUsers = input;
        this.newSubscriptionStartDate = input2;
        this.newSubscriptionEndDate = input3;
        this.fee = input4;
        this.totalFees = input5;
        this.currency = input6;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String currency() {
        return this.currency.value;
    }

    public Integer fee() {
        return this.fee.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ProductPlanSubscriptionRetentionBillInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString("productPlanSubscriptionId", ProductPlanSubscriptionRetentionBillInput.this.productPlanSubscriptionId);
                if (ProductPlanSubscriptionRetentionBillInput.this.numberOfUsers.defined) {
                    inputFieldWriter.writeInt("numberOfUsers", (Integer) ProductPlanSubscriptionRetentionBillInput.this.numberOfUsers.value);
                }
                if (ProductPlanSubscriptionRetentionBillInput.this.newSubscriptionStartDate.defined) {
                    inputFieldWriter.writeString("newSubscriptionStartDate", (String) ProductPlanSubscriptionRetentionBillInput.this.newSubscriptionStartDate.value);
                }
                if (ProductPlanSubscriptionRetentionBillInput.this.newSubscriptionEndDate.defined) {
                    inputFieldWriter.writeString("newSubscriptionEndDate", (String) ProductPlanSubscriptionRetentionBillInput.this.newSubscriptionEndDate.value);
                }
                if (ProductPlanSubscriptionRetentionBillInput.this.fee.defined) {
                    inputFieldWriter.writeInt("fee", (Integer) ProductPlanSubscriptionRetentionBillInput.this.fee.value);
                }
                if (ProductPlanSubscriptionRetentionBillInput.this.totalFees.defined) {
                    inputFieldWriter.writeInt("totalFees", (Integer) ProductPlanSubscriptionRetentionBillInput.this.totalFees.value);
                }
                if (ProductPlanSubscriptionRetentionBillInput.this.currency.defined) {
                    inputFieldWriter.writeString(FirebaseAnalytics.Param.CURRENCY, (String) ProductPlanSubscriptionRetentionBillInput.this.currency.value);
                }
            }
        };
    }

    public String newSubscriptionEndDate() {
        return this.newSubscriptionEndDate.value;
    }

    public String newSubscriptionStartDate() {
        return this.newSubscriptionStartDate.value;
    }

    public Integer numberOfUsers() {
        return this.numberOfUsers.value;
    }

    public String productPlanSubscriptionId() {
        return this.productPlanSubscriptionId;
    }

    public Integer totalFees() {
        return this.totalFees.value;
    }
}
