package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class UpdateProductAccountBillsInput implements InputType {
    private final Input<String> accountId;
    private final Input<String> billGeneratedFrom;
    private final Input<String> billGeneratedTo;
    private final Input<String> billStatus;
    private final Input<String> createdAt;
    private final Input<String> currency;
    private final String id;
    private final Input<List<ProductAccountBillInput>> productAccountBills;
    private final Input<String> productAccountId;
    private final Input<String> productPlanId;
    private final Input<Integer> totalFees;
    private final Input<String> updatedAt;

    public static final class Builder {
        private String id;
        private Input<String> accountId = Input.absent();
        private Input<String> productAccountId = Input.absent();
        private Input<String> productPlanId = Input.absent();
        private Input<List<ProductAccountBillInput>> productAccountBills = Input.absent();
        private Input<Integer> totalFees = Input.absent();
        private Input<String> currency = Input.absent();
        private Input<String> billStatus = Input.absent();
        private Input<String> billGeneratedFrom = Input.absent();
        private Input<String> billGeneratedTo = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = Input.fromNullable(str);
            return this;
        }

        public Builder billGeneratedFrom(String str) {
            this.billGeneratedFrom = Input.fromNullable(str);
            return this;
        }

        public Builder billGeneratedTo(String str) {
            this.billGeneratedTo = Input.fromNullable(str);
            return this;
        }

        public Builder billStatus(String str) {
            this.billStatus = Input.fromNullable(str);
            return this;
        }

        public UpdateProductAccountBillsInput build() {
            Utils.checkNotNull(this.id, "id == null");
            return new UpdateProductAccountBillsInput(this.id, this.accountId, this.productAccountId, this.productPlanId, this.productAccountBills, this.totalFees, this.currency, this.billStatus, this.billGeneratedFrom, this.billGeneratedTo, this.createdAt, this.updatedAt);
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

        public Builder productAccountBills(List<ProductAccountBillInput> list) {
            this.productAccountBills = Input.fromNullable(list);
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

        public Builder totalFees(Integer num) {
            this.totalFees = Input.fromNullable(num);
            return this;
        }

        public Builder updatedAt(String str) {
            this.updatedAt = Input.fromNullable(str);
            return this;
        }
    }

    public UpdateProductAccountBillsInput(String str, Input<String> input, Input<String> input2, Input<String> input3, Input<List<ProductAccountBillInput>> input4, Input<Integer> input5, Input<String> input6, Input<String> input7, Input<String> input8, Input<String> input9, Input<String> input10, Input<String> input11) {
        this.id = str;
        this.accountId = input;
        this.productAccountId = input2;
        this.productPlanId = input3;
        this.productAccountBills = input4;
        this.totalFees = input5;
        this.currency = input6;
        this.billStatus = input7;
        this.billGeneratedFrom = input8;
        this.billGeneratedTo = input9;
        this.createdAt = input10;
        this.updatedAt = input11;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId.value;
    }

    public String billGeneratedFrom() {
        return this.billGeneratedFrom.value;
    }

    public String billGeneratedTo() {
        return this.billGeneratedTo.value;
    }

    public String billStatus() {
        return this.billStatus.value;
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
        return new InputFieldMarshaller() { // from class: type.UpdateProductAccountBillsInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, UpdateProductAccountBillsInput.this.id);
                if (UpdateProductAccountBillsInput.this.accountId.defined) {
                    inputFieldWriter.writeString("accountId", (String) UpdateProductAccountBillsInput.this.accountId.value);
                }
                if (UpdateProductAccountBillsInput.this.productAccountId.defined) {
                    inputFieldWriter.writeString("productAccountId", (String) UpdateProductAccountBillsInput.this.productAccountId.value);
                }
                if (UpdateProductAccountBillsInput.this.productPlanId.defined) {
                    inputFieldWriter.writeString("productPlanId", (String) UpdateProductAccountBillsInput.this.productPlanId.value);
                }
                if (UpdateProductAccountBillsInput.this.productAccountBills.defined) {
                    inputFieldWriter.writeList("productAccountBills", UpdateProductAccountBillsInput.this.productAccountBills.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.UpdateProductAccountBillsInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) UpdateProductAccountBillsInput.this.productAccountBills.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ProductAccountBillInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (UpdateProductAccountBillsInput.this.totalFees.defined) {
                    inputFieldWriter.writeInt("totalFees", (Integer) UpdateProductAccountBillsInput.this.totalFees.value);
                }
                if (UpdateProductAccountBillsInput.this.currency.defined) {
                    inputFieldWriter.writeString(FirebaseAnalytics.Param.CURRENCY, (String) UpdateProductAccountBillsInput.this.currency.value);
                }
                if (UpdateProductAccountBillsInput.this.billStatus.defined) {
                    inputFieldWriter.writeString("billStatus", (String) UpdateProductAccountBillsInput.this.billStatus.value);
                }
                if (UpdateProductAccountBillsInput.this.billGeneratedFrom.defined) {
                    inputFieldWriter.writeString("billGeneratedFrom", (String) UpdateProductAccountBillsInput.this.billGeneratedFrom.value);
                }
                if (UpdateProductAccountBillsInput.this.billGeneratedTo.defined) {
                    inputFieldWriter.writeString("billGeneratedTo", (String) UpdateProductAccountBillsInput.this.billGeneratedTo.value);
                }
                if (UpdateProductAccountBillsInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) UpdateProductAccountBillsInput.this.createdAt.value);
                }
                if (UpdateProductAccountBillsInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) UpdateProductAccountBillsInput.this.updatedAt.value);
                }
            }
        };
    }

    public List<ProductAccountBillInput> productAccountBills() {
        return this.productAccountBills.value;
    }

    public String productAccountId() {
        return this.productAccountId.value;
    }

    public String productPlanId() {
        return this.productPlanId.value;
    }

    public Integer totalFees() {
        return this.totalFees.value;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }
}
