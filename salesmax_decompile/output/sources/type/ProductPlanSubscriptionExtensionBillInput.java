package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes7.dex */
public final class ProductPlanSubscriptionExtensionBillInput implements InputType {
    private final Input<String> currency;
    private final Input<Integer> fee;
    private final Input<Integer> newNumberOfUsers;
    private final Input<String> numUsersIncrementOnDayCurve;
    private final Input<Integer> oldNumberOfUsers;
    private final Input<Integer> proRataCharges;
    private final Input<Integer> proRataNumDays;
    private final String productPlanSubscriptionId;
    private final Input<Integer> totalFees;

    public static final class Builder {
        private String productPlanSubscriptionId;
        private Input<Integer> oldNumberOfUsers = Input.absent();
        private Input<Integer> newNumberOfUsers = Input.absent();
        private Input<String> numUsersIncrementOnDayCurve = Input.absent();
        private Input<Integer> fee = Input.absent();
        private Input<Integer> proRataNumDays = Input.absent();
        private Input<Integer> proRataCharges = Input.absent();
        private Input<Integer> totalFees = Input.absent();
        private Input<String> currency = Input.absent();

        public ProductPlanSubscriptionExtensionBillInput build() {
            Utils.checkNotNull(this.productPlanSubscriptionId, "productPlanSubscriptionId == null");
            return new ProductPlanSubscriptionExtensionBillInput(this.productPlanSubscriptionId, this.oldNumberOfUsers, this.newNumberOfUsers, this.numUsersIncrementOnDayCurve, this.fee, this.proRataNumDays, this.proRataCharges, this.totalFees, this.currency);
        }

        public Builder currency(String str) {
            this.currency = Input.fromNullable(str);
            return this;
        }

        public Builder fee(Integer num) {
            this.fee = Input.fromNullable(num);
            return this;
        }

        public Builder newNumberOfUsers(Integer num) {
            this.newNumberOfUsers = Input.fromNullable(num);
            return this;
        }

        public Builder numUsersIncrementOnDayCurve(String str) {
            this.numUsersIncrementOnDayCurve = Input.fromNullable(str);
            return this;
        }

        public Builder oldNumberOfUsers(Integer num) {
            this.oldNumberOfUsers = Input.fromNullable(num);
            return this;
        }

        public Builder proRataCharges(Integer num) {
            this.proRataCharges = Input.fromNullable(num);
            return this;
        }

        public Builder proRataNumDays(Integer num) {
            this.proRataNumDays = Input.fromNullable(num);
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

    public ProductPlanSubscriptionExtensionBillInput(String str, Input<Integer> input, Input<Integer> input2, Input<String> input3, Input<Integer> input4, Input<Integer> input5, Input<Integer> input6, Input<Integer> input7, Input<String> input8) {
        this.productPlanSubscriptionId = str;
        this.oldNumberOfUsers = input;
        this.newNumberOfUsers = input2;
        this.numUsersIncrementOnDayCurve = input3;
        this.fee = input4;
        this.proRataNumDays = input5;
        this.proRataCharges = input6;
        this.totalFees = input7;
        this.currency = input8;
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
        return new InputFieldMarshaller() { // from class: type.ProductPlanSubscriptionExtensionBillInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString("productPlanSubscriptionId", ProductPlanSubscriptionExtensionBillInput.this.productPlanSubscriptionId);
                if (ProductPlanSubscriptionExtensionBillInput.this.oldNumberOfUsers.defined) {
                    inputFieldWriter.writeInt("oldNumberOfUsers", (Integer) ProductPlanSubscriptionExtensionBillInput.this.oldNumberOfUsers.value);
                }
                if (ProductPlanSubscriptionExtensionBillInput.this.newNumberOfUsers.defined) {
                    inputFieldWriter.writeInt("newNumberOfUsers", (Integer) ProductPlanSubscriptionExtensionBillInput.this.newNumberOfUsers.value);
                }
                if (ProductPlanSubscriptionExtensionBillInput.this.numUsersIncrementOnDayCurve.defined) {
                    inputFieldWriter.writeString("numUsersIncrementOnDayCurve", (String) ProductPlanSubscriptionExtensionBillInput.this.numUsersIncrementOnDayCurve.value);
                }
                if (ProductPlanSubscriptionExtensionBillInput.this.fee.defined) {
                    inputFieldWriter.writeInt("fee", (Integer) ProductPlanSubscriptionExtensionBillInput.this.fee.value);
                }
                if (ProductPlanSubscriptionExtensionBillInput.this.proRataNumDays.defined) {
                    inputFieldWriter.writeInt("proRataNumDays", (Integer) ProductPlanSubscriptionExtensionBillInput.this.proRataNumDays.value);
                }
                if (ProductPlanSubscriptionExtensionBillInput.this.proRataCharges.defined) {
                    inputFieldWriter.writeInt("proRataCharges", (Integer) ProductPlanSubscriptionExtensionBillInput.this.proRataCharges.value);
                }
                if (ProductPlanSubscriptionExtensionBillInput.this.totalFees.defined) {
                    inputFieldWriter.writeInt("totalFees", (Integer) ProductPlanSubscriptionExtensionBillInput.this.totalFees.value);
                }
                if (ProductPlanSubscriptionExtensionBillInput.this.currency.defined) {
                    inputFieldWriter.writeString(FirebaseAnalytics.Param.CURRENCY, (String) ProductPlanSubscriptionExtensionBillInput.this.currency.value);
                }
            }
        };
    }

    public Integer newNumberOfUsers() {
        return this.newNumberOfUsers.value;
    }

    public String numUsersIncrementOnDayCurve() {
        return this.numUsersIncrementOnDayCurve.value;
    }

    public Integer oldNumberOfUsers() {
        return this.oldNumberOfUsers.value;
    }

    public Integer proRataCharges() {
        return this.proRataCharges.value;
    }

    public Integer proRataNumDays() {
        return this.proRataNumDays.value;
    }

    public String productPlanSubscriptionId() {
        return this.productPlanSubscriptionId;
    }

    public Integer totalFees() {
        return this.totalFees.value;
    }
}
