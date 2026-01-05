package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;

/* loaded from: classes7.dex */
public final class UpdateAccountSubscriptionBillCycleInput implements InputType {
    private final Input<String> accountId;
    private final Input<String> addedById;
    private final Input<String> createdAt;
    private final String id;
    private final Input<String> lastBillDate;
    private final Input<String> nextBillDate;
    private final Input<String> period;
    private final Input<String> productAccountId;
    private final Input<String> updatedAt;

    public static final class Builder {
        private String id;
        private Input<String> productAccountId = Input.absent();
        private Input<String> accountId = Input.absent();
        private Input<String> addedById = Input.absent();
        private Input<String> period = Input.absent();
        private Input<String> lastBillDate = Input.absent();
        private Input<String> nextBillDate = Input.absent();
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

        public UpdateAccountSubscriptionBillCycleInput build() {
            Utils.checkNotNull(this.id, "id == null");
            return new UpdateAccountSubscriptionBillCycleInput(this.id, this.productAccountId, this.accountId, this.addedById, this.period, this.lastBillDate, this.nextBillDate, this.createdAt, this.updatedAt);
        }

        public Builder createdAt(String str) {
            this.createdAt = Input.fromNullable(str);
            return this;
        }

        public Builder id(String str) {
            this.id = str;
            return this;
        }

        public Builder lastBillDate(String str) {
            this.lastBillDate = Input.fromNullable(str);
            return this;
        }

        public Builder nextBillDate(String str) {
            this.nextBillDate = Input.fromNullable(str);
            return this;
        }

        public Builder period(String str) {
            this.period = Input.fromNullable(str);
            return this;
        }

        public Builder productAccountId(String str) {
            this.productAccountId = Input.fromNullable(str);
            return this;
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }
    }

    public UpdateAccountSubscriptionBillCycleInput(String str, Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<String> input6, Input<String> input7, Input<String> input8) {
        this.id = str;
        this.productAccountId = input;
        this.accountId = input2;
        this.addedById = input3;
        this.period = input4;
        this.lastBillDate = input5;
        this.nextBillDate = input6;
        this.createdAt = input7;
        this.updatedAt = input8;
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

    public String createdAt() {
        return this.createdAt.value;
    }

    public String id() {
        return this.id;
    }

    public String lastBillDate() {
        return this.lastBillDate.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.UpdateAccountSubscriptionBillCycleInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, UpdateAccountSubscriptionBillCycleInput.this.id);
                if (UpdateAccountSubscriptionBillCycleInput.this.productAccountId.defined) {
                    inputFieldWriter.writeString("productAccountId", (String) UpdateAccountSubscriptionBillCycleInput.this.productAccountId.value);
                }
                if (UpdateAccountSubscriptionBillCycleInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) UpdateAccountSubscriptionBillCycleInput.this.accountId.value);
                }
                if (UpdateAccountSubscriptionBillCycleInput.this.addedById.defined) {
                    inputFieldWriter.writeString("addedById", (String) UpdateAccountSubscriptionBillCycleInput.this.addedById.value);
                }
                if (UpdateAccountSubscriptionBillCycleInput.this.period.defined) {
                    inputFieldWriter.writeString("period", (String) UpdateAccountSubscriptionBillCycleInput.this.period.value);
                }
                if (UpdateAccountSubscriptionBillCycleInput.this.lastBillDate.defined) {
                    inputFieldWriter.writeString("lastBillDate", (String) UpdateAccountSubscriptionBillCycleInput.this.lastBillDate.value);
                }
                if (UpdateAccountSubscriptionBillCycleInput.this.nextBillDate.defined) {
                    inputFieldWriter.writeString("nextBillDate", (String) UpdateAccountSubscriptionBillCycleInput.this.nextBillDate.value);
                }
                if (UpdateAccountSubscriptionBillCycleInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) UpdateAccountSubscriptionBillCycleInput.this.createdAt.value);
                }
                if (UpdateAccountSubscriptionBillCycleInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) UpdateAccountSubscriptionBillCycleInput.this.updatedAt.value);
                }
            }
        };
    }

    public String nextBillDate() {
        return this.nextBillDate.value;
    }

    public String period() {
        return this.period.value;
    }

    public String productAccountId() {
        return this.productAccountId.value;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }
}
