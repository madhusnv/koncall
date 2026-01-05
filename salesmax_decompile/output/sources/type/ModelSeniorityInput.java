package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ModelSeniorityInput implements InputType {
    private final Input<Seniority> eq;
    private final Input<Seniority> ne;

    public static final class Builder {
        private Input<Seniority> eq = Input.absent();
        private Input<Seniority> ne = Input.absent();

        public ModelSeniorityInput build() {
            return new ModelSeniorityInput(this.eq, this.ne);
        }

        public Builder eq(Seniority seniority) {
            this.eq = Input.fromNullable(seniority);
            return this;
        }

        public Builder ne(Seniority seniority) {
            this.ne = Input.fromNullable(seniority);
            return this;
        }
    }

    public ModelSeniorityInput(Input<Seniority> input, Input<Seniority> input2) {
        this.eq = input;
        this.ne = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public Seniority eq() {
        return this.eq.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelSeniorityInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelSeniorityInput.this.eq.defined) {
                    inputFieldWriter.writeString("eq", ModelSeniorityInput.this.eq.value != 0 ? ((Seniority) ModelSeniorityInput.this.eq.value).name() : null);
                }
                if (ModelSeniorityInput.this.ne.defined) {
                    inputFieldWriter.writeString("ne", ModelSeniorityInput.this.ne.value != 0 ? ((Seniority) ModelSeniorityInput.this.ne.value).name() : null);
                }
            }
        };
    }

    public Seniority ne() {
        return this.ne.value;
    }
}
