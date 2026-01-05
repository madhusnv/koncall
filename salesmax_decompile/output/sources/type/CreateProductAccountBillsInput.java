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
public final class CreateProductAccountBillsInput implements InputType {
    private final String accountId;
    private final Input<String> billGeneratedFrom;
    private final Input<String> billGeneratedTo;
    private final Input<String> billStatus;
    private final Input<String> createdAt;
    private final Input<String> currency;
    private final Input<String> id;
    private final Input<List<ProductAccountBillInput>> productAccountBills;
    private final String productAccountId;
    private final String productPlanId;
    private final Input<Integer> totalFees;
    private final Input<String> updatedAt;

    public static final class Builder {
        private String accountId;
        private String productAccountId;
        private String productPlanId;
        private Input<String> id = Input.absent();
        private Input<List<ProductAccountBillInput>> productAccountBills = Input.absent();
        private Input<Integer> totalFees = Input.absent();
        private Input<String> currency = Input.absent();
        private Input<String> billStatus = Input.absent();
        private Input<String> billGeneratedFrom = Input.absent();
        private Input<String> billGeneratedTo = Input.absent();
        private Input<String> createdAt = Input.absent();
        private Input<String> updatedAt = Input.absent();

        public Builder accountId(String str) {
            this.accountId = str;
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

        public CreateProductAccountBillsInput build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            Utils.checkNotNull(this.productAccountId, "productAccountId == null");
            Utils.checkNotNull(this.productPlanId, "productPlanId == null");
            return new CreateProductAccountBillsInput(this.id, this.accountId, this.productAccountId, this.productPlanId, this.productAccountBills, this.totalFees, this.currency, this.billStatus, this.billGeneratedFrom, this.billGeneratedTo, this.createdAt, this.updatedAt);
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

        public Builder productAccountBills(List<ProductAccountBillInput> list) {
            this.productAccountBills = Input.fromNullable(list);
            return this;
        }

        public Builder productAccountId(String str) {
            this.productAccountId = str;
            return this;
        }

        public Builder productPlanId(String str) {
            this.productPlanId = str;
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

    public CreateProductAccountBillsInput(Input<String> input, String str, String str2, String str3, Input<List<ProductAccountBillInput>> input2, Input<Integer> input3, Input<String> input4, Input<String> input5, Input<String> input6, Input<String> input7, Input<String> input8, Input<String> input9) {
        this.id = input;
        this.accountId = str;
        this.productAccountId = str2;
        this.productPlanId = str3;
        this.productAccountBills = input2;
        this.totalFees = input3;
        this.currency = input4;
        this.billStatus = input5;
        this.billGeneratedFrom = input6;
        this.billGeneratedTo = input7;
        this.createdAt = input8;
        this.updatedAt = input9;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId;
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
        return this.id.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CreateProductAccountBillsInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (CreateProductAccountBillsInput.this.id.defined) {
                    inputFieldWriter.writeString(OutcomeConstants.OUTCOME_ID, (String) CreateProductAccountBillsInput.this.id.value);
                }
                inputFieldWriter.writeString("accountId", CreateProductAccountBillsInput.this.accountId);
                inputFieldWriter.writeString("productAccountId", CreateProductAccountBillsInput.this.productAccountId);
                inputFieldWriter.writeString("productPlanId", CreateProductAccountBillsInput.this.productPlanId);
                if (CreateProductAccountBillsInput.this.productAccountBills.defined) {
                    inputFieldWriter.writeList("productAccountBills", CreateProductAccountBillsInput.this.productAccountBills.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.CreateProductAccountBillsInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) CreateProductAccountBillsInput.this.productAccountBills.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ProductAccountBillInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (CreateProductAccountBillsInput.this.totalFees.defined) {
                    inputFieldWriter.writeInt("totalFees", (Integer) CreateProductAccountBillsInput.this.totalFees.value);
                }
                if (CreateProductAccountBillsInput.this.currency.defined) {
                    inputFieldWriter.writeString(FirebaseAnalytics.Param.CURRENCY, (String) CreateProductAccountBillsInput.this.currency.value);
                }
                if (CreateProductAccountBillsInput.this.billStatus.defined) {
                    inputFieldWriter.writeString("billStatus", (String) CreateProductAccountBillsInput.this.billStatus.value);
                }
                if (CreateProductAccountBillsInput.this.billGeneratedFrom.defined) {
                    inputFieldWriter.writeString("billGeneratedFrom", (String) CreateProductAccountBillsInput.this.billGeneratedFrom.value);
                }
                if (CreateProductAccountBillsInput.this.billGeneratedTo.defined) {
                    inputFieldWriter.writeString("billGeneratedTo", (String) CreateProductAccountBillsInput.this.billGeneratedTo.value);
                }
                if (CreateProductAccountBillsInput.this.createdAt.defined) {
                    inputFieldWriter.writeString("createdAt", (String) CreateProductAccountBillsInput.this.createdAt.value);
                }
                if (CreateProductAccountBillsInput.this.updatedAt.defined) {
                    inputFieldWriter.writeString("updatedAt", (String) CreateProductAccountBillsInput.this.updatedAt.value);
                }
            }
        };
    }

    public List<ProductAccountBillInput> productAccountBills() {
        return this.productAccountBills.value;
    }

    public String productAccountId() {
        return this.productAccountId;
    }

    public String productPlanId() {
        return this.productPlanId;
    }

    public Integer totalFees() {
        return this.totalFees.value;
    }

    public String updatedAt() {
        return this.updatedAt.value;
    }
}
