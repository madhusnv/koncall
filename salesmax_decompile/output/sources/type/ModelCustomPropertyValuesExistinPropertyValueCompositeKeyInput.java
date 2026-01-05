package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ModelCustomPropertyValuesExistinPropertyValueCompositeKeyInput implements InputType {
    private final Input<String> parentObjectId;
    private final Input<String> propertyDefinitionId;

    public static final class Builder {
        private Input<String> parentObjectId = Input.absent();
        private Input<String> propertyDefinitionId = Input.absent();

        public ModelCustomPropertyValuesExistinPropertyValueCompositeKeyInput build() {
            return new ModelCustomPropertyValuesExistinPropertyValueCompositeKeyInput(this.parentObjectId, this.propertyDefinitionId);
        }

        public Builder parentObjectId(String str) {
            this.parentObjectId = Input.fromNullable(str);
            return this;
        }

        public Builder propertyDefinitionId(String str) {
            this.propertyDefinitionId = Input.fromNullable(str);
            return this;
        }
    }

    public ModelCustomPropertyValuesExistinPropertyValueCompositeKeyInput(Input<String> input, Input<String> input2) {
        this.parentObjectId = input;
        this.propertyDefinitionId = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelCustomPropertyValuesExistinPropertyValueCompositeKeyInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelCustomPropertyValuesExistinPropertyValueCompositeKeyInput.this.parentObjectId.defined) {
                    inputFieldWriter.writeString("parentObjectId", (String) ModelCustomPropertyValuesExistinPropertyValueCompositeKeyInput.this.parentObjectId.value);
                }
                if (ModelCustomPropertyValuesExistinPropertyValueCompositeKeyInput.this.propertyDefinitionId.defined) {
                    inputFieldWriter.writeString("propertyDefinitionId", (String) ModelCustomPropertyValuesExistinPropertyValueCompositeKeyInput.this.propertyDefinitionId.value);
                }
            }
        };
    }

    public String parentObjectId() {
        return this.parentObjectId.value;
    }

    public String propertyDefinitionId() {
        return this.propertyDefinitionId.value;
    }
}
