package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ModelIfOwnerExistsInput implements InputType {
    private final Input<IfOwnerExists> eq;
    private final Input<IfOwnerExists> ne;

    public static final class Builder {
        private Input<IfOwnerExists> eq = Input.absent();
        private Input<IfOwnerExists> ne = Input.absent();

        public ModelIfOwnerExistsInput build() {
            return new ModelIfOwnerExistsInput(this.eq, this.ne);
        }

        public Builder eq(IfOwnerExists ifOwnerExists) {
            this.eq = Input.fromNullable(ifOwnerExists);
            return this;
        }

        public Builder ne(IfOwnerExists ifOwnerExists) {
            this.ne = Input.fromNullable(ifOwnerExists);
            return this;
        }
    }

    public ModelIfOwnerExistsInput(Input<IfOwnerExists> input, Input<IfOwnerExists> input2) {
        this.eq = input;
        this.ne = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public IfOwnerExists eq() {
        return this.eq.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelIfOwnerExistsInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelIfOwnerExistsInput.this.eq.defined) {
                    inputFieldWriter.writeString("eq", ModelIfOwnerExistsInput.this.eq.value != 0 ? ((IfOwnerExists) ModelIfOwnerExistsInput.this.eq.value).name() : null);
                }
                if (ModelIfOwnerExistsInput.this.ne.defined) {
                    inputFieldWriter.writeString("ne", ModelIfOwnerExistsInput.this.ne.value != 0 ? ((IfOwnerExists) ModelIfOwnerExistsInput.this.ne.value).name() : null);
                }
            }
        };
    }

    public IfOwnerExists ne() {
        return this.ne.value;
    }
}
