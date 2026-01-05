package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes7.dex */
public final class WaProductItemInput implements InputType {
    private final Input<String> currency;
    private final Input<Integer> item_price;
    private final Input<String> product_retailer_id;
    private final Input<Integer> quantity;

    public static final class Builder {
        private Input<String> product_retailer_id = Input.absent();
        private Input<Integer> quantity = Input.absent();
        private Input<Integer> item_price = Input.absent();
        private Input<String> currency = Input.absent();

        public WaProductItemInput build() {
            return new WaProductItemInput(this.product_retailer_id, this.quantity, this.item_price, this.currency);
        }

        public Builder currency(String str) {
            this.currency = Input.fromNullable(str);
            return this;
        }

        public Builder item_price(Integer num) {
            this.item_price = Input.fromNullable(num);
            return this;
        }

        public Builder product_retailer_id(String str) {
            this.product_retailer_id = Input.fromNullable(str);
            return this;
        }

        public Builder quantity(Integer num) {
            this.quantity = Input.fromNullable(num);
            return this;
        }
    }

    public WaProductItemInput(Input<String> input, Input<Integer> input2, Input<Integer> input3, Input<String> input4) {
        this.product_retailer_id = input;
        this.quantity = input2;
        this.item_price = input3;
        this.currency = input4;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String currency() {
        return this.currency.value;
    }

    public Integer item_price() {
        return this.item_price.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.WaProductItemInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (WaProductItemInput.this.product_retailer_id.defined) {
                    inputFieldWriter.writeString("product_retailer_id", (String) WaProductItemInput.this.product_retailer_id.value);
                }
                if (WaProductItemInput.this.quantity.defined) {
                    inputFieldWriter.writeInt(FirebaseAnalytics.Param.QUANTITY, (Integer) WaProductItemInput.this.quantity.value);
                }
                if (WaProductItemInput.this.item_price.defined) {
                    inputFieldWriter.writeInt("item_price", (Integer) WaProductItemInput.this.item_price.value);
                }
                if (WaProductItemInput.this.currency.defined) {
                    inputFieldWriter.writeString(FirebaseAnalytics.Param.CURRENCY, (String) WaProductItemInput.this.currency.value);
                }
            }
        };
    }

    public String product_retailer_id() {
        return this.product_retailer_id.value;
    }

    public Integer quantity() {
        return this.quantity.value;
    }
}
