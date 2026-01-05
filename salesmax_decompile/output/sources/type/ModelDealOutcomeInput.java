package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ModelDealOutcomeInput implements InputType {
    private final Input<DealOutcome> eq;
    private final Input<DealOutcome> ne;

    public static final class Builder {
        private Input<DealOutcome> eq = Input.absent();
        private Input<DealOutcome> ne = Input.absent();

        public ModelDealOutcomeInput build() {
            return new ModelDealOutcomeInput(this.eq, this.ne);
        }

        public Builder eq(DealOutcome dealOutcome) {
            this.eq = Input.fromNullable(dealOutcome);
            return this;
        }

        public Builder ne(DealOutcome dealOutcome) {
            this.ne = Input.fromNullable(dealOutcome);
            return this;
        }
    }

    public ModelDealOutcomeInput(Input<DealOutcome> input, Input<DealOutcome> input2) {
        this.eq = input;
        this.ne = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public DealOutcome eq() {
        return this.eq.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelDealOutcomeInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelDealOutcomeInput.this.eq.defined) {
                    inputFieldWriter.writeString("eq", ModelDealOutcomeInput.this.eq.value != 0 ? ((DealOutcome) ModelDealOutcomeInput.this.eq.value).name() : null);
                }
                if (ModelDealOutcomeInput.this.ne.defined) {
                    inputFieldWriter.writeString("ne", ModelDealOutcomeInput.this.ne.value != 0 ? ((DealOutcome) ModelDealOutcomeInput.this.ne.value).name() : null);
                }
            }
        };
    }

    public DealOutcome ne() {
        return this.ne.value;
    }
}
