package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;

/* loaded from: classes7.dex */
public final class FieldsInput implements InputType {
    private final Input<String> fieldName;
    private final Input<String> fieldParentObjectType;
    private final Input<String> hideCondition;
    private final Input<String> hintText;
    private final Input<Boolean> isHidden;
    private final Input<Boolean> isMandatory;
    private final Input<Boolean> isViewOnly;
    private final Input<String> preSetValue;
    private final Input<String> propertyDefinitionId;
    private final Input<String> showCondition;
    private final String viewType;

    public static final class Builder {
        private String viewType;
        private Input<String> fieldName = Input.absent();
        private Input<String> fieldParentObjectType = Input.absent();
        private Input<String> propertyDefinitionId = Input.absent();
        private Input<Boolean> isMandatory = Input.absent();
        private Input<Boolean> isViewOnly = Input.absent();
        private Input<Boolean> isHidden = Input.absent();
        private Input<String> hintText = Input.absent();
        private Input<String> preSetValue = Input.absent();
        private Input<String> showCondition = Input.absent();
        private Input<String> hideCondition = Input.absent();

        public FieldsInput build() {
            Utils.checkNotNull(this.viewType, "viewType == null");
            return new FieldsInput(this.fieldName, this.fieldParentObjectType, this.propertyDefinitionId, this.viewType, this.isMandatory, this.isViewOnly, this.isHidden, this.hintText, this.preSetValue, this.showCondition, this.hideCondition);
        }

        public Builder fieldName(String str) {
            this.fieldName = Input.fromNullable(str);
            return this;
        }

        public Builder fieldParentObjectType(String str) {
            this.fieldParentObjectType = Input.fromNullable(str);
            return this;
        }

        public Builder hideCondition(String str) {
            this.hideCondition = Input.fromNullable(str);
            return this;
        }

        public Builder hintText(String str) {
            this.hintText = Input.fromNullable(str);
            return this;
        }

        public Builder isHidden(Boolean bool) {
            this.isHidden = Input.fromNullable(bool);
            return this;
        }

        public Builder isMandatory(Boolean bool) {
            this.isMandatory = Input.fromNullable(bool);
            return this;
        }

        public Builder isViewOnly(Boolean bool) {
            this.isViewOnly = Input.fromNullable(bool);
            return this;
        }

        public Builder preSetValue(String str) {
            this.preSetValue = Input.fromNullable(str);
            return this;
        }

        public Builder propertyDefinitionId(String str) {
            this.propertyDefinitionId = Input.fromNullable(str);
            return this;
        }

        public Builder showCondition(String str) {
            this.showCondition = Input.fromNullable(str);
            return this;
        }

        public Builder viewType(String str) {
            this.viewType = str;
            return this;
        }
    }

    public FieldsInput(Input<String> input, Input<String> input2, Input<String> input3, String str, Input<Boolean> input4, Input<Boolean> input5, Input<Boolean> input6, Input<String> input7, Input<String> input8, Input<String> input9, Input<String> input10) {
        this.fieldName = input;
        this.fieldParentObjectType = input2;
        this.propertyDefinitionId = input3;
        this.viewType = str;
        this.isMandatory = input4;
        this.isViewOnly = input5;
        this.isHidden = input6;
        this.hintText = input7;
        this.preSetValue = input8;
        this.showCondition = input9;
        this.hideCondition = input10;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String fieldName() {
        return this.fieldName.value;
    }

    public String fieldParentObjectType() {
        return this.fieldParentObjectType.value;
    }

    public String hideCondition() {
        return this.hideCondition.value;
    }

    public String hintText() {
        return this.hintText.value;
    }

    public Boolean isHidden() {
        return this.isHidden.value;
    }

    public Boolean isMandatory() {
        return this.isMandatory.value;
    }

    public Boolean isViewOnly() {
        return this.isViewOnly.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.FieldsInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (FieldsInput.this.fieldName.defined) {
                    inputFieldWriter.writeString("fieldName", (String) FieldsInput.this.fieldName.value);
                }
                if (FieldsInput.this.fieldParentObjectType.defined) {
                    inputFieldWriter.writeString("fieldParentObjectType", (String) FieldsInput.this.fieldParentObjectType.value);
                }
                if (FieldsInput.this.propertyDefinitionId.defined) {
                    inputFieldWriter.writeString("propertyDefinitionId", (String) FieldsInput.this.propertyDefinitionId.value);
                }
                inputFieldWriter.writeString("viewType", FieldsInput.this.viewType);
                if (FieldsInput.this.isMandatory.defined) {
                    inputFieldWriter.writeBoolean("isMandatory", (Boolean) FieldsInput.this.isMandatory.value);
                }
                if (FieldsInput.this.isViewOnly.defined) {
                    inputFieldWriter.writeBoolean("isViewOnly", (Boolean) FieldsInput.this.isViewOnly.value);
                }
                if (FieldsInput.this.isHidden.defined) {
                    inputFieldWriter.writeBoolean("isHidden", (Boolean) FieldsInput.this.isHidden.value);
                }
                if (FieldsInput.this.hintText.defined) {
                    inputFieldWriter.writeString("hintText", (String) FieldsInput.this.hintText.value);
                }
                if (FieldsInput.this.preSetValue.defined) {
                    inputFieldWriter.writeString("preSetValue", (String) FieldsInput.this.preSetValue.value);
                }
                if (FieldsInput.this.showCondition.defined) {
                    inputFieldWriter.writeString("showCondition", (String) FieldsInput.this.showCondition.value);
                }
                if (FieldsInput.this.hideCondition.defined) {
                    inputFieldWriter.writeString("hideCondition", (String) FieldsInput.this.hideCondition.value);
                }
            }
        };
    }

    public String preSetValue() {
        return this.preSetValue.value;
    }

    public String propertyDefinitionId() {
        return this.propertyDefinitionId.value;
    }

    public String showCondition() {
        return this.showCondition.value;
    }

    public String viewType() {
        return this.viewType;
    }
}
