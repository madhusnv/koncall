package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;

/* loaded from: classes7.dex */
public final class CustomPropertyOptionsInput implements InputType {
    private final Input<Boolean> isArchived;
    private final Input<String> otherAttributes;
    private final Input<Integer> tagColor;
    private final String value;
    private final String viewValue;

    public static final class Builder {
        private String value;
        private String viewValue;
        private Input<Boolean> isArchived = Input.absent();
        private Input<Integer> tagColor = Input.absent();
        private Input<String> otherAttributes = Input.absent();

        public CustomPropertyOptionsInput build() {
            Utils.checkNotNull(this.value, "value == null");
            Utils.checkNotNull(this.viewValue, "viewValue == null");
            return new CustomPropertyOptionsInput(this.value, this.viewValue, this.isArchived, this.tagColor, this.otherAttributes);
        }

        public Builder isArchived(Boolean bool) {
            this.isArchived = Input.fromNullable(bool);
            return this;
        }

        public Builder otherAttributes(String str) {
            this.otherAttributes = Input.fromNullable(str);
            return this;
        }

        public Builder tagColor(Integer num) {
            this.tagColor = Input.fromNullable(num);
            return this;
        }

        public Builder value(String str) {
            this.value = str;
            return this;
        }

        public Builder viewValue(String str) {
            this.viewValue = str;
            return this;
        }
    }

    public CustomPropertyOptionsInput(String str, String str2, Input<Boolean> input, Input<Integer> input2, Input<String> input3) {
        this.value = str;
        this.viewValue = str2;
        this.isArchived = input;
        this.tagColor = input2;
        this.otherAttributes = input3;
    }

    public static Builder builder() {
        return new Builder();
    }

    public Boolean isArchived() {
        return this.isArchived.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.CustomPropertyOptionsInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                inputFieldWriter.writeString("value", CustomPropertyOptionsInput.this.value);
                inputFieldWriter.writeString("viewValue", CustomPropertyOptionsInput.this.viewValue);
                if (CustomPropertyOptionsInput.this.isArchived.defined) {
                    inputFieldWriter.writeBoolean("isArchived", (Boolean) CustomPropertyOptionsInput.this.isArchived.value);
                }
                if (CustomPropertyOptionsInput.this.tagColor.defined) {
                    inputFieldWriter.writeInt("tagColor", (Integer) CustomPropertyOptionsInput.this.tagColor.value);
                }
                if (CustomPropertyOptionsInput.this.otherAttributes.defined) {
                    inputFieldWriter.writeString("otherAttributes", (String) CustomPropertyOptionsInput.this.otherAttributes.value);
                }
            }
        };
    }

    public String otherAttributes() {
        return this.otherAttributes.value;
    }

    public Integer tagColor() {
        return this.tagColor.value;
    }

    public String value() {
        return this.value;
    }

    public String viewValue() {
        return this.viewValue;
    }
}
