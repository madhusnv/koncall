package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class WaButtonInput implements InputType {
    private final Input<String> flow_action;
    private final Input<String> flow_id;
    private final Input<String> flow_json;
    private final Input<String> navigate_screen;
    private final Input<String> waNumber;
    private final Input<String> waText;
    private final Input<String> waType;
    private final Input<String> waUrl;

    public static final class Builder {
        private Input<String> waType = Input.absent();
        private Input<String> waText = Input.absent();
        private Input<String> waUrl = Input.absent();
        private Input<String> waNumber = Input.absent();
        private Input<String> flow_id = Input.absent();
        private Input<String> flow_json = Input.absent();
        private Input<String> flow_action = Input.absent();
        private Input<String> navigate_screen = Input.absent();

        public WaButtonInput build() {
            return new WaButtonInput(this.waType, this.waText, this.waUrl, this.waNumber, this.flow_id, this.flow_json, this.flow_action, this.navigate_screen);
        }

        public Builder flow_action(String str) {
            this.flow_action = Input.fromNullable(str);
            return this;
        }

        public Builder flow_id(String str) {
            this.flow_id = Input.fromNullable(str);
            return this;
        }

        public Builder flow_json(String str) {
            this.flow_json = Input.fromNullable(str);
            return this;
        }

        public Builder navigate_screen(String str) {
            this.navigate_screen = Input.fromNullable(str);
            return this;
        }

        public Builder waNumber(String str) {
            this.waNumber = Input.fromNullable(str);
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

        public Builder waUrl(String str) {
            this.waUrl = Input.fromNullable(str);
            return this;
        }
    }

    public WaButtonInput(Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5, Input<String> input6, Input<String> input7, Input<String> input8) {
        this.waType = input;
        this.waText = input2;
        this.waUrl = input3;
        this.waNumber = input4;
        this.flow_id = input5;
        this.flow_json = input6;
        this.flow_action = input7;
        this.navigate_screen = input8;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String flow_action() {
        return this.flow_action.value;
    }

    public String flow_id() {
        return this.flow_id.value;
    }

    public String flow_json() {
        return this.flow_json.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.WaButtonInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (WaButtonInput.this.waType.defined) {
                    inputFieldWriter.writeString("waType", (String) WaButtonInput.this.waType.value);
                }
                if (WaButtonInput.this.waText.defined) {
                    inputFieldWriter.writeString("waText", (String) WaButtonInput.this.waText.value);
                }
                if (WaButtonInput.this.waUrl.defined) {
                    inputFieldWriter.writeString("waUrl", (String) WaButtonInput.this.waUrl.value);
                }
                if (WaButtonInput.this.waNumber.defined) {
                    inputFieldWriter.writeString("waNumber", (String) WaButtonInput.this.waNumber.value);
                }
                if (WaButtonInput.this.flow_id.defined) {
                    inputFieldWriter.writeString("flow_id", (String) WaButtonInput.this.flow_id.value);
                }
                if (WaButtonInput.this.flow_json.defined) {
                    inputFieldWriter.writeString("flow_json", (String) WaButtonInput.this.flow_json.value);
                }
                if (WaButtonInput.this.flow_action.defined) {
                    inputFieldWriter.writeString("flow_action", (String) WaButtonInput.this.flow_action.value);
                }
                if (WaButtonInput.this.navigate_screen.defined) {
                    inputFieldWriter.writeString("navigate_screen", (String) WaButtonInput.this.navigate_screen.value);
                }
            }
        };
    }

    public String navigate_screen() {
        return this.navigate_screen.value;
    }

    public String waNumber() {
        return this.waNumber.value;
    }

    public String waText() {
        return this.waText.value;
    }

    public String waType() {
        return this.waType.value;
    }

    public String waUrl() {
        return this.waUrl.value;
    }
}
