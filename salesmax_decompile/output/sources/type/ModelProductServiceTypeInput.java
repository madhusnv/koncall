package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ModelProductServiceTypeInput implements InputType {
    private final Input<ProductServiceType> eq;
    private final Input<ProductServiceType> ne;

    public static final class Builder {
        private Input<ProductServiceType> eq = Input.absent();
        private Input<ProductServiceType> ne = Input.absent();

        public ModelProductServiceTypeInput build() {
            return new ModelProductServiceTypeInput(this.eq, this.ne);
        }

        public Builder eq(ProductServiceType productServiceType) {
            this.eq = Input.fromNullable(productServiceType);
            return this;
        }

        public Builder ne(ProductServiceType productServiceType) {
            this.ne = Input.fromNullable(productServiceType);
            return this;
        }
    }

    public ModelProductServiceTypeInput(Input<ProductServiceType> input, Input<ProductServiceType> input2) {
        this.eq = input;
        this.ne = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ProductServiceType eq() {
        return this.eq.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelProductServiceTypeInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelProductServiceTypeInput.this.eq.defined) {
                    inputFieldWriter.writeString("eq", ModelProductServiceTypeInput.this.eq.value != 0 ? ((ProductServiceType) ModelProductServiceTypeInput.this.eq.value).name() : null);
                }
                if (ModelProductServiceTypeInput.this.ne.defined) {
                    inputFieldWriter.writeString("ne", ModelProductServiceTypeInput.this.ne.value != 0 ? ((ProductServiceType) ModelProductServiceTypeInput.this.ne.value).name() : null);
                }
            }
        };
    }

    public ProductServiceType ne() {
        return this.ne.value;
    }
}
