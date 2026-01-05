package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes7.dex */
public final class AdditionalProductUsageBillInput implements InputType {
    private final Input<String> currency;
    private final Input<Integer> fee;
    private final Input<String> numUsersRemovedOnDayCurve;
    private final Input<Integer> numberOfUnits;
    private final Input<String> productPlanId;
    private final Input<Integer> totalFees;

    public static final class Builder {
        private Input<String> productPlanId = Input.absent();
        private Input<String> numUsersRemovedOnDayCurve = Input.absent();
        private Input<Integer> fee = Input.absent();
        private Input<Integer> numberOfUnits = Input.absent();
        private Input<Integer> totalFees = Input.absent();
        private Input<String> currency = Input.absent();

        public AdditionalProductUsageBillInput build() {
            return new AdditionalProductUsageBillInput(this.productPlanId, this.numUsersRemovedOnDayCurve, this.fee, this.numberOfUnits, this.totalFees, this.currency);
        }

        public Builder currency(String str) {
            this.currency = Input.fromNullable(str);
            return this;
        }

        public Builder fee(Integer num) {
            this.fee = Input.fromNullable(num);
            return this;
        }

        public Builder numUsersRemovedOnDayCurve(String str) {
            this.numUsersRemovedOnDayCurve = Input.fromNullable(str);
            return this;
        }

        public Builder numberOfUnits(Integer num) {
            this.numberOfUnits = Input.fromNullable(num);
            return this;
        }

        public Builder productPlanId(String str) {
            this.productPlanId = Input.fromNullable(str);
            return this;
        }

        public Builder totalFees(Integer num) {
            this.totalFees = Input.fromNullable(num);
            return this;
        }
    }

    public AdditionalProductUsageBillInput(Input<String> input, Input<String> input2, Input<Integer> input3, Input<Integer> input4, Input<Integer> input5, Input<String> input6) {
        this.productPlanId = input;
        this.numUsersRemovedOnDayCurve = input2;
        this.fee = input3;
        this.numberOfUnits = input4;
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
        return new InputFieldMarshaller() { // from class: type.AdditionalProductUsageBillInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (AdditionalProductUsageBillInput.this.productPlanId.defined) {
                    inputFieldWriter.writeString("productPlanId", (String) AdditionalProductUsageBillInput.this.productPlanId.value);
                }
                if (AdditionalProductUsageBillInput.this.numUsersRemovedOnDayCurve.defined) {
                    inputFieldWriter.writeString("numUsersRemovedOnDayCurve", (String) AdditionalProductUsageBillInput.this.numUsersRemovedOnDayCurve.value);
                }
                if (AdditionalProductUsageBillInput.this.fee.defined) {
                    inputFieldWriter.writeInt("fee", (Integer) AdditionalProductUsageBillInput.this.fee.value);
                }
                if (AdditionalProductUsageBillInput.this.numberOfUnits.defined) {
                    inputFieldWriter.writeInt("numberOfUnits", (Integer) AdditionalProductUsageBillInput.this.numberOfUnits.value);
                }
                if (AdditionalProductUsageBillInput.this.totalFees.defined) {
                    inputFieldWriter.writeInt("totalFees", (Integer) AdditionalProductUsageBillInput.this.totalFees.value);
                }
                if (AdditionalProductUsageBillInput.this.currency.defined) {
                    inputFieldWriter.writeString(FirebaseAnalytics.Param.CURRENCY, (String) AdditionalProductUsageBillInput.this.currency.value);
                }
            }
        };
    }

    public String numUsersRemovedOnDayCurve() {
        return this.numUsersRemovedOnDayCurve.value;
    }

    public Integer numberOfUnits() {
        return this.numberOfUnits.value;
    }

    public String productPlanId() {
        return this.productPlanId.value;
    }

    public Integer totalFees() {
        return this.totalFees.value;
    }
}
