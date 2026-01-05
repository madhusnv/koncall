package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ModelIDInput implements InputType {
    private final Input<Boolean> attributeExists;
    private final Input<String> eq;

    public static final class Builder {
        private Input<String> eq = Input.absent();
        private Input<Boolean> attributeExists = Input.absent();

        public Builder attributeExists(Boolean bool) {
            this.attributeExists = Input.fromNullable(bool);
            return this;
        }

        public ModelIDInput build() {
            return new ModelIDInput(this.eq, this.attributeExists);
        }

        public Builder eq(String str) {
            this.eq = Input.fromNullable(str);
            return this;
        }
    }

    public ModelIDInput(Input<String> input, Input<Boolean> input2) {
        this.eq = input;
        this.attributeExists = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public Boolean attributeExists() {
        return this.attributeExists.value;
    }

    public String eq() {
        return this.eq.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelIDInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelIDInput.this.eq.defined) {
                    inputFieldWriter.writeString("eq", (String) ModelIDInput.this.eq.value);
                }
                if (ModelIDInput.this.attributeExists.defined) {
                    inputFieldWriter.writeBoolean("attributeExists", (Boolean) ModelIDInput.this.attributeExists.value);
                }
            }
        };
    }
}
