package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ModelAssociatedCreationTypeInput implements InputType {
    private final Input<AssociatedCreationType> eq;
    private final Input<AssociatedCreationType> ne;

    public static final class Builder {
        private Input<AssociatedCreationType> eq = Input.absent();
        private Input<AssociatedCreationType> ne = Input.absent();

        public ModelAssociatedCreationTypeInput build() {
            return new ModelAssociatedCreationTypeInput(this.eq, this.ne);
        }

        public Builder eq(AssociatedCreationType associatedCreationType) {
            this.eq = Input.fromNullable(associatedCreationType);
            return this;
        }

        public Builder ne(AssociatedCreationType associatedCreationType) {
            this.ne = Input.fromNullable(associatedCreationType);
            return this;
        }
    }

    public ModelAssociatedCreationTypeInput(Input<AssociatedCreationType> input, Input<AssociatedCreationType> input2) {
        this.eq = input;
        this.ne = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public AssociatedCreationType eq() {
        return this.eq.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelAssociatedCreationTypeInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelAssociatedCreationTypeInput.this.eq.defined) {
                    inputFieldWriter.writeString("eq", ModelAssociatedCreationTypeInput.this.eq.value != 0 ? ((AssociatedCreationType) ModelAssociatedCreationTypeInput.this.eq.value).name() : null);
                }
                if (ModelAssociatedCreationTypeInput.this.ne.defined) {
                    inputFieldWriter.writeString("ne", ModelAssociatedCreationTypeInput.this.ne.value != 0 ? ((AssociatedCreationType) ModelAssociatedCreationTypeInput.this.ne.value).name() : null);
                }
            }
        };
    }

    public AssociatedCreationType ne() {
        return this.ne.value;
    }
}
