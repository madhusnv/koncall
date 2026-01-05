package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ModelCallConnectStatusInput implements InputType {
    private final Input<CallConnectStatus> eq;
    private final Input<CallConnectStatus> ne;

    public static final class Builder {
        private Input<CallConnectStatus> eq = Input.absent();
        private Input<CallConnectStatus> ne = Input.absent();

        public ModelCallConnectStatusInput build() {
            return new ModelCallConnectStatusInput(this.eq, this.ne);
        }

        public Builder eq(CallConnectStatus callConnectStatus) {
            this.eq = Input.fromNullable(callConnectStatus);
            return this;
        }

        public Builder ne(CallConnectStatus callConnectStatus) {
            this.ne = Input.fromNullable(callConnectStatus);
            return this;
        }
    }

    public ModelCallConnectStatusInput(Input<CallConnectStatus> input, Input<CallConnectStatus> input2) {
        this.eq = input;
        this.ne = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public CallConnectStatus eq() {
        return this.eq.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelCallConnectStatusInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelCallConnectStatusInput.this.eq.defined) {
                    inputFieldWriter.writeString("eq", ModelCallConnectStatusInput.this.eq.value != 0 ? ((CallConnectStatus) ModelCallConnectStatusInput.this.eq.value).name() : null);
                }
                if (ModelCallConnectStatusInput.this.ne.defined) {
                    inputFieldWriter.writeString("ne", ModelCallConnectStatusInput.this.ne.value != 0 ? ((CallConnectStatus) ModelCallConnectStatusInput.this.ne.value).name() : null);
                }
            }
        };
    }

    public CallConnectStatus ne() {
        return this.ne.value;
    }
}
