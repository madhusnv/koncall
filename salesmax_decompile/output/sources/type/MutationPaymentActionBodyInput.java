package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class MutationPaymentActionBodyInput implements InputType {
    private final Input<String> action;
    private final Input<String> paymentServicePayload;
    private final Input<String> paymentServiceSource;
    private final Input<String> paymentServiceType;
    private final Input<String> requestId;

    public static final class Builder {
        private Input<String> paymentServiceSource = Input.absent();
        private Input<String> requestId = Input.absent();
        private Input<String> action = Input.absent();
        private Input<String> paymentServiceType = Input.absent();
        private Input<String> paymentServicePayload = Input.absent();

        public Builder action(String str) {
            this.action = Input.fromNullable(str);
            return this;
        }

        public MutationPaymentActionBodyInput build() {
            return new MutationPaymentActionBodyInput(this.paymentServiceSource, this.requestId, this.action, this.paymentServiceType, this.paymentServicePayload);
        }

        public Builder paymentServicePayload(String str) {
            this.paymentServicePayload = Input.fromNullable(str);
            return this;
        }

        public Builder paymentServiceSource(String str) {
            this.paymentServiceSource = Input.fromNullable(str);
            return this;
        }

        public Builder paymentServiceType(String str) {
            this.paymentServiceType = Input.fromNullable(str);
            return this;
        }

        public Builder requestId(String str) {
            this.requestId = Input.fromNullable(str);
            return this;
        }
    }

    public MutationPaymentActionBodyInput(Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5) {
        this.paymentServiceSource = input;
        this.requestId = input2;
        this.action = input3;
        this.paymentServiceType = input4;
        this.paymentServicePayload = input5;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String action() {
        return this.action.value;
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.MutationPaymentActionBodyInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (MutationPaymentActionBodyInput.this.paymentServiceSource.defined) {
                    inputFieldWriter.writeString("paymentServiceSource", (String) MutationPaymentActionBodyInput.this.paymentServiceSource.value);
                }
                if (MutationPaymentActionBodyInput.this.requestId.defined) {
                    inputFieldWriter.writeString("requestId", (String) MutationPaymentActionBodyInput.this.requestId.value);
                }
                if (MutationPaymentActionBodyInput.this.action.defined) {
                    inputFieldWriter.writeString("action", (String) MutationPaymentActionBodyInput.this.action.value);
                }
                if (MutationPaymentActionBodyInput.this.paymentServiceType.defined) {
                    inputFieldWriter.writeString("paymentServiceType", (String) MutationPaymentActionBodyInput.this.paymentServiceType.value);
                }
                if (MutationPaymentActionBodyInput.this.paymentServicePayload.defined) {
                    inputFieldWriter.writeString("paymentServicePayload", (String) MutationPaymentActionBodyInput.this.paymentServicePayload.value);
                }
            }
        };
    }

    public String paymentServicePayload() {
        return this.paymentServicePayload.value;
    }

    public String paymentServiceSource() {
        return this.paymentServiceSource.value;
    }

    public String paymentServiceType() {
        return this.paymentServiceType.value;
    }

    public String requestId() {
        return this.requestId.value;
    }
}
