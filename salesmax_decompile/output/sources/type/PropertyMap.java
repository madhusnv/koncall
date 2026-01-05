package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class PropertyMap implements InputType {
    private final Input<String> defaultValue;
    private final Input<String> name;
    private final Input<String> property;
    private final Input<String> table;
    private final Input<String> value;

    public static final class Builder {
        private Input<String> name = Input.absent();
        private Input<String> table = Input.absent();
        private Input<String> property = Input.absent();
        private Input<String> value = Input.absent();
        private Input<String> defaultValue = Input.absent();

        public PropertyMap build() {
            return new PropertyMap(this.name, this.table, this.property, this.value, this.defaultValue);
        }

        public Builder defaultValue(String str) {
            this.defaultValue = Input.fromNullable(str);
            return this;
        }

        public Builder name(String str) {
            this.name = Input.fromNullable(str);
            return this;
        }

        public Builder property(String str) {
            this.property = Input.fromNullable(str);
            return this;
        }

        public Builder table(String str) {
            this.table = Input.fromNullable(str);
            return this;
        }

        public Builder value(String str) {
            this.value = Input.fromNullable(str);
            return this;
        }
    }

    public PropertyMap(Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5) {
        this.name = input;
        this.table = input2;
        this.property = input3;
        this.value = input4;
        this.defaultValue = input5;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String defaultValue() {
        return this.defaultValue.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.PropertyMap.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (PropertyMap.this.name.defined) {
                    inputFieldWriter.writeString("name", (String) PropertyMap.this.name.value);
                }
                if (PropertyMap.this.table.defined) {
                    inputFieldWriter.writeString("table", (String) PropertyMap.this.table.value);
                }
                if (PropertyMap.this.property.defined) {
                    inputFieldWriter.writeString("property", (String) PropertyMap.this.property.value);
                }
                if (PropertyMap.this.value.defined) {
                    inputFieldWriter.writeString("value", (String) PropertyMap.this.value.value);
                }
                if (PropertyMap.this.defaultValue.defined) {
                    inputFieldWriter.writeString("defaultValue", (String) PropertyMap.this.defaultValue.value);
                }
            }
        };
    }

    public String name() {
        return this.name.value;
    }

    public String property() {
        return this.property.value;
    }

    public String table() {
        return this.table.value;
    }

    public String value() {
        return this.value.value;
    }
}
