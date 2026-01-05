package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class CreateProductPlanInput implements InputType {
    private final String accountId;
    private final Input<String> createdAt;
    private final String currency;
    private final int fee;
    private final Input<String> id;
    private final String period;
    private final Input<String> planDescription;
    private final String planStatus;
    private final Input<Integer> proRataFee;
    private final String productId;
    private final Input<String> updatedAt;

    public static final class Builder {
        private String accountId;
        private String currency;
        private int fee;
        private String period;
        private String planStatus;
        private String productId;
        private Input<String> id = Input.absent();
        private Input<String> planDescription = Input.absent();
        private Input<Integer> proRataFee = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public CreateProductPlanInput build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            Utils.checkNotNull(this.productId, "productId == null");
            Utils.checkNotNull(this.planStatus, "planStatus == null");
            Utils.checkNotNull(this.period, "period == null");
            Utils.checkNotNull(this.currency, "currency == null");
            return new CreateProductPlanInput(this.id, this.accountId, this.productId, this.planDescription, this.planStatus, this.period, this.fee, this.proRataFee, this.currency, this.createdAt, this.updatedAt);
        }

        public Builder createdAt(String str) {
            this.createdAt = Input.fromNullable(str);
            return this;
        }

        public Builder currency(String str) {
            this.currency = str;
            return this;
        }

        public Builder fee(int i) {
            this.fee = i;
            return this;
        }

        public Builder id(String str) {
            this.id = Input.fromNullable(str);
            return this;
        }

        public Builder period(String str) {
            this.period = str;
            return this;
        }

        public Builder planDescription(String str) {
            this.planDescription = Input.fromNullable(str);
            return this;
        }

        public Builder planStatus(String str) {
            this.planStatus = str;
            return this;
        }

        public Builder proRataFee(Integer num) {
            this.proRataFee = Input.fromNullable(num);
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
    }

    public CreateProductPlanInput(Input<String> input, String str, String str2, Input<String> input2, String str3, String str4, int i, Input<Integer> input3, String str5, Input<String> input4, Input<String> input5) {
        this.id = input;
        this.accountId = str;
        this.productId = str2;
        this.planDescription = input2;
        this.planStatus = str3;
        this.period = str4;
        this.fee = i;
        this.proRataFee = input3;
        this.currency = str5;
        this.createdAt = input4;
        this.updatedAt = input5;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId;
    }

    public String createdAt() {
        return this.createdAt.value;
    }

    public String currency() {
        return this.currency;
    }

    public int fee() {
        return this.fee;
    }

    public String id() {
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateProductPlanInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (CreateProductPlanInput.this.id.defined) {
                    inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, (String) CreateProductPlanInput.this.id.value);
                }
                inputFieldWriter.writeString("accountId", CreateProductPlanInput.this.accountId);
                inputFieldWriter.writeString("productId", CreateProductPlanInput.this.productId);
                if (CreateProductPlanInput.this.planDescription.defined) {
                    inputFieldWriter.writeString("planDescription", (String) CreateProductPlanInput.this.planDescription.value);
                }
                inputFieldWriter.writeString("planStatus", CreateProductPlanInput.this.planStatus);
                inputFieldWriter.writeString("period", CreateProductPlanInput.this.period);
                inputFieldWriter.writeInt("fee", Integer.valueOf(CreateProductPlanInput.this.fee));
                if (CreateProductPlanInput.this.proRataFee.defined) {
                    inputFieldWriter.writeInt("proRataFee", (Integer) CreateProductPlanInput.this.proRataFee.value);
                }
                inputFieldWriter.writeString(FirebaseAnalytics.Param.CURRENCY, CreateProductPlanInput.this.currency);
                if (CreateProductPlanInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) CreateProductPlanInput.this.createdAt.value);
                }
                if (CreateProductPlanInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) CreateProductPlanInput.this.updatedAt.value);
                }
            }
        };
    }

    public String period() {
        return this.period;
    }

    public String planDescription() {
        return this.planDescription.value;
    }

    public String planStatus() {
        return this.planStatus;
    }

    public Integer proRataFee() {
        return this.proRataFee.value;
    }

    public String productId() {
        return this.productId;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }
}
