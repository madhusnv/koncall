package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ParameterInput implements InputType {
    private final Input<String> parameter_name;

    /* renamed from: type, reason: collision with root package name */
    private final Input<String> f58197type;
    private final Input<String> value;

    public static final class Builder {

        /* renamed from: type, reason: collision with root package name */
        private Input<String> f58198type = Input.absent();
        private Input<String> value = Input.absent();
        private Input<String> parameter_name = Input.absent();

        public ParameterInput build() {
            return new ParameterInput(this.f58198type, this.value, this.parameter_name);
        }

        public Builder parameter_name(String str) {
            this.parameter_name = Input.fromNullable(str);
            return this;
        }

        public Builder type(String str) {
            this.f58198type = Input.fromNullable(str);
            return this;
        }

        public Builder value(String str) {
            this.value = Input.fromNullable(str);
            return this;
        }
    }

    public ParameterInput(Input<String> input, Input<String> input2, Input<String> input3) {
        this.f58197type = input;
        this.value = input2;
        this.parameter_name = input3;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ParameterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ParameterInput.this.f58197type.defined) {
                    inputFieldWriter.writeString("type", (String) ParameterInput.this.f58197type.value);
                }
                if (ParameterInput.this.value.defined) {
                    inputFieldWriter.writeString("value", (String) ParameterInput.this.value.value);
                }
                if (ParameterInput.this.parameter_name.defined) {
                    inputFieldWriter.writeString("parameter_name", (String) ParameterInput.this.parameter_name.value);
                }
            }
        };
    }

    public String parameter_name() {
        return this.parameter_name.value;
    }

    public String type() {
        return this.f58197type.value;
    }

    public String value() {
        return this.value.value;
    }
}
