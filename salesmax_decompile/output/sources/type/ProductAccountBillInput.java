package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ProductAccountBillInput implements InputType {
    private final String accountId;
    private final Input<AdditionalProductUsageBillInput> additionalProductUsageBill;
    private final Input<String> currency;
    private final String productId;
    private final Input<List<ProductPlanSubscriptionExtensionBillInput>> productSubscriptionExtensionBillOptions;
    private final Input<List<ProductPlanSubscriptionRetentionBillInput>> productSubscriptionRetentionBills;
    private final Input<Integer> totalFees;

    public static final class Builder {
        private String accountId;
        private String productId;
        private Input<AdditionalProductUsageBillInput> additionalProductUsageBill = Input.absent();
        private Input<List<ProductPlanSubscriptionExtensionBillInput>> productSubscriptionExtensionBillOptions = Input.absent();
        private Input<List<ProductPlanSubscriptionRetentionBillInput>> productSubscriptionRetentionBills = Input.absent();
        private Input<Integer> totalFees = Input.absent();
        private Input<String> currency = Input.absent();

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public Builder additionalProductUsageBill(AdditionalProductUsageBillInput additionalProductUsageBillInput) {
            this.additionalProductUsageBill = Input.fromNullable(additionalProductUsageBillInput);
            return this;
        }

        public ProductAccountBillInput build() {
            Utils.checkNotNull(this.accountId, "accountId == null");
            Utils.checkNotNull(this.productId, "productId == null");
            return new ProductAccountBillInput(this.accountId, this.productId, this.additionalProductUsageBill, this.productSubscriptionExtensionBillOptions, this.productSubscriptionRetentionBills, this.totalFees, this.currency);
        }

        public Builder currency(String str) {
            this.currency = Input.fromNullable(str);
            return this;
        }

        public Builder productId(String str) {
            this.productId = str;
            return this;
        }

        public Builder productSubscriptionExtensionBillOptions(List<ProductPlanSubscriptionExtensionBillInput> list) {
            this.productSubscriptionExtensionBillOptions = Input.fromNullable(list);
            return this;
        }

        public Builder productSubscriptionRetentionBills(List<ProductPlanSubscriptionRetentionBillInput> list) {
            this.productSubscriptionRetentionBills = Input.fromNullable(list);
            return this;
        }

        public Builder totalFees(Integer num) {
            this.totalFees = Input.fromNullable(num);
            return this;
        }
    }

    public ProductAccountBillInput(String str, String str2, Input<AdditionalProductUsageBillInput> input, Input<List<ProductPlanSubscriptionExtensionBillInput>> input2, Input<List<ProductPlanSubscriptionRetentionBillInput>> input3, Input<Integer> input4, Input<String> input5) {
        this.accountId = str;
        this.productId = str2;
        this.additionalProductUsageBill = input;
        this.productSubscriptionExtensionBillOptions = input2;
        this.productSubscriptionRetentionBills = input3;
        this.totalFees = input4;
        this.currency = input5;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String accountId() {
        return this.accountId;
    }

    public AdditionalProductUsageBillInput additionalProductUsageBill() {
        return this.additionalProductUsageBill.value;
    }

    public String currency() {
        return this.currency.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ProductAccountBillInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString("accountId", ProductAccountBillInput.this.accountId);
                inputFieldWriter.writeString("productId", ProductAccountBillInput.this.productId);
                if (ProductAccountBillInput.this.additionalProductUsageBill.defined) {
                    inputFieldWriter.writeObject("additionalProductUsageBill", ProductAccountBillInput.this.additionalProductUsageBill.value != 0 ? ((AdditionalProductUsageBillInput) ProductAccountBillInput.this.additionalProductUsageBill.value).marshaller() : null);
                }
                if (ProductAccountBillInput.this.productSubscriptionExtensionBillOptions.defined) {
                    inputFieldWriter.writeList("productSubscriptionExtensionBillOptions", ProductAccountBillInput.this.productSubscriptionExtensionBillOptions.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ProductAccountBillInput.1.1
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ProductAccountBillInput.this.productSubscriptionExtensionBillOptions.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ProductPlanSubscriptionExtensionBillInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ProductAccountBillInput.this.productSubscriptionRetentionBills.defined) {
                    inputFieldWriter.writeList("productSubscriptionRetentionBills", ProductAccountBillInput.this.productSubscriptionRetentionBills.value != 0 ? new InputFieldWriter.ListWriter() { // from class: type.ProductAccountBillInput.1.2
                        @Override // com.apollographql.apollo.api.InputFieldWriter.ListWriter
                        public void write(InputFieldWriter.ListItemWriter listItemWriter) {
                            Iterator it = ((List) ProductAccountBillInput.this.productSubscriptionRetentionBills.value).iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ProductPlanSubscriptionRetentionBillInput) it.next()).marshaller());
                            }
                        }
                    } : null);
                }
                if (ProductAccountBillInput.this.totalFees.defined) {
                    inputFieldWriter.writeInt("totalFees", (Integer) ProductAccountBillInput.this.totalFees.value);
                }
                if (ProductAccountBillInput.this.currency.defined) {
                    inputFieldWriter.writeString(FirebaseAnalytics.Param.CURRENCY, (String) ProductAccountBillInput.this.currency.value);
                }
            }
        };
    }

    public String productId() {
        return this.productId;
    }

    public List<ProductPlanSubscriptionExtensionBillInput> productSubscriptionExtensionBillOptions() {
        return this.productSubscriptionExtensionBillOptions.value;
    }

    public List<ProductPlanSubscriptionRetentionBillInput> productSubscriptionRetentionBills() {
        return this.productSubscriptionRetentionBills.value;
    }

    public Integer totalFees() {
        return this.totalFees.value;
    }
}
