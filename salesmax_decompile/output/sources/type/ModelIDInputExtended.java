package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ModelIDInputExtended implements InputType {
    private final Input<Boolean> attributeExists;
    private final Input<String> eq;
    private final Input<String> ne;

    public static final class Builder {
        private Input<String> ne = Input.absent();
        private Input<String> eq = Input.absent();
        private Input<Boolean> attributeExists = Input.absent();

        public Builder attributeExists(Boolean bool) {
            this.attributeExists = Input.fromNullable(bool);
            return this;
        }

        public ModelIDInputExtended build() {
            return new ModelIDInputExtended(this.ne, this.eq, this.attributeExists);
        }

        public Builder eq(String str) {
            this.eq = Input.fromNullable(str);
            return this;
        }

        public Builder ne(String str) {
            this.ne = Input.fromNullable(str);
            return this;
        }
    }

    public ModelIDInputExtended(Input<String> input, Input<String> input2, Input<Boolean> input3) {
        this.ne = input;
        this.eq = input2;
        this.attributeExists = input3;
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
        return new InputFieldMarshaller() { // from class: type.ModelIDInputExtended.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelIDInputExtended.this.ne.defined) {
                    inputFieldWriter.writeString("ne", (String) ModelIDInputExtended.this.ne.value);
                }
                if (ModelIDInputExtended.this.eq.defined) {
                    inputFieldWriter.writeString("eq", (String) ModelIDInputExtended.this.eq.value);
                }
                if (ModelIDInputExtended.this.attributeExists.defined) {
                    inputFieldWriter.writeBoolean("attributeExists", (Boolean) ModelIDInputExtended.this.attributeExists.value);
                }
            }
        };
    }

    public String ne() {
        return this.ne.value;
    }
}
