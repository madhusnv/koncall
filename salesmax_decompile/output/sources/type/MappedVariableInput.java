package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes7.dex */
public final class MappedVariableInput implements InputType {
    private final Input<String> fallBackValue;
    private final Input<Integer> index;
    private final Input<String> mappedObject;
    private final Input<String> mappedProperty;
    private final Input<String> sampleValue;
    private final Input<String> sub_type;
    private final Input<String> taType;
    private final Input<String> variableId;

    public static final class Builder {
        private Input<String> taType = Input.absent();
        private Input<String> variableId = Input.absent();
        private Input<String> mappedObject = Input.absent();
        private Input<String> mappedProperty = Input.absent();
        private Input<String> fallBackValue = Input.absent();
        private Input<String> sampleValue = Input.absent();
        private Input<Integer> index = Input.absent();
        private Input<String> sub_type = Input.absent();

        public MappedVariableInput build() {
            return new MappedVariableInput(this.taType, this.variableId, this.mappedObject, this.mappedProperty, this.fallBackValue, this.sampleValue, this.index, this.sub_type);
        }

        public Builder fallBackValue(String str) {
            this.fallBackValue = Input.fromNullable(str);
            return this;
        }

        public Builder index(Integer num) {
            this.index = Input.fromNullable(num);
            return this;
        }

        public Builder mappedObject(String str) {
            this.mappedObject = Input.fromNullable(str);
            return this;
        }

        public Builder mappedProperty(String str) {
            this.mappedProperty = Input.fromNullable(str);
            return this;
        }

        public Builder sampleValue(String str) {
            this.sampleValue = Input.fromNullable(str);
            return this;
        }

        public Builder sub_type(String str) {
            this.sub_type = Input.fromNullable(str);
            return this;
        }

        public Builder taType(String str) {
            this.taType = Input.fromNullable(str);
            return this;
        }

        public Builder variableId(String str) {
            this.variableId = Input.fromNullable(str);
            return this;
        }
    }

    public MappedVariableInput(Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<String> input6, Input<Integer> input7, Input<String> input8) {
        this.taType = input;
        this.variableId = input2;
        this.mappedObject = input3;
        this.mappedProperty = input4;
        this.fallBackValue = input5;
        this.sampleValue = input6;
        this.index = input7;
        this.sub_type = input8;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String fallBackValue() {
        return this.fallBackValue.value;
    }

    public Integer index() {
        return this.index.value;
    }

    public String mappedObject() {
        return this.mappedObject.value;
    }

    public String mappedProperty() {
        return this.mappedProperty.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.MappedVariableInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (MappedVariableInput.this.taType.defined) {
                    inputFieldWriter.writeString("taType", (String) MappedVariableInput.this.taType.value);
                }
                if (MappedVariableInput.this.variableId.defined) {
                    inputFieldWriter.writeString("variableId", (String) MappedVariableInput.this.variableId.value);
                }
                if (MappedVariableInput.this.mappedObject.defined) {
                    inputFieldWriter.writeString("mappedObject", (String) MappedVariableInput.this.mappedObject.value);
                }
                if (MappedVariableInput.this.mappedProperty.defined) {
                    inputFieldWriter.writeString("mappedProperty", (String) MappedVariableInput.this.mappedProperty.value);
                }
                if (MappedVariableInput.this.fallBackValue.defined) {
                    inputFieldWriter.writeString("fallBackValue", (String) MappedVariableInput.this.fallBackValue.value);
                }
                if (MappedVariableInput.this.sampleValue.defined) {
                    inputFieldWriter.writeString("sampleValue", (String) MappedVariableInput.this.sampleValue.value);
                }
                if (MappedVariableInput.this.index.defined) {
                    inputFieldWriter.writeInt(FirebaseAnalytics.Param.INDEX, (Integer) MappedVariableInput.this.index.value);
                }
                if (MappedVariableInput.this.sub_type.defined) {
                    inputFieldWriter.writeString("sub_type", (String) MappedVariableInput.this.sub_type.value);
                }
            }
        };
    }

    public String sampleValue() {
        return this.sampleValue.value;
    }

    public String sub_type() {
        return this.sub_type.value;
    }

    public String taType() {
        return this.taType.value;
    }

    public String variableId() {
        return this.variableId.value;
    }
}
