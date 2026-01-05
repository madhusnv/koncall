package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class FlowActionPayloadInput implements InputType {
    private final Input<String> flowData;
    private final Input<String> screen;

    public static final class Builder {
        private Input<String> screen = Input.absent();
        private Input<String> flowData = Input.absent();

        public FlowActionPayloadInput build() {
            return new FlowActionPayloadInput(this.screen, this.flowData);
        }

        public Builder flowData(String str) {
            this.flowData = Input.fromNullable(str);
            return this;
        }

        public Builder screen(String str) {
            this.screen = Input.fromNullable(str);
            return this;
        }
    }

    public FlowActionPayloadInput(Input<String> input, Input<String> input2) {
        this.screen = input;
        this.flowData = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String flowData() {
        return this.flowData.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.FlowActionPayloadInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (FlowActionPayloadInput.this.screen.defined) {
                    inputFieldWriter.writeString("screen", (String) FlowActionPayloadInput.this.screen.value);
                }
                if (FlowActionPayloadInput.this.flowData.defined) {
                    inputFieldWriter.writeString("flowData", (String) FlowActionPayloadInput.this.flowData.value);
                }
            }
        };
    }

    public String screen() {
        return this.screen.value;
    }
}
