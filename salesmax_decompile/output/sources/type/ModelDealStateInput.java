package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ModelDealStateInput implements InputType {
    private final Input<DealState> eq;
    private final Input<DealState> ne;

    public static final class Builder {
        private Input<DealState> eq = Input.absent();
        private Input<DealState> ne = Input.absent();

        public ModelDealStateInput build() {
            return new ModelDealStateInput(this.eq, this.ne);
        }

        public Builder eq(DealState dealState) {
            this.eq = Input.fromNullable(dealState);
            return this;
        }

        public Builder ne(DealState dealState) {
            this.ne = Input.fromNullable(dealState);
            return this;
        }
    }

    public ModelDealStateInput(Input<DealState> input, Input<DealState> input2) {
        this.eq = input;
        this.ne = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public DealState eq() {
        return this.eq.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelDealStateInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelDealStateInput.this.eq.defined) {
                    inputFieldWriter.writeString("eq", ModelDealStateInput.this.eq.value != 0 ? ((DealState) ModelDealStateInput.this.eq.value).name() : null);
                }
                if (ModelDealStateInput.this.ne.defined) {
                    inputFieldWriter.writeString("ne", ModelDealStateInput.this.ne.value != 0 ? ((DealState) ModelDealStateInput.this.ne.value).name() : null);
                }
            }
        };
    }

    public DealState ne() {
        return this.ne.value;
    }
}
