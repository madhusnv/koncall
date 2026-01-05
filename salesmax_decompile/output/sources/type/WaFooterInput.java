package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class WaFooterInput implements InputType {
    private final Input<String> waText;
    private final Input<String> waType;

    public static final class Builder {
        private Input<String> waType = Input.absent();
        private Input<String> waText = Input.absent();

        public WaFooterInput build() {
            return new WaFooterInput(this.waType, this.waText);
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

    public WaFooterInput(Input<String> input, Input<String> input2) {
        this.waType = input;
        this.waText = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.WaFooterInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (WaFooterInput.this.waType.defined) {
                    inputFieldWriter.writeString("waType", (String) WaFooterInput.this.waType.value);
                }
                if (WaFooterInput.this.waText.defined) {
                    inputFieldWriter.writeString("waText", (String) WaFooterInput.this.waText.value);
                }
            }
        };
    }

    public String waText() {
        return this.waText.value;
    }

    public String waType() {
        return this.waType.value;
    }
}
