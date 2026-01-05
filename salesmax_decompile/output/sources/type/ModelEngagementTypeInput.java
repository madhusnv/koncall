package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ModelEngagementTypeInput implements InputType {
    private final Input<EngagementType> eq;
    private final Input<EngagementType> ne;

    public static final class Builder {
        private Input<EngagementType> eq = Input.absent();
        private Input<EngagementType> ne = Input.absent();

        public ModelEngagementTypeInput build() {
            return new ModelEngagementTypeInput(this.eq, this.ne);
        }

        public Builder eq(EngagementType engagementType) {
            this.eq = Input.fromNullable(engagementType);
            return this;
        }

        public Builder ne(EngagementType engagementType) {
            this.ne = Input.fromNullable(engagementType);
            return this;
        }
    }

    public ModelEngagementTypeInput(Input<EngagementType> input, Input<EngagementType> input2) {
        this.eq = input;
        this.ne = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public EngagementType eq() {
        return this.eq.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelEngagementTypeInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelEngagementTypeInput.this.eq.defined) {
                    inputFieldWriter.writeString("eq", ModelEngagementTypeInput.this.eq.value != 0 ? ((EngagementType) ModelEngagementTypeInput.this.eq.value).name() : null);
                }
                if (ModelEngagementTypeInput.this.ne.defined) {
                    inputFieldWriter.writeString("ne", ModelEngagementTypeInput.this.ne.value != 0 ? ((EngagementType) ModelEngagementTypeInput.this.ne.value).name() : null);
                }
            }
        };
    }

    public EngagementType ne() {
        return this.ne.value;
    }
}
