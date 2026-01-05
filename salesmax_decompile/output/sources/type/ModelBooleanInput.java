package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ModelBooleanInput implements InputType {
    private final Input<Boolean> attributeExists;
    private final Input<ModelAttributeTypes> attributeType;
    private final Input<Boolean> eq;
    private final Input<Boolean> ne;

    public static final class Builder {
        private Input<Boolean> ne = Input.absent();
        private Input<Boolean> eq = Input.absent();
        private Input<Boolean> attributeExists = Input.absent();
        private Input<ModelAttributeTypes> attributeType = Input.absent();

        public Builder attributeExists(Boolean bool) {
            this.attributeExists = Input.fromNullable(bool);
            return this;
        }

        public Builder attributeType(ModelAttributeTypes modelAttributeTypes) {
            this.attributeType = Input.fromNullable(modelAttributeTypes);
            return this;
        }

        public ModelBooleanInput build() {
            return new ModelBooleanInput(this.ne, this.eq, this.attributeExists, this.attributeType);
        }

        public Builder eq(Boolean bool) {
            this.eq = Input.fromNullable(bool);
            return this;
        }

        public Builder ne(Boolean bool) {
            this.ne = Input.fromNullable(bool);
            return this;
        }
    }

    public ModelBooleanInput(Input<Boolean> input, Input<Boolean> input2, Input<Boolean> input3, Input<ModelAttributeTypes> input4) {
        this.ne = input;
        this.eq = input2;
        this.attributeExists = input3;
        this.attributeType = input4;
    }

    public static Builder builder() {
        return new Builder();
    }

    public Boolean attributeExists() {
        return this.attributeExists.value;
    }

    public ModelAttributeTypes attributeType() {
        return this.attributeType.value;
    }

    public Boolean eq() {
        return this.eq.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelBooleanInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelBooleanInput.this.ne.defined) {
                    inputFieldWriter.writeBoolean("ne", (Boolean) ModelBooleanInput.this.ne.value);
                }
                if (ModelBooleanInput.this.eq.defined) {
                    inputFieldWriter.writeBoolean("eq", (Boolean) ModelBooleanInput.this.eq.value);
                }
                if (ModelBooleanInput.this.attributeExists.defined) {
                    inputFieldWriter.writeBoolean("attributeExists", (Boolean) ModelBooleanInput.this.attributeExists.value);
                }
                if (ModelBooleanInput.this.attributeType.defined) {
                    inputFieldWriter.writeString("attributeType", ModelBooleanInput.this.attributeType.value != 0 ? ((ModelAttributeTypes) ModelBooleanInput.this.attributeType.value).name() : null);
                }
            }
        };
    }

    public Boolean ne() {
        return this.ne.value;
    }
}
