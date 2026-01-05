package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;

/* loaded from: classes7.dex */
public final class ModelProductPlanSubscriptionByAccountCompositeKeyInput implements InputType {
    private final Input<String> status;
    private final Input<String> subscriptionPaymentStatus;

    public static final class Builder {
        private Input<String> status = Input.absent();
        private Input<String> subscriptionPaymentStatus = Input.absent();

        public ModelProductPlanSubscriptionByAccountCompositeKeyInput build() {
            return new ModelProductPlanSubscriptionByAccountCompositeKeyInput(this.status, this.subscriptionPaymentStatus);
        }

        public Builder status(String str) {
            this.status = Input.fromNullable(str);
            return this;
        }

        public Builder subscriptionPaymentStatus(String str) {
            this.subscriptionPaymentStatus = Input.fromNullable(str);
            return this;
        }
    }

    public ModelProductPlanSubscriptionByAccountCompositeKeyInput(Input<String> input, Input<String> input2) {
        this.status = input;
        this.subscriptionPaymentStatus = input2;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // com.apollographql.apollo.api.InputType
    public InputFieldMarshaller marshaller() {
        return new InputFieldMarshaller() { // from class: type.ModelProductPlanSubscriptionByAccountCompositeKeyInput.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.apollographql.apollo.api.InputFieldMarshaller
            public void marshal(InputFieldWriter inputFieldWriter) {
                if (ModelProductPlanSubscriptionByAccountCompositeKeyInput.this.status.defined) {
                    inputFieldWriter.writeString("status", (String) ModelProductPlanSubscriptionByAccountCompositeKeyInput.this.status.value);
                }
                if (ModelProductPlanSubscriptionByAccountCompositeKeyInput.this.subscriptionPaymentStatus.defined) {
                    inputFieldWriter.writeString("subscriptionPaymentStatus", (String) ModelProductPlanSubscriptionByAccountCompositeKeyInput.this.subscriptionPaymentStatus.value);
                }
            }
        };
    }

    public String status() {
        return this.status.value;
    }

    public String subscriptionPaymentStatus() {
        return this.subscriptionPaymentStatus.value;
    }
}
