package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ModelCloudTelephonyUserUserByAgentNumberCompositeKeyInput implements InputType {
    private final Input<String> agentNumber;
    private final Input<String> providerName;

    public static final class Builder {
        private Input<String> agentNumber = Input.absent();
        private Input<String> providerName = Input.absent();

        public Builder agentNumber(String str) {
            this.agentNumber = Input.fromNullable(str);
            return this;
        }

        public ModelCloudTelephonyUserUserByAgentNumberCompositeKeyInput build() {
            return new ModelCloudTelephonyUserUserByAgentNumberCompositeKeyInput(this.agentNumber, this.providerName);
        }

        public Builder providerName(String str) {
            this.providerName = Input.fromNullable(str);
            return this;
        }
    }

    public ModelCloudTelephonyUserUserByAgentNumberCompositeKeyInput(Input<String> input, Input<String> input2) {
        this.agentNumber = input;
        this.providerName = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String agentNumber() {
        return this.agentNumber.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelCloudTelephonyUserUserByAgentNumberCompositeKeyInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelCloudTelephonyUserUserByAgentNumberCompositeKeyInput.this.agentNumber.defined) {
                    inputFieldWriter.writeString("agentNumber", (String) ModelCloudTelephonyUserUserByAgentNumberCompositeKeyInput.this.agentNumber.value);
                }
                if (ModelCloudTelephonyUserUserByAgentNumberCompositeKeyInput.this.providerName.defined) {
                    inputFieldWriter.writeString("providerName", (String) ModelCloudTelephonyUserUserByAgentNumberCompositeKeyInput.this.providerName.value);
                }
            }
        };
    }

    public String providerName() {
        return this.providerName.value;
    }
}
