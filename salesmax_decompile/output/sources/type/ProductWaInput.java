package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ProductWaInput implements InputType {
    private final Input<String> product_retailer_id;

    public static final class Builder {
        private Input<String> product_retailer_id = Input.absent();

        public ProductWaInput build() {
            return new ProductWaInput(this.product_retailer_id);
        }

        public Builder product_retailer_id(String str) {
            this.product_retailer_id = Input.fromNullable(str);
            return this;
        }
    }

    public ProductWaInput(Input<String> input) {
        this.product_retailer_id = input;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ProductWaInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ProductWaInput.this.product_retailer_id.defined) {
                    inputFieldWriter.writeString("product_retailer_id", (String) ProductWaInput.this.product_retailer_id.value);
                }
            }
        };
    }

    public String product_retailer_id() {
        return this.product_retailer_id.value;
    }
}
