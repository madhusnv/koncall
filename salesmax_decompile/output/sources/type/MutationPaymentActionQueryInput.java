package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class MutationPaymentActionQueryInput implements InputType {
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

        public MutationPaymentActionQueryInput build() {
            return new MutationPaymentActionQueryInput(this.paymentServiceSource, this.requestId, this.action, this.paymentServiceType, this.paymentServicePayload);
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

    public MutationPaymentActionQueryInput(Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4, Input<String> input5) {
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
        return new InputFieldMarshaller() { // from class: type.MutationPaymentActionQueryInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (MutationPaymentActionQueryInput.this.paymentServiceSource.defined) {
                    inputFieldWriter.writeString("paymentServiceSource", (String) MutationPaymentActionQueryInput.this.paymentServiceSource.value);
                }
                if (MutationPaymentActionQueryInput.this.requestId.defined) {
                    inputFieldWriter.writeString("requestId", (String) MutationPaymentActionQueryInput.this.requestId.value);
                }
                if (MutationPaymentActionQueryInput.this.action.defined) {
                    inputFieldWriter.writeString("action", (String) MutationPaymentActionQueryInput.this.action.value);
                }
                if (MutationPaymentActionQueryInput.this.paymentServiceType.defined) {
                    inputFieldWriter.writeString("paymentServiceType", (String) MutationPaymentActionQueryInput.this.paymentServiceType.value);
                }
                if (MutationPaymentActionQueryInput.this.paymentServicePayload.defined) {
                    inputFieldWriter.writeString("paymentServicePayload", (String) MutationPaymentActionQueryInput.this.paymentServicePayload.value);
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
