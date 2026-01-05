package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ModelMissedOpportunityTypeInput implements InputType {
    private final Input<MissedOpportunityType> eq;
    private final Input<MissedOpportunityType> ne;

    public static final class Builder {
        private Input<MissedOpportunityType> eq = Input.absent();
        private Input<MissedOpportunityType> ne = Input.absent();

        public ModelMissedOpportunityTypeInput build() {
            return new ModelMissedOpportunityTypeInput(this.eq, this.ne);
        }

        public Builder eq(MissedOpportunityType missedOpportunityType) {
            this.eq = Input.fromNullable(missedOpportunityType);
            return this;
        }

        public Builder ne(MissedOpportunityType missedOpportunityType) {
            this.ne = Input.fromNullable(missedOpportunityType);
            return this;
        }
    }

    public ModelMissedOpportunityTypeInput(Input<MissedOpportunityType> input, Input<MissedOpportunityType> input2) {
        this.eq = input;
        this.ne = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public MissedOpportunityType eq() {
        return this.eq.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelMissedOpportunityTypeInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelMissedOpportunityTypeInput.this.eq.defined) {
                    inputFieldWriter.writeString("eq", ModelMissedOpportunityTypeInput.this.eq.value != 0 ? ((MissedOpportunityType) ModelMissedOpportunityTypeInput.this.eq.value).name() : null);
                }
                if (ModelMissedOpportunityTypeInput.this.ne.defined) {
                    inputFieldWriter.writeString("ne", ModelMissedOpportunityTypeInput.this.ne.value != 0 ? ((MissedOpportunityType) ModelMissedOpportunityTypeInput.this.ne.value).name() : null);
                }
            }
        };
    }

    public MissedOpportunityType ne() {
        return this.ne.value;
    }
}
