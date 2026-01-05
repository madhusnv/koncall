package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ModelDistributionCreationTypeInput implements InputType {
    private final Input<DistributionCreationType> eq;
    private final Input<DistributionCreationType> ne;

    public static final class Builder {
        private Input<DistributionCreationType> eq = Input.absent();
        private Input<DistributionCreationType> ne = Input.absent();

        public ModelDistributionCreationTypeInput build() {
            return new ModelDistributionCreationTypeInput(this.eq, this.ne);
        }

        public Builder eq(DistributionCreationType distributionCreationType) {
            this.eq = Input.fromNullable(distributionCreationType);
            return this;
        }

        public Builder ne(DistributionCreationType distributionCreationType) {
            this.ne = Input.fromNullable(distributionCreationType);
            return this;
        }
    }

    public ModelDistributionCreationTypeInput(Input<DistributionCreationType> input, Input<DistributionCreationType> input2) {
        this.eq = input;
        this.ne = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public DistributionCreationType eq() {
        return this.eq.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelDistributionCreationTypeInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelDistributionCreationTypeInput.this.eq.defined) {
                    inputFieldWriter.writeString("eq", ModelDistributionCreationTypeInput.this.eq.value != 0 ? ((DistributionCreationType) ModelDistributionCreationTypeInput.this.eq.value).name() : null);
                }
                if (ModelDistributionCreationTypeInput.this.ne.defined) {
                    inputFieldWriter.writeString("ne", ModelDistributionCreationTypeInput.this.ne.value != 0 ? ((DistributionCreationType) ModelDistributionCreationTypeInput.this.ne.value).name() : null);
                }
            }
        };
    }

    public DistributionCreationType ne() {
        return this.ne.value;
    }
}
