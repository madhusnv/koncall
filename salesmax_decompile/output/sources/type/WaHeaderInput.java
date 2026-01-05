package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class WaHeaderInput implements InputType {
    private final Input<String> waExample;
    private final Input<String> waFormat;
    private final Input<String> waText;
    private final Input<String> waType;

    public static final class Builder {
        private Input<String> waType = Input.absent();
        private Input<String> waFormat = Input.absent();
        private Input<String> waText = Input.absent();
        private Input<String> waExample = Input.absent();

        public WaHeaderInput build() {
            return new WaHeaderInput(this.waType, this.waFormat, this.waText, this.waExample);
        }

        public Builder waExample(String str) {
            this.waExample = Input.fromNullable(str);
            return this;
        }

        public Builder waFormat(String str) {
            this.waFormat = Input.fromNullable(str);
            return this;
        }

        public Builder waText(String str) {
            this.waText = Input.fromNullable(str);
            return this;
        }

        public Builder waType(String str) {
            this.waType = Input.fromNullable(str);
            return this;
        }
    }

    public WaHeaderInput(Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4) {
        this.waType = input;
        this.waFormat = input2;
        this.waText = input3;
        this.waExample = input4;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.WaHeaderInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (WaHeaderInput.this.waType.defined) {
                    inputFieldWriter.writeString("waType", (String) WaHeaderInput.this.waType.value);
                }
                if (WaHeaderInput.this.waFormat.defined) {
                    inputFieldWriter.writeString("waFormat", (String) WaHeaderInput.this.waFormat.value);
                }
                if (WaHeaderInput.this.waText.defined) {
                    inputFieldWriter.writeString("waText", (String) WaHeaderInput.this.waText.value);
                }
                if (WaHeaderInput.this.waExample.defined) {
                    inputFieldWriter.writeString("waExample", (String) WaHeaderInput.this.waExample.value);
                }
            }
        };
    }

    public String waExample() {
        return this.waExample.value;
    }

    public String waFormat() {
        return this.waFormat.value;
    }

    public String waText() {
        return this.waText.value;
    }

    public String waType() {
        return this.waType.value;
    }
}
