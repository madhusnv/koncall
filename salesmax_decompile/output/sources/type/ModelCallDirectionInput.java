package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ModelCallDirectionInput implements InputType {
    private final Input<CallDirection> eq;
    private final Input<CallDirection> ne;

    public static final class Builder {
        private Input<CallDirection> eq = Input.absent();
        private Input<CallDirection> ne = Input.absent();

        public ModelCallDirectionInput build() {
            return new ModelCallDirectionInput(this.eq, this.ne);
        }

        public Builder eq(CallDirection callDirection) {
            this.eq = Input.fromNullable(callDirection);
            return this;
        }

        public Builder ne(CallDirection callDirection) {
            this.ne = Input.fromNullable(callDirection);
            return this;
        }
    }

    public ModelCallDirectionInput(Input<CallDirection> input, Input<CallDirection> input2) {
        this.eq = input;
        this.ne = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public CallDirection eq() {
        return this.eq.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelCallDirectionInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelCallDirectionInput.this.eq.defined) {
                    inputFieldWriter.writeString("eq", ModelCallDirectionInput.this.eq.value != 0 ? ((CallDirection) ModelCallDirectionInput.this.eq.value).name() : null);
                }
                if (ModelCallDirectionInput.this.ne.defined) {
                    inputFieldWriter.writeString("ne", ModelCallDirectionInput.this.ne.value != 0 ? ((CallDirection) ModelCallDirectionInput.this.ne.value).name() : null);
                }
            }
        };
    }

    public CallDirection ne() {
        return this.ne.value;
    }
}
