package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ModelCustomDataTypeInput implements InputType {
    private final Input<CustomDataType> eq;
    private final Input<CustomDataType> ne;

    public static final class Builder {
        private Input<CustomDataType> eq = Input.absent();
        private Input<CustomDataType> ne = Input.absent();

        public ModelCustomDataTypeInput build() {
            return new ModelCustomDataTypeInput(this.eq, this.ne);
        }

        public Builder eq(CustomDataType customDataType) {
            this.eq = Input.fromNullable(customDataType);
            return this;
        }

        public Builder ne(CustomDataType customDataType) {
            this.ne = Input.fromNullable(customDataType);
            return this;
        }
    }

    public ModelCustomDataTypeInput(Input<CustomDataType> input, Input<CustomDataType> input2) {
        this.eq = input;
        this.ne = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public CustomDataType eq() {
        return this.eq.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelCustomDataTypeInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelCustomDataTypeInput.this.eq.defined) {
                    inputFieldWriter.writeString("eq", ModelCustomDataTypeInput.this.eq.value != 0 ? ((CustomDataType) ModelCustomDataTypeInput.this.eq.value).name() : null);
                }
                if (ModelCustomDataTypeInput.this.ne.defined) {
                    inputFieldWriter.writeString("ne", ModelCustomDataTypeInput.this.ne.value != 0 ? ((CustomDataType) ModelCustomDataTypeInput.this.ne.value).name() : null);
                }
            }
        };
    }

    public CustomDataType ne() {
        return this.ne.value;
    }
}
