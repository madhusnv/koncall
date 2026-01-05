package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;

/* loaded from: classes7.dex */
public final class ProductServiceUnitInput implements InputType {
    private final Input<Integer> negotiatedPricePerUnit;
    private final String productId;
    private final Input<Integer> units;

    public static final class Builder {
        private String productId;
        private Input<Integer> units = Input.absent();
        private Input<Integer> negotiatedPricePerUnit = Input.absent();

        public ProductServiceUnitInput build() {
            Utils.checkNotNull(this.productId, "productId == null");
            return new ProductServiceUnitInput(this.productId, this.units, this.negotiatedPricePerUnit);
        }

        public Builder negotiatedPricePerUnit(Integer num) {
            this.negotiatedPricePerUnit = Input.fromNullable(num);
            return this;
        }

        public Builder productId(String str) {
            this.productId = str;
            return this;
        }

        public Builder units(Integer num) {
            this.units = Input.fromNullable(num);
            return this;
        }
    }

    public ProductServiceUnitInput(String str, Input<Integer> input, Input<Integer> input2) {
        this.productId = str;
        this.units = input;
        this.negotiatedPricePerUnit = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ProductServiceUnitInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString("productId", ProductServiceUnitInput.this.productId);
                if (ProductServiceUnitInput.this.units.defined) {
                    inputFieldWriter.writeInt("units", (Integer) ProductServiceUnitInput.this.units.value);
                }
                if (ProductServiceUnitInput.this.negotiatedPricePerUnit.defined) {
                    inputFieldWriter.writeInt("negotiatedPricePerUnit", (Integer) ProductServiceUnitInput.this.negotiatedPricePerUnit.value);
                }
            }
        };
    }

    public Integer negotiatedPricePerUnit() {
        return this.negotiatedPricePerUnit.value;
    }

    public String productId() {
        return this.productId;
    }

    public Integer units() {
        return this.units.value;
    }
}
