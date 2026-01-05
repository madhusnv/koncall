package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class CreateAccountSubscriptionBillCycleInput implements InputType {
    private final String accountId;
    private final String addedById;
    private final Input<String> createdAt;
    private final Input<String> id;
    private final String lastBillDate;
    private final String nextBillDate;
    private final Input<String> period;
    private final String productAccountId;
    private final Input<String> updatedAt;

    public static final class Builder {
        private String accountId;
        private String addedById;
        private String lastBillDate;
        private String nextBillDate;
        private String productAccountId;
        private Input<String> id = Input.absent();
        private Input<String> period = Input.absent();
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

        public CreateAccountSubscriptionBillCycleInput build() {
            Utils.checkNotNull(this.productAccountId, "productAccountId == null");
            Utils.checkNotNull(this.accountId, "accountId == null");
            Utils.checkNotNull(this.addedById, "addedById == null");
            Utils.checkNotNull(this.lastBillDate, "lastBillDate == null");
            Utils.checkNotNull(this.nextBillDate, "nextBillDate == null");
            return new CreateAccountSubscriptionBillCycleInput(this.id, this.productAccountId, this.accountId, this.addedById, this.period, this.lastBillDate, this.nextBillDate, this.createdAt, this.updatedAt);
        }

        public Builder createdAt(String str) {
            this.createdAt = Input.fromNullable(str);
            return this;
        }

        public Builder id(String str) {
            this.id = Input.fromNullable(str);
            return this;
        }

        public Builder lastBillDate(String str) {
            this.lastBillDate = str;
            return this;
        }

        public Builder nextBillDate(String str) {
            this.nextBillDate = str;
            return this;
        }

        public Builder period(String str) {
            this.period = Input.fromNullable(str);
            return this;
        }

        public Builder productAccountId(String str) {
            this.productAccountId = str;
            return this;
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }
    }

    public CreateAccountSubscriptionBillCycleInput(Input<String> input, String str, String str2, String str3, Input<String> input2, String str4, String str5, Input<String> input3, Input<String> input4) {
        this.id = input;
        this.productAccountId = str;
        this.accountId = str2;
        this.addedById = str3;
        this.period = input2;
        this.lastBillDate = str4;
        this.nextBillDate = str5;
        this.createdAt = input3;
        this.updatedAt = input4;
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

    public String createdAt() {
        return this.createdAt.value;
    }

    public String id() {
        return this.id.value;
    }

    public String lastBillDate() {
        return this.lastBillDate;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateAccountSubscriptionBillCycleInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (CreateAccountSubscriptionBillCycleInput.this.id.defined) {
                    inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, (String) CreateAccountSubscriptionBillCycleInput.this.id.value);
                }
                inputFieldWriter.writeString("productAccountId", CreateAccountSubscriptionBillCycleInput.this.productAccountId);
                inputFieldWriter.writeString("accountId", CreateAccountSubscriptionBillCycleInput.this.accountId);
                inputFieldWriter.writeString("addedById", CreateAccountSubscriptionBillCycleInput.this.addedById);
                if (CreateAccountSubscriptionBillCycleInput.this.period.defined) {
                    inputFieldWriter.writeString("period", (String) CreateAccountSubscriptionBillCycleInput.this.period.value);
                }
                inputFieldWriter.writeString("lastBillDate", CreateAccountSubscriptionBillCycleInput.this.lastBillDate);
                inputFieldWriter.writeString("nextBillDate", CreateAccountSubscriptionBillCycleInput.this.nextBillDate);
                if (CreateAccountSubscriptionBillCycleInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) CreateAccountSubscriptionBillCycleInput.this.createdAt.value);
                }
                if (CreateAccountSubscriptionBillCycleInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) CreateAccountSubscriptionBillCycleInput.this.updatedAt.value);
                }
            }
        };
    }

    public String nextBillDate() {
        return this.nextBillDate;
    }

    public String period() {
        return this.period.value;
    }

    public String productAccountId() {
        return this.productAccountId;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }
}
