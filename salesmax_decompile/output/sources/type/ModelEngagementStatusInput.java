package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ModelEngagementStatusInput implements InputType {
    private final Input<EngagementStatus> eq;
    private final Input<EngagementStatus> ne;

    public static final class Builder {
        private Input<EngagementStatus> eq = Input.absent();
        private Input<EngagementStatus> ne = Input.absent();

        public ModelEngagementStatusInput build() {
            return new ModelEngagementStatusInput(this.eq, this.ne);
        }

        public Builder eq(EngagementStatus engagementStatus) {
            this.eq = Input.fromNullable(engagementStatus);
            return this;
        }

        public Builder ne(EngagementStatus engagementStatus) {
            this.ne = Input.fromNullable(engagementStatus);
            return this;
        }
    }

    public ModelEngagementStatusInput(Input<EngagementStatus> input, Input<EngagementStatus> input2) {
        this.eq = input;
        this.ne = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public EngagementStatus eq() {
        return this.eq.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelEngagementStatusInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelEngagementStatusInput.this.eq.defined) {
                    inputFieldWriter.writeString("eq", ModelEngagementStatusInput.this.eq.value != 0 ? ((EngagementStatus) ModelEngagementStatusInput.this.eq.value).name() : null);
                }
                if (ModelEngagementStatusInput.this.ne.defined) {
                    inputFieldWriter.writeString("ne", ModelEngagementStatusInput.this.ne.value != 0 ? ((EngagementStatus) ModelEngagementStatusInput.this.ne.value).name() : null);
                }
            }
        };
    }

    public EngagementStatus ne() {
        return this.ne.value;
    }
}
