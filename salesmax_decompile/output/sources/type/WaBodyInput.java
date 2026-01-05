package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class WaBodyInput implements InputType {
    private final Input<String> waExample;
    private final Input<String> waText;
    private final Input<String> waType;

    public static final class Builder {
        private Input<String> waType = Input.absent();
        private Input<String> waText = Input.absent();
        private Input<String> waExample = Input.absent();

        public WaBodyInput build() {
            return new WaBodyInput(this.waType, this.waText, this.waExample);
        }

        public Builder waExample(String str) {
            this.waExample = Input.fromNullable(str);
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

    public WaBodyInput(Input<String> input, Input<String> input2, Input<String> input3) {
        this.waType = input;
        this.waText = input2;
        this.waExample = input3;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.WaBodyInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (WaBodyInput.this.waType.defined) {
                    inputFieldWriter.writeString("waType", (String) WaBodyInput.this.waType.value);
                }
                if (WaBodyInput.this.waText.defined) {
                    inputFieldWriter.writeString("waText", (String) WaBodyInput.this.waText.value);
                }
                if (WaBodyInput.this.waExample.defined) {
                    inputFieldWriter.writeString("waExample", (String) WaBodyInput.this.waExample.value);
                }
            }
        };
    }

    public String waExample() {
        return this.waExample.value;
    }

    public String waText() {
        return this.waText.value;
    }

    public String waType() {
        return this.waType.value;
    }
}
